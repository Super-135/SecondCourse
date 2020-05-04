package com.Super135.Lesson1;

public class Cat implements Runnable, Jumpable {
    private String name;
    private int run;
    private double jump;
    private static final int rangeRun = 400; //Все кошки могут пробежать +- 200 метров (800-1200 метров)
    private static final int rangeJump = 4;  //Все кошки могут прагнуть +- 1 метр (20 - 24 метров)


    public Cat(String name) {
        this.name = name;
        this.run = 800 +  (int) (Math.random() * (rangeRun+1));
        this.jump = 20 + (Math.random()* (rangeJump));
    }
    @Override
    public void runAction(int length){
        if (this.run >= length){
            System.out.println(this.name +"пробежал беговую дорожку длинной "+ length);
            this.run -= length;
        } else {
            System.out.println(this.name + " не пробежал");
        }
    }

    @Override
    public void jumpAction(double height){
        if (this.jump >= height){
            System.out.println(this.name +"перепрыгнул через стену высотой"+ height);
            this.jump -= height;
        } else {
            System.out.println(this.name + " не перепрыгнул");
        }
    }

}
