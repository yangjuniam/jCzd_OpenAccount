package com.caizhidao.jiaoyisuo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.caizhidao.common.Configuration;
import com.caizhidao.enums.ResultCodeEnum;
import com.caizhidao.jiaoyisuo.aq.OpenAccountForUnitService;
import com.caizhidao.jiaoyisuo.sim.OpenMiAccountForUnitService;
import com.caizhidao.model.Customer;
import com.caizhidao.model.RegisterResult;
import com.caizhidao.service.AqCunstomerService;
import com.caizhidao.service.SimCunstomerService;

/**
 * 交易所创建账号 Util 类
 * 
 * @author Jail Hu
 * 
 */
@Component
@Transactional
public class JiaoYiSuoUtil {

	@Autowired
	private SimCunstomerService simCunstomerService;

	@Autowired
	private AqCunstomerService aqCunstomerService;

	
	private Logger logger = Logger.getLogger(JiaoYiSuoUtil.class);
	/**
	 * 创建实盘账号
	 * 
	 * @param customer
	 * @return
	 */
	public RegisterResult createAqCustomer(Customer customer) {
		// return new
		// RegisterResult(String.valueOf(ResultCodeEnum.开户信息提交成功我们将在审核后正式提交交易所.getIndex()),customer);
		if (customer.getCheckBankCard().equals("999")) {
			return new RegisterResult(
					String.valueOf(ResultCodeEnum.开户信息提交成功我们将在审核后正式提交交易所
							.getIndex()), customer);
		} else {
			logger.info("==================>实盘开户提交数据" + customer);
			String[] results = new OpenAccountForUnitService()
					.getOpenAccountForUnitServiceHttpSoap12Endpoint()
					.openAndCheck(
							Configuration.getInstance().getAq_tjpmeToken(),
							Configuration.getInstance().getAq_memberNo(),
							customer.getCustomerNo(),
							customer.getCustomerName(),
							customer.getPapersType(), customer.getPapersNum(),
							customer.getGender(), customer.getProvince(),
							customer.getCity(), customer.getArea(),
							customer.getTradePWD(), customer.getPhonePWD(),
							customer.getPhone(), customer.getFax(),
							customer.getPostcode(), customer.getEmail(),
							customer.getAddress(), "",
							"", customer.getIDType(),
							customer.getBankAcc(), customer.getCheckBankCard())
					.toArray(new String[2]);
			RegisterResult registerResult = new RegisterResult(results);
			if (registerResult.getResultCode().equals("1")
					&& registerResult.getResultBankCode().equals("1")) {
				customer.setStatus(true);
				aqCunstomerService.updateAqStatus(customer);
			}
			registerResult.setCustomer(customer);
			logger.info("==================>实盘开户结果：" + registerResult);
			return registerResult;
		}
	}

	/**
	 * 创建模拟盘账号
	 * 
	 * @param customer
	 * @return
	 */
	@Transactional
	public RegisterResult createSimCustomer(Customer customer)
			throws RuntimeException {
		// return new
		// RegisterResult(String.valueOf(ResultCodeEnum.开户信息提交成功我们将在审核后正式提交交易所.getIndex()),customer);
		logger.info("==================>模拟盘开户提交数据" + customer);
		String result = new OpenMiAccountForUnitService()
				.getOpenMiAccountForUnitServiceHttpSoap11Endpoint()
				.openAndCheck(Configuration.getInstance().getSim_tjpmeToken(),
						Configuration.getInstance().getSim_memberNo(),
						customer.getCustomerNo(), customer.getCustomerName(),
						customer.getPapersType(), customer.getPapersNum(),
						customer.getGender(), customer.getProvince(),
						customer.getCity(), customer.getArea(),
						customer.getTradePWD(), customer.getPhonePWD(),
						customer.getPhone(), customer.getFax(),
						customer.getPostcode(), customer.getEmail(),
						customer.getAddress(), "",
						"");
		if (result.equals("1")) {
			customer.setStatus(true);
			simCunstomerService.updateSimStatus(customer);
		}
		RegisterResult registerResult = new RegisterResult(result);
		registerResult.setCustomer(customer);
		logger.info("==================>模拟盘开户结果：" + registerResult);
		return registerResult;
	}
}
