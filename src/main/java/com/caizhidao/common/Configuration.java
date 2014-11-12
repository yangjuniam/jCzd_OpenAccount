package com.caizhidao.common;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import java.io.Serializable;

/**
 * 系统配置参数
 * 
 * @author Jail Hu
 * 
 */
public class Configuration implements Serializable {
	private static final long serialVersionUID = -8557407685178026272L;
	private static Logger logger = Logger.getLogger(Configuration.class);

	/*
	 * 当前环境， 模拟盘: development 实盘： production
	 */
	private String env;

	/*
	 * 网上开户平台的通讯标识_实盘
	 */
	private String aq_tjpmeToken;

	/*
	 * 会员ID_实盘
	 */
	private String aq_memberNo;
	
	/*
	 * 网上开户平台的通讯标识_模拟盘
	 */
	private String sim_tjpmeToken;

	/*
	 * 会员ID_模拟盘
	 */
	private String sim_memberNo;

	/*
	 * 短信接口地址
	 */
	private String sms_url;
	private static Configuration config;
	
	/**
	 * 获得 当前环境， 模拟盘: development 实盘： production
	 * 
	 * @return
	 */
	public String getEnv() {
		return env;
	}

	/**
	 * 设置 当前环境， 模拟盘: development 实盘： production
	 * 
	 * @param env
	 */
	public void setEnv(String env) {
		this.env = env;
	}

	/**
	 * 获得 网上开户平台的通讯标识_实盘
	 * 
	 * @return String
	 */ 
	public String getAq_tjpmeToken() {
		return aq_tjpmeToken;
	}

	/**
	 * 设置 网上开户平台的通讯标识_实盘
	 * 
	 * @param aq_tjpmeToken  网上开户平台的通讯标识_实盘
	 */
	public void setAq_tjpmeToken(String aq_tjpmeToken) {
		this.aq_tjpmeToken = aq_tjpmeToken;
	}

	/**
	 * 获得 会员ID_实盘
	 * 
	 * @return String
	 */
	public String getAq_memberNo() {
		return aq_memberNo;
	}

	/**
	 * 设置 会员ID_实盘
	 * 
	 * @param aq_memberNo 会员ID_实盘
	 */ 
	public void setAq_memberNo(String aq_memberNo) {
		this.aq_memberNo = aq_memberNo;
	}

	/**
	 * 获得 网上开户平台的通讯标识_模拟盘
	 * @return String
	 */
	public String getSim_tjpmeToken() {
		return sim_tjpmeToken;
	}
	/**
	 * 设置 网上开户平台的通讯标识_模拟盘
	 * @param sim_tjpmeToken
	 */
	public void setSim_tjpmeToken(String sim_tjpmeToken) {
		this.sim_tjpmeToken = sim_tjpmeToken;
	}
	
	/**
	 * 获得  会员ID_模拟盘
	 * @return String
	 */
	public String getSim_memberNo() {
		return sim_memberNo;
	}
	/**
	 * 设置 会员ID_模拟盘
	 * @param sim_memberNo
	 */
	public void setSim_memberNo(String sim_memberNo) {
		this.sim_memberNo = sim_memberNo;
	}

	/**
	 * 获得单例
	 * 
	 * @return Configuration
	 */
	public synchronized static Configuration getInstance() {
		if (config == null) {
			config = new Configuration();
			try {
				PropertiesConfiguration globalProperties = new PropertiesConfiguration(
						"global.properties");
				config.setEnv(globalProperties.getString("env"));

				PropertiesConfiguration setupProperties = new PropertiesConfiguration(
						config.getEnv() + "_czd.properties");
				config.setAq_tjpmeToken(setupProperties.getString("aq_tjpmeToken"));
				config.setAq_memberNo(setupProperties.getString("aq_memberNo"));
				config.setSim_tjpmeToken(setupProperties.getString("sim_tjpmeToken"));
				config.setSim_memberNo(setupProperties.getString("sim_memberNo"));
				config.setSms_url(setupProperties.getString("sms_url"));
			} catch (ConfigurationException e) {
				logger.error("加载配置文件失败:  " + e.getMessage());
				e.printStackTrace();
			}
		}
		return config;
	}

	/**
	 * 私有化默认构造函数
	 */
	private Configuration() {

	}

	
	/**
	 * 判断是否 开发环境
	 * @return boolean
	 */
	public boolean isDevelopment(){
		return this.getEnv().equals("development");
	}
	
	/**
	 * 判断是否正式环境
	 * @return boolean
	 */
	public boolean isProduction(){
		return this.getEnv().equals("production");
	}

	/**
	 * 获得  短信接口地址
	 * @return String
	 */
	public String getSms_url() {
		return sms_url;
	}

	/**
	 * 设置  短信接口地址
	 * @param sms_url  短信接口地址
	 */
	public void setSms_url(String sms_url) {
		this.sms_url = sms_url;
	}

	@Override
	public String toString() {
		return "Configuration [env=" + env + ", aq_tjpmeToken=" + aq_tjpmeToken
				+ ", aq_memberNo=" + aq_memberNo + ", sim_tjpmeToken="
				+ sim_tjpmeToken + ", sim_memberNo=" + sim_memberNo
				+ ", sms_url=" + sms_url + "]";
	}

}
