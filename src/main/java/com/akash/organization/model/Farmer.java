package com.akash.organization.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Farmer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "farmer_id") // Matches the database column name
    private Long id;

    @Column(name = "farmer_name", length = 50, nullable = false)
    private String farmerName;

    @Column(name = "farmer_address", length = 200)
    private String farmerAddress;

    @Column(name = "org_id")
    private Long orgId;

    @Column(name = "crop_name1", length = 20)
    private String cropName1;

    @Column(name = "crop_name2", length = 20)
    private String cropName2;

    @Column(name = "membership")
    private boolean membership;

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for farmerName
    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    // Getter and Setter for farmerAddress
    public String getFarmerAddress() {
        return farmerAddress;
    }

    public void setFarmerAddress(String farmerAddress) {
        this.farmerAddress = farmerAddress;
    }

    // Getter and Setter for orgId
    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    // Getter and Setter for cropName1
    public String getCropName1() {
        return cropName1;
    }

    public void setCropName1(String cropName1) {
        this.cropName1 = cropName1;
    }

    // Getter and Setter for cropName2
    public String getCropName2() {
        return cropName2;
    }

    public void setCropName2(String cropName2) {
        this.cropName2 = cropName2;
    }

    // Getter and Setter for membership
    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }
}
