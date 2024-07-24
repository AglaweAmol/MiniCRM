package com.minicrm.repository;

import com.minicrm.entity.Leads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadRepository extends JpaRepository<Leads,Long> {

}
