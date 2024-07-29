package com.minicrm.repository;

import com.minicrm.entity.Deals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealRepository extends JpaRepository<Deals,Long> {
}
