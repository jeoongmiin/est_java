package java_0619;

import java.util.Stack;

public class Test8 {
    public static void main(String[] args) {
        Stack<Coin> coinStack = new Stack<>();

        coinStack.push(new Coin(100));
        coinStack.push(new Coin(500));
        coinStack.push(new Coin(10));
        coinStack.push(new Coin(50));

        while(!coinStack.isEmpty()){
            Coin pop = coinStack.pop();
            System.out.println(pop.getValue());
        }

    }
}