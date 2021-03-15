package com.ivan.polovyi.tutorials.springbootoracleconnectionnotclosederror;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public List<CountryResponse> findAll() {
        return countryRepository.findAll().stream()
                .map(CountryResponse::valueOf)
                .collect(Collectors.toList());
    }
}
