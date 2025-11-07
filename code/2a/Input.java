/**
 * Program Assignment: PSP 0.1 - Program 2A
 * Author: Iván G. B.
 * Date: 2025-11-06
 * Description: Reads input data or source files.
 */


import java.io.*;

public class Input {
    private String data;
    private BufferedReader br = null;

    public String readData(String inFile) {
        StringBuilder sb = new StringBuilder();
        try {
            br = new BufferedReader(new FileReader(inFile));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString().trim();
    }
}

