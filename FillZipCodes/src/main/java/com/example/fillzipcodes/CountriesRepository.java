package com.example.fillzipcodes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountriesRepository extends JpaRepository<CountriesEntity, Long> {
    Optional<CountriesEntity> findByCode(String code);
}
