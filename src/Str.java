import java.util.Arrays;

public class Str {
    public static void main(String[] args) {
        task1_1();
        task1_2();
        task1_3();
        task2_1UP();
        task2_2UP();
        task2_3UP();
        task2_4UP();
    }

    /*
Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном формате.
Бухгалтерия попросила написать программу, в которой можно работать с Ф. И. О. сотрудников.
Напишите четыре строки:
С именем firstName — для хранения имени.
С именем middleName — для хранения отчества.
С именем lastName — для хранения фамилии.
С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
Выведите в консоль фразу: «ФИО сотрудника — …».
В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".
     */
    public static void task1_1() {
        System.out.println("Задача 1_1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
    }

    /*
    Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников, полностью написанные заглавными
    буквами (верхним регистром).
    Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich" на полностью заглавные буквы.
    В качестве строки с исходными данными используйте строку fullName.
    Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"
         */
    public static void task1_2() {
        System.out.println("Задача 1_2");
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println();
    }

    /*
    Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая заменяет символ «ё» на символ «е».
    В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".
    Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».
         */
    public static void task1_3() {
        System.out.println("Задача 1_3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);
        System.out.println();
    }

    /*
К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф. И. О.
на три — на фамилию, имя и отчество.
В качестве исходных данных используйте:
Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
переменная firstName — для хранения имени;
переменная middleName — для хранения отчества;
переменная lastName — для хранения фамилии.
Решите задание с помощью метода substring().
Результат программы выведите в формате:
“Имя сотрудника — …”
“Фамилия сотрудника — …”
“Отчество сотрудника — ...”
     */
    public static void task2_1UP() {
        System.out.println("Задача 2_1 повышенная сложность");
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName, middleName, lastName;

        lastName = fullName.substring(0, fullName.indexOf(" "));
        firstName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        middleName = fullName.substring(fullName.lastIndexOf(" ") + 1);

        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
        System.out.println();
    }

    /*
 Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
 Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О.
  в правильный формат.
 В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“,
 которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
 Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв —  …”
      */
    public static void task2_2UP() {
        System.out.println("Задача 2_2 повышенная сложность");
        String fullName = "ivanov ivan ivanovich";
        char[] nameChar = fullName.toCharArray();
        nameChar[0] = Character.toUpperCase(nameChar[0]);
        for (int i = 0; i < nameChar.length; i++) {
            if (Character.isWhitespace(nameChar[i])) { //nameChar[i] == ' ') {
                nameChar[i + 1] = Character.toUpperCase(nameChar[i + 1]);
            }
        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullName);
        System.out.println();
    }

    /*
 Имеется две строки.
 Первая: "135"
 Вторая: "246"
 Соберите из двух строк одну, содержащую данные "123456".
 Использовать сортировку нельзя.
 Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
 Выведите результат в консоль в формате: “Данные строки — ….”
      */
    public static void task2_3UP() {
        System.out.println("Задача 2_3 повышенная сложность");
        String str1 = "135";
        String str2 = "2467";
        StringBuilder strBuilder = new StringBuilder(str1);

        for (int i = 0, j = 1; i < str2.length(); i++) {
            strBuilder.insert(i + j, str2.charAt(i));
            if (strBuilder.length() > i + j) {
                j++;
            }
        }
        System.out.println("Данные строки — " + strBuilder);
        System.out.println();
    }

    /*
 Дана строка из букв английского алфавита "aabccddefgghiijjkk".
 Нужно найти и напечатать буквы, которые дублируются в строке.
 Обратите внимание, что строка отсортирована, т.е. дубли идут друг за другом.
 В итоге в консоль должен быть выведен результат программы: "acdgijk".
      */
    public static void task2_4UP() {
        System.out.println("Задача 2_4 повышенная сложность");
        String str = "abaasshsashzajsfsaaghddhhdfab";
        StringBuilder strBuilder = new StringBuilder(str);

        char val;
        for (int i = 0; i < strBuilder.length(); i++) {
            val = strBuilder.charAt(i);
            for (int j = i + 1; j < strBuilder.length(); ) {
                if (val == strBuilder.charAt(j))
                    strBuilder.delete(j, j + 1);
                else {
                    j++;
                }
            }
        }
//        int i = 0;
//        while (i < strBuilder.length() - 1) {
//            if (strBuilder.charAt(i) == strBuilder.charAt(i + 1)) {
//                strBuilder.delete(i, i + 1);
//            } else {
//                i++;
//            }
//        }
        System.out.println(strBuilder);
        System.out.println();
    }

}
