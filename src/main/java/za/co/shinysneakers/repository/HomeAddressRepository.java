package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.co.shinysneakers.domain.HomeAddress;
import java.util.Optional;
@Repository
public interface HomeAddressRepository extends JpaRepository<HomeAddress, Long> {
    @Query("select u from HomeAddress u where u.city = ?1")
    Optional<HomeAddress> findByCity(String city);
    @Query("select u from HomeAddress u where u.surburb = ?1")
    Optional<HomeAddress> findBySurburb(String surburb);
}
