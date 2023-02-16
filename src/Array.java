import java.util.Arrays;
import java.util.Random;

/**
 * Решение задач на массивы
 */
public class Array {

    public static void main(String[] args) {
        task2_1();
        task2_2();
        task2_3();
        task2_4();
    }

    public static int[] generateRandomArray() {
        int[] arr = new int[30];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(100) + 100;
        return arr;
    }

    //Объявите три массива:
    //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
    //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
    //Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания
    // массива: с помощью ключевого слова или сразу заполненный элементами.
    public static void task1_1() {
        System.out.println("Задача 1_1");
        int[] integ = new int[3];
        integ[0] = 1;
        integ[1] = 2;
        integ[2] = 3;
        double[] doud = {1.57, 7.654, 9.986};
        boolean[] boole = {true, false};
    }

    //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
    // В конце строки запятую ставить не надо.
    public static void task1_2() {
        System.out.println("Задача 1_2");
        int[] integ = new int[3];
        integ[0] = 1;
        integ[1] = 2;
        integ[2] = 3;
        double[] doud = {1.57, 7.654, 9.986};
        boolean[] boole = {true, false};
        for (int i = 0; i < integ.length; i++) {
            if (i != integ.length - 1) System.out.print(integ[i] + ", ");
            else System.out.println(integ[i]);
        }

        for (int i = 0; i < doud.length; i++) {
            if (i != doud.length - 1) System.out.print(doud[i] + ", ");
            else System.out.println(doud[i]);
        }

        for (int i = 0; i < boole.length; i++) {
            if (i != boole.length - 1) System.out.print(boole[i] + ", ");
            else System.out.println(boole[i]);
        }
        System.out.println();
    }

    //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
    // В конце строки запятую ставить не надо.
    //Если в задаче № 2 в консоль у вас вывелся результат:
    //// произвольные элементы третьего массива
    //то в этой задаче результат должен быть таким:
    //// произвольные элементы третьего массива в обратном порядке
    public static void task1_3() {
        System.out.println("Задача 1_3");
        int[] integ = new int[3];
        integ[0] = 1;
        integ[1] = 2;
        integ[2] = 3;
        double[] doud = {1.57, 7.654, 9.986};
        boolean[] boole = {true, false};
        for (int i = integ.length - 1; i >= 0; i--) {
            if (i != 0) System.out.print(integ[i] + ", ");
            else System.out.println(integ[i]);
        }

        for (int i = doud.length - 1; i >= 0; i--) {
            if (i != 0) System.out.print(doud[i] + ", ");
            else System.out.println(doud[i]);
        }

        for (int i = boole.length - 1; i >= 0; i--) {
            if (i != 0) System.out.print(boole[i] + ", ");
            else System.out.println(boole[i]);
        }
        System.out.println();
    }

    //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
    //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
    public static void task1_4() {
        System.out.println("Задача 1_4");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) arr[i]++;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
    //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
    // «Сумма трат за месяц составила … рублей».
    public static void task2_1() {
        System.out.println("Задача 2_1");
        int[] cost = generateRandomArray();
        int sum = 0;
        for (int current : cost) {
            sum += current;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }


    //Также бухгалтерия попросила найти минимальную и максимальную трату за день.
    //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
    // «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
    public static void task2_2() {
        System.out.println("Задача 2_2");
        int[] cost = generateRandomArray();
        int min = cost[0];
        int max = cost[0];
        for (int current : cost) {
            if (max < current) max = current;
            if (min > current) min = current;
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println();
    }

    //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
    //Напишите программу, которая посчитает среднее значение трат за месяц
    // (то есть сумму всех трат за месяц поделить на количество дней), и выведите в консоль результат в формате:
    // «Средняя сумма трат за месяц составила … рублей».
    //Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
    public static void task2_3() {
        System.out.println("Задача 2_3");
        int[] cost = generateRandomArray();
        int sum = 0;
        float result;
        for (int current :
                cost) {
            sum += current;
        }
        result = sum / 30f;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", result);
        System.out.println();
    }

    //В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в
    // обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в
    // виде массива символов — char[ ].
    //Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
    // В качестве данных для массива используйте:
    //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    //В результате в консоль должно быть выведено: Ivanov Ivan.
    //Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву
    // циклом и распечатать его элементы в правильном порядке.
    public static void task2_4() {
        System.out.println("Задача 2_4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

}