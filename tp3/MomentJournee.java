class MomentJournee extends Program {

    void algorithm() {
        print("Saisir une heure: ");
        // à compléter ...
        int n=readInt();
        if(n>=6 && n<=11){
            println("matinée");
        }
        if(n>=12 && n<=17){
            println("après-midi");
        }
        if(n>=18 && n<=21){
            println("soirée");
        }
        if(n==23){
            println("nuit");
        }
        if(n>=0 && n<=5){
            println("nuit");
        }
        if(n>23 || n<0){
            println("erreur");
        }
    }


}
