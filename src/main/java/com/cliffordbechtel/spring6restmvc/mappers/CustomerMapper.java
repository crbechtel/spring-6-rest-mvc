package com.cliffordbechtel.spring6restmvc.mappers;

import com.cliffordbechtel.spring6restmvc.entities.Customer;
import com.cliffordbechtel.spring6restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDTO(Customer customer);
}
