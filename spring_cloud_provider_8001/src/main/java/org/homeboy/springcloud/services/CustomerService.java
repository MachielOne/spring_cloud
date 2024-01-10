package org.homeboy.springcloud.services;

import org.homeboy.springcloud.pojo.Customer;

import java.util.List;

public interface CustomerService {

    Boolean addCustomer(Customer customer);


    Customer getCustomerById(long id);

    List<Customer> getAllCustomers();

}
