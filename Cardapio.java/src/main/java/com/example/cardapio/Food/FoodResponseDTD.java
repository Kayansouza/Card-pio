package com.example.cardapio.Food;

public record FoodResponseDTD(long id, String title, String image, Integer price) {

    public FoodResponseDTD( Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPride());
    };

};
