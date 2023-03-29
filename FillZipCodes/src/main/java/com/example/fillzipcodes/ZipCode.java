package com.example.fillzipcodes;

import jakarta.persistence.*;

import java.util.Objects;

@Entity(name ="zip")
public class ZipCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="zip_id")
    private Long id;


    @OneToOne
    @JoinColumn(name = "country_id", nullable = false)
    private CountriesEntity country;
    @Column(name = "zip_code", nullable = false)
    private String code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CountriesEntity getCountry() {
        return country;
    }

    public void setCountry(CountriesEntity country) {
        this.country = country;
    }

    public String getZipCode() {
        return code;
    }

    public void setZipCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZipCode that = (ZipCode) o;
        return id.equals(that.id) && country.equals(that.country) && code.equals(that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, country, code);
    }

    @Override
    public String toString() {
        return "ZipsEntity{" +
                "id=" + id +
                ", country=" + country +
                ", code='" + code + '\'' +
                '}';
    }
}
