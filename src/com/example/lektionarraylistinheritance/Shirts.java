//SUBBLASS

package com.example.lektionarraylistinheritance;

public class Shirts extends Clothes {
  //Variabler som används i denna klass:
  private String color;
  private String price;


  //Konstrukor för subklassen
  public Shirts(String type, String size, String color, String price){
    super(type, size);
    this.color = color;
    this.price = price;

  }

  //Getters för denna klassen:
  public String getColor() {
    return color;
  }

  public String getPrice() { return price; }


}
