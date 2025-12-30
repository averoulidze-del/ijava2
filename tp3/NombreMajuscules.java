class NombreMajuscules extends Program {

    void algorithm() {
        print("Votre texte : ");
        String texte = readString();
        // à compléter ...
        int cpt=0;
        for(int i=0;i<length(texte); i++){
            if(charAt(texte, i) >=65 && charAt(texte, i) <= 65+26){
                cpt=cpt+1;
            }
        }
        println("Il y a " + cpt + " majuscule(s) dans votre texte.");
    }

}
