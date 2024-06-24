package com.example.cardapio.Food;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table( name = "foods")
@Entity (name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode( of = "id")

public class Food {

    @Id  @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

     private String image;

     private Integer pride;

  public Food(FoodRequestDTD data){
      this.image = data.image();
      this.pride = data.price();
      this.title = data.title();
  }

}
