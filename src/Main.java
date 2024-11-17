public class Main {
    public static void main(String[] args) {
        // Домашее задание 2
        // Задача 1
        System.out.println("Задание 1");
        int savings = 2_459_000;
        int amount = 15_000;
        int sum = 0;
        int month = 0;
        while (sum <= savings) {
            month = month + 1;
            sum = amount * month;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + sum + " рублей");
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
        int births = 17;
        int mortal = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * births / 1_000 - population * mortal / 1_000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        // Задание 4
        System.out.println("Задание 4");
        int accruals = 12_000_000;
        amount = 15_000;
        sum = amount;
        month = 0;
        double percent1 = 0.07;
        while (sum <= accruals) {
            sum = (int) (sum * (1 + percent1));
            month++;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + sum + " рублей");
        }
        // Задание 5
        System.out.println("Задание 5");
        accruals = 12_000_000;
        amount = 15_000;
        sum = amount;
        month = 0;
        double interestRate = 0.07;
        while (sum <= accruals) {
            sum = (int) (sum * (1 + interestRate));
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " ,сумма накоплений равна " + sum + " рублей");
            }
        }
        // Задание 6
        System.out.println("Задание 6");
        amount = 15_000;
        sum = amount;
        month = 0;
        int months = 12 * 9;
        interestRate = 0.07;
        while (month <= months) {
            sum = (int) (sum * (1 + interestRate));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " ,сумма накоплений равна " + sum + " рублей");
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