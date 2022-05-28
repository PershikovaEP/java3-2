public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double a = 1.7; // введите рост в метрах;
        double b = 59.5; // введите вес в килограммах;
        double bmi = service.calculate(a, b);
        System.out.println("Индекс Массы Тела " + bmi);
    }
}
