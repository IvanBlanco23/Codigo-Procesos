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
/* Description: Counts logical LOC excluding blanks/comments.     */
/******************************************************************/
public class LineCounter {

    public int count(String content) {
        boolean inBlockComment = false;
        int count = 0;

        for (String line : content.split("\\R")) {
            String trimmed = line.trim();
            if (trimmed.isEmpty()) continue;

            if (inBlockComment) {
                if (trimmed.contains("*/")) inBlockComment = false;
                continue;
            }

            if (trimmed.startsWith("/*")) {
                if (!trimmed.contains("*/")) inBlockComment = true;
                continue;
            }

            if (trimmed.startsWith("//")) continue;
            count++;
        }
        return count;
    }
}
