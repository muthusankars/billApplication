package com.app.shop.bill.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.shop.bill.entity.Bill;

@Repository
public interface BillDao extends JpaRepository<Bill, Integer> {

}
