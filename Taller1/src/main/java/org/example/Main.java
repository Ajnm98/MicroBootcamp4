package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        int counter = 0;

        for (Integer n : numbers) {
                if (n >= 10) {
                    counter++;
                }
            }

            System.out.println(counter);

        Long count = numbers.stream().filter(num-> num > 10).count();

        System.out.println(count);

    }
}