public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("задача 1");
        int salary = 15000;
        int total = 1;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

    }

    public static void task2() {
        System.out.println("задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("задача 3 ");
        int y = 12_000_000;
        int birtsRate = y / 1000 * 17; //рождаемость
        //System.out.println(birtsRate);
        int mortality = y / 1000 * 8; // смертность
        //System.out.println(mortality);
        int populationGrowth = birtsRate - mortality;//прирост населения
        //System.out.println(populationGrowth);
        for (int i = 1; i <= 10; i++) {
            y = y + populationGrowth;
            System.out.println("Год " + i + " численность населения составляет " + y);
        }
    }

    public static void task4() {
        System.out.println("задача 4");
        int sum = 15000;
        int i = 0;
        while (sum < 12_000_000) {
            sum += sum/100 * 7;
            i++;
            System.out.println("Месяц " + i + " сумма на счете " + sum + " рублей");
        }
    }

    public static void task5() {
        System.out.println("задача 5");
        int sum = 15000;
        int i = 0;
        while (sum < 12_000_000) {
            sum += sum/100 * 7;
            i++;
            if (i % 6 == 0)  {
                System.out.println("Месяц " + i + " сумма на счете " + sum + " рублей");
            }
        }
    }
    public static void task6() {
        int sum = 15000; //сумма накоплений
        int month = 1;
        int nineYears = (month * 12) * 9; //девять лет
        while (month <= nineYears) {
            sum+= sum/100 *7;
            if (month %6 ==0) { System.out.println( "Месяц " + month + " сумма на счете " +  sum + " рублей");}
                month++;

            }
    }
}