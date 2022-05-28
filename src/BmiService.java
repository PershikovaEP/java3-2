public class BmiService {
    public double calculate(double h, double m) {

       int c = 2;
       double i = m / Math.pow(h, c);
       return i;
    }
}
