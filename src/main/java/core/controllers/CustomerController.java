package core.controllers;

import core.Exceptions.CannotAddCustomerException;
import core.Exceptions.CustomerNotFoundException;
import core.persistence.Customer;
import core.persistence.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {

    private final CustomerRepository repository;

    @Autowired
    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers() {
        List<Customer> customers = (List<Customer>) repository.findAll();
        return customers;
    }

    @PostMapping("/getCustomerDetails")
    public Customer getCustomerDetails(Long id) throws CustomerNotFoundException {
        return repository.findById(id).orElseThrow((CustomerNotFoundException::new));
    }

    @PostMapping("/createCustomer")
    @ResponseBody
    public Customer createCustomer(Long id, String name, String address, String phone) throws CannotAddCustomerException {
        if (id != null && name != null && address != null && phone != null) {
            if (name.isEmpty() || address.isEmpty() || phone.isEmpty()) {
                throw new CannotAddCustomerException();
            }
        }

        Customer customer = new Customer(id, name, address, phone);
        repository.save(customer);

        return customer;
    }

    @PostMapping("/updateCustomer")
    public Customer updateCustomer(Long id, String name, String address, String phone) throws CustomerNotFoundException {
        Customer customer = repository.findById(id).orElseThrow(CustomerNotFoundException::new);
        if (name != null) {
            if (!name.isEmpty())
                customer.setName(name);
        }
        if (address != null) {
            if (!address.isEmpty())
                customer.setAddress(address);
        }
        if (phone != null) {
            if (!phone.isEmpty())
                customer.setPhone(phone);
        }
        repository.save(customer);
        return customer;
    }

    @PostMapping("/deleteCustomer")
    public String deleteCustomer(Long id) throws CustomerNotFoundException {
        repository.delete(repository.findById(id).orElseThrow(CustomerNotFoundException::new));
        return "Customer [" + id + "] Has been deleted";
    }


}
