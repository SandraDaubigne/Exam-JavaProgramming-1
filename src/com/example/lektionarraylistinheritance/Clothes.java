//SUPERKLASS

package com.example.lektionarraylistinheritance;

public class Clothes {
  private String type;
  private String size;

  // Konstruktor
  public Clothes(String type, String size) {
    this.type = type;
    this.size = size;
  }

  public String getType() {
    return type;
  }

  public String getSize() {
    return size;
  }

  // Använder static för att kunna komma åt metoden utan att skapa ett objekt först i mainklassen
  public static Clothes createClothes(String type, String size) {
    return new Clothes(type, size);
  }
}
