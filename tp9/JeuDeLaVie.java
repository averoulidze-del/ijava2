class JeuDeLaVie extends Program {
    boolean F=false;
    boolean T=true;

    String afficher(boolean[][] monde){
        String res="";
        for(int i=0;i<length(monde,1);i++){
            for(int j=0;j<length(monde, 2);j++){
                if(monde[i][j]==false){
                    res=res+".";
                }else{
                    res=res+"@";
                }
            }
            res=res+"\n";
        }
        return res;
    }    
    void test_afficher() {
        boolean[][] monde = {
            {F, F, F, F, F},
            {F, T, T, T, F},
            {F, F, T, F, F},
            {F, F, F, F, F}
        };
        String expected =
            ".....\n" +
            ".@@@.\n" +
            "..@..\n" +
            ".....\n";
        assertEquals(expected, afficher(monde));
    }

    void initialiser(boolean[][] tab, double proba){
        
        for(int i=0;i<length(tab, 1);i++){
            for(int j=0;j<length(tab, 2);j++){
                if(i==0 || i==length(tab, 1)-1 || j==0 || j==length(tab, 2)-1){
                    tab[i][j]=false;
                }else{
                    tab[i][j]=(random()<proba);
                }
            }
        }


    }

    int nombreDeVoisins(boolean[][] monde, int lig, int col){
        int nbr=0;
        for(int i=0;i<length(monde, 1) ; i++){
            for(int j=0;j<length(monde, 2); j++){

            }
        }
        return nbr;
    }
    void test_nombreDeVoisins() {
        // Initialiser un monde exemple
        boolean[][] monde = new boolean[][]
            {{F, F, F, F, F},
             {F, F, F, F, F},
             {F, T, T, T, F},
             {F, F, F, F, F},
             {F, F, F, F, F}};
        assertEquals(2, nombreDeVoisins(monde, 2, 2));
        assertEquals(2, nombreDeVoisins(monde, 1, 1));
        assertEquals(3, nombreDeVoisins(monde, 3, 2));
    }

    void algorithm(){
        boolean[][] tableau=new boolean[5][5];
        initialiser(tableau, 0.35);
        println(afficher(tableau));
    }
}
