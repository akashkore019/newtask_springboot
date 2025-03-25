package com.akash.organization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.akash.organization.model.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {
    // Custom query methods if needed
}
