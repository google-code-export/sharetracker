package com.prem.share.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.springframework.core.io.FileSystemResource;

import com.prem.share.dm.db.Commodity;
import com.prem.share.dm.db.dao.impl.CommodityDAOImpl;

public class McxDataLoader {
	private static final String MCX = "MCX";
	public McxDataLoader() {
		Properties prop = new Properties();
		try {
			FileSystemResource commodityResource = new FileSystemResource(
					"sharetracker/sharetracker/resource/mcxCommodityList.txt");
			File commodityFile = commodityResource.getFile();
			if (commodityFile.exists()) {
				System.out.println(commodityFile.getCanonicalPath()
						+ " Exists: " + commodityFile.exists());
			}
			prop.load(new FileReader(commodityFile));
			Set keySet = prop.keySet();
			Iterator<String> key = keySet.iterator();
			while (key.hasNext()) {
				String keyValue = key.next();
				String value = (String) prop.get(keyValue);
				System.out.println(keyValue + ":" + value);
				
				Commodity commodity = new Commodity();
				commodity.setExchange(MCX);
				commodity.setCommodityId(keyValue);
//				commodity.setDescription(description);
				commodity.setQuantity(Integer.parseInt(value));
				
				CommodityDAOImpl commodityImpl = DatabaseHandler
						.getInstance().getCommodityDAOImpl();
				commodityImpl.insertCommodity(commodity);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new McxDataLoader();

	}

}
