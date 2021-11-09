package org.example.kva;


import org.example.kva.music.Music;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {



    //private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private int volume;

    // внедрение зависимости через конструктор
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public MusicPlayer() {
    }

    // внедрение зависимости через сеттер
//    public void setMusic(Music music) {
//        this.music = music;
//    }

   public void playMusicList(){
      // for (int i = 0; i < musicList.size(); i++) {
           System.out.println("Playing: " + musicList.toString());
      // }


   }
}
