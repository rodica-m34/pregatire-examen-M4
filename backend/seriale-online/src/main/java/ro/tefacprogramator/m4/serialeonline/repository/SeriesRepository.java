package ro.tefacprogramator.m4.serialeonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ro.tefacprogramator.m4.serialeonline.entity.Series;

public interface SeriesRepository extends JpaRepository<Series, Integer> {

    @Query(value = "SELECT * FROM Series s INNER JOIN Category c ON s.IDCategory = c.IDCategory WHERE NameCategory = ?1",nativeQuery = true)
    public List<Series> getSeriesByCategoryName(String categoryName);
}
