class SousChaines extends Program {

    void algorithm() {
            print("Mot : ");
            String mot = readString();
            // à compléter ...
            for(int i=0; i<length(mot);i++){
                for(int j=length(mot);j>i;j--){
                    println(substring(mot, i, j));
                }
            }
        }

}
