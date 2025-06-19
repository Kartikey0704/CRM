package com.example.crm.service;

import com.example.crm.entity.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    void saveCustomer(Customer customer);
    Customer getCustomerById(int id);
    void deleteCustomerById(int id);
}
