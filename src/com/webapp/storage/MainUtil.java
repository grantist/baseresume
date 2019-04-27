package com.webapp.storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainUtil {
    public static void main(String[] args) {
        Path path = null;
        try {
            path = Files.createFile(Paths.get("D:\\Java\\test2.txt"));
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}