package ru.netology.sqr;

public class SQRService {
    public int counting(int lowerLimit, int upperLimit) {
        int numberCount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i*i >= lowerLimit && i*i <= upperLimit) {
                numberCount = numberCount + 1;
            }
        }
        return numberCount;
    }
}
