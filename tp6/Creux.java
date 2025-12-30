class Creux extends Program {

    void algorithm() {
        print("Taille : ");
        int taille = readInt();
        print("Caractere : ");
        char caractere = readChar();
        for(int i=0;i<taille;i++){
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i || i==taille-1){
                    print(caractere);
                }else {
                    print(" ");
                }
            }
            println("");
        }

    }
    

}
