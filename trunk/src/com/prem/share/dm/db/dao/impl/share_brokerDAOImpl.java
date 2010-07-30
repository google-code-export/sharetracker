package com.prem.share.dm.db.dao.impl;

import com.prem.share.dm.db.dao.share_brokerDAO;
import com.prem.share.dm.db.share_broker;
import com.prem.share.dm.db.share_brokerExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class share_brokerDAOImpl extends SqlMapClientDaoSupport implements share_brokerDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    public share_brokerDAOImpl() {
        super();
    }


    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    public int countshare_brokerByExample(share_brokerExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("share_broker.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    public int deleteshare_brokerByExample(share_brokerExample example) {
        int rows = getSqlMapClientTemplate().delete("share_broker.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    public int deleteshare_brokerByPrimaryKey(Integer id) {
        share_broker key = new share_broker();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("share_broker.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    public void insertshare_broker(share_broker record) {
        getSqlMapClientTemplate().insert("share_broker.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    public void insertshare_brokerSelective(share_broker record) {
        getSqlMapClientTemplate().insert("share_broker.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    @SuppressWarnings("unchecked")
    public List<share_broker> selectshare_brokerByExample(share_brokerExample example) {
        List<share_broker> list = getSqlMapClientTemplate().queryForList("share_broker.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    public share_broker selectshare_brokerByPrimaryKey(Integer id) {
        share_broker key = new share_broker();
        key.setId(id);
        share_broker record = (share_broker) getSqlMapClientTemplate().queryForObject("share_broker.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    public int updateshare_brokerByExampleSelective(share_broker record, share_brokerExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("share_broker.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    public int updateshare_brokerByExample(share_broker record, share_brokerExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("share_broker.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    public int updateshare_brokerByPrimaryKeySelective(share_broker record) {
        int rows = getSqlMapClientTemplate().update("share_broker.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    public int updateshare_brokerByPrimaryKey(share_broker record) {
        int rows = getSqlMapClientTemplate().update("share_broker.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table share_broker
     *
     * @ibatorgenerated Wed Jul 21 16:18:59 GMT+05:30 2010
     */
    private static class UpdateByExampleParms extends share_brokerExample {
        private Object record;

        public UpdateByExampleParms(Object record, share_brokerExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}