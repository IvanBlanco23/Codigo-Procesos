/**
 * Program Assignment: PSP 0.1 - Program 2A
 * Author: Iván G. B.
 * Date: 2025-11-06
 * Description: Handles output of results to files.
 */


import java.io.*;

public class OutPut {
    public void writeData(String outFile, String outText) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
            bw.write(outText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
