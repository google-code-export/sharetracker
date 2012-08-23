package com.prem.share.dm.db;

import java.io.Serializable;

public class Commodity implements Serializable {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column commodity.commodity_id
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	private String commodityId;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column commodity.exchange
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	private String exchange;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column commodity.description
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	private String description;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column commodity.quantity
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	private Integer quantity;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table commodity
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column commodity.commodity_id
	 * @return  the value of commodity.commodity_id
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	public String getCommodityId() {
		return commodityId;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column commodity.commodity_id
	 * @param commodityId  the value for commodity.commodity_id
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId == null ? null : commodityId.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column commodity.exchange
	 * @return  the value of commodity.exchange
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	public String getExchange() {
		return exchange;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column commodity.exchange
	 * @param exchange  the value for commodity.exchange
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	public void setExchange(String exchange) {
		this.exchange = exchange == null ? null : exchange.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column commodity.description
	 * @return  the value of commodity.description
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column commodity.description
	 * @param description  the value for commodity.description
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column commodity.quantity
	 * @return  the value of commodity.quantity
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column commodity.quantity
	 * @param quantity  the value for commodity.quantity
	 * @ibatorgenerated  Mon Oct 24 16:28:18 IST 2011
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}