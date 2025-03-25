package com.akash.organization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.organization.dto.FarmerDTO;
import com.akash.organization.model.Farmer;
import com.akash.organization.repository.FarmerRepository;
import com.akash.organization.service.FarmerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/farmers")
public class FarmerController {

    private final FarmerService farmerService;
    private final FarmerRepository farmerRepository;

    @Autowired
    public FarmerController(FarmerService farmerService, FarmerRepository farmerRepository) {
        this.farmerService = farmerService;
        this.farmerRepository = farmerRepository;

    }

    @GetMapping
    public List<Farmer> getAllFarmers() {
        return farmerService.getAllFarmers();
    }

    @PostMapping
    public ResponseEntity<Farmer> addFarmer(@Valid @RequestBody FarmerDTO farmerDTO) {
        Farmer farmer = new Farmer();
        farmer.setFarmerName(farmerDTO.getFarmerName());
        farmer.setFarmerAddress(farmerDTO.getFarmerAddress());
        farmer.setOrgId(farmerDTO.getOrgId());
        farmer.setCropName1(farmerDTO.getCropName1());
        farmer.setCropName2(farmerDTO.getCropName2());
        farmer.setMembership(farmerDTO.isMembership());

        Farmer savedFarmer = farmerRepository.save(farmer);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedFarmer);
    }

    @DeleteMapping("/{id}")
    public void deleteFarmer(@PathVariable Long id) {
        farmerService.deleteFarmer(id);
    }
}
