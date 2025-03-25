package com.akash.organization.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.organization.dto.OrganizationDTO;
import com.akash.organization.model.Farmer; // Import the Farmer class
import com.akash.organization.model.Organization;
import com.akash.organization.repository.FarmerRepository;
import com.akash.organization.repository.OrganizationRepository;

@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;
    private final FarmerRepository farmerRepository;

    // Explicit Constructor Injection
    @Autowired
    public OrganizationService(OrganizationRepository organizationRepository, FarmerRepository farmerRepository) {
        this.organizationRepository = organizationRepository;
        this.farmerRepository = farmerRepository;
    }

    public List<Organization> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    public Organization saveOrganization(OrganizationDTO organizationDTO) {
        Organization organization = new Organization();
        organization.setOrgName(organizationDTO.getOrgName());
        organization.setOrgAddress(organizationDTO.getOrgAddress());
        organization.setOrgPinCode(organizationDTO.getOrgPinCode());
        organization.setOrgPanCard(organizationDTO.getOrgPanCard());
        
        if (organizationDTO.getFarmerId() != null) {
            // Only set the farmer if the ID is provided
            Optional<Farmer> farmer = farmerRepository.findById(organizationDTO.getFarmerId());
            if (farmer.isPresent()) {
                organization.setFarmer(farmer.get());
            } else {
                throw new IllegalArgumentException("Farmer not found with ID: " + organizationDTO.getFarmerId());
            }
        }

        return organizationRepository.save(organization);
    }



    public void deleteOrganization(Long id) {
        // Ensure the organization exists before attempting to delete
        if (!organizationRepository.existsById(id)) {
            throw new IllegalArgumentException("Organization with ID " + id + " not found");
        }
        
        organizationRepository.deleteById(id);
    }

    public Optional<Organization> getOrganizationById(Long id) {
        return organizationRepository.findById(id);
    }
}
