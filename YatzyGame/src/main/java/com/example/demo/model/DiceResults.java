package com.example.demo.model;

public class DiceResults {

    private static int [] diceResults  = new int [5];

    private static boolean[] checked = new boolean [5];

    public static void main (String [] args){

        rollAllDice();



    }





    public static int [] rollAllDice() {
       for (int i = 0; i < 5; i++) {

           int temp = diceRoll();
           diceResults[i] = temp;
           System.out.println(diceResults[i]);
       }
   return diceResults;
   }





    private static int diceRoll(){

    return (int) ((Math.random()*6)+1);
}

}

