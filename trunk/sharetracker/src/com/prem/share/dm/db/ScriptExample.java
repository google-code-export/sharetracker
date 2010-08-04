package com.prem.share.dm.db;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScriptExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table script
	 * @ibatorgenerated  Wed Aug 04 18:25:48 GMT+05:30 2010
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table script
	 * @ibatorgenerated  Wed Aug 04 18:25:48 GMT+05:30 2010
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Wed Aug 04 18:25:48 GMT+05:30 2010
	 */
	public ScriptExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Wed Aug 04 18:25:48 GMT+05:30 2010
	 */
	protected ScriptExample(ScriptExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Wed Aug 04 18:25:48 GMT+05:30 2010
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Wed Aug 04 18:25:48 GMT+05:30 2010
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Wed Aug 04 18:25:48 GMT+05:30 2010
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Wed Aug 04 18:25:48 GMT+05:30 2010
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Wed Aug 04 18:25:48 GMT+05:30 2010
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Wed Aug 04 18:25:48 GMT+05:30 2010
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Wed Aug 04 18:25:48 GMT+05:30 2010
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table script
	 * @ibatorgenerated  Wed Aug 04 18:25:48 GMT+05:30 2010
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

		public Criteria andScriptIdIsNull() {
			addCriterion("script_id is null");
			return this;
		}

		public Criteria andScriptIdIsNotNull() {
			addCriterion("script_id is not null");
			return this;
		}

		public Criteria andScriptIdEqualTo(String value) {
			addCriterion("script_id =", value, "scriptId");
			return this;
		}

		public Criteria andScriptIdNotEqualTo(String value) {
			addCriterion("script_id <>", value, "scriptId");
			return this;
		}

		public Criteria andScriptIdGreaterThan(String value) {
			addCriterion("script_id >", value, "scriptId");
			return this;
		}

		public Criteria andScriptIdGreaterThanOrEqualTo(String value) {
			addCriterion("script_id >=", value, "scriptId");
			return this;
		}

		public Criteria andScriptIdLessThan(String value) {
			addCriterion("script_id <", value, "scriptId");
			return this;
		}

		public Criteria andScriptIdLessThanOrEqualTo(String value) {
			addCriterion("script_id <=", value, "scriptId");
			return this;
		}

		public Criteria andScriptIdLike(String value) {
			addCriterion("script_id like", value, "scriptId");
			return this;
		}

		public Criteria andScriptIdNotLike(String value) {
			addCriterion("script_id not like", value, "scriptId");
			return this;
		}

		public Criteria andScriptIdIn(List<String> values) {
			addCriterion("script_id in", values, "scriptId");
			return this;
		}

		public Criteria andScriptIdNotIn(List<String> values) {
			addCriterion("script_id not in", values, "scriptId");
			return this;
		}

		public Criteria andScriptIdBetween(String value1, String value2) {
			addCriterion("script_id between", value1, value2, "scriptId");
			return this;
		}

		public Criteria andScriptIdNotBetween(String value1, String value2) {
			addCriterion("script_id not between", value1, value2, "scriptId");
			return this;
		}

		public Criteria andScriptNameIsNull() {
			addCriterion("script_name is null");
			return this;
		}

		public Criteria andScriptNameIsNotNull() {
			addCriterion("script_name is not null");
			return this;
		}

		public Criteria andScriptNameEqualTo(String value) {
			addCriterion("script_name =", value, "scriptName");
			return this;
		}

		public Criteria andScriptNameNotEqualTo(String value) {
			addCriterion("script_name <>", value, "scriptName");
			return this;
		}

		public Criteria andScriptNameGreaterThan(String value) {
			addCriterion("script_name >", value, "scriptName");
			return this;
		}

		public Criteria andScriptNameGreaterThanOrEqualTo(String value) {
			addCriterion("script_name >=", value, "scriptName");
			return this;
		}

		public Criteria andScriptNameLessThan(String value) {
			addCriterion("script_name <", value, "scriptName");
			return this;
		}

		public Criteria andScriptNameLessThanOrEqualTo(String value) {
			addCriterion("script_name <=", value, "scriptName");
			return this;
		}

		public Criteria andScriptNameLike(String value) {
			addCriterion("script_name like", value, "scriptName");
			return this;
		}

		public Criteria andScriptNameNotLike(String value) {
			addCriterion("script_name not like", value, "scriptName");
			return this;
		}

		public Criteria andScriptNameIn(List<String> values) {
			addCriterion("script_name in", values, "scriptName");
			return this;
		}

		public Criteria andScriptNameNotIn(List<String> values) {
			addCriterion("script_name not in", values, "scriptName");
			return this;
		}

		public Criteria andScriptNameBetween(String value1, String value2) {
			addCriterion("script_name between", value1, value2, "scriptName");
			return this;
		}

		public Criteria andScriptNameNotBetween(String value1, String value2) {
			addCriterion("script_name not between", value1, value2,
					"scriptName");
			return this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2,
					"description");
			return this;
		}

		public Criteria andUrlIsNull() {
			addCriterion("url is null");
			return this;
		}

		public Criteria andUrlIsNotNull() {
			addCriterion("url is not null");
			return this;
		}

		public Criteria andUrlEqualTo(String value) {
			addCriterion("url =", value, "url");
			return this;
		}

		public Criteria andUrlNotEqualTo(String value) {
			addCriterion("url <>", value, "url");
			return this;
		}

		public Criteria andUrlGreaterThan(String value) {
			addCriterion("url >", value, "url");
			return this;
		}

		public Criteria andUrlGreaterThanOrEqualTo(String value) {
			addCriterion("url >=", value, "url");
			return this;
		}

		public Criteria andUrlLessThan(String value) {
			addCriterion("url <", value, "url");
			return this;
		}

		public Criteria andUrlLessThanOrEqualTo(String value) {
			addCriterion("url <=", value, "url");
			return this;
		}

		public Criteria andUrlLike(String value) {
			addCriterion("url like", value, "url");
			return this;
		}

		public Criteria andUrlNotLike(String value) {
			addCriterion("url not like", value, "url");
			return this;
		}

		public Criteria andUrlIn(List<String> values) {
			addCriterion("url in", values, "url");
			return this;
		}

		public Criteria andUrlNotIn(List<String> values) {
			addCriterion("url not in", values, "url");
			return this;
		}

		public Criteria andUrlBetween(String value1, String value2) {
			addCriterion("url between", value1, value2, "url");
			return this;
		}

		public Criteria andUrlNotBetween(String value1, String value2) {
			addCriterion("url not between", value1, value2, "url");
			return this;
		}

		public Criteria andFaceValueIsNull() {
			addCriterion("face_value is null");
			return this;
		}

		public Criteria andFaceValueIsNotNull() {
			addCriterion("face_value is not null");
			return this;
		}

		public Criteria andFaceValueEqualTo(BigDecimal value) {
			addCriterion("face_value =", value, "faceValue");
			return this;
		}

		public Criteria andFaceValueNotEqualTo(BigDecimal value) {
			addCriterion("face_value <>", value, "faceValue");
			return this;
		}

		public Criteria andFaceValueGreaterThan(BigDecimal value) {
			addCriterion("face_value >", value, "faceValue");
			return this;
		}

		public Criteria andFaceValueGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("face_value >=", value, "faceValue");
			return this;
		}

		public Criteria andFaceValueLessThan(BigDecimal value) {
			addCriterion("face_value <", value, "faceValue");
			return this;
		}

		public Criteria andFaceValueLessThanOrEqualTo(BigDecimal value) {
			addCriterion("face_value <=", value, "faceValue");
			return this;
		}

		public Criteria andFaceValueIn(List<BigDecimal> values) {
			addCriterion("face_value in", values, "faceValue");
			return this;
		}

		public Criteria andFaceValueNotIn(List<BigDecimal> values) {
			addCriterion("face_value not in", values, "faceValue");
			return this;
		}

		public Criteria andFaceValueBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("face_value between", value1, value2, "faceValue");
			return this;
		}

		public Criteria andFaceValueNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("face_value not between", value1, value2, "faceValue");
			return this;
		}

		public Criteria andSharekhanIdIsNull() {
			addCriterion("sharekhan_id is null");
			return this;
		}

		public Criteria andSharekhanIdIsNotNull() {
			addCriterion("sharekhan_id is not null");
			return this;
		}

		public Criteria andSharekhanIdEqualTo(String value) {
			addCriterion("sharekhan_id =", value, "sharekhanId");
			return this;
		}

		public Criteria andSharekhanIdNotEqualTo(String value) {
			addCriterion("sharekhan_id <>", value, "sharekhanId");
			return this;
		}

		public Criteria andSharekhanIdGreaterThan(String value) {
			addCriterion("sharekhan_id >", value, "sharekhanId");
			return this;
		}

		public Criteria andSharekhanIdGreaterThanOrEqualTo(String value) {
			addCriterion("sharekhan_id >=", value, "sharekhanId");
			return this;
		}

		public Criteria andSharekhanIdLessThan(String value) {
			addCriterion("sharekhan_id <", value, "sharekhanId");
			return this;
		}

		public Criteria andSharekhanIdLessThanOrEqualTo(String value) {
			addCriterion("sharekhan_id <=", value, "sharekhanId");
			return this;
		}

		public Criteria andSharekhanIdLike(String value) {
			addCriterion("sharekhan_id like", value, "sharekhanId");
			return this;
		}

		public Criteria andSharekhanIdNotLike(String value) {
			addCriterion("sharekhan_id not like", value, "sharekhanId");
			return this;
		}

		public Criteria andSharekhanIdIn(List<String> values) {
			addCriterion("sharekhan_id in", values, "sharekhanId");
			return this;
		}

		public Criteria andSharekhanIdNotIn(List<String> values) {
			addCriterion("sharekhan_id not in", values, "sharekhanId");
			return this;
		}

		public Criteria andSharekhanIdBetween(String value1, String value2) {
			addCriterion("sharekhan_id between", value1, value2, "sharekhanId");
			return this;
		}

		public Criteria andSharekhanIdNotBetween(String value1, String value2) {
			addCriterion("sharekhan_id not between", value1, value2,
					"sharekhanId");
			return this;
		}

		public Criteria andRediffIdIsNull() {
			addCriterion("rediff_id is null");
			return this;
		}

		public Criteria andRediffIdIsNotNull() {
			addCriterion("rediff_id is not null");
			return this;
		}

		public Criteria andRediffIdEqualTo(String value) {
			addCriterion("rediff_id =", value, "rediffId");
			return this;
		}

		public Criteria andRediffIdNotEqualTo(String value) {
			addCriterion("rediff_id <>", value, "rediffId");
			return this;
		}

		public Criteria andRediffIdGreaterThan(String value) {
			addCriterion("rediff_id >", value, "rediffId");
			return this;
		}

		public Criteria andRediffIdGreaterThanOrEqualTo(String value) {
			addCriterion("rediff_id >=", value, "rediffId");
			return this;
		}

		public Criteria andRediffIdLessThan(String value) {
			addCriterion("rediff_id <", value, "rediffId");
			return this;
		}

		public Criteria andRediffIdLessThanOrEqualTo(String value) {
			addCriterion("rediff_id <=", value, "rediffId");
			return this;
		}

		public Criteria andRediffIdLike(String value) {
			addCriterion("rediff_id like", value, "rediffId");
			return this;
		}

		public Criteria andRediffIdNotLike(String value) {
			addCriterion("rediff_id not like", value, "rediffId");
			return this;
		}

		public Criteria andRediffIdIn(List<String> values) {
			addCriterion("rediff_id in", values, "rediffId");
			return this;
		}

		public Criteria andRediffIdNotIn(List<String> values) {
			addCriterion("rediff_id not in", values, "rediffId");
			return this;
		}

		public Criteria andRediffIdBetween(String value1, String value2) {
			addCriterion("rediff_id between", value1, value2, "rediffId");
			return this;
		}

		public Criteria andRediffIdNotBetween(String value1, String value2) {
			addCriterion("rediff_id not between", value1, value2, "rediffId");
			return this;
		}

		public Criteria andYahooIdIsNull() {
			addCriterion("yahoo_id is null");
			return this;
		}

		public Criteria andYahooIdIsNotNull() {
			addCriterion("yahoo_id is not null");
			return this;
		}

		public Criteria andYahooIdEqualTo(String value) {
			addCriterion("yahoo_id =", value, "yahooId");
			return this;
		}

		public Criteria andYahooIdNotEqualTo(String value) {
			addCriterion("yahoo_id <>", value, "yahooId");
			return this;
		}

		public Criteria andYahooIdGreaterThan(String value) {
			addCriterion("yahoo_id >", value, "yahooId");
			return this;
		}

		public Criteria andYahooIdGreaterThanOrEqualTo(String value) {
			addCriterion("yahoo_id >=", value, "yahooId");
			return this;
		}

		public Criteria andYahooIdLessThan(String value) {
			addCriterion("yahoo_id <", value, "yahooId");
			return this;
		}

		public Criteria andYahooIdLessThanOrEqualTo(String value) {
			addCriterion("yahoo_id <=", value, "yahooId");
			return this;
		}

		public Criteria andYahooIdLike(String value) {
			addCriterion("yahoo_id like", value, "yahooId");
			return this;
		}

		public Criteria andYahooIdNotLike(String value) {
			addCriterion("yahoo_id not like", value, "yahooId");
			return this;
		}

		public Criteria andYahooIdIn(List<String> values) {
			addCriterion("yahoo_id in", values, "yahooId");
			return this;
		}

		public Criteria andYahooIdNotIn(List<String> values) {
			addCriterion("yahoo_id not in", values, "yahooId");
			return this;
		}

		public Criteria andYahooIdBetween(String value1, String value2) {
			addCriterion("yahoo_id between", value1, value2, "yahooId");
			return this;
		}

		public Criteria andYahooIdNotBetween(String value1, String value2) {
			addCriterion("yahoo_id not between", value1, value2, "yahooId");
			return this;
		}

		public Criteria andFavoriteIsNull() {
			addCriterion("favorite is null");
			return this;
		}

		public Criteria andFavoriteIsNotNull() {
			addCriterion("favorite is not null");
			return this;
		}

		public Criteria andFavoriteEqualTo(Integer value) {
			addCriterion("favorite =", value, "favorite");
			return this;
		}

		public Criteria andFavoriteNotEqualTo(Integer value) {
			addCriterion("favorite <>", value, "favorite");
			return this;
		}

		public Criteria andFavoriteGreaterThan(Integer value) {
			addCriterion("favorite >", value, "favorite");
			return this;
		}

		public Criteria andFavoriteGreaterThanOrEqualTo(Integer value) {
			addCriterion("favorite >=", value, "favorite");
			return this;
		}

		public Criteria andFavoriteLessThan(Integer value) {
			addCriterion("favorite <", value, "favorite");
			return this;
		}

		public Criteria andFavoriteLessThanOrEqualTo(Integer value) {
			addCriterion("favorite <=", value, "favorite");
			return this;
		}

		public Criteria andFavoriteIn(List<Integer> values) {
			addCriterion("favorite in", values, "favorite");
			return this;
		}

		public Criteria andFavoriteNotIn(List<Integer> values) {
			addCriterion("favorite not in", values, "favorite");
			return this;
		}

		public Criteria andFavoriteBetween(Integer value1, Integer value2) {
			addCriterion("favorite between", value1, value2, "favorite");
			return this;
		}

		public Criteria andFavoriteNotBetween(Integer value1, Integer value2) {
			addCriterion("favorite not between", value1, value2, "favorite");
			return this;
		}
	}
}