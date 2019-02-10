package com.bunkware.bc.boardCafe.Controller;

import com.bunkware.bc.boardCafe.Dto.Customer;
import com.bunkware.bc.boardCafe.Dto.LoyaltyDto;
import com.bunkware.bc.boardCafe.Service.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController
{
    @Autowired
    CustomerService customerService;

    @RequestMapping("/customers")
    public String getAllCustomers()
    {
        ObjectMapper objectMapper = new ObjectMapper();

        List<Customer> customers = new ArrayList<>();
        customers = customerService.getAllCustomers();

        try {
          String response = objectMapper.writeValueAsString(customers);
          return response;
        }
        catch (Exception ex)
        {
            return null;
        }
    }
    @RequestMapping(value = "/createNewCustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createNewCustomer(@RequestBody String customerRequest) throws IOException {


        ObjectMapper mapper = new ObjectMapper();
        Customer customer = mapper.readValue(customerRequest, Customer.class);

        try
        {
            customerService.createNewCustomer(customer);
        }
        catch (Exception ex)
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @RequestMapping(value = "getCustomerById", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Customer getCustomerById(@RequestBody String customerRequest) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Customer customer = mapper.readValue(customerRequest, Customer.class);

        try
        {
           return  customerService.getCustomerById(customer);
        }
        catch (Exception ex)
        {
          return customer;
        }
    }

    @RequestMapping(value = "getCustomerByName", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getCustomerByName(@RequestBody String customerRequest) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Customer customer = mapper.readValue(customerRequest, Customer.class);

        try
        {
            return  customerService.getCustomerByName(customer);
        }
        catch (Exception ex)
        {
             List<Customer> list = new ArrayList<>();

             return list;
        }
    }

    @RequestMapping(value = "getCustomerByEmail", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Customer getCustomerByEmail(@RequestBody String customerRequest) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Customer customer = mapper.readValue(customerRequest, Customer.class);

        try
        {
            return  customerService.getCustomerByEmail(customer);
        }
        catch (Exception ex)
        {
            return customer;
        }
    }


    @RequestMapping(value = "updateLoyaltyPoints", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateLoyaltyPoints(@RequestBody String loyaltyRequest) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        LoyaltyDto loyalty = mapper.readValue(loyaltyRequest, LoyaltyDto.class);

        try
        {
            Customer customer = loyalty.getCustomer();
            int pointsToAdd = loyalty.getPointsToAdd();
            customerService.updateLoyaltyPoints(customer, pointsToAdd);
            return new ResponseEntity<>(HttpStatus.OK);

        }
        catch (Exception ex)
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @RequestMapping(value = "updateEmail", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateEmail(@RequestBody String emailRequest) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Customer customer = mapper.readValue(emailRequest, Customer.class);

        try
        {
            customerService.updateEmail(customer);
            return new ResponseEntity<>(HttpStatus.OK);

        }
        catch (Exception ex)
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @RequestMapping(value = "updatePhone", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updatePhone(@RequestBody String phoneRequest) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Customer customer = mapper.readValue(phoneRequest, Customer.class);

        try
        {
            customerService.updatePhone(customer);
            return new ResponseEntity<>(HttpStatus.OK);

        }
        catch (Exception ex)
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }





}
