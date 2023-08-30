package com.freshbasket.newservice;

import java.util.List;

import com.freshbasket.pojos.Farmer;
import com.freshbasket.pojos.StockDetails;

public interface FarmerService {

	List<Farmer> getFarmersList();

	Farmer getFarmerDetails(Integer id);

	List<StockDetails> getFarmerStock(Integer farmerid);

	StockDetails getProductDetails(Integer farmerid, Integer productid);

	List<StockDetails> getAllProduct();

}
