package com.bunkware.bc.boardCafe.Service;

import com.bunkware.bc.boardCafe.Dto.Customer;
import com.bunkware.bc.boardCafe.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;


    public List<Customer> getAllCustomers()
    {
        return customerRepository.getAllCustomers();
    }

    public void createNewCustomer(Customer customer)
    {
        customerRepository.createNewCustomer(customer);
    }

    public Customer getCustomerById(Customer customer)
    {
        return customerRepository.getCustomerById(customer);
    }

    public List<Customer> getCustomerByName(Customer customer)
    {
        return customerRepository.getCustomerByName(customer);
    }

    public Customer getCustomerByEmail(Customer customer)
    {
        return customerRepository.getCustomerByEmail(customer);
    }

    public  void updateLoyaltyPoints(Customer customer, int pointsToAdd)
    {
        customerRepository.updateLoyaltyPoints(customer, pointsToAdd);
    }

    public void updateEmail(Customer customer)
    {
        customerRepository.updateEmail(customer);
    }

    public void updatePhone(Customer customer)
    {
        customerRepository.updatePhone(customer);
    }

}
