package com.akash.organization.controller;

import java.util.List;
import java.util.Optional;

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

import com.akash.organization.dto.CropsDTO;
import com.akash.organization.service.CropsService;

@RestController
@RequestMapping("/api/v1/crops")
public class CropController {

    @Autowired
    private CropsService cropsService;

    // Create or Update a Crop
    @PostMapping
    public ResponseEntity<CropsDTO> createOrUpdateCrop(@RequestBody CropsDTO cropsDTO) {
        CropsDTO savedCrop = cropsService.saveCrops(cropsDTO);
        return new ResponseEntity<>(savedCrop, HttpStatus.CREATED);
    }

    // Get all Crops
    @GetMapping
    public ResponseEntity<List<CropsDTO>> getAllCrops() {
        List<CropsDTO> cropsList = cropsService.getAllCrops();
        return new ResponseEntity<>(cropsList, HttpStatus.OK);
    }

    // Get Crop by Id
    @GetMapping("/{id}")
    public ResponseEntity<CropsDTO> getCropById(@PathVariable Long id) {
        Optional<CropsDTO> cropsDTO = cropsService.getCropById(id);
        return cropsDTO.map(dto -> new ResponseEntity<>(dto, HttpStatus.OK))
                       .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Delete Crop by Id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCrop(@PathVariable Long id) {
        boolean deleted = cropsService.deleteCrop(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
