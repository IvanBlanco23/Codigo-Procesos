/**
 * Program Assignment: PSP 0.1 - Program 2A
 * Author: Iván G. B.
 * Date: 2025-11-06
 * Description: Controls PSP analyzer for counting LOC and methods.
 */

/******************************************************************/
/* Program Assignment:  Program 2 - PSP 0.1                       */
/* Name:  Cristian Ivan Garcia Blanco                             */
/* Date:  6/Noviembre/2025                                        */
/* Description: Controls counting process and report generation.  */
/******************************************************************/


public class Logic2 {

    private final String inputFile;

    public Logic2(String fileName) {
        this.inputFile = fileName;
    }

    public void run() {
        Input input = new Input();
        String content = input.readData(inputFile); // Usa tu versión de Input.java

        LineCounter lineCounter = new LineCounter();
        int totalLines = lineCounter.count(content);

        MethodCounter methodCounter = new MethodCounter();
        int totalMethods = methodCounter.count(content);

        String result = String.format(
            "Archivo: %s%n---------------------------------------%nLíneas Lógicas (LOC): %d%nMétodos Encontrados: %d%n",
            inputFile, totalLines, totalMethods
        );

        // Mostrar en consola
        System.out.println(result);

        // Guardar resultados
        Output output = new Output();
        output.write("output.txt", result);
    }
}
