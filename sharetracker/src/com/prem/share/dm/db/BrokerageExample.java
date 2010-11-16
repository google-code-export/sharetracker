package com.prem.share.dm.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrokerageExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table brokerage
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table brokerage
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	public BrokerageExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	protected BrokerageExample(BrokerageExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table brokerage
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	public static class Criteria {
		protected List<String> criteriaWithoutValue;
		protected List<Map<String, Object>> criteriaWithSingleValue;
		protected List<Map<String, Object>> criteriaWithListValue;
		protected List<Map<String, Object>> criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList<String>();
			criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
			criteriaWithListValue = new ArrayList<Map<String, Object>>();
			criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0
					|| criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0
					|| criteriaWithBetweenValue.size() > 0;
		}

		public List<String> getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List<Map<String, Object>> getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List<Map<String, Object>> getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List<Map<String, Object>> getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition,
				List<? extends Object> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List<Object> list = new ArrayList<Object>();
			list.add(value1);
			list.add(value2);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return this;
		}

		public Criteria andSecurityTypeIsNull() {
			addCriterion("security_type is null");
			return this;
		}

		public Criteria andSecurityTypeIsNotNull() {
			addCriterion("security_type is not null");
			return this;
		}

		public Criteria andSecurityTypeEqualTo(String value) {
			addCriterion("security_type =", value, "securityType");
			return this;
		}

		public Criteria andSecurityTypeNotEqualTo(String value) {
			addCriterion("security_type <>", value, "securityType");
			return this;
		}

		public Criteria andSecurityTypeGreaterThan(String value) {
			addCriterion("security_type >", value, "securityType");
			return this;
		}

		public Criteria andSecurityTypeGreaterThanOrEqualTo(String value) {
			addCriterion("security_type >=", value, "securityType");
			return this;
		}

		public Criteria andSecurityTypeLessThan(String value) {
			addCriterion("security_type <", value, "securityType");
			return this;
		}

		public Criteria andSecurityTypeLessThanOrEqualTo(String value) {
			addCriterion("security_type <=", value, "securityType");
			return this;
		}

		public Criteria andSecurityTypeLike(String value) {
			addCriterion("security_type like", value, "securityType");
			return this;
		}

		public Criteria andSecurityTypeNotLike(String value) {
			addCriterion("security_type not like", value, "securityType");
			return this;
		}

		public Criteria andSecurityTypeIn(List<String> values) {
			addCriterion("security_type in", values, "securityType");
			return this;
		}

		public Criteria andSecurityTypeNotIn(List<String> values) {
			addCriterion("security_type not in", values, "securityType");
			return this;
		}

		public Criteria andSecurityTypeBetween(String value1, String value2) {
			addCriterion("security_type between", value1, value2,
					"securityType");
			return this;
		}

		public Criteria andSecurityTypeNotBetween(String value1, String value2) {
			addCriterion("security_type not between", value1, value2,
					"securityType");
			return this;
		}

		public Criteria andTransactionTypeIsNull() {
			addCriterion("transaction_type is null");
			return this;
		}

		public Criteria andTransactionTypeIsNotNull() {
			addCriterion("transaction_type is not null");
			return this;
		}

		public Criteria andTransactionTypeEqualTo(String value) {
			addCriterion("transaction_type =", value, "transactionType");
			return this;
		}

		public Criteria andTransactionTypeNotEqualTo(String value) {
			addCriterion("transaction_type <>", value, "transactionType");
			return this;
		}

		public Criteria andTransactionTypeGreaterThan(String value) {
			addCriterion("transaction_type >", value, "transactionType");
			return this;
		}

		public Criteria andTransactionTypeGreaterThanOrEqualTo(String value) {
			addCriterion("transaction_type >=", value, "transactionType");
			return this;
		}

		public Criteria andTransactionTypeLessThan(String value) {
			addCriterion("transaction_type <", value, "transactionType");
			return this;
		}

		public Criteria andTransactionTypeLessThanOrEqualTo(String value) {
			addCriterion("transaction_type <=", value, "transactionType");
			return this;
		}

		public Criteria andTransactionTypeLike(String value) {
			addCriterion("transaction_type like", value, "transactionType");
			return this;
		}

		public Criteria andTransactionTypeNotLike(String value) {
			addCriterion("transaction_type not like", value, "transactionType");
			return this;
		}

		public Criteria andTransactionTypeIn(List<String> values) {
			addCriterion("transaction_type in", values, "transactionType");
			return this;
		}

		public Criteria andTransactionTypeNotIn(List<String> values) {
			addCriterion("transaction_type not in", values, "transactionType");
			return this;
		}

		public Criteria andTransactionTypeBetween(String value1, String value2) {
			addCriterion("transaction_type between", value1, value2,
					"transactionType");
			return this;
		}

		public Criteria andTransactionTypeNotBetween(String value1,
				String value2) {
			addCriterion("transaction_type not between", value1, value2,
					"transactionType");
			return this;
		}

		public Criteria andTradeTypeIsNull() {
			addCriterion("trade_type is null");
			return this;
		}

		public Criteria andTradeTypeIsNotNull() {
			addCriterion("trade_type is not null");
			return this;
		}

		public Criteria andTradeTypeEqualTo(String value) {
			addCriterion("trade_type =", value, "tradeType");
			return this;
		}

		public Criteria andTradeTypeNotEqualTo(String value) {
			addCriterion("trade_type <>", value, "tradeType");
			return this;
		}

		public Criteria andTradeTypeGreaterThan(String value) {
			addCriterion("trade_type >", value, "tradeType");
			return this;
		}

		public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
			addCriterion("trade_type >=", value, "tradeType");
			return this;
		}

		public Criteria andTradeTypeLessThan(String value) {
			addCriterion("trade_type <", value, "tradeType");
			return this;
		}

		public Criteria andTradeTypeLessThanOrEqualTo(String value) {
			addCriterion("trade_type <=", value, "tradeType");
			return this;
		}

		public Criteria andTradeTypeLike(String value) {
			addCriterion("trade_type like", value, "tradeType");
			return this;
		}

		public Criteria andTradeTypeNotLike(String value) {
			addCriterion("trade_type not like", value, "tradeType");
			return this;
		}

		public Criteria andTradeTypeIn(List<String> values) {
			addCriterion("trade_type in", values, "tradeType");
			return this;
		}

		public Criteria andTradeTypeNotIn(List<String> values) {
			addCriterion("trade_type not in", values, "tradeType");
			return this;
		}

		public Criteria andTradeTypeBetween(String value1, String value2) {
			addCriterion("trade_type between", value1, value2, "tradeType");
			return this;
		}

		public Criteria andTradeTypeNotBetween(String value1, String value2) {
			addCriterion("trade_type not between", value1, value2, "tradeType");
			return this;
		}

		public Criteria andBrokerageChargeIsNull() {
			addCriterion("brokerage_charge is null");
			return this;
		}

		public Criteria andBrokerageChargeIsNotNull() {
			addCriterion("brokerage_charge is not null");
			return this;
		}

		public Criteria andBrokerageChargeEqualTo(BigDecimal value) {
			addCriterion("brokerage_charge =", value, "brokerageCharge");
			return this;
		}

		public Criteria andBrokerageChargeNotEqualTo(BigDecimal value) {
			addCriterion("brokerage_charge <>", value, "brokerageCharge");
			return this;
		}

		public Criteria andBrokerageChargeGreaterThan(BigDecimal value) {
			addCriterion("brokerage_charge >", value, "brokerageCharge");
			return this;
		}

		public Criteria andBrokerageChargeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("brokerage_charge >=", value, "brokerageCharge");
			return this;
		}

		public Criteria andBrokerageChargeLessThan(BigDecimal value) {
			addCriterion("brokerage_charge <", value, "brokerageCharge");
			return this;
		}

		public Criteria andBrokerageChargeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("brokerage_charge <=", value, "brokerageCharge");
			return this;
		}

		public Criteria andBrokerageChargeIn(List<BigDecimal> values) {
			addCriterion("brokerage_charge in", values, "brokerageCharge");
			return this;
		}

		public Criteria andBrokerageChargeNotIn(List<BigDecimal> values) {
			addCriterion("brokerage_charge not in", values, "brokerageCharge");
			return this;
		}

		public Criteria andBrokerageChargeBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("brokerage_charge between", value1, value2,
					"brokerageCharge");
			return this;
		}

		public Criteria andBrokerageChargeNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("brokerage_charge not between", value1, value2,
					"brokerageCharge");
			return this;
		}

		public Criteria andServiceTaxChargeIsNull() {
			addCriterion("service_tax_charge is null");
			return this;
		}

		public Criteria andServiceTaxChargeIsNotNull() {
			addCriterion("service_tax_charge is not null");
			return this;
		}

		public Criteria andServiceTaxChargeEqualTo(BigDecimal value) {
			addCriterion("service_tax_charge =", value, "serviceTaxCharge");
			return this;
		}

		public Criteria andServiceTaxChargeNotEqualTo(BigDecimal value) {
			addCriterion("service_tax_charge <>", value, "serviceTaxCharge");
			return this;
		}

		public Criteria andServiceTaxChargeGreaterThan(BigDecimal value) {
			addCriterion("service_tax_charge >", value, "serviceTaxCharge");
			return this;
		}

		public Criteria andServiceTaxChargeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("service_tax_charge >=", value, "serviceTaxCharge");
			return this;
		}

		public Criteria andServiceTaxChargeLessThan(BigDecimal value) {
			addCriterion("service_tax_charge <", value, "serviceTaxCharge");
			return this;
		}

		public Criteria andServiceTaxChargeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("service_tax_charge <=", value, "serviceTaxCharge");
			return this;
		}

		public Criteria andServiceTaxChargeIn(List<BigDecimal> values) {
			addCriterion("service_tax_charge in", values, "serviceTaxCharge");
			return this;
		}

		public Criteria andServiceTaxChargeNotIn(List<BigDecimal> values) {
			addCriterion("service_tax_charge not in", values,
					"serviceTaxCharge");
			return this;
		}

		public Criteria andServiceTaxChargeBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("service_tax_charge between", value1, value2,
					"serviceTaxCharge");
			return this;
		}

		public Criteria andServiceTaxChargeNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("service_tax_charge not between", value1, value2,
					"serviceTaxCharge");
			return this;
		}

		public Criteria andSttChargeIsNull() {
			addCriterion("stt_charge is null");
			return this;
		}

		public Criteria andSttChargeIsNotNull() {
			addCriterion("stt_charge is not null");
			return this;
		}

		public Criteria andSttChargeEqualTo(BigDecimal value) {
			addCriterion("stt_charge =", value, "sttCharge");
			return this;
		}

		public Criteria andSttChargeNotEqualTo(BigDecimal value) {
			addCriterion("stt_charge <>", value, "sttCharge");
			return this;
		}

		public Criteria andSttChargeGreaterThan(BigDecimal value) {
			addCriterion("stt_charge >", value, "sttCharge");
			return this;
		}

		public Criteria andSttChargeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("stt_charge >=", value, "sttCharge");
			return this;
		}

		public Criteria andSttChargeLessThan(BigDecimal value) {
			addCriterion("stt_charge <", value, "sttCharge");
			return this;
		}

		public Criteria andSttChargeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("stt_charge <=", value, "sttCharge");
			return this;
		}

		public Criteria andSttChargeIn(List<BigDecimal> values) {
			addCriterion("stt_charge in", values, "sttCharge");
			return this;
		}

		public Criteria andSttChargeNotIn(List<BigDecimal> values) {
			addCriterion("stt_charge not in", values, "sttCharge");
			return this;
		}

		public Criteria andSttChargeBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("stt_charge between", value1, value2, "sttCharge");
			return this;
		}

		public Criteria andSttChargeNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("stt_charge not between", value1, value2, "sttCharge");
			return this;
		}

		public Criteria andStampDutyChargeIsNull() {
			addCriterion("stamp_duty_charge is null");
			return this;
		}

		public Criteria andStampDutyChargeIsNotNull() {
			addCriterion("stamp_duty_charge is not null");
			return this;
		}

		public Criteria andStampDutyChargeEqualTo(BigDecimal value) {
			addCriterion("stamp_duty_charge =", value, "stampDutyCharge");
			return this;
		}

		public Criteria andStampDutyChargeNotEqualTo(BigDecimal value) {
			addCriterion("stamp_duty_charge <>", value, "stampDutyCharge");
			return this;
		}

		public Criteria andStampDutyChargeGreaterThan(BigDecimal value) {
			addCriterion("stamp_duty_charge >", value, "stampDutyCharge");
			return this;
		}

		public Criteria andStampDutyChargeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("stamp_duty_charge >=", value, "stampDutyCharge");
			return this;
		}

		public Criteria andStampDutyChargeLessThan(BigDecimal value) {
			addCriterion("stamp_duty_charge <", value, "stampDutyCharge");
			return this;
		}

		public Criteria andStampDutyChargeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("stamp_duty_charge <=", value, "stampDutyCharge");
			return this;
		}

		public Criteria andStampDutyChargeIn(List<BigDecimal> values) {
			addCriterion("stamp_duty_charge in", values, "stampDutyCharge");
			return this;
		}

		public Criteria andStampDutyChargeNotIn(List<BigDecimal> values) {
			addCriterion("stamp_duty_charge not in", values, "stampDutyCharge");
			return this;
		}

		public Criteria andStampDutyChargeBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("stamp_duty_charge between", value1, value2,
					"stampDutyCharge");
			return this;
		}

		public Criteria andStampDutyChargeNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("stamp_duty_charge not between", value1, value2,
					"stampDutyCharge");
			return this;
		}

		public Criteria andTransactionChargeIsNull() {
			addCriterion("transaction_charge is null");
			return this;
		}

		public Criteria andTransactionChargeIsNotNull() {
			addCriterion("transaction_charge is not null");
			return this;
		}

		public Criteria andTransactionChargeEqualTo(BigDecimal value) {
			addCriterion("transaction_charge =", value, "transactionCharge");
			return this;
		}

		public Criteria andTransactionChargeNotEqualTo(BigDecimal value) {
			addCriterion("transaction_charge <>", value, "transactionCharge");
			return this;
		}

		public Criteria andTransactionChargeGreaterThan(BigDecimal value) {
			addCriterion("transaction_charge >", value, "transactionCharge");
			return this;
		}

		public Criteria andTransactionChargeGreaterThanOrEqualTo(
				BigDecimal value) {
			addCriterion("transaction_charge >=", value, "transactionCharge");
			return this;
		}

		public Criteria andTransactionChargeLessThan(BigDecimal value) {
			addCriterion("transaction_charge <", value, "transactionCharge");
			return this;
		}

		public Criteria andTransactionChargeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("transaction_charge <=", value, "transactionCharge");
			return this;
		}

		public Criteria andTransactionChargeIn(List<BigDecimal> values) {
			addCriterion("transaction_charge in", values, "transactionCharge");
			return this;
		}

		public Criteria andTransactionChargeNotIn(List<BigDecimal> values) {
			addCriterion("transaction_charge not in", values,
					"transactionCharge");
			return this;
		}

		public Criteria andTransactionChargeBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("transaction_charge between", value1, value2,
					"transactionCharge");
			return this;
		}

		public Criteria andTransactionChargeNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("transaction_charge not between", value1, value2,
					"transactionCharge");
			return this;
		}
	}
}