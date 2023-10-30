import java.util.Scanner;
public class Calculator {
    static double sum = 0.0;

    // Добавление товаров в список
    static void goodsInput() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Введите название товара.");
            String name = sc.next(); // ?
            double cost = 0.0;
            while (true) {
                System.out.println("Введите стоимость товара.");
                if (sc.hasNextDouble()) {
                    cost = sc.nextDouble();
                    if (cost > 0.0) {
                        sum += cost;
                        break;
                    }
                } else {
                    System.out.println("ОШИБКА! Вы указали некорректное значение.");
                    sc.next();
                }
            }

            Goods.list = Goods.list + " " + name + " " + Double.toString(cost) + "\n";

            System.out.println("Товар успешно добавлен!");
            System.out.println("Хотите ввести следующий товар или завершить?");
            if (end()) {
                break;
            }
        }
        sc.close();
        System.out.println("Добавленные товары:");
        System.out.print(Goods.list);
        System.out.println("===================");
        sc.close();
    }

    // Расчет итоговой суммы
    static void totalAmount(int people) {
        sum /= people;
        System.out.println("Итоговая сумма: " + Formatter.rounding(sum) + " " + Formatter.rubles(sum) + ".");
    }

    // Обрабатываем случай, если вводят слово ЗАВЕРШИТЬ.
    static boolean end() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("завершить")) {
            return true;
        } else {
            return false;
        }
    }
}
