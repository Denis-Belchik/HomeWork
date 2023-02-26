import java.time.LocalDate;

public class Method {
    public static void main(String[] args) {
        checkLeapYear(2024);
        System.out.println();
        checkApplication(1, 2030);
        System.out.println();
        System.out.println(checkDays(80));
        System.out.println();


    }

    /*
    Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
Эту проверку вы уже реализовывали в задании по условным операторам.
Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение: «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».
     */
    public static void checkLeapYear(int year) {
        System.out.println("Задача 1_1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }

    /*
Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
Если устройство старше текущего года, предложите ему установить облегченную версию.
Текущий год можно получить таким способом:
int currentYear = LocalDate.now().getYear();
Или самим задать значение вручную — ввести в переменную числовое значение.
В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
     */
    public static void checkApplication(int iOS, int year) {
        System.out.println("Задача 1_2");
        int currentYear = LocalDate.now().getYear();
        if (iOS == 1) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версия для Android");
            } else {
                System.out.println("Установите версию приложения для Android");
            }
        } else {
            if (year < currentYear) {
                System.out.println("Установите облегченную версия для iOC");
            } else {
                System.out.println("Установите версию приложения для iOS");
            }
        }
    }

    /*
Возвращаемся к задаче на расчет дней доставки банковской карты.
Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
     */
    public static int checkDays(int distance) {
        int time = 1;
        if (distance > 100) {
            return -1;
        }
        if (distance > 20) {
            time++;
        }
        if (distance >= 60) {
            time++;
        }
        return time;
    }

}
