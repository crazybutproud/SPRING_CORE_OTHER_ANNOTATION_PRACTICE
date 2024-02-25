package ru.anna.musicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        ); //запуск файла

        MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        classPathXmlApplicationContext.close();
    }
}
