package org.mospower;

//ЗАДАНИЕ 1 МЕДИАНА
/* Задан произвольный массив (тип int) размера m.
Необходимо отсортировать его по возрастанию с помощью пузырьковой сортировки, вывести отсортированный массив в консоль.
После чего определить медиану полученного массива и вывести её в консоль.
Примечание: медианой ряда чисел (медианой числового ряда) называется число,
стоящее посередине упорядоченного по возрастанию ряда чисел — в случае,
если количество чисел нечётное. Если же количество чисел в ряду чётно,
 то медианой ряда является полусумма двух стоящих посередине чисел упорядоченного по возрастанию ряда.
 */

public class HW21 {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]){
                    int swap = array[j];
                    array[j] = array [j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }

    public static void mediana(int[] array) {
        // even - четное, uneven - нечетное
        if (array.length % 2 == 0){
            int i = (array.length / 2)-1;
            int j = (array.length / 2);
            //sred - cреднее значение двух чисел, если even
            double sred = (array[i] + array[j])/2.0;
            System.out.print("\n" + sred);
        }else if (array.length == 0){
            System.out.println("Массив пуст, наполните его!");
        }else{
            int i = (array.length / 2);
            System.out.print("\n" + array[i]);
        }
    }

    public static void main(String args[]) {
        //int[] array = {12,6,4,10,5};
        int[] array = {12,6,4,10,1,5};
        bubbleSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " "+ "");
        }
        mediana(array);

    }
}
