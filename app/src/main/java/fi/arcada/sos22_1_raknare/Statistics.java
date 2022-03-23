package fi.arcada.sos22_1_raknare;

public class Statistics {

    public static double calcMean(double[] dataset) {
        double sum = 0;
        for (int i =0; i < dataset.length; i++) {
            sum = sum +dataset[i];
        }

        return sum / dataset.length;
    }
}
