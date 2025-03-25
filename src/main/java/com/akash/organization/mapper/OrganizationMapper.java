//package com.akash.organization.mapper;
//
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//import com.akash.organization.dto.OrganizationDTO;
//import com.akash.organization.model.Organization;
//
//@Mapper(componentModel = "spring")
//public interface OrganizationMapper {
//
//    @Mapping(source = "farmer.farmerId", target = "farmerId")  // Mapping farmer's ID to the DTO field
//    OrganizationDTO toDTO(Organization organization);
//
//    @Mapping(source = "farmerId", target = "farmer.farmerId")  // Mapping the DTO's farmerId back to farmer's ID
//    Organization toEntity(OrganizationDTO organizationDTO);
//}
