import java.util.*;

// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

public class task {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        int min = numbers.get(0);
        int max = numbers.get(0);
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        double average = sum / numbers.size();

        numbers.removeIf(n -> n % 2 == 0);
        
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
        System.out.println("Список, из которого удалены все четные числа: " + numbers);


    }

}
