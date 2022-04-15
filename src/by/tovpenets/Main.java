package by.tovpenets;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    /*
Основное задание
1. Написать программу для вывода на консоль названия дня недели по
введенной дате.
2. Написать программу для вывода на экран дату следующего вторника.

Дополнительное задание
3. Создать обобщенный функциональный интерфейс.
Написать класс с одним методом.
В этом методе реализуйте логику:
- если в консоль введена цифра 1, то: использования интерфейса со
строковым типом и передать в метод интерфейса логику реверса
строки(вывода строки в обратном порядке).
- если в консоль введена цифра 2, то: использования интерфейса с
целочисленным типом и передать в метод интерфейса логику
нахождения факториала числа.
 */

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату по формату yyyy/mm/dd");
        String date = scanner.nextLine();

        int year, month, dayOfMonth;
        String[] dateArray = date.split("/");
        year = Integer.parseInt(dateArray[0]);
        month = Integer.parseInt(dateArray[1]);
        dayOfMonth = Integer.parseInt(dateArray[2]);


        LocalDate localDate = LocalDate.of(year, month, dayOfMonth);
        System.out.println(localDate.getDayOfWeek());

        Task2.test(1);
        Task2.test(2);
    }
}
@FunctionalInterface
interface Calculator<T> {
    void calculate(T param);
}
class Task2{
    static int factorial(int num){
        int result = 0;

        for (int i = 1; i <= num; i++)
            result += i;

        return result;
    }
    static void test(int num){
        if (num == 1){
            Calculator<String> reverser = param -> System.out.println(new StringBuilder(param).reverse());
            reverser.calculate("12345678");

        }
        else if (num == 2){
            Calculator<Integer> factorial = param -> System.out.println(factorial(param));
            factorial.calculate(6);

        }
    }
}
