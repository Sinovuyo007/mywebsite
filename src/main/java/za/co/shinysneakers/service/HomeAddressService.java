package za.co.shinysneakers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.shinysneakers.domain.HomeAddress;
import za.co.shinysneakers.repository.HomeAddressRepository;

import java.util.List;
import java.util.Optional;
@Service
public class HomeAddressService implements IHomeAdressService {
   private HomeAddressRepository homeAddressRepository;
   @Autowired
   public HomeAddressService(HomeAddressRepository homeAddressRepository) {this.homeAddressRepository = homeAddressRepository;}
    @Override
    public HomeAddress create(HomeAddress t) {
        return homeAddressRepository.save(t);
    }

    @Override
    public HomeAddress read(Long id) {
        return homeAddressRepository.getReferenceById(id);
    }

    @Override
    public HomeAddress update(HomeAddress t) {
        return homeAddressRepository.save(t);
    }
    @Override
    public Optional<HomeAddress> findByCity(String city) {
        return homeAddressRepository.findByCity(city);
    }

    @Override
    public Optional<HomeAddress> findBySurburb(String surburb) {
        return homeAddressRepository.findBySurburb(surburb);
    }

//    @Override
//    public List<HomeAddress> getAll() {
//        return homeAddressRepository.findAll();
//    }
}
