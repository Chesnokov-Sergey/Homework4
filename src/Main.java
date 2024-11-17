public class Main {
    public static void main(String[] args) {
        // Циклы
        // Циклы Часть 1
        // Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i = i + 1) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        // Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Задание 5
        System.out.println("Задание 5");
        for (int year = 1904; year < 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }
        // Задание 6
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Задание 7
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Задание 8
        System.out.println("Задание 8");
        int amount = 29000;
        int sum = 0;
        for (int month = 1; month <= 12; month = month + 1) {
            sum = amount * month;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + sum + " рублей");
        }
        // Задание 9
        System.out.println("Задание 9");
        int amount1 = 29000;
        int sum1 = 0;
        double percent = 0.01;
        for (int month1 = 1; month1 <= 12; month1 = month1 + 1) {
            sum1 = (int) ((amount1 * month1) * (1 + percent));
            System.out.println("Месяц " + month1 + " ,сумма накоплений равна " + sum1 + " рублей");
        }
                // Задание 10
        System.out.println("Задание 10");
        for (int multiplication = 2; multiplication <= 10; multiplication = multiplication + 1) {
            System.out.println("2 * " + multiplication + " = " + 2  * multiplication);
        }

    }
}