package com.example.cardapio.Controler;

import com.example.cardapio.Food.Food;
import com.example.cardapio.Food.FoodRepository;
import com.example.cardapio.Food.FoodRequestDTD;
import com.example.cardapio.Food.FoodResponseDTD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Food")
public class FoodControler {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowCredentials = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTD data) {
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

    @CrossOrigin(origins = "*", allowCredentials = "*")
    @GetMapping
    public List<FoodResponseDTD> getAll() {
        return repository.findAll().stream().map(FoodResponseDTD::new).toList();
    }
}
