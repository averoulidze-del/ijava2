class BlaBla extends Program {

    void algorithm() {
        String mot = readString();
        String premiereMoitie    = substring(mot,0, length(mot)/2); // à compléter
        String deuxiemeMoitie    = substring(mot, length(mot)/2, length(mot)); // à compléter
        boolean memeMot = equals(premiereMoitie, deuxiemeMoitie);
        println(mot+" = "+ memeMot); // à compléter
    }

}
