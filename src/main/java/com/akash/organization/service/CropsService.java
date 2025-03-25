package com.akash.organization.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.organization.dto.CropsDTO;
import com.akash.organization.model.Crops;
import com.akash.organization.repository.CropsRepository;

@Service
public class CropsService {

    @Autowired
    private CropsRepository cropsRepository;

    // Create or Update Crop
    public CropsDTO saveCrops(CropsDTO cropsDTO) {
        Crops crop = new Crops();
        crop.setName(cropsDTO.getName());  // Don't set 'id' as it's auto-generated
        Crops savedCrop = cropsRepository.save(crop);
        return new CropsDTO(savedCrop.getId(), savedCrop.getName());
    }


    // Get all Crops
    public List<CropsDTO> getAllCrops() {
        List<Crops> cropsList = cropsRepository.findAll();
        return cropsList.stream()
                        .map(crop -> new CropsDTO(crop.getId(), crop.getName()))
                        .collect(Collectors.toList());
    }

    // Get a Crop by Id
    public Optional<CropsDTO> getCropById(Long id) {
        Optional<Crops> crop = cropsRepository.findById(id);
        return crop.map(c -> new CropsDTO(c.getId(), c.getName()));
    }

    // Delete Crop by Id
    public boolean deleteCrop(Long id) {
        if (cropsRepository.existsById(id)) {
            cropsRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
