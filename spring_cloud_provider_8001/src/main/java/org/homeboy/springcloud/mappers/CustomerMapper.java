package org.homeboy.springcloud.mappers;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.homeboy.springcloud.pojo.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerMapper {


    @Insert("INSERT INTO customer(firstname, lastname, gender, phoneNumber) values (#{firstName}, #{lastName}, #{gender}, #{phoneNumber})")
    Boolean addCustomer(Customer customer);


    @Select("Select * from customer where id=#{id}")
    Customer getCustomerById(long id);

    @Select("Select * from customer")
    List<Customer> getAllCustomers();
}
