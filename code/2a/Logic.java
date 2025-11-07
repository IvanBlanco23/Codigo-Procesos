/**
 * Program Assignment: PSP 0.1 - Program 2A
 * Author: Iván G. B.
 * Date: 2025-11-06
 * Description: Implements main computation logic for PSP program.
 */


public class Logic {
    private int n = 0;
    private String data;
    private String[] arrData;
    private double media;
    private double desv;

    public void logical() {
        Input input = new Input();
        data = input.readData("in1.txt");

        Data dataObj = new Data();
        arrData = dataObj.saveData(data);
        n = arrData != null ? arrData.length : 0;

        if (n == 0) {
            System.err.println("\n[ERROR DE DATOS] No se pudo leer o procesar datos válidos desde el archivo de entrada (in2.txt).");
            System.err.println("Asegúrate de que 'in2.txt' existe y contiene números separados por espacios o saltos de línea.");
            return;
        }

        double[] numArr = new double[n];
        try {
            for (int i = 0; i < n; i++) {
                numArr[i] = Double.parseDouble(arrData[i]);
            }
        } catch (NumberFormatException e) {
            System.err.println("\n[ERROR DE FORMATO] Uno o más datos leídos en el archivo no son números válidos.");
            System.err.println("Por favor, revisa el contenido de 'in2.txt'.");
            return;
        }


        // Media
        Media m = new Media();
        media = m.getMedia(numArr, n);

        // Desviación
        DesvEst d = new DesvEst();
        desv = d.getDesvEst(media, numArr, n);

        String result = "Media: " + media + "\nDesviación Estándar: " + desv;
        OutPut out = new OutPut();
        out.writeData("out2.txt", result);

        System.out.println(result);
    }
}
