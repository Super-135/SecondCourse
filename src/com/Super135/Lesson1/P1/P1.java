package com.Super135.Lesson1.P1;

public class P1 {
    public static class Cat implements Runnable, Jumpable {
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

    public static class Human implements Runnable, Jumpable {


        private String name;
        private int run;
        private double jump;
        private static final int rangeRun = 500; //Все кошки могут пробежать +- 200 метров (800-1200 метров)
        private static final int rangeJump = 5;  //Все кошки могут прагнуть +- 1 метр (20 - 24 метров)

        public Human(String name) {
            this.name = name;
            this.run = 800 +  (int) (Math.random() * (rangeRun+1));
            this.jump = 20 + (Math.random()* (rangeJump));
        }
        @Override
        public void runAction(int length){
            if (this.run >= length){
                System.out.println(this.name +"пробежал беговую дорожку длинной "+ length);
                this.jump -= length;
            } else {
                System.out.println(this.name + " не пробежал");
            }
        }

        @Override
        public void jumpAction(double height){
            if (this.jump >= height){
                System.out.println(this.name +"перепрыгнул через стену высотой"+ height);
                this.run -= height;
            } else {
                System.out.println(this.name + " не перепрыгнул");
            }
        }



    }

    public static interface Jumpable {
        void jumpAction(double height);
    }

    public static class Robot implements Runnable, Jumpable {

        private String name;
        private int run;
        private double jump;
        private static final int rangeRun = 500; //Все кошки могут пробежать +- 200 метров (800-1200 метров)
        private static final int rangeJump = 1;  //Все кошки могут прагнуть +- 1 метр (20 - 24 метров)

        public Robot(String name) {
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

    public static interface Runnable {
        void runAction(int length);
    }

    public static class TestLesson1 {

        public static void main(String[] args) {

            // Это команда 1- Кот, 2- Человек, 3 робот
            int team[] = {1,2,3,2,3,1};
            // Это препятствие 1- беговая дорожка. 2- стена
            int barrier[] = {1,1,2,1,1,2};

            for (int i = 0; i < team.length ; i++) {
                for (int j = 0; j < barrier.length ; j++) {
                    if (team[i] == 1) {
                        Cat cat = new Cat("Котик № "+i+1);
                        if(barrier[j] == 1){
                            Treadmill treadmill = new Treadmill();
                            treadmill.take(cat);
                        } else {
                            Wall wall = new Wall();
                            wall.take(cat);
                        }
                    }
                    if (team[i] == 2) {
                        Human human = new Human("Человек № "+i+1);
                        if(barrier[j] == 1){
                            Treadmill treadmill = new Treadmill();
                            treadmill.take(human);
                        } else {
                            Wall wall = new Wall();
                            wall.take(human);
                        }
                    }
                    if (team[i] == 3) {
                        Robot cat = new Robot("Робот № "+i+1);
                        if(barrier[j] == 1){
                            Treadmill treadmill = new Treadmill();
                            treadmill.take(cat);
                        } else {
                            Wall wall = new Wall();
                            wall.take(cat);
                        }
                    }

                }

            }
            Treadmill treadmill = new Treadmill();





        }
    }

    public static class Treadmill {

        private int length;
        private String name;
        private int id;
        private static int count;
        private static final int rangeRun = 100; //Все беговые дорожки +- 100 метров (100-300 метров)

        public Treadmill() {
            this.name = "Бегов.Дорожка №" + id;
            this.length = (int) (Math.random() * (rangeRun+1));
        }

        public void take(Runnable runnable) {
            runnable.runAction(this.length);
        }

    }

    public static class Wall  {

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
}
