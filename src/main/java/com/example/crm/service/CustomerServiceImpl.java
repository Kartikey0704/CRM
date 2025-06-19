package com.example.crm.service;

import com.example.crm.entity.Customer;
import com.example.crm.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public void saveCustomer(Customer customer) {
        repository.save(customer);
    }

    public Customer getCustomerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteCustomerById(int id) {
        repository.deleteById(id);
    }
}
