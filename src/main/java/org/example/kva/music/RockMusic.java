package org.example.kva.music;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String playSong() {
        return "RockMusic";
    }

    @Override
    public String toString() {
        return "RockMusic";
    }
}
