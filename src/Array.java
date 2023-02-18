import java.util.Arrays;
import java.util.Random;

/**
 * Задачи на массивы
 */
public class Array {

    public static void main(String[] args) {
        task1_1();
        task1_2();
        task1_3();
        task1_4();
        task2_1();
        task2_2();
        task2_3();
        task2_4();
        task3_1UP();
        task3_2UP();
        task3_3UP();
        task3_4UP();
        task3_5UP();
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
            System.out.print(integ[i]);
            if (i != integ.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < doud.length; i++) {
            System.out.print(doud[i]);
            if (i != doud.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < boole.length; i++) {
            System.out.print(boole[i]);
            if (i != boole.length - 1)
                System.out.print(", ");
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
            System.out.print(integ[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();

        for (int i = doud.length - 1; i >= 0; i--) {
            System.out.println(doud[i]);
            if (i != 0)
                System.out.print(", ");
        }

        System.out.println();
        for (int i = boole.length - 1; i >= 0; i--) {
            System.out.print(boole[i]);
            if (i != 0)
                System.out.print(", ");
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
        result = (float) sum / cost.length;
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
        System.out.println();
    }

    /*
    Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в консоль.
    Постарайтесь заполнить обе диагонали в одном цикле.
     */
    public static void task3_1UP() {
        System.out.println("Задача 3_1");
        int[][] matrix = new int[7][7];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || j == matrix[i].length - 1 - i) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
    У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
    Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
    Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
    Нам дан массив чисел: {5, 4, 3, 2, 1}
    Необходимо привести его к виду: {1, 2, 3, 4, 5}
    Решите задачу с использованием дополнительного массива.
    Напечатайте массив до преобразования и после с помощью
    System.out.println(Arrays.toString(arr));
     */
    public static void task3_2UP() {
        System.out.println("Задача 3_2");
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = new int[5];

        for (int i = arr1.length - 1; i >= 0; i--) {
            arr2[arr1.length - 1 - i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println();
    }

    /*
    Решите предыдущее задание, но без использования дополнительного массива.
    Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
    Выведите результат программы в консоль тем же способом.
    **Уточнения**:
    - Это задание не на сортировку.
    - Не использовать Arrays.sort() и другие способы сортировок.
    - Числа в порядке убывания даны исключительно для указания направления чтения.
    - Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.
     */
    public static void task3_3UP() {
        System.out.println("Задача 3_3");
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int value;
        for (int i = 0; i < arr.length / 2; i++) {
            value = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = value;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    /*
    Задача, которая используется/бывает/встречается на собеседованиях.
    Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
    Необходимо найти два числа, сумма которых равна −2.
    Напечатать эти числа в консоль.
     */
    public static void task3_4UP() {
        System.out.println("Задача 3_4");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2)
                    System.out.println(arr[i] + " + " + arr[j] + " = -2");
            }
        }

        System.out.println();
    }

    /*
    Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.
     */
    public static void task3_5UP() {
        System.out.println("Задача 3_5");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2)
                    System.out.println(arr[i] + " + " + arr[j] + " = -2");
            }
        }
        System.out.println();
    }

}