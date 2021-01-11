package com.denisenko.HT10_1;

import java.util.ArrayList;
import java.util.List;

public class GenericSum {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(7);
        num.add(2);
        System.out.println(sum(num)); // 13

        List<Double> numD = new ArrayList<>();
        numD.add(1.5);
        numD.add(6.0);
        numD.add(3.0);
        System.out.println(sum(numD)); // 10.5

    }

    public static <T extends Number> Double sum(List<T> list) {
        double sum = 0;
        for (T n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

}

