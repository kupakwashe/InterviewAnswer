package com.econetmedia.developer.interview.service;

import com.econetmedia.developer.interview.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmukorera on 9/10/2017.
 */
public class CustomerInitialiser {

    public static List<Customer> getDummycustomerList(){
        List<Customer> customers = new ArrayList<Customer>();
        for(int i=0;i<15;i++){
            Customer customer = new Customer();
            customer.setFirstName("firstName "+i);
            customer.setLastName("lastName "+i);
            if(i<6){
                customer.setGrade("g1");
                customer.setSalary(i<2?10:11);
            }
            if(i>6&&i<11){
                customer.setGrade("g2");
                customer.setSalary(i<9?13:15);
            }else {
                customer.setGrade("g3");
                customer.setSalary(i<13?11:19);
            }
            customer.setNationalId("nationalId"+i);
            customer.setId(new Long(i));
            customers.add(customer);
        }
        return customers;
    }

    public static Customer getDummyCustomer(){
        Customer customer = new Customer();
        customer.setFirstName("myname");
        customer.setLastName("mySurname");
        customer.setSalary(5);
        customer.setGrade("g1");
        customer.setNationalId("myidn");
        customer.setId(1l);
        return customer;
    }

}
