package com.rushi.firstproject.services;

import com.rushi.firstproject.Repository.Getrepository;
import com.rushi.firstproject.model.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rushi.firstproject.model.Details;

import java.util.List;

@Service
public class DetailService {
    @Autowired
    private Getrepository getrepository;


    public List<Details> getdetails(){
        return getrepository.findAll();

    }

    public Details postdetails(Details details) {

        return getrepository.save(details);
    }


}
