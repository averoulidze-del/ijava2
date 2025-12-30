class DoublerCaracteres extends Program {
    void algorithm(){
        String mot=readString();
        for(int i=0; i<length(mot);i++){
            for(int j=0; j<2;j++){
                print(charAt(mot, i));
            }
        }
    }
}
