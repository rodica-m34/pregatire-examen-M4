package ro.tefacprogramator.m4.serialeonline.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ro.tefacprogramator.m4.serialeonline.entity.Series;
import ro.tefacprogramator.m4.serialeonline.service.SeriesService;

@RestController
public class SeriesController {
    @Autowired
    public SeriesService service;

    @CrossOrigin
    @PostMapping("/series/add")
    public Object addSeries(@RequestBody Series s1) {

        if (service.addSeries(s1)) {
            return Collections.singletonMap("success", true);
        }
        return Collections.singletonMap("success", false);
    }

    @GetMapping("/series/getAll")
    public List<Series> getAllSeries() {
        return service.getAllSavedSeries();
    }

    @GetMapping("/series/getByCategory/{categoryName}")
    public List<Series> getSeriesByCategory(
            @PathVariable(name = "categoryName") 
            String categoryName
        ) {

        return service.getSeriesByCategoryName(categoryName);
    }

   

}
