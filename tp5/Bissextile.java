class Bissextile extends Program {

    boolean bissextile(int annee) {
        boolean b=false;
        if(annee % 4==0){
            b=true;
        }if(annee%100==0){
            b=false;
        }else if(annee%400==0){
            b=true;
        }
        return b;
    }

    void algorithm() {
        int annee = 2022;
        int nbAnneesBissextiles = 0;
        // à compléter
    }

}
