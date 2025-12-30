class TvaPasDeUn extends Program {
    void algorithm(){
        print("Combien de lignes ? ");
        int n=readInt();
        double ttc=1.196;
        for(int i=1;i<=n;i++){
            println(i + " euros HT = " + i*ttc + " euros TTC." );
        }
    
    
    }
}
