package ru.blaskowitz.behavioral.command;

public interface Command {
    void execute();
    void undo();
}
