public class Main {
    public static void main(String[] args) {
        int CustomerAccount = 100; //счёт клиента
        int RepAmount = 500; //сумма пополнения
        int bonus; // бонус
        if (RepAmount > 1000) { bonus = RepAmount/100;
        } else { bonus = 0;
        }
        int FinalScore = CustomerAccount+RepAmount+bonus;
        int BonusMiles = FinalScore-(CustomerAccount+RepAmount);
        System.out.println("Итоговый счёт = " + FinalScore);
        System.out.println("Бонусные мили = " + BonusMiles);
    }
}
