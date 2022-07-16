import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
//1st and 2nd tasks

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Пожалуйста, укажите Вашу операционную систему:");
        System.out.println("0 - iOS");
        System.out.println("1 - Android");
        int clientOS = Integer.parseInt(reader.readLine());

        System.out.println("Укажите год выпуска Вашего телефона:");
        int clientPhoneYear = Integer.parseInt(reader.readLine());

        if (clientOS == 0 && clientPhoneYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0 && clientPhoneYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientPhoneYear > 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS > 1){
            System.out.println("Такого варианта нет!");
        }
        else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
//3nd task
        System.out.println("Введите год, а я скажу, високосный ли он");
        int year = Integer.parseInt(reader.readLine());

        if (year % 4 == 0 && year % 100!=0 || year % 400 == 0 ) {
            System.out.println(year + " год является високосным!");
        }
        else {
            System.out.println(year + " год не является високосным!");
        }
//4 task
        System.out.println("Введите расстояние до нас:");
        int deliveryDistance = Integer.parseInt(reader.readLine());

        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance < 100){
            System.out.println("Потребуется дней: 3");
        }
        else {
            System.out.println("Доставка осуществляется по почте. Срок не регламентирован.");
        }
//5th task
        System.out.println("Введите номер месяца:");
        int month = Integer.parseInt(reader.readLine());

        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого не существует!");
        }
    }

}