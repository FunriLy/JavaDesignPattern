package com.qg.fangrui.JavaDesignPattern.strategy;

/**
 * 策略模式
 * Created by FunriLy on 2017/7/14.
 * From small beginnings comes great things.
 */
public class Main {

    public static void main(String[] args) {
        int seed1 = 314;
        int seed2 = 15;

        Player player1 = new Player("A", new WinningStrategy(seed1));
        Player player2 = new Player("B", new ProbStrategy(seed2));

        for (int i=0; i<1000; i++){
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)){
                System.out.println("winner:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)){
                System.out.println("winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("even…………");
                player1.even();
                player2.even();
            }

            System.out.println("=================");
            System.out.println("the result:");
            System.out.println(player1.toString());
            System.out.println(player2.toString());
        }
    }
}
