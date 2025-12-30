class DevinerNombre extends Program {
    void algorithm() {
        int deb=1;
        int fin=100
        boolean trouver=false;

        while(!trouver){
            int milieu=(debut+fin)/2;
            println("Est-ce que le nombre est " + milieu + " ?");
            char c =readChar();
            if(c=='='){
                println("Il fallait trouver " + milieu + " !");
            }if(c=="+"){
                deb=deb+1;
            }if(c=="-"){
                fin=fin-1;
            }
        }
    }
}
