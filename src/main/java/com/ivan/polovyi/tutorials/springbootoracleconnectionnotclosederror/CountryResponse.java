package com.ivan.polovyi.tutorials.springbootoracleconnectionnotclosederror;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountryResponse {

    private Integer id;

    private String countryName;

    public static CountryResponse valueOf(CountryDomain countryDomain) {
        return builder().id(countryDomain.getId())
                .countryName(countryDomain.getCountryName()).build();
    }

}
