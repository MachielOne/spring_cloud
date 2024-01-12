package org.homeboy.springcloud.controllers;

import org.homeboy.springcloud.pojo.Customer;
import org.homeboy.springcloud.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provider")
public class Provider8003Controller {

    @Autowired
    private CustomerService customerService;

    /*@Autowired
    private DiscoveryClient discoveryClient;*/

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") long id)
    {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/list")
    public List<Customer> getAllCustomers()
    {
        return customerService.getAllCustomers();
    }

    @PostMapping("/add")
    public Boolean addCustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);
    }


    /*@GetMapping("/discovery")
    public Object discovery()
    {
        List<Application> registeredApplications = discoveryClient.getApplications().getRegisteredApplications();
        for (Application application: registeredApplications)
        {
            System.out.println("dicovery -- application:"+ application.getName());
            application.getInstances()
                    .forEach(instance
                            -> System.out.println("application instance:"+ instance.getHostName() + instance.getPort() + instance.getInstanceId()));
        }
        return this.discoveryClient;

    }*/
}
