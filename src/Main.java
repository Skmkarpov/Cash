public class Main {
    public static void main(String[] args) {
        int customerAccount = 100; //счёт клиента
        int repAmount = 500; //сумма пополнения
        int bonus; // бонус
        if (repAmount > 1000) {
            bonus = repAmount / 100;
        } else {
            bonus = 0;
        }
        int finalScore = customerAccount + repAmount + bonus;
        int bonusMiles = finalScore - (customerAccount + repAmount);
        System.out.println("Итоговый счёт = " + finalScore);
        System.out.println("Бонусные мили = " + bonusMiles);
    }
}
