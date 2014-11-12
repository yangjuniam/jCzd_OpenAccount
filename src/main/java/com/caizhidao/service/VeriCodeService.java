package com.caizhidao.service;

import org.springframework.stereotype.Service;
import com.caizhidao.base.service.BaseService;
import com.caizhidao.model.VeriCode;

/**
 * 验证码Service
 * 
 * @author Jail Hu
 * 
 */
@Service
public class VeriCodeService extends BaseService<VeriCode> {
	/**
	 * 插入验证码发送记录
	 *  
	 * @return boolean
	 */
	public boolean insertVeriCode(VeriCode veriCode) {
		return insert("insert", veriCode);
	}

	/**
	 * 获得当天验证码发送次数
	 * 
	 * @param veriCode 验证码
	 * @return int
	 */
	public int checkCount(VeriCode veriCode) {
		return (int) this.queryDao.getSqlSession().selectOne("checkCount",
				veriCode);
	}

	/**
	 * 获得尚未过期的验证码
	 * 
	 * @param veriCode  验证码
	 * @return
	 */
	public VeriCode findLastOne(VeriCode veriCode) {
		return this.selectOne("findLastOne", veriCode);
	}

	/**
	 * 检查验证码是否正确
	 * @param veriCode 验证码
	 * @return
	 */
	public boolean checkValid(VeriCode veriCode) {
		return (int) this.queryDao.getSqlSession().selectOne("checkValid",
				veriCode) > 0;
	}
}
