package ru.anna.musicPlayer;

import org.springframework.stereotype.Component;

@Component("someRockMusic")
public class RockMusic implements Music{
    public String getSong() {
        return "Симфония разрушения";
    }

}
