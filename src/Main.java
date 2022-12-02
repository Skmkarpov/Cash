public class Main {
    public static void main(String[] args) {
        int x = 100; //счёт клиента
        int c = 2000; //сумма пополнения
        int b; // бонус
        if (c > 1000) { b = c/100;
        } else { b = 0;
        }
        int z = x+c+b;
        int v = z-(x+c);
        System.out.println("Итоговый счёт = " + z);
        System.out.println("Бонусные мили = " + v);
    }
}
