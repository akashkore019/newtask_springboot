package com.akash.organization.dto;

public class CropsDTO {

    private Long id;
    private String name;

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Constructor for the DTO
    public CropsDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Default constructor
    public CropsDTO() {
    }
}
