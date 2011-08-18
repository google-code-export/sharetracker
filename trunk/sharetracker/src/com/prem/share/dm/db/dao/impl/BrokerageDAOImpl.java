package com.prem.share.dm.db.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.prem.share.dm.db.Brokerage;
import com.prem.share.dm.db.BrokerageExample;
import com.prem.share.dm.db.dao.BrokerageDAO;

public class BrokerageDAOImpl extends SqlMapClientDaoSupport implements BrokerageDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public BrokerageDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public int countBrokerageByExample(BrokerageExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"brokerage.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public int deleteBrokerageByExample(BrokerageExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"brokerage.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public void insertBrokerage(Brokerage record) {
		getSqlMapClientTemplate().insert("brokerage.ibatorgenerated_insert",
				record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public void insertBrokerageSelective(Brokerage record) {
		getSqlMapClientTemplate().insert(
				"brokerage.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	@SuppressWarnings("unchecked")
	public List<Brokerage> selectBrokerageByExample(BrokerageExample example) {
		List<Brokerage> list = getSqlMapClientTemplate().queryForList(
				"brokerage.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public int updateBrokerageByExampleSelective(Brokerage record,
			BrokerageExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"brokerage.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table brokerage
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public int updateBrokerageByExample(Brokerage record,
			BrokerageExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"brokerage.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table brokerage
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	private static class UpdateByExampleParms extends BrokerageExample {
		private Object record;

		public UpdateByExampleParms(Object record, BrokerageExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}