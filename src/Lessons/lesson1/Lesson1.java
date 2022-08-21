package Lessons.lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//Пишем код -> компиляция в код для Java Machine (JVM) -> JVM преобразует в байт код

// Примитивные типы данных

    //boolean (да / нет, истина / ложь, 1 / 0
       boolean b1 = true;
       boolean b2 = false;
       System.out.println(b1);

    //целые числа
       //byte (8 бит или 8 значений 1 или 0)
        byte bt1 = -128;
        byte bt2 = 127;
        //short (короткое число - 2 байта)
        short sh1 = -32_768;
        short sh2 = 32_767;
        //integer (целое число (4 байта или 32 бит
        int int1 = -2_100_000_000;
        int int2 = 2_100_000_000;
        //long (длинное целое число (8 байт или 64 бит)
        long lon1 = 1_000_000_000_000_000l;

    //числа с плавающей точкой
        //float (короткое число с плавающей точкой - 32 бит)
        float fl1 = 3.123456789f;
        System.out.println(fl1);
        //double (более длинное число с плавающей точкой - 64 бит)
        double db1 = 3.123456789012345678901234567890;
        System.out.println(db1);

    //действия с числами
        int x = 4;
        int y = 2;
        int c1 = x + y;
        int c2 = x - y;
        int c3 = x * y;
        int c4 = x / y;
        int c5 = x % y;

    //символы
        char ch1 = 'l';
        char ch2 = 123;
        System.out.println(ch2);

     //массив
        char[] ans1 = new char[6];
        ans1[0] = 'A';
        ans1[1] = 'N';
        ans1[2] = 'Y';
        ans1[3] = 'A';
        System.out.println(ans1);

        char[] ans2 = {'a', 'b', 'c', 'd'};
        System.out.println(ans2);

        int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println(Arrays.toString(numbers));

    //текстовый тип данных
        String word1 = "Hello";
        String word2 = " World!";

    //Конкатенация (объединение строк)
        String result = word1 + word2;
        System.out.println(result);
        System.out.println(word1 + word2);

    //операции с текстом
        String stringFromCharArray = String.valueOf(ans2);
        System.out.println(stringFromCharArray + 'e');
        //все прописные буквы
        System.out.println(word1.toUpperCase());
        //все строчные буквы
        System.out.println(word2.toLowerCase());
        //длина строки
        System.out.println(word1.length());
        //заменить часть текста
        String newWord1 = word1.replaceAll("llo", "licopter");
        System.out.println(newWord1);
        //повторение строк
        System.out.println(word1.repeat(10));
        //убрать лишние пробелы в начале и конце строки
        String word3 = "             WOW               ";
        System.out.println(word3.trim());
    }
}