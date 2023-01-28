public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){
        System.out.println("Задача 1");
int a=40000;
byte b=100;
short c=20000;
long d=600000000000L;
float g=3.55f;
double h=1.581;
        System.out.println("Значение переменной a с типом int равно"+a);
        System.out.println("Значение переменной b с типом byte равно"+b);
        System.out.println("Значение переменной c с типом short равно"+c);
        System.out.println("Значение переменной d с типом long равно"+d);
        System.out.println("Значение переменной g с типом float равно"+g);
        System.out.println("Значение переменной h с типом double равно"+h);
        task2();
    }
    public static void task2(){
        System.out.println("Задача 2");
        float floatNumber=27.12f;
        System.out.println("float="+floatNumber);
        long longNumber=987678965549L;
        System.out.println("long="+longNumber);
        double doubleNumber=2.786;
        System.out.println("double="+doubleNumber);
        short shortNumber=569;
        System.out.println("short="+shortNumber);
        int intNumber=-159;
        System.out.println("int="+intNumber);
        short shortNumber1=27897;
        System.out.println("short="+shortNumber1);
        byte byteNumber=67;
        System.out.println("byte="+byteNumber);
        task3();
    }
    public static void task3(){
        System.out.println("Задача 3");
int classOne=23;
int classTwo=27;
int classThree=30;
int totalSheets=480;
int totalStudents=classOne + classTwo + classThree;
int calculatedSheets= totalSheets/totalStudents;
System.out.println("На каждого ученика рассчитано" + calculatedSheets + "листов бумаги");
        task4();
    }
    public static void task4(){
        System.out.println("Задача 4");
int bottles=16;
int minutes=2;
int bottlesMinute = bottles / minutes;
int bottles20Minutes = bottlesMinute * 20;
int bottlesDay = bottlesMinute * 1440;
int bottles3Days = bottlesMinute * 4320;
int bottles30Days = bottlesMinute * 43200;
System.out.println("За 20 мин машина произвела " + bottles20Minutes + " штук бутылок ");
System.out.println("За сутки машина произвела " + bottlesDay + " штук бутылок ");
System.out.println("За 3 дня машина произвела " + bottles3Days + " штук бутылок ");
System.out.println("За 1 месяц машина произвела " + bottles30Days + " штук бутылок ");
        task5();
    }
    public static void task5(){
        System.out.println("Задача 5");
        int whitePaint= 2;
        int brownPaint= 4;
        int totalPaint= 120;
        int totalClasses= totalPaint/ (whitePaint+brownPaint);
        int totalWhitePaint= totalClasses * whitePaint;
        int totalBrownPaint= totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint
                + " банок белой краски и " + totalBrownPaint + " банок коричневой краски ");
        task6();
    }
    public static void task6(){
        System.out.println("Задача 6");
int bananasPieces = 5;
int oneBananasGr = 80;
int totalBananasGr = bananasPieces * oneBananasGr;
int milkMl = 200;
double totalMilkGr = milkMl * 1.05;
int iceCream = 2;
int totalIceCreamGr = iceCream * 100;
int eggPieces = 4;
int totalEggGr = eggPieces * 70;
double totalWeightGr = totalBananasGr + totalMilkGr + totalIceCreamGr + totalEggGr;
double totalWeightKg = (totalWeightGr) / 1000;
System.out.println("Вес спортзавтрака " + totalWeightGr + " граммов ");
System.out.println("Вес спортзавтрака " + totalWeightKg + " килограмм ");
        task7();
    }
    public static void task7(){
        System.out.println("Задача 7");
int weight = 7*1000;
int minGrDay = 250;
int maxGrDay = 500;
int maxDays = weight / minGrDay;
int minDays = weight / maxGrDay;
int averageDays = (maxDays + minDays) / 2;
System.out.println(maxDays);
System.out.println(minDays);
System.out.println(averageDays);
        task8();
    }
    public static void task8(){
        System.out.println("Задача 8");
int masha = 67760;
int denis = 83690;
int kristina = 76230;
double salaryIncreaseMasha = masha + (masha * 0.1);
double salaryIncreaseDenis = denis + (denis * 0.1);
double salaryIncreaseKristina = kristina + (kristina * 0.1);
int annualIncomeMasha = masha * 12;
int annualIncomeDenis = denis * 12;
int annualIncomeKristina = kristina * 12;
double annualIncomeSalaryIncreaseMasha = salaryIncreaseMasha * 12;
double annualIncomeSalaryIncreaseDenis = salaryIncreaseDenis * 12;
double annualIncomeSalaryIncreaseKristina = salaryIncreaseKristina * 12;
double differenceMasha = annualIncomeSalaryIncreaseMasha - annualIncomeMasha;
double differenceDenis = annualIncomeSalaryIncreaseDenis - annualIncomeDenis;
double differenceKristina = annualIncomeSalaryIncreaseKristina + annualIncomeKristina;
System.out.println("Маша теперь получает " + salaryIncreaseMasha + " рублей. Годовой доход вырос на " + differenceMasha
        + " рублей");
System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей. Годовой доход вырос на " + differenceDenis
                + " рублей");
System.out.println("Кристина теперь получает " + salaryIncreaseKristina + " рублей. Годовой доход вырос на "
        + differenceKristina + " рублей");

    }
}