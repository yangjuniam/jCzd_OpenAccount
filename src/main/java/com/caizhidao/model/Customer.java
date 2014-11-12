package com.caizhidao.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.caizhidao.base.model.Page;

@Alias("customer")
public class Customer extends Page {
	private static final long serialVersionUID = 2403622653070489361L;
	/*
	 * 主键
	 */
	private int id;
	/*
	 * 财之道会员ID
	 */
	private int userCode;
	/*
	 * 交易账号
	 */
	private String customerNo;
	/*
	 * 客户名称
	 */
	private String customerName;
	/*
	 * 证件类型（附录一）注：目前只支持身份证
	 */
	private String papersType;
	/*
	 * 证件号
	 */
	private String papersNum;
	/*
	 * 性别（男：0，女：1；0和1之外的值视为默认0）
	 */
	private String gender;
	/*
	 * 所属省份
	 */
	private String province;
	/*
	 * 所属城市
	 */
	private String city;
	/*
	 * 所属区/县
	 */
	private String area;
	/*
	 * 交易密码
	 */
	private String tradePWD;
	/*
	 * 电话交易密码
	 */
	private String phonePWD;
	/*
	 * 电话号码
	 */
	private String phone;
	/*
	 * 传真
	 */
	private String fax;
	/*
	 * 邮编
	 */
	private String postcode;
	/*
	 * 邮件地址
	 */
	private String email;
	/*
	 * 地址
	 */
	private String address;
	/*
	 * 居间代码
	 */
	private String brokerageNo;
	/*
	 * 机构代码
	 */
	private String organizationNo;
	/*
	 * 证件类别（参见附录三）注：目前只支持身份证
	 */
	private String IDType;
	/*
	 * 银行账号
	 */
	private String bankAcc;
	/*
	 * 银行代码字段（参见附录二）
	 */
	private String checkBankCard;
	/*
	 * 视频文件夹名字
	 */
	private String recordFile;
	/*
	 * 推荐经纪人ID
	 */
	private Integer recommendUserCode;
	/*
	 * 房间邀请码
	 */
	private String realBrokerNo;

	/*
	 * 是否已经开户
	 */
	private boolean status;

	/*
	 * 成功开户时间
	 */
	private Date openDate;

	/**
	 * 获得主键
	 * 
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * 设置主键
	 * 
	 * @param id
	 *            主键
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 获得财之道会员ID
	 * 
	 * @return int
	 */
	public int getUserCode() {
		return userCode;
	}

	/**
	 * 设置财之道会员ID
	 * 
	 * @param userCode
	 *            财之道会员ID
	 */
	public void setUserCode(int userCode) {
		this.userCode = userCode;
	}

	/**
	 * 获得 交易账号
	 * 
	 * @return String
	 */
	public String getCustomerNo() {
		return customerNo;
	}

	/**
	 * 设置 交易账号
	 * 
	 * @param customerNo
	 *            交易账号
	 */
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	/**
	 * 获得 客户名称
	 * 
	 * @return String
	 */
	public String getCustomerName() {
		return this.customerName;
	}

	/**
	 * 设置 客户名称
	 * 
	 * @param customerName
	 *            客户名称
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * 获得 证件类型
	 * 
	 * @return String
	 */
	public String getPapersType() {
		return papersType == null ? null : papersType.toUpperCase();
	}

	/**
	 * 设置 证件类型
	 * 
	 * @param papersType
	 *            证件类型
	 */
	public void setPapersType(String papersType) {
		this.papersType = papersType;
	}

	/**
	 * 获得 证件号
	 * 
	 * @return String
	 */
	public String getPapersNum() {
		return papersNum;
	}

	/**
	 * 设置 证件号
	 * 
	 * @param papersNum
	 *            证件号
	 */
	public void setPapersNum(String papersNum) {
		this.papersNum = papersNum;
	}

	/**
	 * 获得 性别
	 * 
	 * @return String
	 */
	public String getGender() {
		String ne = this.getPapersNum().replaceAll("[^\\d]", "");
		return ne.substring(ne.length() - 1, ne.length());
	}

	/**
	 * 设置 性别
	 * 
	 * @param gender
	 *            性别
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 获得 所属省份
	 * 
	 * @return String
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * 设置 所属省份
	 * 
	 * @param province
	 *            所属省份
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * 获得 所属城市
	 * 
	 * @return String
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 设置 所属城市
	 * 
	 * @param city
	 *            所属城市
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 获得 所属区/县
	 * 
	 * @return String
	 */
	public String getArea() {
		return area;
	}

	/**
	 * 设置 所属区/县
	 * 
	 * @param area
	 *            所属区/县
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * 获得 交易密码
	 * 
	 * @return String
	 */
	public String getTradePWD() {
		return tradePWD;
	}

	/**
	 * 设置 交易密码
	 * 
	 * @param tradePWD
	 *            交易密码
	 */
	public void setTradePWD(String tradePWD) {
		this.tradePWD = tradePWD;
	}

	/**
	 * 获得 电话密码
	 * 
	 * @return String
	 */
	public String getPhonePWD() {
		return phonePWD;
	}

	/**
	 * 设置 电话密码
	 * 
	 * @param phonePWD
	 *            电话密码
	 */
	public void setPhonePWD(String phonePWD) {
		this.phonePWD = phonePWD;
	}

	/**
	 * 获得 电话
	 * 
	 * @return String
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 设置 电话
	 * 
	 * @param phone
	 *            电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 获得 传真
	 * 
	 * @return String
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * 设置 传真
	 * 
	 * @param fax
	 *            传真
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * 获得 邮编
	 * 
	 * @return String
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * 设置 邮编
	 * 
	 * @param postcode
	 *            邮编
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * 获得 邮件
	 * 
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置 邮件
	 * 
	 * @param email
	 *            邮件
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获得 地址
	 * 
	 * @return String
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 设置 地址
	 * 
	 * @param address
	 *            地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 获得 居间代码
	 * 
	 * @return String
	 */
	public String getBrokerageNo() {
		return brokerageNo;
	}

	/**
	 * 设置 居间代码
	 * 
	 * @param brokerageNo
	 *            居间代码
	 */
	public void setBrokerageNo(String brokerageNo) {
		this.brokerageNo = brokerageNo;
	}

	/**
	 * 获得 机构代码
	 * 
	 * @return String
	 */
	public String getOrganizationNo() {
		return organizationNo;
	}

	/**
	 * 设置 机构代码
	 * 
	 * @param organizationNo
	 *            机构代码
	 */
	public void setOrganizationNo(String organizationNo) {
		this.organizationNo = organizationNo;
	}

	/**
	 * 获得 证件类别
	 * 
	 * @return
	 */
	public String getIDType() {
		return IDType;
	}

	/**
	 * 设置 证件类型
	 * 
	 * @param iDType
	 */
	public void setIDType(String iDType) {
		IDType = iDType;
	}

	/**
	 * 获得 银行账号
	 * 
	 * @return
	 */
	public String getBankAcc() {
		return bankAcc;
	}

	/**
	 * 设置 银行账号
	 * 
	 * @param bankAcc
	 */
	public void setBankAcc(String bankAcc) {
		this.bankAcc = bankAcc;
	}

	/**
	 * 获得 银行代码字段
	 * 
	 * @return
	 */
	public String getCheckBankCard() {
		return checkBankCard;
	}

	/**
	 * 设置 银行代码字段
	 * 
	 * @param checkBankCard
	 *            银行代码字段
	 */
	public void setCheckBankCard(String checkBankCard) {
		this.checkBankCard = checkBankCard;
	}

	/**
	 * 获得 视频文件夹名字
	 * 
	 * @return String
	 */
	public String getRecordFile() {
		return recordFile;
	}

	/**
	 * 设置 文件夹名字
	 * 
	 * @param recordFile
	 *            文件夹名字
	 */
	public void setRecordFile(String recordFile) {
		this.recordFile = recordFile;
	}

	/**
	 * 获得 是否已经开户
	 * 
	 * @return boolean
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * 设置 是否已经开户
	 * 
	 * @param status
	 *            是否已经开户
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * 获得 推荐经纪人ID
	 */
	public Integer getRecommendUserCode() {
		return recommendUserCode;
	}

	/**
	 * 设置 推荐经纪人ID
	 */
	public void setRecommendUserCode(Integer recommendUserCode) {
		this.recommendUserCode = recommendUserCode;
	}

	/**
	 * 获得 成功开户时间 return 成功开户时间
	 */
	public Date getOpenDate() {
		return openDate;
	}

	/**
	 * 设置 成功开户时间
	 */
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	/**
	 * 获得 房间邀请码
	 * 
	 * @return String
	 */
	public String getRealBrokerNo() {
		return realBrokerNo;
	}

	/**
	 * 设置 房间邀请码
	 */
	public void setRealBrokerNo(String realBrokerNo) {
		this.realBrokerNo = realBrokerNo;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", userCode=" + userCode
				+ ", customerNo=" + customerNo + ", customerName="
				+ customerName + ", papersType=" + papersType + ", papersNum="
				+ papersNum + ", gender=" + gender + ", province=" + province
				+ ", city=" + city + ", area=" + area + ", tradePWD="
				+ tradePWD + ", phonePWD=" + phonePWD + ", phone=" + phone
				+ ", fax=" + fax + ", postcode=" + postcode + ", email="
				+ email + ", address=" + address + ", brokerageNo="
				+ brokerageNo + ", organizationNo=" + organizationNo
				+ ", IDType=" + IDType + ", bankAcc=" + bankAcc
				+ ", checkBankCard=" + checkBankCard + ", recordFile="
				+ recordFile + ", recommendUserCode=" + recommendUserCode
				+ ", realBrokerNo=" + realBrokerNo + ", status=" + status
				+ ", openDate=" + openDate + "]";
	}
}
