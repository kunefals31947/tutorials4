

import java.math.BigDecimal;
import java.util.List;

public class Adder {

    public int add(int x,int y) {
        return x + y;
    }
    public BigDecimal add(List<BigDecimal> numbers) {
        BigDecimal wynik = BigDecimal.ZERO;
        for (BigDecimal num : numbers) {
            wynik = wynik.add(num);
        }
        return wynik  ;
    }
}