package com.app.shop.bill.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.shop.bill.dao.BillDao;
import com.app.shop.bill.entity.Bill;
import com.app.shop.bill.exception.BillNotFoundException;

@Service
public class BillService {

	@Autowired
	BillDao billDao;

	public Bill saveBill(Bill bill) {
		return billDao.save(bill);
	}
	
	public List<Bill> getAllBills(){
		return billDao.findAll();
	}
	
	public Bill getBillById(int id) {
		Optional<Bill> bill=billDao.findById(id);
		if(bill.isEmpty()) {
			return null;
		}
		else {
			return bill.get();
		}
		
	}
}
