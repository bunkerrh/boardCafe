package com.bunkware.bc.boardCafe.Repository;

import com.bunkware.bc.boardCafe.Dto.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository

{

   List<Customer> getAllCustomers();

   void createNewCustomer(Customer customer);

   Customer getCustomerById(Customer customer);

   List<Customer> getCustomerByName(Customer Customer);

   Customer getCustomerByEmail(Customer customer);

   void updateLoyaltyPoints(Customer customer, int pointsToAdd);

   void updateEmail(Customer customer);

   void updatePhone(Customer customer);
}
