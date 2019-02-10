package com.bunkware.bc.boardCafe.Implementation;

import com.bunkware.bc.boardCafe.Dto.Customer;
import com.bunkware.bc.boardCafe.Implementation.Query.CustomerQuery;
import com.bunkware.bc.boardCafe.Mapper.CustomerMapper;
import com.bunkware.bc.boardCafe.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerImpl implements CustomerRepository
{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public List<Customer> getAllCustomers() {
        return jdbcTemplate.query(CustomerQuery.GET_ALL_CUSTOMERS, customerMapper);
    }

    @Override
    public void createNewCustomer(Customer customer)
    {
        jdbcTemplate.update(CustomerQuery.INSERT_NEW_CUSTOMER, customer.getFirstName(), customer.getLastName(), customer.getEmail(),
                customer.getAreaCode(), customer.getPhoneNumber(), customer.getLoyaltyPoints());
    }
    @Override
    public Customer getCustomerById(Customer customer) {
        return (Customer) jdbcTemplate.query(CustomerQuery.GET_CUSTOMER_BY_ID, customerMapper, customer.getCustomerId());
    }

    @Override
    public List<Customer> getCustomerByName(Customer customer) {
        return jdbcTemplate.query(CustomerQuery.GET_CUSTOMER_BY_NAME, customerMapper, customer.getFirstName(), customer.getLastName());

    }

    @Override
    public Customer getCustomerByEmail(Customer customer) {
        return (Customer) jdbcTemplate.query( CustomerQuery.GET_CUSTOMER_BY_EMAIL, customerMapper, customer.getEmail());
    }

    @Override
    public void updateLoyaltyPoints(Customer customer, int pointsToAdd) {

        int oldPoints = customer.getLoyaltyPoints();
        int newPointsTotal = oldPoints + pointsToAdd;

        jdbcTemplate.update(CustomerQuery.UPDATE_LOYALTY_POINTS, newPointsTotal, customer.getCustomerId());
    }

    @Override
    public void updateEmail(Customer customer) {
        jdbcTemplate.update(CustomerQuery.UPDATE_EMAIL_BY_ID, customer.getEmail(), customer.getCustomerId());
    }

    @Override
    public void updatePhone(Customer customer) {

        jdbcTemplate.update(CustomerQuery.UPDATE_PHONE_NUMBER_BY_ID, customer.getAreaCode(),
                customer.getPhoneNumber(), customer.getCustomerId());

    }
}
