package ro.tefacprogramator.m4.serialeonline.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ro.tefacprogramator.m4.serialeonline.service.CategoryService;

import ro.tefacprogramator.m4.serialeonline.entity.Category;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService service;

    @PostMapping ("category/update/{id}")
    public String updateCategory (
        @PathVariable(value = "id") Integer id,
        @RequestBody Category c1
        ){

        c1.setId(id);
        
        if (service.updateCategory(c1))
        {
            return "success";
        }
       
        return "failed";

        }
}
