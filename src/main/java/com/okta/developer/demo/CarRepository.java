package com.okta.developer.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "https://sn-angular-cli-heroku-boiler.herokuapp.com")
interface CarRepository extends JpaRepository<Car, Long> {
}