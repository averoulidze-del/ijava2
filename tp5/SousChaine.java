class SousChaine extends Program {

    boolean contient(String chaine, String motif){
        boolean trouver=false;
        for(int i=0;i<=length(chaine)-length(motif);i++){
            if(equals(substring(chaine, i, i+length(motif)), motif)){
                trouver=true;
            }
        }

        return trouver;
    }

    void algorithm() {
        String chaine, motif;
        print("Veuillez entrer un texte : ");
        chaine = readString();
        print("Motif à chercher : ");
        motif = readString();
        if(contient(chaine,motif)) {
            println("trouvé");
        } else {
            println("pas trouvé");
        }
    }

}
