package com.bunkware.bc.boardCafe.Mapper;

import com.bunkware.bc.boardCafe.Dto.Customer;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CustomerMapper implements RowMapper<Customer>
{

    @Override
    public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
        Customer customer = new Customer();
        customer.setFirstName(resultSet.getString("FIRST_NAME"));
        customer.setLastName(resultSet.getString("LAST_NAME"));
        customer.setCustomerId(resultSet.getInt("CUSTOMER_ID"));
        customer.setEmail(resultSet.getString("EMAIL"));
        customer.setAreaCode(resultSet.getInt("AREA_CODE"));
        customer.setPhoneNumber(resultSet.getInt("PHONE_NUMBER"));

        return customer;
    }
}
