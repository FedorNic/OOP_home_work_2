package Home_Tasks.HT_8;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

// Написать итератор, который будет выдавать N случайных целых чисел
// Я не до конца понял задание, поэтому сделал еще один вариант. Вроде как это тоже написание итератора

public class RandomIterator {

    public static void main(String[] args) {
        System.out.println("Введите желаемое количество случайных чисел.");
        int N = new Scanner(System.in).nextInt();
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            nums.add(new Random().nextInt(1, 100));
        }

        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}