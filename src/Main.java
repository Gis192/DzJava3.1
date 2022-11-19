import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
        // ДЛЯ СЕБЯ
        System.out.println();
        System.out.println(service.calculate(500));
        System.out.println(service.calculate(5000));
        System.out.println(service.calculate(2000));
        System.out.println(service.calculate(4000));
        System.out.println(service.calculate(50));
        System.out.println(service.calculate(50000));

    }
}