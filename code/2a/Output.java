/**
 * Program Assignment: PSP 0.1 - Program 2A
 * Author: Iván G. B.
 * Date: 2025-11-06
 * Description: Handles output of results to files.
 */

/******************************************************************/
/* Program Assignment:  Program 2 - PSP 0.1                       */
/* Name:  Cristian Ivan Garcia Blanco                             */
/* Date:  6/Nov/2025                                              */
/* Description: Writes text output to file.                       */
/******************************************************************/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Output {

    public void write(String fileName, String text) {
        try {
            Files.writeString(Path.of(fileName), text);
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
