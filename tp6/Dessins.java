class Dessins extends Program {

    String trianglePlein( int taille, char caractere){
        String res="";
        for(int i=0; i<taille; i++){
            for(int j=0;j<i+1;j++){
                res+=caractere;
            }
            res+="\n";
        }
        return res;
    }
    String triangleCreux(int taille, char caractere){
        String res="";
        for(int i=0;i<taille;i++){
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i || i==taille-1){
                    res+=caractere;
                }else{
                    res+=" ";
                }
            }
            res+="\n";
        }
        return res;
    }


    void algorithm() {
        print("Taille : ");
        int taille = readInt();
        print("Caractere : ");
        char caractere = readChar();

        println(trianglePlein(taille, caractere));
        println(triangleCreux(taille, caractere));
    }

}
