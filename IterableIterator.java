package Home_Tasks.HT_8;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// Написать итератор, который будет выдавать N случайных целых чисел
public class IterableIterator implements Iterable<Integer> {

    private final int nums;

    public IterableIterator(int nums) {
        this.nums = nums;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int counter = 1;

            @Override
            public boolean hasNext() {
                return counter <= nums;
            }

            @Override
            public Integer next() {
                int num = new Random().nextInt(1, 100);
                counter++;
                return num;
            }
        };
    }

    public static void main(String[] args) {
        System.out.println("Введите желаемое количество целых случайных чисел.");
        int N = new Scanner(System.in).nextInt();

        IterableIterator iterator = new IterableIterator(N);
        for (Integer integer : iterator) {
            System.out.println(integer);
        }
    }
}