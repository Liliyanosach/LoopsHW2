public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");

        int start = 0;
        int finalSaving = 2_459_000;
        int month = 1;
        while (start <= finalSaving) {
            System.out.println("Месяц " + month++ + ", сумма накоплений равна " + start + " рублей");
            start = start + 15_000;

        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int start = 1;
        while (start <= 10) {
            System.out.print(start);
            System.out.print(" ");
            start++;
        }
        System.out.println(" ");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");

        int populationY = 12_000_000;
        int fertility = populationY / 1_000;
        int mortality = 8;
        int totalFertility = fertility * 17;
        int year = 0;

        while (year <= 10) {
            System.out.println("Год " + year + " численность населения составляет " + populationY);
            populationY = populationY - mortality + totalFertility;
            year = year + 1;
        }


        /*for (int i = 1; i <= 10; i++) {
            populationY = populationY - mortality + totalFertility;
            System.out.println("Год " + i + " численность населения составляет " + populationY);}*/

    }

    public static void task4() {
        System.out.println("Задача 4");

        int sumContribution = 15_000;
        int monthPer = 7;
        int month = 0;

        while (sumContribution <= 12_000_000) {
            sumContribution = sumContribution + sumContribution * monthPer / 100;
            month++;
            System.out.println("Через " + month + " мес., сумма накоплений " + sumContribution);
        }
        System.out.println("Всего месяцев " + month + " сумма накоплений будет " + sumContribution);


    }

    public static void task5() {
        System.out.println("Задача 5");
        int sumContribution = 15_000;
        int monthPer = 7;
        int month = 0;

        while (sumContribution <= 12_000_000) {
            sumContribution = sumContribution + sumContribution * monthPer / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Через " + month + " мес., сумма накоплений " + sumContribution);
            }
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int sumContribution = 15_000;
        int monthPer = 7;

        for (int i = 1; i <= 108; i++) {
            sumContribution = sumContribution + sumContribution * monthPer / 100;
            if (i % 6 == 0) {
                System.out.println("Сумма накоплений " + sumContribution + " за " + i + " мес.");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int firstFriday = 1;
        System.out.println("Сегодня пятница, " + firstFriday + " число. Необходимо подготовить отчет");

        for (int i = 1; i <= 31; i++) {
            firstFriday = firstFriday + 7;
            if (firstFriday <= 31) {
                System.out.println("Сегодня пятница, " + firstFriday + " число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int yearNow = 2022;
        int yearBefore = yearNow - 200;
        int yearAfter = yearNow + 100;

        for (int i = yearBefore; i <= yearAfter; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}

