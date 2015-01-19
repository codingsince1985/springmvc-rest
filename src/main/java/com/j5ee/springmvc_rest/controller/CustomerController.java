package com.j5ee.springmvc_rest.controller;

import com.j5ee.springmvc_rest.model.Customer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Customer getCustomer(@PathVariable String id) {
        Customer customer;
        if (id != null && id.equals("1")) {
            customer = new Customer(1, "John Smith");
        } else {
            customer = new Customer(0, "Cash Customer");
        }
        return customer;
    }

}