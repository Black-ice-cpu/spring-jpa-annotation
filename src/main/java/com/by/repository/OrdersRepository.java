package com.by.repository;

import com.by.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ice
 */
@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
