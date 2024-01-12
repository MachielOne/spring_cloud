package org.homeboy.springcloud.services;

import org.homeboy.springcloud.pojo.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value="spring-cloud-provider-application")
public interface CommonService {


    @PostMapping("/provider/add")
    Boolean addCustomer(Customer customer);


    @GetMapping("/provider/{id}")
    Customer getCustomerById(@PathVariable("id") long id);

    @GetMapping("/provider/list")
    List<Customer> getAllCustomers();
}
