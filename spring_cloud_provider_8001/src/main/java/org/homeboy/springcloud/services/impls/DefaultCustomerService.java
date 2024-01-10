package org.homeboy.springcloud.services.impls;

import org.homeboy.springcloud.pojo.Customer;
import org.homeboy.springcloud.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.homeboy.springcloud.mappers.CustomerMapper;

@Service
public class DefaultCustomerService implements CustomerService {


    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Boolean addCustomer(Customer customer) {
        return customerMapper.addCustomer(customer);
    }

    @Override
    public Customer getCustomerById(long id) {
        return customerMapper.getCustomerById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerMapper.getAllCustomers();
    }
}
