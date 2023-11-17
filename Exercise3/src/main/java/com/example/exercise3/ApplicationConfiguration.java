package com.example.exercise3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public TextWriter plainTextWriter() {return new PlainTextWriter();}

    @Bean public TextWriter pdfTextWriter() {return new PdfTextWriter();}

    @Bean
    public TextEditor textEditor() {return new TextEditor();}
}
