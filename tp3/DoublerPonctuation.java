class DoublerPonctuation extends Program {
    void algorithm(){
        String mot=readString();
        for(int i=0; i<length(mot);i++){
            if(charAt(mot, i)=='?' || charAt(mot, i)=='!'){
                for(int j=0; j<2;j++){
                    print(charAt(mot, i));
                }
            }else{
                print(charAt(mot, i));
            }
        }
    }
}
