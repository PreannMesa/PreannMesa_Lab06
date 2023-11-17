package com.example.exercise4;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Component(value = "plainTextWriter")
public class PlainTextWriter implements TextWriter{

    @Override
    public void write(String pathFile, String message) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(pathFile));
        printWriter.print(message);
        printWriter.close();
    }
}
