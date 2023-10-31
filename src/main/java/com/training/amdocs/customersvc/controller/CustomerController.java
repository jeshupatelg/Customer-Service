package com.training.amdocs.customersvc.controller;

import com.training.amdocs.customersvc.service.CustomerService;
import com.training.amdocs.customersvc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("/list")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @GetMapping("/uid{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable(name = "id") long id){
        Customer customer = customerService.getCustomerById(id);
        if(customer == null)return ResponseEntity.noContent().build();
        return ResponseEntity.ok(customer);
    }

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

   @GetMapping("/prem")
    public ResponseEntity<String> setPremium(@RequestParam(name = "id") long id){
        if(customerService.setPremium(id))return ResponseEntity.ok("Premium added");
        else return ResponseEntity.noContent().build();
   }

   @PostMapping("/order{id}")
    public void addOrder(@PathVariable(name = "id") long id,@RequestParam(name = "no") Optional<Integer> orders){
        customerService.addOrders(id,orders.orElse(1));
   }

}
