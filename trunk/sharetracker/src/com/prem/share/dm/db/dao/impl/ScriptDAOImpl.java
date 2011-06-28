package com.prem.share.dm.db.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.prem.share.dm.db.Script;
import com.prem.share.dm.db.ScriptExample;
import com.prem.share.dm.db.dao.ScriptDAO;

public class ScriptDAOImpl extends SqlMapClientDaoSupport implements ScriptDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	public ScriptDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	public int countScriptByExample(ScriptExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"script.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	public int deleteScriptByExample(ScriptExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"script.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	public int deleteScriptByPrimaryKey(String scriptId) {
		Script key = new Script();
		key.setScriptId(scriptId);
		int rows = getSqlMapClientTemplate().delete(
				"script.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	public void insertScript(Script record) {
		getSqlMapClientTemplate().insert("script.ibatorgenerated_insert",
				record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	public void insertScriptSelective(Script record) {
		getSqlMapClientTemplate().insert(
				"script.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	@SuppressWarnings("unchecked")
	public List<Script> selectScriptByExample(ScriptExample example) {
		List<Script> list = getSqlMapClientTemplate().queryForList(
				"script.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	public Script selectScriptByPrimaryKey(String scriptId) {
		Script key = new Script();
		key.setScriptId(scriptId);
		Script record = (Script) getSqlMapClientTemplate().queryForObject(
				"script.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	public int updateScriptByExampleSelective(Script record,
			ScriptExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"script.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	public int updateScriptByExample(Script record, ScriptExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"script.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	public int updateScriptByPrimaryKeySelective(Script record) {
		int rows = getSqlMapClientTemplate().update(
				"script.ibatorgenerated_updateByPrimaryKeySelective", record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	public int updateScriptByPrimaryKey(Script record) {
		int rows = getSqlMapClientTemplate().update(
				"script.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table script
	 * @ibatorgenerated  Tue Jun 28 11:24:18 IST 2011
	 */
	private static class UpdateByExampleParms extends ScriptExample {
		private Object record;

		public UpdateByExampleParms(Object record, ScriptExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}