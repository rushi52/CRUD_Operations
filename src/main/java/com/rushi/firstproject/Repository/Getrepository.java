package com.rushi.firstproject.Repository;

import com.rushi.firstproject.model.Details;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface Getrepository extends MongoRepository<Details, Integer> {



}
