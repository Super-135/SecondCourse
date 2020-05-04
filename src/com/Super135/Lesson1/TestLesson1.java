package com.Super135.Lesson1;

import java.util.ArrayList;
import java.util.List;

public class TestLesson1 {

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
