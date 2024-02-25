package ru.anna.musicPlayer;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("someClassicalMusic")
public class ClassicalMusic implements Music{
    public String getSong() {
        return "Венгерская рапсодия";
    }
    @PostConstruct
    public void doMyInit () {
        System.out.println("do my init");
    }
    @PreDestroy
    public void doMyDestroy () {
        System.out.println("do my destroy");
    }
}
