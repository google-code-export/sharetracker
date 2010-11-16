package com.prem.share.dm.db.dao;

import com.prem.share.dm.db.EquityTransaction;
import com.prem.share.dm.db.EquityTransactionExample;
import java.util.List;

public interface EquityTransactionDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table equity_transaction
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	int countEquityTransactionByExample(EquityTransactionExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table equity_transaction
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	int deleteEquityTransactionByExample(EquityTransactionExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table equity_transaction
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	int deleteEquityTransactionByPrimaryKey(Integer transactionId);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table equity_transaction
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	void insertEquityTransaction(EquityTransaction record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table equity_transaction
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	void insertEquityTransactionSelective(EquityTransaction record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table equity_transaction
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	List<EquityTransaction> selectEquityTransactionByExample(
			EquityTransactionExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table equity_transaction
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	EquityTransaction selectEquityTransactionByPrimaryKey(Integer transactionId);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table equity_transaction
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	int updateEquityTransactionByExampleSelective(EquityTransaction record,
			EquityTransactionExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table equity_transaction
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	int updateEquityTransactionByExample(EquityTransaction record,
			EquityTransactionExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table equity_transaction
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	int updateEquityTransactionByPrimaryKeySelective(EquityTransaction record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table equity_transaction
	 * @ibatorgenerated  Tue Nov 16 20:05:25 GMT+05:30 2010
	 */
	int updateEquityTransactionByPrimaryKey(EquityTransaction record);
}