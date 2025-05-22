package za.co.shinysneakers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService service;

    @Autowired
    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Customer create(@RequestBody Customer customer) {
        return service.create(customer);
    }

    @GetMapping("/read/{id}")
    public Customer read(@PathVariable String id) {
        return service.read(id);
    }

    @PutMapping("/update")
    public Customer update(@RequestBody Customer customer) {
        return service.update(customer);
    }

    @GetMapping("/getAll")
    public List<Customer> getAll() {
        return service.getAll();
    }
}
