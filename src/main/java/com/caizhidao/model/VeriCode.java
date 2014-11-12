package com.caizhidao.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("veriCode")
public class VeriCode implements Serializable{

	private static final long serialVersionUID = 8560946283255110388L;
	/*
	 * ID
	 */
	private int id;
	/*
	 * 手机号
	 */
	private String mobilePhone;
	/*
	 * 验证码类型  0：模拟盘  1：私盘
	 */
	private int type; 
	/*
	 * 验证码
	 */
	private String veriCode;
	/*
	 * 发送时间
	 */
	private Date createTime;
	/*
	 * 是否已经使用
	 */
	private boolean used;
	/**
	 * 获得 ID
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 设置 ID
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获得 手机号
	 * @return
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * 设置 手机号
	 * @param mobilePhone
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * 获得 验证码类型  0：模拟盘  1：私盘
	 * @return
	 */
	public int getType() {
		return type;
	}
	/**
	 * 设置 验证码类型  0：模拟盘  1：私盘
	 * @param type
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * 获得 验证码
	 * @return
	 */
	public String getVeriCode() {
		return veriCode;
	}
	/**
	 * 设置 验证码
	 * @param veriCode
	 */
	public void setVeriCode(String veriCode) {
		this.veriCode = veriCode;
	}
	/**
	 * 获得 发送时间
	 * @return
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置 发送时间
	 * @param createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获得 是否已经使用
	 * @return
	 */
	public boolean isUsed() {
		return used;
	}
	/**
	 * 设置 是否已经使用
	 * @param used
	 */
	public void setUsed(boolean used) {
		this.used = used;
	}
	@Override
	public String toString() {
		return "VeriCode [id=" + id + ", mobilePhone=" + mobilePhone
				+ ", type=" + type + ", veriCode=" + veriCode + ", createTime="
				+ createTime + ", used=" + used + "]";
	}
	public VeriCode(){}
	public VeriCode(String mobilePhone,String veriCode,int type){
		this.mobilePhone = mobilePhone;
		this.veriCode = veriCode;
		this.type = type;
	}
}
