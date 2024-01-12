package org.homeboy.springcloud.controllers;

import org.homeboy.springcloud.pojo.Customer;
import org.homeboy.springcloud.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ComsumerController {


    @Autowired
    private CommonService commonService;

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") long id)
    {
        return commonService.getCustomerById(id);
    }

    @GetMapping("/list")
    public List<Customer> getAllCustomers()
    {
        return commonService.getAllCustomers();
    }

    @PostMapping("/add")
    public Boolean addCustomer(@RequestBody Customer customer)
    {
        return commonService.addCustomer(customer);
    }

}
