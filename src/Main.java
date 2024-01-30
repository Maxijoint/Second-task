//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int price = 5000; // Стоимость билета
        int miles = 50; //  Количество рублей для одной бонусной мили

        int bonus;

        bonus = price / miles; // Формула подсчета бонуса

        System.out.println("Количество бонусов" + bonus);

    }
}