import model.Car;
import model.enums.Brand;
import model.enums.Color;

import java.util.Scanner;

public class ManipulateCar {
    private static Scanner input = new Scanner(System.in);

    public static String searchCarByBrand(Car[] cars) {
        System.out.println("Please enter brand name:");
        String brand = input.nextLine();
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                return car.toString();
            }
        }
        return "No such car";
    }

    public static String searchCarByModel(Car[] cars) {
        System.out.println("Please enter model name:");
        String model = input.nextLine();
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                return car.toString();
            }
        }
        return "No such car";
    }

    public static String searchCarByYear(Car[] cars) {
        System.out.println("Please enter year of issue:");
        int year = Integer.parseInt(input.nextLine());
        for (Car car : cars) {
            if (car.getIssueYear() == year) {
                return car.toString();
            }
        }
        return "No such car";
    }

    public static String searchCarByColor(Car[] cars) {
        System.out.println("Please enter color:");
        String color = input.nextLine();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                return car.toString();
            }
        }
        return "No such car";
    }

    public static String searchCarByPrice(Car[] cars) {
        System.out.println("Please enter price:");
        int price = Integer.parseInt(input.nextLine());
        for (Car car : cars) {
            if (car.getPrice() == price) {
                return car.toString();
            }
        }
        return "No such car";
    }

    public static String searchCarByNumber(Car[] cars) {
        System.out.println("Please enter registration number:");
        String number = input.nextLine();
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(number)) {
                return car.toString();
            }
        }
        return "No such car";
    }

    public static String searchCar(Car[] cars, String param) {
        switch (param) {
            case "brand":
                return searchCarByBrand(cars);
            case "model":
                return searchCarByModel(cars);
            case "year":
                return searchCarByYear(cars);
            case "color":
                return searchCarByColor(cars);
            case "price":
                return searchCarByPrice(cars);
            case "number":
                return searchCarByNumber(cars);
            default:
                return "No such parameter";
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car(1, Brand.BMW, "X5", 2010);
        car1.setColor(Color.YELLOW);
        car1.setPrice(20000);
        car1.setRegistrationNumber("KZ100ZKZ");
        Car car2 = new Car(2, Brand.TOYOTA, "Camry 70", 2018, Color.WHITE, 50000, "KZ728TQA");
        Car car3 = new Car(3, Brand.MAZDA, "RX-8", 2011, Color.RED, 35000, "KZ777CCC");
        Car car4 = new Car(4, Brand.CHEVROLET, "Impala", 1967);
        car4.setColor(Color.BLACK);
        Car car5 = new Car(5, Brand.FORD, "Focus", 2000);
        Car car6 = new Car(6, Brand.DAEWOO, "Matiz", 2005, Color.BLUE, 10000, "KZ034BAG");
        Car[] cars = {car1, car2, car3, car4, car5, car6};

        while (true) {
            System.out.println("Please choose a parameter by which you want to search car or type quit");
            System.out.println("\tbrand / model / year / color / price / number");
            String parameter = input.nextLine();
            if (parameter.equals("quit")) {
                break;
            }
            System.out.println("\n" + searchCar(cars, parameter) + "\n");
        }
    }
}
