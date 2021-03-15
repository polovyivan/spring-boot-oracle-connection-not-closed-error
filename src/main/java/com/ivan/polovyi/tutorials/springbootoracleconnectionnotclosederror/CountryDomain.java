package com.ivan.polovyi.tutorials.springbootoracleconnectionnotclosederror;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "countries")
public class CountryDomain {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String countryName;
}
