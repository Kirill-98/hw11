public class Main {
    //1 задача
    public static void printcheckingYear(int year){
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " год — високосный год");
        }else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void main(String[] args) {
        //переменные для 1 задачи
        int year = 2004;
        printcheckingYear(year);
        // переменные для 2 задачи
        int clientOs = 1;
        int clientDeviceYear = 2017;
        printcheckingOs(clientOs , clientDeviceYear);
        //переменные для 3 задачи
        int deliveryDistance = 67;
        int days = distance(deliveryDistance);
        if (days > 0){
            System.out.println("Потребуется дней для доставки - " + days);
        }else
        {
            System.out.println("Доставки нет.");
        }

    }
    //2 задача

    public static void printcheckingOs (int clientOs , int clientDeviceYear){
        if (clientOs == 0){
            if (clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOs == 1){
            if (clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    //3 задача
    public  static int distance(int deliveryDistance ) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return 3;
        } else {
            return 0;
        }
    }

}