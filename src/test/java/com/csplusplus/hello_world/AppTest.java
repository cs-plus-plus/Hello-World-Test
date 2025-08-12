package com.csplusplus.hello_world;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testMainPrintsHelloWorld() {
        // Capture System.out
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        try {
            // Run main method
            App.main(new String[]{});
        } finally {
            // Always restore System.out
            System.setOut(originalOut);
        }

        // Verify output
        String output = outputStream.toString().trim();
        assertEquals("Hello World!", output);
    }
}
