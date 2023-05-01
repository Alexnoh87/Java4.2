public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 59;
        double heightInMetres = 1.68;
        int bmi = service.calculate(heightInMetres, weightInKg);
        System.out.println("Индекс массы тела " + bmi);
        }
}