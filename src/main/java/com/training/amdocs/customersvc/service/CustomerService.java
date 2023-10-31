package com.training.amdocs.customersvc.service;

import com.training.amdocs.customersvc.model.Customer;
import com.training.amdocs.customersvc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public Customer getCustomerById(long customerId){
        return customerRepository.findById(customerId).orElse(null);
    }

    public List<Customer> getAllCustomers(){return customerRepository.findAll();}

    public void addCustomer(Customer customer){
        customer.setDateOfAccount(new Date(System.currentTimeMillis()));
        customer.setPremium(false);
        customerRepository.save(customer);
    }

    public boolean setPremium(long id){
        Customer customer = customerRepository.findById(id).orElse(null);
        if(customer == null)return false;
        customer.setPremium(true);
        customerRepository.save(customer);
        return true;
    }

    public void addOrders(long id,int orders){
        Customer customer = customerRepository.findById(id).orElse(null);
        if(customer == null)return ;
        customer.setNoOfOrders(customer.getNoOfOrders()+orders);
        customerRepository.save(customer);
    }
}
