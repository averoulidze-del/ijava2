class Cercle extends Program {

    double PI=3.14159;
    double QUATRE_TIERS_DE_PI=4.0/3.0 * PI;

    double circonference(double rayon) {
        return PI * diametre(rayon);
    }

    double diametre(double rayon) {
        return 2 * rayon;
    }

    double aire(double rayon) {
        return PI * rayon * rayon;
    }

    double volume(double rayon) {
        return QUATRE_TIERS_DE_PI * rayon * rayon *rayon;
    }
    int nombreDeMultiplications=0;

    void algorithm() {
        
        for(int i=1;i<=15;i++){
            println("circonference(" + i + ") = " + circonference(i) + ", diametre(" + i + ") = " + diametre(i) + ", volume(" + i + ") = " + volume(i) + ".");
            nombreDeMultiplications=nombreDeMultiplications+6;
        }
        println("Soit un total de " + nombreDeMultiplications + " multiplications.");
    }

}
