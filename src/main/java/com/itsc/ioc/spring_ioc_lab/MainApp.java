package com.itsc.ioc.spring_ioc_lab;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.itsc.ioc.spring_ioc_lab.interfaces.MusicPlayerInterface;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansConfig.xml");
        MusicPlayerInterface cdPlayer = context.getBean("cdPlayer", MusicPlayerInterface.class);
        cdPlayer.play();
        cdPlayer.stop();

        MusicPlayerInterface mp3Player = context.getBean("mp3Player", MusicPlayerInterface.class);
        mp3Player.play();
        mp3Player.stop();
    }
}