package com.prem.share.dm.db.dao;

import com.prem.share.dm.db.EquityTransaction;
import com.prem.share.dm.db.EquityTransactionExample;
import java.util.List;

public interface EquityTransactionDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table equity_transaction
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    int countEquityTransactionByExample(EquityTransactionExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table equity_transaction
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    int deleteEquityTransactionByExample(EquityTransactionExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table equity_transaction
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    int deleteEquityTransactionByPrimaryKey(Integer transactionId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table equity_transaction
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    void insertEquityTransaction(EquityTransaction record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table equity_transaction
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    void insertEquityTransactionSelective(EquityTransaction record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table equity_transaction
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    List<EquityTransaction> selectEquityTransactionByExample(EquityTransactionExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table equity_transaction
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    EquityTransaction selectEquityTransactionByPrimaryKey(Integer transactionId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table equity_transaction
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    int updateEquityTransactionByExampleSelective(EquityTransaction record, EquityTransactionExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table equity_transaction
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    int updateEquityTransactionByExample(EquityTransaction record, EquityTransactionExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table equity_transaction
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    int updateEquityTransactionByPrimaryKeySelective(EquityTransaction record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table equity_transaction
     *
     * @ibatorgenerated Mon Oct 24 16:28:18 IST 2011
     */
    int updateEquityTransactionByPrimaryKey(EquityTransaction record);
}