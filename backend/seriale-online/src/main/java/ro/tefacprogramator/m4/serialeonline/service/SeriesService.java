package ro.tefacprogramator.m4.serialeonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.tefacprogramator.m4.serialeonline.entity.Series;
import ro.tefacprogramator.m4.serialeonline.repository.SeriesRepository;

@Service
public class SeriesService {
    
    @Autowired
    public SeriesRepository repo;

    public boolean addSeries(Series s1) {



        repo.save(s1);

        return true;
    }

    public List<Series> getAllSavedSeries() {
        return repo.findAll();
    }

    public List<Series> getSeriesByCategoryName(String categoryName) {
        return repo.getSeriesByCategoryName(categoryName);
    }


}
