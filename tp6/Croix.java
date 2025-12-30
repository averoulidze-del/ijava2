class Croix extends Program {

    void algorithm() {
        print("Taille : ");
        int taille = readInt();
        print("Caractere : ");
        char caractere = readChar();
        String res="";
        String ligne="";
        for(int lig=0;lig<taille;lig++){
            for(int col=0;col<taille;col++){
                if(lig==col || lig+col==taille-1){
                    ligne=ligne+caractere;
                }else if(lig!=col){
                    ligne=ligne+ " ";
                }
            }
            while(length(ligne)>0 && charAt(ligne, length(ligne)-1) == ' '){
                ligne=substring(ligne, 0, length(ligne)-1);
            }
            res=res+ligne+"\n";
            ligne="";
        }
        print(res);
    }

}
