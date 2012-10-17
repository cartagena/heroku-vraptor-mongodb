package com.petrusti.herokusample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.petrusti.herokusample.model.Client;

public interface ClientRepository extends MongoRepository<Client, String> {

}
