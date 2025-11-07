/**
 * Program Assignment: PSP 0.1 - Program 2A
 * Author: Iván G. B.
 * Date: 2025-11-06
 * Description: Computes standard deviation for data input.
 */

import java.lang.Math;

public class DesvEst {

    public double getDesvEst(double media, double[] dataList, int n) {
        if (n <= 1) {
            return 0.0;
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            double value = dataList[i];
            sum += Math.pow(value - media, 2);
        }

        return Math.sqrt(sum / (n - 1));
    }
}
