1 задача

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вещественное число, чтобы найти квадратный корень");
        double number= scanner.nextDouble();
        if (number<0) {
            System.out.println("Квадратный корень нельзя получить с числа ниже 0");
        }
        else System.out.println("Квадратный корень от вашего числа равен " + Math.sqrt(number));
        }
        catch (Exception e) {
            System.out.println("При решении задачи возникла ошибка, невозможно получить корень");
        }
    }
}


2 задача

public class Main {
    public static void main(String[] args) {
try {
        double result = divide(4, 4);
        System.out.println("Итого: " + result);
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
    }
}

    public static double divide(double x, double y) {
            if (y==0) {
                throw new ArithmeticException("Нельзя делить на 0");
            }
            else {
                return x/y;
    }}}


3 задача

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите в строку значения для суммирования");
        String input = scanner.nextLine();
        String[] summary = input.split("\\s+");

        int sum = 0;

        for (String total:summary) {
            try {
                int number = Integer.parseInt(total);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Убираем: " + total + " (не число)");
            }
        }

        System.out.println("Сумма целых чисел в строке равна " + sum);
    } catch (Exception e) {
        System.out.println("Ошибка: " + e.getMessage());
    }
    }
}