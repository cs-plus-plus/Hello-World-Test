package com.csplusplus.hello_world;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class AppTest {

    @Test
    public void testMainPrintsHelloWorld() {
        // Capture System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Run main method
        App.main(new String[]{});

        // Restore System.out
        System.setOut(originalOut);

        // Verify output
        String output = outputStream.toString().trim();
        assertEquals("Hello World!", output);
    }
}
