class NettoyerChaine extends Program {

    void algorithm() {
        String chaine = readString();
        println("Avant nettoyage :");
        println(">"+chaine+"<");
        //À COMPLÉTER
        for(int i=0;i<length(chaine);i++){
            if(charAt(chaine, length(chaine)-1)==' '){
                chaine=substring(chaine,0 ,length(chaine)-1);
            }
            if(charAt(chaine, i)==' ' ){
            chaine=substring(chaine,i+1 ,length(chaine));
            }
        }
        println("Après nettoyage :");
        println(">"+chaine+"<");
    }

}
