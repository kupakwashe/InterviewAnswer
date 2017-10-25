package com.econetmedia.developer.interview.service;

import com.econetmedia.developer.interview.model.Customer;

import java.util.List;
import java.util.Optional;

/**
 * Created by bmukorera on 9/10/2017.
 */
public interface CustomerService {
    boolean registerCustomer(Customer customer);
    Optional<Customer> findCustomer(Long id);
    List<Customer> filterByGradeOrSalary(String grade,Number salary,List<Customer> customerInputList);

}
