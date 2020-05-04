package com.Super135.Lesson5;

public class CustomTreads extends Thread{
    private volatile boolean running;
    private float[] arr1;

    public CustomTreads(float[] arr) {
        running = false;
        this.arr1 = arr;
    }

    public boolean isRunning() {
        return running;
    }

    @Override
    public void run() {
//        long b = System.currentTimeMillis();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        running = true;
//        System.out.println(System.currentTimeMillis()-b);
    }
}
