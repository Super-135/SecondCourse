package com.Super135.Lesson2;

public class ArrayUtils {

    public long arraySum(Object [][] array) throws ArraySizeException {

         long sum = 0;

        if (array[0].length > 4 || array.length >4) {
            throw new ArraySizeException("Размер массива больше чем 4х4");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[i][j] instanceof Integer)
                  sum += (int) array[i][j];
                else {
                    throw new ArrayDataException("В array["+i+"]["+j+"]не int");
                }
            }
        }
        return sum;
    }
}
