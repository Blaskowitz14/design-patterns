package ru.blaskowitz.behavioral.command;

import java.nio.file.Path;

public class CommandUsage {
    public static void main(String[] args) {
        Path source = Path.of("original.txt");
        Path backup = Path.of("backup.txt");
        Path archive = Path.of("backup.txt.gz");

        new FileProcessingOrchestrator().process(source, backup, archive);
    }
}
