package com.akash.organization.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class FarmerDTO {

    private Long farmerId; // ID of the farmer, can be used for updates

    @NotNull
    @Size(max = 50)
    private String farmerName;

    @Size(max = 200)
    private String farmerAddress;

    private Long orgId; // Assuming orgId is a Long type

    @Size(max = 20)
    private String cropName1;

    @Size(max = 20)
    private String cropName2;

    private boolean membership;

    // Getters and Setters

    public Long getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(Long farmerId) {
        this.farmerId = farmerId;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getFarmerAddress() {
        return farmerAddress;
    }

    public void setFarmerAddress(String farmerAddress) {
        this.farmerAddress = farmerAddress;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getCropName1() {
        return cropName1;
    }

    public void setCropName1(String cropName1) {
        this.cropName1 = cropName1;
    }

    public String getCropName2() {
        return cropName2;
    }

    public void setCropName2(String cropName2) {
        this.cropName2 = cropName2;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }
}
