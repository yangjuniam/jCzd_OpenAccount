package com.caizhidao.base.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;


/**
 * 分页抽象类
 * @author Jail Hu
 *  用于分页的底层抽象类
 */
@Alias("pageEntity")
public abstract class Page implements Serializable{
	private static final long serialVersionUID = -86455L;
	//查询  条件
	private String where;
	//排序 条件 ，无需输入 Order by
	private String order;
	//页号 第一页为1 
	private int pageNo = 1;
	//页尺寸
	private int pageSize = 20;
	
//	public int getNextPageNo();
//	public int getPreviewPageNo();

	/**
	 * 获得页号，页号从 1 开始
	 * @return int
	 */
	public int getPageNo() {
		return pageNo;
	}
	/**
	 * 设置页号,页号从 1 开始
	 * @param pageNo 页码
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	/**
	 * 获得 查询 条件
	 * @return string
	 */
	public String getWhere() {
		return where;
	}
	/**
	 * 设置 查询 条件
	 * @param where 查询条件
	 */
	public void setWhere(String where) {
		this.where = where;
	}
	/**
	 * 获得 排序 条件
	 * @return string
	 */
	public String getOrder() {
		return order;
	}
	/**
	 * 设置 排序 条件，无需输入 Order by
	 * @param order 排序条件
	 */
	public void setOrder(String order) {
		this.order = order;
	}
	/**
	 * 获得 页尺寸
	 * @return int 
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * 设置 页尺寸
	 * @param pageSize 页尺寸
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	/**
	 * 获得 where / order 的 sql 补充语句
	 * @return string
	 */
	public String getExtensionSql() {
		return (this.getWhere() == null ? "" : " where " + this.getWhere())
				+ (this.getOrder() == null ? "" : " order by "
						+ this.getOrder());
	}
	/**
	 * 获得 limit 补充 sql
	 * @return string
	 */
	public String getLimitSql() {
		return " limit "
				+ ((this.getPageNo() < 1 ? 0 : this.getPageNo() - 1) * this
						.getPageSize()) + "," + this.getPageSize();
	}
}
 