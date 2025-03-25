package com.akash.organization.repository;

import com.akash.organization.model.Crops;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CropsRepository extends JpaRepository<Crops, Long> {
    // You can add custom queries here if needed
}
