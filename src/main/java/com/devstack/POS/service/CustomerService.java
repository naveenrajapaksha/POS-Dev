package com.devstack.POS.service;

import com.devstack.POS.dto.request.CustomerRequestDTO;
import com.devstack.POS.dto.response.CustomerResponseDTO;
import com.devstack.POS.dto.response.PagedResponseDTO;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    void createCustomer(CustomerRequestDTO dto);
    void updateCustomer(CustomerRequestDTO dto, UUID id);
    void deleteCustomer(UUID id);
    CustomerResponseDTO findCustomer(UUID id);
    List<CustomerResponseDTO> findAll(); // not a best practice
    PagedResponseDTO<CustomerResponseDTO> searchCustomer(String searchText, int page, int pageSize);

    CustomerResponseDTO findCustomerById(UUID id);

    PagedResponseDTO<CustomerResponseDTO> searchCustomers(String searchText, int page, int size);
}
