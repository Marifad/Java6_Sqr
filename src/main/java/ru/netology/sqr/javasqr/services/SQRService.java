package ru.netology.sqr.javasqr.services;

public class SQRService {
    public int calcSqr(int a, int b) {
        int q = 0;
        for (int i = 10; i <= 99; i++) {
            if (a <= i * i && i * i <= b) {
                q = q + 1;
            }
            q = q + 0;
        }
        return q;
    }
}
