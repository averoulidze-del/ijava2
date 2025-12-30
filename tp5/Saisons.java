class Saisons extends Program {

    String saisonMeteorologique (int mois) {
        String m="";
        if(mois>=3 && mois<=5){
            m="printemps";
        }if(mois>=6 && mois<=8){
            m="été";
        }if(mois>=9 && mois<=11){
            m="automne";
        }if(mois>=1 && mois<=2 || mois==12){
            m="hiver";
        }
        if(mois<1 || mois>12){
            m="erreur";
        }
        return m;
    }
    int nombreJoursMois(int numeroMois) {
        int nb=0;
        if (numeroMois < 1 || numeroMois > 12) {
            nb = 0;
        } else if (numeroMois == 2) {
            nb = 28;
        } else if (numeroMois == 4 || numeroMois == 6 || numeroMois == 9 || numeroMois == 11) {
            nb = 30;
        } else {
            nb = 31;
        }
        return nb;
    }

    String saisonAstronomique (int jour, int mois) {
        String saison = "";

        if (mois < 1 || mois > 12) {
            saison = "erreur";
        } else if ((mois == 12 && jour >= 21) || (mois == 1) || (mois == 2) || (mois == 3 && jour < 21)) {
            saison = "hiver";
        } else if ((mois == 3 && jour >= 21) || (mois == 4) || (mois == 5) || (mois == 6 && jour < 21)) {
            saison = "printemps";
        } else if ((mois == 6 && jour >= 21) || (mois == 7) || (mois == 8) || (mois == 9 && jour < 23)) {
            saison = "été";
        } else if ((mois == 9 && jour >= 23) || (mois == 10) || (mois == 11) || (mois == 12 && jour < 21)) {
            saison = "automne";
        }

        return saison;
    }

    void algorithm () {
        for (int m=0;m<=13;m=m+1){
            println("mois " + m + " : " + saisonMeteorologique(m));
        }
    }

}
