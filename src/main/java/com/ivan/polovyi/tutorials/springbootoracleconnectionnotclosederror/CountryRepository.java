package com.ivan.polovyi.tutorials.springbootoracleconnectionnotclosederror;

import org.springframework.data.jpa.repository.JpaRepository;

interface CountryRepository extends JpaRepository<CountryDomain, Integer> {

}
