//VANLIG KLASS

package com.example.lektionarraylistinheritance;

import java.util.ArrayList;

public class Shop {
  private String myOrder;
//En arraylista där allt sparas och lagras från inmatningen i main.
  private ArrayList<Shirts> myClothes;

  // Konstruktor
  public Shop(String myOrder) {
    this.myOrder = myOrder;
    //Den gör det den får i shirt till en arraylist
    this.myClothes = new ArrayList<Shirts>();
  }

  //Väljs i menyval 2 och gör att du kan lägga till en tröja.
  public boolean addNewOrder(Shirts shirts) {
    myClothes.add(shirts);
    return true;

  }


 //Väljs av menyval 1 och visar tid order:
  public void printOrder() {
    System.out.println("Din beställning är:");
    for(int i=0; i<this.myClothes.size(); i++) {
      System.out.println((i+1) + "." +
              this.myClothes.get(i).getType() + " typ av plagg " +
              this.myClothes.get(i).getSize() + " Storlek: " +
              this.myClothes.get(i).getColor() + " Färg: " +
              this.myClothes.get(i).getPrice() + " Kronor: ");
    }

  }

}

