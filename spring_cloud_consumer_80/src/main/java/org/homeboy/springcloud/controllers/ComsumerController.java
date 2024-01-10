package org.homeboy.springcloud.controllers;

import org.homeboy.springcloud.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ComsumerController {

    private final static String REST_URL_PREFIX = "http://localhost:8001/provider";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") long id)
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/" + id, Customer.class);
    }

    @GetMapping("/list")
    public List<Customer> getAllCustomers()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/list", List.class);
    }

    @PostMapping("/add")
    public Boolean addCustomer(@RequestBody Customer customer)
    {
        return restTemplate.postForObject(REST_URL_PREFIX + "/add",customer, Boolean.class);
    }

}
