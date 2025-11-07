/**
 * Program Assignment: PSP 0.1 - Program 2A
 * Author: Iván G. B.
 * Date: 2025-11-06
 * Description: Calculates mean and standard deviation.
 */

import java.io.*;
import java.util.*;

public class Media {

    public Media() {
    }

    public double getMedia(double[] dataList, int n) {
        if (n == 0) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += dataList[i];
        }

        return sum / n;
    }
}
