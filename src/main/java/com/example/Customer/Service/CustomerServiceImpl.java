package com.example.Customer.Service;

import com.example.Customer.Model.Customer;

import java.util.List;

public interface CustomerServiceImpl {

    List<Customer> getAllCustomer();

    Customer saveCustomer(Customer customer);

    Customer getCustomerById(Long id);

    Customer updateCustomer(Customer customer);

    void deleteCustomerById(Long id);
}
