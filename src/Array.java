import java.util.Arrays;
/**
 * Решение задач на массивы
 */
public class Array {

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
            if (i != integ.length - 1)
                System.out.print(integ[i] + ", ");
            else System.out.println(integ[i]);
        }

        for (int i = 0; i < doud.length; i++) {
            if (i != doud.length - 1)
                System.out.print(doud[i] + ", ");
            else System.out.println(doud[i]);
        }

        for (int i = 0; i < boole.length; i++) {
            if (i != boole.length - 1)
                System.out.print(boole[i] + ", ");
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
            if (i != 0)
                System.out.print(integ[i] + ", ");
            else System.out.println(integ[i]);
        }

        for (int i = doud.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(doud[i] + ", ");
            else System.out.println(doud[i]);
        }

        for (int i = boole.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(boole[i] + ", ");
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
            if (arr[i] % 2 != 0)
                arr[i]++;
        }
        System.out.println(Arrays.toString(arr));
    }

}