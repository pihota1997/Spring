package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer1 = context.getBean("musicPlayerByConstructor", MusicPlayer.class);
        musicPlayer1.playMusic();

        MusicPlayer musicPlayer2 = context.getBean("musicPlayerBySetter", MusicPlayer.class);
        musicPlayer2.playMusic();
        System.out.println(musicPlayer2.getName());
        System.out.println(musicPlayer2.getVolume());

        MusicPlayer musicPlayer3 = context.getBean("musicPlayerByFile", MusicPlayer.class);
        musicPlayer3.playMusic();
        System.out.println(musicPlayer3.getName());
        System.out.println(musicPlayer3.getVolume());
        context.close();
    }
}
