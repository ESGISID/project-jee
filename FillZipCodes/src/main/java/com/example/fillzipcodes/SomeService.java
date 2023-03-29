package com.example.fillzipcodes;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

@Service
public class SomeService implements Wesh{

    @Autowired
    private  ZipRepository zipRepository;

    @Autowired
    private  CountriesRepository countriesRepository;



    public void yoyoyo() throws IOException {
        long start = System.currentTimeMillis();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        var input = new File(Objects.requireNonNull(classloader.getResource("zipCodes.json")).getFile());
        ObjectMapper mapper = new ObjectMapper();
        JsonZips[] jsonNode = mapper.readValue(input, JsonZips[].class);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time elapsed : "+ timeElapsed);
        String countryCode = jsonNode[0].country_code;
        var countryInDb = countriesRepository.findByCode(jsonNode[0].country_code).get();
        System.out.println(jsonNode.length);
        for (JsonZips jsonZips : jsonNode) {
            if (!jsonZips.country_code.equals(countryCode)) {
                countryCode = jsonZips.country_code;
                countryInDb = countriesRepository.findByCode(jsonZips.country_code).get();
            }
            if (zipRepository.findByCode(jsonZips.postal_code).isEmpty()) {
                ZipCode toSave = new ZipCode();
                toSave.setCountry(countryInDb);
                toSave.setZipCode(jsonZips.postal_code);
                zipRepository.save(toSave);
            }
        }
        System.out.println("Done");

        //JSONOb
    }
}
