package ru.blaskowitz.behavioral.command.impl;

import lombok.RequiredArgsConstructor;
import ru.blaskowitz.behavioral.command.Command;
import ru.blaskowitz.behavioral.command.util.FileUtils;

import java.nio.file.Path;

@RequiredArgsConstructor
public class DeleteTempFileCommand implements Command {
    private final Path target;
    private boolean executed;


    @Override
    public void execute() {
        FileUtils.delete(target);
        executed = true;
        System.out.println("deleted " + target);
    }

    @Override
    public void undo() {
        System.out.println("can't undo deleting temp file " + target);
    }
}
