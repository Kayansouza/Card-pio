package com.example.demo.Controler;

import com.example.demo.Food.Food;
import com.example.demo.Food.FoodRepository;
import com.example.demo.Food.FoodResponseDTD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Food")
public class FoodControler {


    @Autowired
    private FoodRepository repository;

    @GetMapping
    public List<FoodResponseDTD> getALL(){

        List<FoodResponseDTD> foodList = repository.findAll().stream();
        return foodList;

    }

}