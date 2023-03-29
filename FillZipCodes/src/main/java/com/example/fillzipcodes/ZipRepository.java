package com.example.fillzipcodes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ZipRepository extends JpaRepository<ZipCode, Long> {
    Optional<ZipCode> findByCode(String code);
}
