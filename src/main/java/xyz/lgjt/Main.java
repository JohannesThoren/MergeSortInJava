package xyz.lgjt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        Random r = new Random(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {

            l.add(r.nextInt(1, 20));
        }

        List<Integer> s = (new MergeSort()).sort(l);


        s.forEach(System.out::println);
    }
}