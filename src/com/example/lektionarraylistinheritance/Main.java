//Ett program där du kan :
//Beställa ett klädesplagg och välja:
//*Typ av plagg
//*Färg
//*Pris
//*Storlek
//
//Du kan se menyn hela tiden och du kan avsluta.
//
//MVH Sandra dÁubigné

package com.example.lektionarraylistinheritance;

import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  //Skapar ett objekt av klassen shop, för att den inte är en superklass eller subklass och ärver ingenting.
  private static Shop shop = new Shop("");

  public static void main(String[] args) {

    //En switch-sats med menyvalen
    boolean quit = false;
    printActions();
    while(!quit) {
      System.out.println("\nVälj: (6 för att visa val)");
      int action = scanner.nextInt();
      scanner.nextLine();

      switch (action) {
        case 0:
          System.out.println("\nStänger ner...");
          quit = true;
          break;

        case 1:
          shop.printOrder();
          break;

        case 2:
          addNewOrder();
          break;

          case 6:
          printActions();
          break;

      }

    }

  }

  //Matar in beställningen
  private static void addNewOrder() {
    System.out.println("Skriv in vilket plagg du vill köpa: ");
    String type = scanner.nextLine();

    System.out.println("Skriv in stolek: ");
    String size = scanner.nextLine();

    System.out.println("Skriv in färg: ");
    String color = scanner.nextLine();

    System.out.println("Skriv in pris: ");
    String price = scanner.nextLine();

    //Skapar ett objekt för att ovan ska funka
    Shirts newOrder = new Shirts (type, size, color, price);

    //Kollar om nu order gör eller inte
    if(shop.addNewOrder(newOrder)) {
      System.out.println("Ny beställning gjord:");
    } else {
      System.out.println("Kan inte göra beställning.");
    }
  }


  //Metod som skriver ut menyn
  private static void printActions() {
    System.out.println("\nVälj:\n");
    System.out.println("0  - Avsluta\n" +
            "1  - Visa order\n" +
            "2  - Lägg till order\n" +
            "6  - Se menyn");
  }

}

