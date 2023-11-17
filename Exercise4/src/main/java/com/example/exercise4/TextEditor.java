package com.example.exercise4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component(value = "textEditor")
public class TextEditor {
    public String message;

    @Autowired
    @Qualifier(value = "pdfTextWriter")
    public TextWriter writer;

    public TextEditor(){}

    public void input(String message) {
        this.message = message;
    }

    public void save(String pathFile) throws IOException {
        writer.write(pathFile, message);
    }
}
