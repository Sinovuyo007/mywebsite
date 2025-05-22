package za.co.shinysneakers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.shinysneakers.domain.HomeAddress;
import za.co.shinysneakers.service.HomeAddressService;

import java.util.List;

@RestController
@RequestMapping("/homeAdress")
public class HomeAddressController {

    private HomeAddressService service;

    @Autowired
    public HomeAddressController(HomeAddressService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public HomeAddress create(@RequestBody HomeAddress customer) {
        return service.create(customer);
    }

    @GetMapping("/read/{id}")
    public HomeAddress read(@PathVariable long id) {
        return service.read(id);
    }

    @PutMapping("/update")
    public HomeAddress update(@RequestBody HomeAddress homeAddress) {
        return service.update(homeAddress);
    }

//    @GetMapping("/getAll")
//    public List<HomeAddress> getAll() {
//        return service.getAll();
//    }
}
