package com.caizhidao.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.caizhidao.base.model.Page;
import com.caizhidao.base.service.BaseService;
import com.caizhidao.base.utils.TextUtil;
import com.caizhidao.common.Configuration;
import com.caizhidao.model.Customer;

/**
 * 实盘Service
 * 
 * @author Jail Hu
 * 
 */
@Service
public class AqCunstomerService extends BaseService<Customer> {

	/**
	 * 优先插入实盘行数据
	 * 
	 * @return
	 */
	public int addCustomerRow() {
		Customer customer = new Customer();
		insertAndReturnId("insertAqCustomerAndResturnId", customer);
		return customer.getId();
	}

	/**
	 * 添加客户并返回ID
	 * 
	 * @return
	 */
	public Customer addCustomer(Customer customer) {
		insertAndReturnId("insertAqCustomerAndReturnId", customer);
		customer.setCustomerNo(Configuration.getInstance().getAq_memberNo()
				+ TextUtil.textContact(String.valueOf(customer.getId()), 12,
						"0"));
		this.update("updateAqCustomerNo", customer);
		return customer;
	}

	public Customer findAqCustomerById(int userCode) {
		return selectOne("findAqById", userCode);
	}

	public Customer findAqCustomerByPhone(String phone) {
		return selectOne("findAqCustomerByPhone", phone);
	}

	/**
	 * 检查实盘登录
	 * 
	 * @param customer
	 * @return
	 */
	public boolean checkAqLogin(Customer customer) {
		return (int) this.queryDao.getSqlSession().selectOne("checkAqLogin",
				customer) > 0;
	}

	/**
	 * 更新实盘数据
	 * 
	 * @param customer
	 * @return
	 */
	public boolean updateCustomer(Customer customer) {
		return update("updateAqCustomer", customer);
	}

	/**
	 * 更新实盘数据 - 开户成功
	 * 
	 * @param customer
	 * @return
	 */
	public boolean updateAqStatus(Customer customer) {
		return update("updateAqStatus", customer);
	}

	/**
	 * 检查手机号码是否已经注册
	 * 
	 * @param phone
	 * @return
	 */
	public boolean checkExist(String phone) {
		return (int) this.queryDao.getSqlSession().selectOne("checkAqExist",
				phone) > 0;
	}

	/**
	 * 获得 用户 列表
	 * @param page
	 * @return
	 */
	public List<Customer> queryCustomerList(Page page) {
		Customer customer = (Customer) page;
		StringBuffer sb = new StringBuffer("1=1");
		if (StringUtils.isNotBlank(customer.getPhone())) {
			sb.append(" and (phone like '" + customer.getPhone()
					+ "%' or customerName like '" + customer.getPhone()
					+ "%')");
		}
		if (StringUtils.isNotBlank(customer.getBrokerageNo())) {
			sb.append(" and brokerageNo=" + customer.getBrokerageNo());
		}
		if (customer.getRecommendUserCode() != null) {
			sb.append(" and recommendUserCode="
					+ customer.getRecommendUserCode());
		}
		customer.setWhere(sb.toString());
		return this.selectByPage("queryAqCustomer", page);
	}

	/**
	 * 数据条数
	 * @return
	 */
	public int queryCount() {
		return this.queryDao.getSqlSession().selectOne("queryCount");
	}

	/**
	 * 变更开户经纪人ID
	 * @param customer 对象
	 * @return boolean
	 */
	public boolean changeAqRecommendUserCode(Customer customer) {
		return this.update("changeAqRecommendUserCode", customer);
	}
}
