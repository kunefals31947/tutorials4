import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        System.out.println("Wynik " + multiplier.multiply(3, 4));
        System.out.println("Wynik (BigDecimal) " + multiplier.multiply(BigDecimal.valueOf(3.5), BigDecimal.valueOf(4.5)));

        Adder adder = new Adder();
        System.out.println("wynik " + adder.add(3, 4));
        System.out.println("wynik(BigDecimal) " + adder.add(Arrays.asList(BigDecimal.valueOf(3.5), BigDecimal.valueOf(4.5))));

        Address address = new Address();
        System.out.println("Adres: " + address.createAddress("Polska", "Cieszyn", "12345", "Miodowa", 10));
    }
}