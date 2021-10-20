package hu.petrik.bolygoprojekt;

import hu.petrik.bolygoprojekt.bolygo.Bolygo;

public class Main {

    public static void main(String[] args) {
        double sajatSulyFoldon = 110;
        Bolygo fold = Bolygo.FOLD;
        double sajatTomeg = sajatSulyFoldon / fold.getGravitacio();

        for (Bolygo bolygo : Bolygo.values()) {
            System.out.printf("%s (%f): %f\n", bolygo, bolygo.getGravitacio(), bolygo.getSuly(sajatTomeg));
        }
    }
}
