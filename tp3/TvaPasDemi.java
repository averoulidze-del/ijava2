class TvaPasDemi extends Program {
    void algorithm(){
        print("Combien de lignes ? ");
        int n=readInt();
        print("A partir de ? ");
        double a=readDouble();
        double ttc=1.196;
        for(int i=0;i<n;i++){
            println(a + " euros HT = " + a*ttc + " euros TTC." );
            a=a+0.5;
        }
    
    
    }
}
