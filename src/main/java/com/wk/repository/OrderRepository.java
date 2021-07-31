package com.wk.repository;

import com.wk.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface OrderRepository extends JpaRepository<Order,String> {
    Object findByoId(int oId);
}
