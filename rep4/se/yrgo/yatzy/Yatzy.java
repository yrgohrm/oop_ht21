package se.yrgo.yatzy;

public class Yatzy {
    public static void main(String[] args) {
        DiceCup cup = new DiceCup(5);
        cup.roll();
        System.out.println(cup);
        cup.hold(1);
        cup.hold(2);
        cup.hold(3);
        cup.roll();
        System.out.println(cup);
        
        cup.newTurn();
        cup.roll();
        System.out.println(cup);
    }
}
