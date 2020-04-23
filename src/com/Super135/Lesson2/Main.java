package com.Super135.Lesson2;



public class Main {

    public static void main(String[] args) {
        long res = 0;
                ArrayUtils utils = new ArrayUtils();
        Object [][] objects = new Object[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                objects[i][j] = 10;
            }
        }

        try {
            res = utils.arraySum(objects);
        } catch (ArraySizeException e){
            e.printStackTrace();
        } catch (ArrayDataException e){
            e.printStackTrace();
        }
        System.out.println(res);
        System.out.println("Программа завершена корректно");
    }

}
