package com.Super135.Lesson1;

public class Wall  {

    private int height;
    private String name;
    private int id;
    private static int count;
    private static final int rangeJump = 10; //Все беговые дорожки +- 100 метров (10-30 метров)

    public Wall() {
        this.name = "Стена №" + id;
        this.height = (int) (Math.random() * (rangeJump+1));
    }

    public void take(Jumpable Jumpable) {
        Jumpable.jumpAction(this.height);
    }


}
