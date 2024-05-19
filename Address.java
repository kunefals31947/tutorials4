
public class Address {

    public String createAddress(String kraj) {
        return String.format("Country: %s", kraj);
    }

    public String createAddress(String kraj, String Miasto) {
        return String.format("Country: %s, City: %s", kraj, Miasto);
    }

    public String createAddress(String kraj, String miasto, String kod_pocztowy) {
        return String.format("Country: %s, City: %s, Postal Code: %s", kraj, miasto, kod_pocztowy);
    }

    public String createAddress(String kraj, String Miasto, String kod_pocztowy, String nazwa_ulicy) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s", kraj, Miasto, kod_pocztowy,nazwa_ulicy);
    }

    public String createAddress(String kraj, String Miasto, String kod_pocztowy, String nazwa_ulicy, int numer_mieszkania) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s, Apartment Number: %d", kraj, Miasto, kod_pocztowy, nazwa_ulicy, numer_mieszkania);
    }
}