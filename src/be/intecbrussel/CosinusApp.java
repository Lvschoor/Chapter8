package be.intecbrussel;


import java.util.Scanner;

import static java.lang.Math.*;

public class CosinusApp {
    public static void main(String[] args) {
        double cosinus;
        for (double i = 0; i <= 2 * PI; i += 0.1) {
            double angle = toDegrees(i);
            cosinus = cos(i);
            System.out.printf("The cosinus of the angle  = %.2f rad (= %6.2f graden) is = %+1.5f \n", i,angle, cosinus);
        }

    }

}
