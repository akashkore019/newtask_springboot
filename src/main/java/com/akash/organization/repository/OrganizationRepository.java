package com.akash.organization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.organization.model.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    // Custom query methods if needed
}
