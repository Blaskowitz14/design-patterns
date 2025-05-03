package ru.blaskowitz.behavioral.command.util;

import lombok.SneakyThrows;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.zip.GZIPOutputStream;

public class FileUtils {

    @SneakyThrows
    public static void copy(Path source, Path target) {
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }

    @SneakyThrows
    public static void compressGzip(Path source, Path target) {
        try (InputStream inputStream = Files.newInputStream(source);
        OutputStream outputStream = new GZIPOutputStream(Files.newOutputStream(target))) {
            byte[] buffer = new byte[8192];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }
    }

    @SneakyThrows
    public static void delete(Path path) {
        Files.deleteIfExists(path);
    }
}
