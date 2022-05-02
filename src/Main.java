public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmi = service.calculate(65, 1.77f);

        System.out.println(bmi);
    }
}
