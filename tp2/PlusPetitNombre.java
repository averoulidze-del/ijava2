class PlusPetitNombre extends Program {
    void algorithm(){
        println("Entrez deux nombres :");
        int a=readInt();
        int b=readInt();
        int petit=0;
        if(a>b){
            petit=b;
        }
        if(b>a){
            petit=a;
        }
        if(a==b){
            petit=a;
        }
        println(("Le plus petit est " + petit));
    }
}
