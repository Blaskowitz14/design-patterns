package ru.blaskowitz.behavioral.command.impl;

import lombok.RequiredArgsConstructor;
import ru.blaskowitz.behavioral.command.Command;
import ru.blaskowitz.behavioral.command.util.FileUtils;

import java.io.IOException;
import java.nio.file.Path;

@RequiredArgsConstructor
public class CompressFileCommand implements Command {
    private final Path source;
    private final Path target;
    private boolean executed;

    @Override
    public void execute() {
        FileUtils.compressGzip(source, target);
        executed = true;
        System.out.println("compressed to " + target);
    }

    @Override
    public void undo() {
        if(!executed) {
            return;
        }
        try {
            FileUtils.delete(target);
            System.out.println("undo compressing to " + target);
        }
        catch (Exception e) {
            System.out.println("failed to undo compressing " + target);
        }
    }
}
