class Remplacement extends Program {
    void algorithm(){
        String txt;
        String resultat = ""; 
        char ancien,nouveau; 
        print("Veuillez saisir votre texte : "); 
        txt =readString(); 
        print("Caractère à remplacer : "); 
        ancien=readChar(); 
        print("Caractère de remplacement : "); 
        nouveau=readChar();
        for(int i=0;i<length(txt);i++){
            if (charAt(txt, i) == ancien) {
                resultat = resultat + nouveau; 
            } else {
                resultat = resultat + charAt(txt, i);
            }
        }
        println(resultat);
    }
}
