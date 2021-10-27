package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfigure.class
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName()+" "+ musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);

        context.close();
    }
}
