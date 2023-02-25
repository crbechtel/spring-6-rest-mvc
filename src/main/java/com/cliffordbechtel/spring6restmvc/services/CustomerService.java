package com.cliffordbechtel.spring6restmvc.services;

import com.cliffordbechtel.spring6restmvc.model.Customer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerService {

    List<Customer> listCustomers();

    Optional<Customer> getCustomerById(UUID id);

    Customer saveNewCustomer(Customer customer);

    void updateById(UUID customerId, Customer customer);

    void deleteById(UUID customerId);

    void patchById(UUID customerId, Customer customer);
}
