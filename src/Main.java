package src;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CurrencyService service = new CurrencyService();

        List<String> history = new ArrayList<>();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        Map<Integer, String[]> conversions = Map.of(
        1, new String[]{"USD", "ARS"},
        2, new String[]{"ARS", "USD"},
        3, new String[]{"USD", "BRL"},
        4, new String[]{"BRL", "USD"},
        5, new String[]{"USD", "PEN"}
);

        while (true) {
            System.out.println("\nSea bienvenido/a al Conversor de Moneda");
            System.out.println("1) USD → ARS");
            System.out.println("2) ARS → USD");
            System.out.println("3) USD → BRL");
            System.out.println("4) BRL → USD");
            System.out.println("5) USD → PEN");
            System.out.println("6) Ver historial");
            System.out.println("7) Salir");


            int option = InputUtils.readInt(sc, "Elija una opción: ");

            if (option == 7) {
                System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                break;
            }

            if (option == 6) {
                if (history.isEmpty()) {
                    System.out.println("No hay conversiones registradas.");
                } else {
                    System.out.println("Historial de conversiones:");
                    history.forEach(System.out::println);
                }
                continue;
            }

            if (!conversions.containsKey(option)) {
                System.out.println("Opción inválida.");
                continue;
            }

            String fromCurrency = conversions.get(option)[0];
            String toCurrency   = conversions.get(option)[1];

            double amount = InputUtils.readPositiveDouble(
        sc, "Ingrese el monto en " + fromCurrency + ": ");


            try {
                String json = service.getLatestRates(fromCurrency);

                double rate = ExchangeRateParser.getCurrencyRate(json, toCurrency);

                double result =
                        CurrencyConverter.convert(amount, rate);

                System.out.printf("Resultado: %.2f %s%n",
                        result, toCurrency);

                String record = formatter.format(LocalDateTime.now())
                        + " | " + amount + " " + fromCurrency + " a "
                        + String.format("%.2f", result) + " " + toCurrency;

                history.add(record);

            } catch (Exception e) {
                System.out.println("Error al realizar la conversión.");
            }
        }

        sc.close();
    }
}
