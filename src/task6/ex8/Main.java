package task6.ex8;
/*
Домашние  электроприборы. Определить  иерархию  электроприборов.
Включить  некоторые  в  розетку.  Подсчитать  потребляемую  мощность.
Провести  сортировку  приборов  в квартире  на основе  мощности.  Найти
прибор в квартире, соответствующий заданному диапазону параметров.

 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplianceManager applianceManager = new ApplianceManager();

        Scanner sc = new Scanner(System.in);

        System.out.println("Меню : " + "\n" + "1.Показать все приборы." + "\n" + "2.Показать вквлюченные приборы." + "\n"
                + "3.Показать выключеные приборы." + "\n" + "4.Показать потребляемую мощность." + "\n"
                + "5.Отсортировать приборы по мощности." + "\n" + "6.Найти приборы по заданным параметрам.");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                applianceManager.showAllAppliance();
                break;
            case 2:
                applianceManager.showApplOn();
                break;
            case 3:
                applianceManager.showApplOff();
                break;
            case 4:
                applianceManager.findPower();
                break;
            case 5:
                applianceManager.sortByPower();
                break;
            case 6:
                System.out.println("Задайте параметры поиска : " + "\n" + "Минимальная мощность :");
                int a = sc.nextInt();
                System.out.println("Миксимальная мощность :");
                int b = sc.nextInt();
                System.out.println("Статус прибора (Вкл или Выкл)");
                String status = sc.next();

                applianceManager.findByParam(a, b, status);
                break;
        }
    }
}