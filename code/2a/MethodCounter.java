/**
 * Program Assignment: PSP 0.1 - Program 2A
 * Author: Iván G. B.
 * Date: 2025-11-06
 * Description: Java class part of PSP 0.1 Program 2A.
 */

/******************************************************************/
/* Program Assignment:  Program 2 - PSP 0.1                       */
/* Name:  Cristian Ivan Garcia Blanco                             */
/* Date:  6/Nov/2025                                              */
/* Description: Counts method declarations in Java source.        */
/******************************************************************/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodCounter {

    public int count(String content) {
        String regex = "(public|private|protected)?\\s+[\\w<>\\[\\]]+\\s+\\w+\\s*\\([^)]*\\)\\s*\\{";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);

        int count = 0;
        while (matcher.find()) count++;
        return count;
    }
}
