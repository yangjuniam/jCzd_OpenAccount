package com.caizhidao.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caizhidao.base.model.Page;
import com.caizhidao.base.service.BaseService;
import com.caizhidao.base.utils.TextUtil;
import com.caizhidao.common.Configuration;
import com.caizhidao.model.Customer;

/**
 * 模拟盘Service
 * 
 * @author Jail Hu
 * 
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SimCunstomerService extends BaseService<Customer> {
	/**
	 * 优先插入模拟盘行数据
	 * 
	 * @return
	 */
	public int addCustomerRow() {
		Customer customer = new Customer();
		insertAndReturnId("insertSimCustomerAndResturnId", customer);
		return customer.getId();
	}

	/**
	 * 添加客户并返回ID
	 * 
	 * @return
	 * @throws Exception
	 */
	@Transactional
	public Customer addCustomer(Customer customer) throws Exception {
		try {
			insertAndReturnId("insertSimCustomerAndReturnId", customer);
			customer.setCustomerNo(Configuration.getInstance()
					.getSim_memberNo()
					+ TextUtil.textContact(String.valueOf(customer.getId()),
							12, "0"));
			this.update("updateSimCustomerNo", customer);
		} catch (Exception e) {
			throw new Exception("afds");
		}
		return customer;
	}

	/**
	 * 更新模拟盘数据
	 * 
	 * @param customer
	 * @return
	 */
	public boolean updateCustomer(Customer customer) {
		return update("updateSimCustomer", customer);
	}

	public Customer findSimCustomerById(int userCode) {
		return selectOne("findSimById", userCode);
	}
	
	/**
	 * 根据 电话号码查找模拟盘账号
	 * @param phone
	 * @return
	 */
	public Customer findSimCustomerByPhone(String phone) {
		return selectOne("findSimCustomerByPhone", phone);
	}
	

	/**
	 * 检查模拟盘登录
	 * 
	 * @param customer
	 * @return
	 */
	public boolean checkSimLogin(Customer customer) {
		return (int) this.queryDao.getSqlSession().selectOne("checkSimLogin",
				customer) > 0;
	}

	/**
	 * 更新模拟盘数据 - 开户成功
	 * 
	 * @param customer
	 * @return
	 */
	public boolean updateSimStatus(Customer customer) {
		return update("updateSimStatus", customer);
	}

	/**
	 * 检查手机号码是否已经注册
	 * 
	 * @param phone
	 * @return
	 */
	public boolean checkExist(String phone) {
		int ss = (int) this.queryDao.getSqlSession().selectOne("checkSimExist",
				phone);
		return ss > 0;
	}

	public List<Customer> queryCustomerList(Page page) {
		Customer customer = (Customer) page;
		if (StringUtils.isNotBlank(customer.getPhone())) {
			page.setWhere(" phone like '" + customer.getPhone()
					+ "%' or customerName like '" + customer.getCustomerName()
					+ "%'");
		}
		return this.selectByPage("querySimCustomer", page);
	}
	
	/**
	 * 数据条数
	 * @return
	 */
	public int queryCount() {
		return this.queryDao.getSqlSession().selectOne("queryCount");
	}
}
