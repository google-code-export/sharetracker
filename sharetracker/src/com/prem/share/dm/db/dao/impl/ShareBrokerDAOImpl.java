<<<<<<< .mine
package com.prem.share.dm.db.dao.impl;

import com.prem.share.dm.db.ShareBroker;
import com.prem.share.dm.db.ShareBrokerExample;
import com.prem.share.dm.db.dao.ShareBrokerDAO;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ShareBrokerDAOImpl extends SqlMapClientDaoSupport implements ShareBrokerDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    public ShareBrokerDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    public int countShareBrokerByExample(ShareBrokerExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("share_broker.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    public int deleteShareBrokerByExample(ShareBrokerExample example) {
        int rows = getSqlMapClientTemplate().delete("share_broker.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    public int deleteShareBrokerByPrimaryKey(Integer id) {
        ShareBroker key = new ShareBroker();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("share_broker.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    public void insertShareBroker(ShareBroker record) {
        getSqlMapClientTemplate().insert("share_broker.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    public void insertShareBrokerSelective(ShareBroker record) {
        getSqlMapClientTemplate().insert("share_broker.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    @SuppressWarnings("unchecked")
    public List<ShareBroker> selectShareBrokerByExample(ShareBrokerExample example) {
        List<ShareBroker> list = getSqlMapClientTemplate().queryForList("share_broker.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    public ShareBroker selectShareBrokerByPrimaryKey(Integer id) {
        ShareBroker key = new ShareBroker();
        key.setId(id);
        ShareBroker record = (ShareBroker) getSqlMapClientTemplate().queryForObject("share_broker.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    public int updateShareBrokerByExampleSelective(ShareBroker record, ShareBrokerExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("share_broker.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    public int updateShareBrokerByExample(ShareBroker record, ShareBrokerExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("share_broker.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    public int updateShareBrokerByPrimaryKeySelective(ShareBroker record) {
        int rows = getSqlMapClientTemplate().update("share_broker.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    public int updateShareBrokerByPrimaryKey(ShareBroker record) {
        int rows = getSqlMapClientTemplate().update("share_broker.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table share_broker
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    private static class UpdateByExampleParms extends ShareBrokerExample {
        private Object record;

        public UpdateByExampleParms(Object record, ShareBrokerExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}=======
package com.prem.share.dm.db.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.prem.share.dm.db.ShareBroker;
import com.prem.share.dm.db.ShareBrokerExample;
import com.prem.share.dm.db.dao.ShareBrokerDAO;

public class ShareBrokerDAOImpl extends SqlMapClientDaoSupport implements ShareBrokerDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public ShareBrokerDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public int countShareBrokerByExample(ShareBrokerExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"share_broker.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public int deleteShareBrokerByExample(ShareBrokerExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"share_broker.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public int deleteShareBrokerByPrimaryKey(Integer id) {
		ShareBroker key = new ShareBroker();
		key.setId(id);
		int rows = getSqlMapClientTemplate().delete(
				"share_broker.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public void insertShareBroker(ShareBroker record) {
		getSqlMapClientTemplate().insert("share_broker.ibatorgenerated_insert",
				record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public void insertShareBrokerSelective(ShareBroker record) {
		getSqlMapClientTemplate().insert(
				"share_broker.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	@SuppressWarnings("unchecked")
	public List<ShareBroker> selectShareBrokerByExample(
			ShareBrokerExample example) {
		List<ShareBroker> list = getSqlMapClientTemplate().queryForList(
				"share_broker.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public ShareBroker selectShareBrokerByPrimaryKey(Integer id) {
		ShareBroker key = new ShareBroker();
		key.setId(id);
		ShareBroker record = (ShareBroker) getSqlMapClientTemplate()
				.queryForObject(
						"share_broker.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public int updateShareBrokerByExampleSelective(ShareBroker record,
			ShareBrokerExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"share_broker.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public int updateShareBrokerByExample(ShareBroker record,
			ShareBrokerExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"share_broker.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public int updateShareBrokerByPrimaryKeySelective(ShareBroker record) {
		int rows = getSqlMapClientTemplate().update(
				"share_broker.ibatorgenerated_updateByPrimaryKeySelective",
				record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	public int updateShareBrokerByPrimaryKey(ShareBroker record) {
		int rows = getSqlMapClientTemplate().update(
				"share_broker.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table share_broker
	 * @ibatorgenerated  Thu Aug 18 12:42:12 IST 2011
	 */
	private static class UpdateByExampleParms extends ShareBrokerExample {
		private Object record;

		public UpdateByExampleParms(Object record, ShareBrokerExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}>>>>>>> .r52
