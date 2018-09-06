package ru.job4j.array;

/**
 * @author Alexey Zhukov (mailto:hadzage@gmail.com)
 * @version $02$
 * @since 04.09.2018
 */


public class ThirdArray {
/*    public static void main(String[] args) {
        int[] arOne = new int[]{1, 3, 5};
        int[] arTwo = new int[]{2, 4};
        int[] arThree = new int[5];
        int[] longAr;

        if (arOne.length > arTwo.length) {
            longAr = arOne;
        } else {
            longAr = arTwo;
        }

        for (int num: arThree) {
            if (arOne[num] > arTwo[num] && num <= arOne.length && num <= arTwo.length) {
                arThree[num] = arTwo[num];
            } else {
                arThree[num] = arOne[num];

            if (num )
        }


    }
}*/


    public static void main(String[] args) {
        int[] arOne = new int[]{1, 3, 5};
        int[] arTwo = new int[]{2, 4};
        int[] arThree = new int[5];
        int[] longAr;
        int min = Math.min(arOne.length, arTwo.length);
        int max = Math.max(arOne.length, arTwo.length);

        // Определяем самый длинный массив.
        if (arOne.length > arTwo.length) {
            longAr = arOne;
        } else {
            longAr = arTwo;
        }
        //Заполняем третий массив.
        for (int index = 0; index != min - 1; index++) {
            if (arOne[index] > arTwo[index]) {
                arThree[index] = arTwo[index];
                arThree[index + 1] = arOne[index];
            } else {
                arThree[index] = arOne[index];
                arThree[index + 1] = arTwo[index];
            }
        }

        for (int yandex = arThree.length - min; yandex != arThree.length - 1; yandex++) {
            arThree[yandex] = longAr[yandex - 2];
        }

        for (int num : arThree) {
            System.out.println(num);
        }
    }
}



