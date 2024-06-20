package java_0620;

import java.util.Arrays;
import java.util.List;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        callList(list);
    }

    public static void callList(List<Integer> integerList){
        for(int i:integerList){
            System.out.println(i);
        }
    }
}