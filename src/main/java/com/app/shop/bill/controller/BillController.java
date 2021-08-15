package com.app.shop.bill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.shop.bill.entity.Bill;
import com.app.shop.bill.exception.BillNotFoundException;
import com.app.shop.bill.service.BillService;

@RestController
public class BillController {
	
	@Autowired
	BillService billService;
	
	@PostMapping("/save")
	public String saveBill(@RequestBody Bill bill) {
		if(billService.saveBill(bill)!=null) {
			return "Success";
		}
		else {
			return "Failed";
		}
	}
	
	@GetMapping("/getAll")
	public List<Bill> getAllBills(){
		return billService.getAllBills();
	}
	
	@GetMapping("/getById/{id}")
	public Bill getBillById(@PathVariable int id){
		if(billService.getBillById(id)==null) {
			throw new BillNotFoundException("Bill not found for given id : "+id);
		}
		else {
			return billService.getBillById(id);
		}
		
		
	}
	
}
