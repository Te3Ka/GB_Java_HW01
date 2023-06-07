/********************************/
/**Илья "Te3K@_PaynE" Новичихин**/
/*****79811131773@yandex.ru******/
/********************************/

import java.util.Random;

/*
1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i.
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа.
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE и сохранить в массив m1.
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2.
*/

public class HomeWork01 {

    // Метод вызова автора
    public static void author() {
        System.out.println("================================");
        System.out.println("=======Author programm: ========");
        System.out.println("=Ilya \"Te3K@_PaynE\" Novichikhin=");
        System.out.println("=====79811131773@yandex.ru======");
        System.out.println("================================");
    }

    public static void main(String[] args) {
        System.out.println("1. Toss a random integer in the range 0 to 2000 and store it in i.\n" +
                "2. Count and store in n the number of the highest significant bit of the dropped number.\n" +
                "3. Find all multiples of n in the range from i to Short.MAX_VALUE and store in array m1.\n" +
                "4. Find all non-multiples of n in the range from Short.MIN_VALUE to i and store in m2.");

        // 1 задание
        Random random = new Random();
        int i = random.nextInt(0, 2000);
        System.out.println("1. Random number i = " + i);
        System.out.println();

        // 2 задание
        int n = Integer.toBinaryString(i).length() - 1;
        System.out.println("2. The number of the most significant bit n = " + n);
        System.out.println();

        // 3 задание
        int numbers = 0;
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0)
                numbers++;
        }
        int[] m1 = new int[numbers];
        numbers = 0;
        System.out.print("3. m1 = [");
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                if (numbers == m1.length) {
                    m1[numbers] = j;
                    System.out.print(m1[numbers]);
                    numbers++;
                } else {
                    m1[numbers] = j;
                    System.out.print(m1[numbers] + ", ");
                    numbers++;
                }

            }
        }
        System.out.println("]");
        System.out.println("Total numbers in the array m1 = " + m1.length);
        System.out.println();
        // 4 задание
        numbers = 0;
        for (int j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0)
                numbers++;
        }
        int[] m2 = new int[numbers];
        numbers = 0;
        System.out.print("4. m2 = [");
        for (int j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0) {
                if (numbers == m2.length) {
                    m2[numbers] = j;
                    System.out.print(m2[numbers]);
                } else {
                    m2[numbers] = j;
                    System.out.print(m2[numbers] + ", ");
                    numbers++;
                }
            }
        }
        System.out.println("]");
        System.out.println("Total numbers in the array m2 = " + m2.length);
        System.out.println();

        author();
    }
}