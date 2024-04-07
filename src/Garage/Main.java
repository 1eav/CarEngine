package Garage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("****");
            System.out.println("МЕНЮ:");
            System.out.println("1. SUV");
            System.out.println("2. SEDAN");
            System.out.println("3. HATCHBACK");
            System.out.println("4. PICKUP");
            System.out.println("5. LIMOUSINE");
            System.out.println("6. COUPE");
            System.out.println("7. WAGON");
            System.out.println("8. CABRIOLET");
            System.out.print("Выберите номер, чтобы просмотреть машину: ");

            int choice = scanner.nextInt();

            Car car = null;
            Engine engine = null;

            switch(choice) {
                case 0:
                    System.out.println("Завершение программы.");
                    return;
                case 1:
                    car = new Car(CarType.SUV, 2300);
                    engine = new Engine(EngineType.DIESEL, 3.5, 156);
                    break;
                case 2:
                    car = new Car(CarType.SEDAN, 3400);
                    engine = new Engine(EngineType.GAS, 2.7, 132);
                    break;
                case 3:
                    car = new Car(CarType.HATCHBACK, 2100);
                    engine = new Engine(EngineType.GAS, 2.5, 121);
                    break;
                case 4:
                    car = new Car(CarType.PICKUP, 3900);
                    engine = new Engine(EngineType.DIESEL, 4.1, 168);
                    break;
                case 5:
                    car = new Car(CarType.LIMOUSINE, 3400);
                    engine = new Engine(EngineType.GAS, 3.1, 150);
                    break;
                case 6:
                    car = new Car(CarType.COUPE, 2900);
                    engine = new Engine(EngineType.PETROL, 3.5, 210);
                    break;
                case 7:
                    car = new Car(CarType.WAGON, 3200);
                    engine = new Engine(EngineType.HYBRID, 2.1, 110);
                    break;
                case 8:
                    car = new Car(CarType.CABRIOLET, 3100);
                    engine = new Engine(EngineType.GAS, 3.3, 152);
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }

            if (car != null && engine != null) {
                System.out.println("****");
                System.out.println(car);
                System.out.println(engine);
            }
        }
    }
}