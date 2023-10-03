package com.rushi.firstproject.controllers;

import com.rushi.firstproject.model.Details;
import com.rushi.firstproject.services.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DetailsController {
    @Autowired
    private DetailService detailService;
    @GetMapping("/details")
    private List<Details> getDetails()
    {
        return detailService.getdetails();

    }
    @PostMapping("/postentity")
    private Details postdetails(@RequestBody Details details)
    {
        return detailService.postdetails(details);
    }




}
