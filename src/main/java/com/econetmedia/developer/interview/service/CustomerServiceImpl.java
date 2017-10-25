package com.econetmedia.developer.interview.service;

import com.econetmedia.developer.interview.exception.ValidationException;
import com.econetmedia.developer.interview.model.Customer;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by kennympariwa on 10/24/17.
 */
public class CustomerServiceImpl implements CustomerService {

  public  boolean registerCustomer(Customer customer){
      if(customer.getFirstName()==null){
          throw new ValidationException("The name is empty");

      } if(customer.getFirstName().equals("")){
          throw new ValidationException("The name is empty");

      }if(customer.getFirstName().length()<0){
          throw new ValidationException("The name is empty");

      } if(customer.getNationalId().length()<=4){
          throw new ValidationException("The national id is less than 5");
      }

      return true;
  }
    public  Optional<Customer> findCustomer(Long id){

            return null;
    }
    public List<Customer> filterByGradeOrSalary(String grade, Number salary, List<Customer> customerInputList){
        return  customerInputList.stream()
                .filter(p-> p.getGrade().equals(grade) || p.getSalary()==salary)
                .collect(Collectors.toList());
    }
}
