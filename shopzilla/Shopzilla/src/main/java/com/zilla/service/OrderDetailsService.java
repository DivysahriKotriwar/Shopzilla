package com.zilla.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zilla.models.Order;
import com.zilla.models.OrderDetails;
import com.zilla.models.Product;
import com.zilla.repos.OrderDetailsRepository;

@Service
public class OrderDetailsService {

	@Autowired private OrderDetailsRepository odrepo;
	
	public List<OrderDetails> allItemsinOrder(int orderid){
		return odrepo.findByOrderid(orderid);
	}
	
	public void saveItem(OrderDetails od) {		
		odrepo.save(od);
	}
	
	public void deleteAllItems(int orderid) {
		odrepo.deleteByOrderid(orderid);
	}
}
