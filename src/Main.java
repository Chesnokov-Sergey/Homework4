public class Main {
    public static void main(String[] args) {
        // Домашее задание 2
        // Задача 1
        System.out.println("Задание 1");
        int savings = 2_459_000;
        int amount3 = 15_000;
        int sum3 = 0;
        int month2 = 0;
        while (sum3 <= savings) {
            month2 = month2 + 1;
            sum3 = amount3 * month2;
            System.out.println("Месяц " + month2 + " ,сумма накоплений равна " + sum3 + " рублей");
        }
        // Задание 2
        System.out.println("Задание 2");
        int b = 0;
        while (b < 10) {
            b++;
            System.out.print(b + " ");
        }
        System.out.println();
        for (; b >= 1; b--) {
            System.out.print(b + " ");
        }
        System.out.println();
        // Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int onethousandBirths = 17;
        int mortalityperThousand = 8;
        int currentYear = 2024;
        for (int yaer = currentYear; yaer < currentYear + 10; yaer++) {
            population += population * onethousandBirths / 1_000 - population * mortalityperThousand / 1_000;
            System.out.println("Год " + yaer + ", численность населения составляет " + population);
        }
        // Задание 4
        System.out.println("Задание 4");
        int savings1 = 12_000_000;
        int amount4 = 15_000;
        int sum4 = amount4;
        int month3 = 0;
        double percent1 = 0.07;
        while (sum4 <= savings1) {
            sum4 = (int) (sum4 * (1 + percent1));
            month3++;
            System.out.println("Месяц " + month3 + " ,сумма накоплений равна " + sum4 + " рублей");
        }
        // Задание 5

        int savings2 = 12_000_000;
        int amount5 = 15_000;
        int sum5 = amount5;
        int month4 = 0;
        double percent2 = 0.07;
        while (sum5 <= savings2) {
            sum5 = (int) (sum5 * (1 + percent2));
            month4 = month4 + 1;
            if (month4 % 6 == 0) {
                System.out.println("Месяц " + month4 + " ,сумма накоплений равна " + sum5 + " рублей");
            }
        }
        // Задание 6
        System.out.println("Задание 6");
        amount5 = 15_000;
        sum5 = amount5;
        month4 = 0;
        int months = 12 * 9;
        percent2 = 0.07;
        while (month4 <= months) {
            sum5 = (int) (sum5 * (1 + percent2));
            month4++;
            if (month4 % 6 == 0) {
                System.out.println("Месяц " + month4 + " ,сумма накоплений равна " + sum5 + " рублей");
            }
        }
        // Задание 7
        System.out.println("Задание 7");
        int firstFriday = 1;
        for (int day = firstFriday; day < 31; day += 7) {
            System.out.println("Сегодня пятница " + day + " -е число. Необходимо подготовить отчет");
        }
        // Задание 8
        System.out.println("Задание 8");
        int period = 79;
        int initialPeriod = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = initialPeriod; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}