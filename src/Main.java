import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Độ F sang dộ C");
            System.out.println("2. Độ C sang dộ F");
            System.out.println("0. Exit");
            System.out.print("Lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Nhập độ F: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Độ F sang độ C là: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.print("Nhập độ C: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Độ C sang độ F là: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:{
                    System.exit(0);
                }
                default:{
                    System.out.println("Không có ");
                }
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
