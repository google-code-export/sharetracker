package com.prem.share.common;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.prem.share.dm.db.EquityTransaction;
import com.prem.share.dm.db.EquityTransactionExample;
import com.prem.share.dm.db.ShareBroker;
import com.prem.share.dm.db.ShareBrokerExample;
import com.prem.share.dm.db.dao.impl.CommodityDAOImpl;
import com.prem.share.dm.db.dao.impl.CommodityTransactionDAOImpl;
import com.prem.share.dm.db.dao.impl.EquityTransactionDAOImpl;
import com.prem.share.dm.db.dao.impl.ShareBrokerDAOImpl;

public class DatabaseHandler {

	private static DatabaseHandler dbHandler = new DatabaseHandler();
	private BeanFactory beanFactory;

	private DatabaseHandler() {
		Resource resource = new FileSystemResource(
				"sharetracker/sharetracker/src/com/prem/share/dm/db/maps/spring-ibatis.xml");
		beanFactory = new XmlBeanFactory(resource);
	}

	public static DatabaseHandler getInstance() {
		return dbHandler;
	}

	public ShareBrokerDAOImpl getShareBrokerDAOImpl() {
		ShareBrokerDAOImpl share_brokerImpl = (ShareBrokerDAOImpl) beanFactory
				.getBean("share_broker");
		return share_brokerImpl;
	}

	public EquityTransactionDAOImpl getEquityTransactionDAOImpl() {
		EquityTransactionDAOImpl eqTranImpl = (EquityTransactionDAOImpl) beanFactory
				.getBean("equity_transaction");
		return eqTranImpl;
	}

	public CommodityTransactionDAOImpl getCommodityTransactionDAOImpl() {
		CommodityTransactionDAOImpl commTranImpl = (CommodityTransactionDAOImpl) beanFactory
				.getBean("commodity_transaction");
		return commTranImpl;
	}
	
	public CommodityDAOImpl getCommodityDAOImpl() {
		CommodityDAOImpl commImpl = (CommodityDAOImpl) beanFactory
				.getBean("commodity");
		return commImpl;
	}
	
	public static void main(String[] argv) {
		ShareBrokerDAOImpl share_brokerImpl = DatabaseHandler.getInstance()
				.getShareBrokerDAOImpl();
		ShareBrokerExample sb = new ShareBrokerExample();
		sb.createCriteria().andNameEqualTo("Sharekhan");

		List<ShareBroker> ls = share_brokerImpl.selectShareBrokerByExample(sb);

		for (int i = 0; i < ls.size(); i++) {
			System.out.println("Name: " + ls.get(i).getId());
			System.out.println("Name: " + ls.get(i).getName());
			System.out.println("Name: " + ls.get(i).getDescription());
		}

		EquityTransactionExample eq = new EquityTransactionExample();
		EquityTransactionDAOImpl eqTranImpl = DatabaseHandler.getInstance()
				.getEquityTransactionDAOImpl();
		List<EquityTransaction> eqList = eqTranImpl
				.selectEquityTransactionByExample(eq);

		for (int i = 0; i < eqList.size(); i++) {
			System.out.println("Equity: " + eqList.get(i).getScriptScriptId());
			// System.out.println("Name: " + eqList.get(i).getName());
			// System.out.println("Name: " + eqList.get(i).getDescription());
		}
	}
}
