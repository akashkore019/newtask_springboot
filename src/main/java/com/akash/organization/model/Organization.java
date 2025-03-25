package com.akash.organization.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "farmer_id", nullable = true)  // Set nullable to true
    private Farmer farmer;

    @Column(name = "org_name", length = 100, nullable = false)
    private String orgName;

    @Column(name = "org_address", length = 200)
    private String orgAddress;

    @Column(name = "org_pin_code")
    private int orgPinCode;

    @Column(name = "org_pan_card", length = 20)
    private String orgPanCard;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public int getOrgPinCode() {
        return orgPinCode;
    }

    public void setOrgPinCode(int orgPinCode) {
        this.orgPinCode = orgPinCode;
    }

    public String getOrgPanCard() {
        return orgPanCard;
    }

    public void setOrgPanCard(String orgPanCard) {
        this.orgPanCard = orgPanCard;
    }
}
