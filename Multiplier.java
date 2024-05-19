
    import java.math.BigDecimal;
import java.util.List;

    public class Multiplier {

        public int multiply(int x,int y) {
            return x*y;
        }

        public int multiply(int x,int y,int z,int v) {
            return multiply(x, y) * multiply(z, v);
        }

        public double multiply(double x,double y) {
            return x*y;
        }

        public BigDecimal multiply(BigDecimal x,BigDecimal y) {
            return x.multiply(y);
        }
        public int multiply(List<Integer> numbers) {
            int wynik   = 1;
            for (int num : numbers) {
                wynik   *= num;
            }
            return wynik   ;
        }
    }

