/**
 * Program Assignment: PSP 0.1 - Program 2A
 * Author: Iván G. B.
 * Date: 2025-11-06
 * Description: Main entry point for PSP analyzer.
 */

/******************************************************************/
/* Program Assignment:  Program 2 - PSP 0.1                       */
/* Name:  Cristian Ivan Garcia Blanco                             */
/* Date:  6/Nov/2025                                              */
/* Description: Counts LOC & Methods for all .java files.         */
/******************************************************************/

public class AppPSP {
    public static void main(String[] args) {
        // Si no se pasa un argumento, usa App.java por defecto
        String fileName = (args.length > 0) ? args[0] : "App.java";

        Logic2 logic = new Logic2(fileName);
        logic.run();
    }
}
