package org.example.kva;

import org.example.kva.music.Music;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestPlayer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "AppContext.xml");

 //      Music music = context.getBean("musicBean", Music.class);
//       MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
musicPlayer.playMusicList();
        musicPlayer.playMusicList();
      //  System.out.println(musicPlayer.getVolume());

    }
}
