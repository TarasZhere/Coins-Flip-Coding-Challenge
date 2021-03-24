package com.company;
import model.Coin;

public class Main {
    public static void main(String[] args) {
	// write your code here
        byte[]coins = {1, 1, 0, 1, 1};

        System.out.println("Coins:");
        for (int i = 0; i < 5; i++){
            System.out.println(coins[i]);
        }

        Coin coinChain = new Coin((byte)5);

        coinChain.printCases();

        System.out.println(
                "Number of flips is: " + coinChain.getMinNumberOfFlips(coins)
        );
    }

}