package chap11.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinStack = new Stack<Coin>();
        coinStack.push(new Coin(500));
        coinStack.push(new Coin(100));
        coinStack.push(new Coin(50));
        coinStack.push(new Coin(10));
        coinStack.push(new Coin(5));

//        System.out.println(coinStack.pop());
//        System.out.println(coinStack.pop());
//        System.out.println(coinStack.pop());
//        System.out.println(coinStack.pop());
//        System.out.println(coinStack.pop());

        System.out.println(coinStack.peek());
        System.out.println(coinStack.peek());
        System.out.println(coinStack.peek());
        System.out.println(coinStack.peek());
        System.out.println(coinStack.peek());
    }
}
