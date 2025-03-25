package com.akash.organization.dto;

import jakarta.validation.constraints.NotNull;

public class OrganizationDTO {

    private String orgName;
    private String orgAddress;
    private int orgPinCode;
    private String orgPanCard;
    @NotNull(message = "Farmer ID is required")
    private Long farmerId;  // Make farmerId required if necessary
    // Getter for orgName
    public String getOrgName() {
        return orgName;
    }

    // Setter for orgName
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    // Getter for orgAddress
    public String getOrgAddress() {
        return orgAddress;
    }

    // Setter for orgAddress
    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    // Getter for orgPinCode
    public int getOrgPinCode() {
        return orgPinCode;
    }

    // Setter for orgPinCode
    public void setOrgPinCode(int orgPinCode) {
        this.orgPinCode = orgPinCode;
    }

    // Getter for orgPanCard
    public String getOrgPanCard() {
        return orgPanCard;
    }

    // Setter for orgPanCard
    public void setOrgPanCard(String orgPanCard) {
        this.orgPanCard = orgPanCard;
    }

    // Getter for farmerId
    public Long getFarmerId() {
        return farmerId;
    }

    // Setter for farmerId
    public void setFarmerId(Long farmerId) {
        this.farmerId = farmerId;
    }
}
