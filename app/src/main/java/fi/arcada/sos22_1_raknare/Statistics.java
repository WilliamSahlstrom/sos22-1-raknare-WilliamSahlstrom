package fi.arcada.sos22_1_raknare;

import java.util.ArrayList;
import java.util.Collections;

public class Statistics {

    //Sorteringsmetod
    public static ArrayList<Double> getSorted(ArrayList<Double> dataset) {
        ArrayList<Double> sorted = new ArrayList<>(dataset);
        Collections.sort(sorted);
        return sorted;
    }

    public static double calcMean(ArrayList<Double> dataset) {
        double sum = 0;
        for (int i =0; i < dataset.size(); i++) {
            sum = sum +dataset.get(i);
        }

        return sum / dataset.size();
    }
    //Median
    public static double calcMedian(ArrayList<Double> dataset) {
        ArrayList<Double> sorted = getSorted(dataset);
        int mid = sorted.size() / 2;
        double median;
        if (sorted.size() % 2 == 0) {
            median = sorted.get(mid-1) + sorted.get(mid) / 2;
        } else {
            median = sorted.get(mid);
        }
        return median;
    }
    //Standardavvikelse
    public static double calcSD(ArrayList<Double> dataset) {
        double sumDiff = 0;
        double avg = calcMean(dataset);

        //Loopa igenom dataset
        for (double dataVal: dataset) {
           //Summan av de enskilda skillnaderna i kvadrat
           sumDiff +=Math.pow(dataVal-avg,2);
        }
        return Math.sqrt(sumDiff / dataset.size());
    }
}
