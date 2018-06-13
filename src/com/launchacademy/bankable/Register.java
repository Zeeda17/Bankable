package com.launchacademy.bankable;

import java.util.ArrayList;

public class Register {
  public static ArrayList<Coin> provideChange(int change) {
    ArrayList<Coin> coins = new ArrayList<Coin>();
    
    Coin coinQuarter = new Quarter();
    while(change - coinQuarter.getValue() >= 0) {
      coins.add(coinQuarter);
      change -= coinQuarter.getValue();
    }
    
    Coin coinDime = new Dime();
    while(change - coinDime.getValue() >= 0) {
      coins.add(coinDime);
      change -= coinDime.getValue();
    }
    
    Coin coinNickel = new Nickel();
    while(change - coinNickel.getValue() >= 0) {
      coins.add(coinNickel);
      change -= coinNickel.getValue();
    }
    
    Coin coinPenny = new Penny();
    while(change - coinPenny.getValue() >= 0) {
      coins.add(coinPenny);
      change -= coinPenny.getValue();
    }
    return coins;
  }
}
