package Homework.homework1;
import java.util.Arrays;
public class Homework1 {
    public static void main(String[] args) {

//Базовый уровень

    //Задача №1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        String phrase = hi.trim() + world.toLowerCase() + newLine;
        System.out.print(phrase.repeat(3));

    //Задача №2
        float height = 1.8f;
        int weight = 65;
        float index = weight / (height * height);
        System.out.printf("%.1f \n", index);

    //Задача №3
        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(Arrays.toString (letters));
        letters[3] = 'h';
        System.out.println(Arrays.toString (letters));

    // Задача №4
        int count = 1;
        while (count <= 100) {
            System.out.print(count + "a ");
            count++;
        }
        System.out.print(newLine);
//        for (int z = 1; z <= 100 ; z++) { //другой вариант
//            System.out.print(z + "a ");
//        }
//        System.out.print(newLine);

    // Задание №5
        int ageChildren = 10;

        if (ageChildren < 6) {
        System.out.println("пошел в сад");
        }
        else if (ageChildren < 11) {
        System.out.println("пошел в младшую школу");
        }
        else if (ageChildren < 17) {
        System.out.println("пошел в среднюю школу");
        }
        else {
            System.out.println("пошел в университет");
        }


//Продвинутый уровень

    //Задача №1
        String num = "234";
        String text = "some_text";

        int num2 = Integer.valueOf(num);
        int res = num2 + text.length();
        System.out.println(res);

    //Задача №2
        int a = 3;
        int b = 5;

        System.out.printf("%.0f \n", Math.pow(a + b, 2));

    //Задача №3
        int[] arr1 = {1, 2 ,5 ,7 ,10};
        int[] arr2 = {2, 3, 2, 17, 15};

        int[] arr3 = new int [arr1.length]; //создаем массив 3 с произведением чисел первых двух массивов
        for (int j = 0; j < arr1.length; j++) {
            arr3[j] = arr1[j] * arr2[j];
            }
        int[] arr4 = new int [arr1.length + arr2.length + arr3.length]; //создаем массив 4, куда вносим данные из трех массивов
        int count1 = 0;
        for (int a1 = 0; a1 < arr1.length; a1++) { //добавляем данные из массива 1
            arr4[a1] = arr1[a1];
            count1++;
        }
        int count2 = arr1.length;
        for (int a2 = 0; a2 < arr2.length; a2++) { //добавляем данные из массива 2
            arr4[count1++] = arr2[a2];
            count2++;
        }
        for (int a3 = 0; a3 < arr3.length; a3++) { //добавляем данные из массива 3
            arr4[count2++] = arr3[a3];
        }
        System.out.println(Arrays.toString(arr4)); //выводим на экран массив 4 в виде строки

//другой вариант вывода на экран
//        for (int a1 = 0; a1 < arr4.length; a1++) {
//            System.out.print(arr4[a1] + ","); //выводим на экран массив 4 в виде перечисления компонентов через запятую
//        }
//        System.out.print(newLine); //добавляем перенос строки

    //Задача №4
        String hello = "Hello world!";
        int symbols = 8;
        String newhello = String.format("%."+ symbols +"s", hello.replaceAll("l", "r"));
        System.out.println(newhello.toUpperCase());

    // Задача №5:
        double increment = 0.01123;
        double result = 0;

        double max = 1_000_000;
        int count3 = 0;
        if (increment >= 0) {
            for (double r = result; r <= max; r += increment) {
            //по условию задачи остановка итераций когда сумма становится больше max.
            //если надо не больше max, то for (double r = result; r <= max - increment; r += increment) {
                count3++;
            }
            System.out.println(count3);
        }

    // Задание №6
        boolean chicken = true;
        boolean vegetables = false;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;

        boolean caesar = chicken && vegetables && sour && toast;
        boolean olivier = vegetables && (sausage || chicken) && eggs;
        boolean veggies = vegetables;

        if (caesar) {
            System.out.println("Приготовлен салат Цезарь");
        }
        else if (olivier) {
            System.out.println("Приготовлен салат Оливье");
        }
        else if (veggies) {
            System.out.println("Приготовлен овощной салат");
        }
        else {
            System.out.println("У меня ничего нет");
        }

//Экспертный уровень

    //Задача №1

        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
    }
}