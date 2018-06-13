package com.launchacademy.bankable;

import java.util.ArrayList;

public class CoinContainer {
  public static int totalValue(ArrayList<Coin> coins) {
    int total = 0;
    for(Coin coin : coins ) {
      total += coin.getValue();
    }
    
    return total;
  } 
}


// The CoinContainer class should require
// a totalValue() instance method