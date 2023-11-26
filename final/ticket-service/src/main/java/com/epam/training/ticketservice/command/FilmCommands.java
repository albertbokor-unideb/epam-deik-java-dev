package com.epam.training.ticketservice.command;

import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@RequiredArgsConstructor
public class FilmCommands {

    @ShellMethod(key = "create film", value = "Format: <title> <genre> <length in minutes>")
    public String createFilm(String title, String category, int length) {
        return "";
    }

    @ShellMethod(key = "update film", value = "Format: <title> <genre> <length in minutes>")
    public String updateFilm(String title, String category, int length) {
        return "";
    }

    @ShellMethod(key = "delete film", value = "Format: <title>")
    public String deleteFilm(String title) {
        return "";
    }

    @ShellMethod(key = "list films", value = "List all films")
    public String listFilms() {
        return "";
    }
}