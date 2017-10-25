package com.econetmedia.developer.interview.service;

import com.econetmedia.developer.interview.exception.ValidationException;
import com.econetmedia.developer.interview.model.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by bmukorera on 9/10/2017.
 */
public class CustomerServiceTest {

    private CustomerService customerService;

    private Customer customer;

    @Before
    public void setup(){
        customer = CustomerInitialiser.getDummyCustomer();
        customerService= new CustomerServiceImpl();
    }



    @Test(expected = ValidationException.class)
    public void shouldThrowValidationExceptionWhenFirstNameIsEmptyOrNull(){
        customer.setFirstName("");
        customerService.registerCustomer(customer);
    }

    @Test(expected = ValidationException.class)
    public void shouldThrowValidationErrorWhenNationalIdHasLengthLessThanFive(){
        customer.setNationalId("abcd");
        customerService.registerCustomer(customer);
    }

    @Test
    public void shouldReturnCorrectFilterListForGivenGrade(){
        List<Customer> customerList= customerService.filterByGradeOrSalary("g2",19,CustomerInitialiser.getDummycustomerList());
        assertThat(customerList.size(),is(6));
    }


}
