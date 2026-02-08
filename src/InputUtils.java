package src;
import java.util.Scanner;
    public class InputUtils {
    
        public static int readInt(Scanner sc, String prompt) {
            int value;
            while (true) {
                System.out.print(prompt);
                if (sc.hasNextInt()) {
                    value = sc.nextInt();
                    sc.nextLine(); 
                    return value;
                } else {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                    sc.nextLine(); 
                }
            }
        }

        public static double readPositiveDouble(Scanner sc, String prompt) {
            double value;
            while (true) {
                System.out.print(prompt);
                if (sc.hasNextDouble()) {
                    value = sc.nextDouble();
                    sc.nextLine(); 
                    if (value > 0) {
                        return value;
                    } else {
                        System.out.println("Por favor, ingrese un número positivo.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, ingrese un número.");
                    sc.nextLine();
                }
            }
        }
    }
