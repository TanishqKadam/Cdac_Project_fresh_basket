package com.freshbasket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freshbasket.pojos.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{
	
}
