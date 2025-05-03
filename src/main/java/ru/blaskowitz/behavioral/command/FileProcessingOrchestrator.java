package ru.blaskowitz.behavioral.command;

import ru.blaskowitz.behavioral.command.impl.CompressFileCommand;
import ru.blaskowitz.behavioral.command.impl.CopyFileCommand;
import ru.blaskowitz.behavioral.command.impl.DeleteTempFileCommand;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileProcessingOrchestrator {
    private final List<Command> executedCommands = new ArrayList<>();

    public void process(Path file, Path backupFile, Path compressedBackupFile) {
        List<Command> processSteps = List.of(new CopyFileCommand(file, backupFile),
                                             new CompressFileCommand(backupFile, compressedBackupFile),
                                             new DeleteTempFileCommand(backupFile));
        for (Command command : processSteps) {
            try {
                command.execute();
                executedCommands.add(command);
            } catch (Exception e) {
                System.out.println("error during " + command.getClass().getSimpleName());
                compensate();
                return;
            }
        }
    }

    public void compensate() {
        System.out.println("trying to compensate");
        executedCommands.forEach(Command::undo);
        System.out.println("finished compensating");
    }
}
