package com.epam.training.ticketservice.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.time.LocalDateTime;

@ShellComponent
public class ScreeningCommands {

    @ShellMethod(key = "create screening", value = "Usage: <film title> <room name> <start time>")
    public String createScreening(String film, String room, LocalDateTime start) {
        return "";
    }

    @ShellMethod(key = "delete screening", value = "Usage: <film title> <room name> <start time>")
    public String deleteScreening(String film, String room, LocalDateTime start) {
        return "";
    }

    @ShellMethod(key = "list screenings", value = "List all screenings.")
    public String listScreenings() {
        return "";
    }
}
