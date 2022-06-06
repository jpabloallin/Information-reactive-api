package com.example.reactive.api.repository;

import com.example.reactive.api.collection.Information;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInformationRepository extends ReactiveMongoRepository<Information, String> {
}
