package ro.tefacprogramator.m4.serialeonline.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import ro.tefacprogramator.m4.serialeonline.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>
{
    
}
