package ro.tefacprogramator.m4.serialeonline.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.tefacprogramator.m4.serialeonline.entity.Category;
import ro.tefacprogramator.m4.serialeonline.repository.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    public CategoryRepository repo;

    public boolean updateCategory (Category c1)
    {
        repo.save(c1);
        return true;

    }
}
