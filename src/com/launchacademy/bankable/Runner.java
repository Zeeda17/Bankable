package com.launchacademy.bankable;

import java.util.Scanner;
import java.util.ArrayList;

public class Runner {
  public static void main() {
    int input = 0;
    
    System.out.println("Provide the change value");
    Scanner in = new Scanner(System.in);
    input = in.nextInt();
    
    ArrayList<Coin> coins = Register.provideChange(input);
    in.close();
  }
}
