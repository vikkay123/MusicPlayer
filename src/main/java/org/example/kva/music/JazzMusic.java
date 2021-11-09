package org.example.kva.music;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
    @Override
    public String playSong() {
        return "JazzMusic";
    }

    @Override
    public String toString() {
        return "JazzMusic";
    }
}
