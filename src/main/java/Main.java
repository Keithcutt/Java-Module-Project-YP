import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int people = peopleNumberInput();
        Calculator.goodsInput();
        Calculator.totalAmount(people);
    }
    public static int peopleNumberInput() {
        Scanner sc = new Scanner(System.in);
        int peopleNumber;

        while (true) {
            System.out.println("На скольких человек необходимо разделить счёт?");
            if (sc.hasNextInt()) {
                peopleNumber = sc.nextInt();
                if (peopleNumber > 1) {
                    return (peopleNumber);
                } else {
                    System.out.println("ОШИБКА! Вы указали некорректное значение.");
                }
            } else {
                System.out.println("Ошибка! Вы указали некорректное значение.");
                sc.next();
            }
        }
        sc.close();
    }
}