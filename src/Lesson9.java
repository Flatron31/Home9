import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Lesson9 {

    public static void main(String[] args) {
//        print1("I like Java!!!");
//        print2("I like Java!!!");
//        print3("I like Java!!!");
//        print4("I like Java!!!");
//        print5("I like Java!!!");
//        print6("I like Java!!!");
//        print7("I like Java!!!");
//        print8("I like Java!!!");
//        print9("I like Java!!!");
//        print10("I like Java!!!");
//        print11("I like Java!!!");
//        print12("то новое значение переменной min будет равно значению этого элемента");
//        print13("то новое значение переменной min будет равно значению этого элемента");
//        print14();
//        print15();
        print16("JavaJ");
    }

    public static void print1(String a) {
        System.out.println(a);
    }

    public static void print2(String a) {
        System.out.println(a.charAt(a.length() - 1));
    }

    public static void print3(String a) {
        System.out.println(a.endsWith("!!!"));
    }

    public static void print4(String a) {
        System.out.println(a.startsWith("I like"));
    }

    public static void print5(String a) {
        System.out.println(a.contains("Java"));
    }

    public static void print6(String a) {
        System.out.println(a.indexOf("Java"));
    }

    public static void print7(String a) {
        System.out.println(a.replace("a", "o"));
    }

    public static void print8(String a) {
        System.out.println(a.toUpperCase());
    }

    public static void print9(String a) {
        System.out.println(a.toLowerCase());
    }

    public static void print10(String a) {
        System.out.println(a.substring(a.indexOf("Java"), a.indexOf("Java") + "Java".length()));
    }

    //    Написать метод, который находит и выводит все слова, длина которых от 3 до 5 включительно.
    public static void print11(String a) {
        String[] b = a.split(" ");
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i].length() >= 3 && b[i].length() <= 5) {
                System.out.println(b[i]);
            }
        }
    }

    //    Написать метод, который возвращает самое маленькое слово в тексте.
    public static void print12(String a) {
        String[] b = a.split(" ");
        int min = b[0].length();
        for (int i = 0; i < b.length - 1; i++) {
            if (min > b[i].length()) {
                min = b[i].length();
            }
        }
        for (int i = 0; i < b.length - 1; i++) {
            if (min == b[i].length()) {
                System.out.println(b[i]);
                break;
            }
        }
    }

    //    Написать метод, который возвращает самое большое слово в тексте.
    public static void print13(String a) {
        String[] array = a.split(" ");
        int max = array[0].length();
        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i].length()) {
                max = array[i].length();
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (max == array[i].length()) {
                System.out.println(array[i]);
                break;
            }
        }
    }

    //        Используя StringBuilder сделайте выражения 3 + 56 = 59
//        3 – 56 = -53
//        3 * 56 = 168.
    public static void print14() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("3");
        stringBuilder.append(" +");
        stringBuilder.append(" 56");
        stringBuilder.append(" =");
        stringBuilder.append(" 59");
        System.out.println(stringBuilder);
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder1.append("3").append(" -").append(" 56").append(" =").append(" -").append("53");
        stringBuilder2.append("3").append(" * ").append("56").append(" = ").append("168");
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
        // памятка-прописывать можно как хочешь но не забывать учитывать пробелы
    }

//        Ввести 2 слова, состоящие из четного числа букв. Получить слово состоящее из первой половины первого
//        слова и второй половины второго слова.
    public static void print15() {
        String q = "java";
        String w = "like";
        System.out.println(q.substring(0, q.length() / 2) + w.substring(w.length() / 2, w.length()));
    }

    //    Написать метод, который находит и выводит все слова палиндромы в тексте.
    public static void print16(String a) {

        String[] b = a.split(" ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length(); j++) {
                if (b[i].charAt(j) == b[i].charAt(b[i].length() - 1 - j)) {
                    System.out.print(b[i].charAt(j));
                } else {
                }
            }
            System.out.print(" ");
        }
    }
}





