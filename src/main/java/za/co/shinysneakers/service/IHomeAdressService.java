package za.co.shinysneakers.service;

import za.co.shinysneakers.domain.HomeAddress;

import java.util.List;
import java.util.Optional;

public interface IHomeAdressService extends IService<HomeAddress,Long>{
    Optional<HomeAddress> findByCity(String email);
    Optional<HomeAddress> findBySurburb(String mobile);
    //List<HomeAddress> getAll();
}
