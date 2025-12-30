class InitTableau extends Program {

    int[] creerTableau(){
        return creerTableau(10);
    }
    void test_creerTableau_taille_fixe_10() {
        assertArrayEquals(new int[]{1,1,1,1,1,2,2,2,2,2}, creerTableau());
    }

    int[] creerTableau(int valeur){
        int[] tab=new int[valeur];
        for (int i=0;i<length(tab);i++){
            if(i<length(tab)/2){
                tab[i]=1;
            }else{
                tab[i]=2;
            }
        }
        return tab;
    }

    
    void test_creerTableau_taille_en_parametre () {
        assertArrayEquals(new int[]{1,1,1,1,1,2,2,2,2,2}, creerTableau(10));
        assertArrayEquals(new int[]{1,1,2,2,2}, creerTableau(5));
        assertArrayEquals(new int[]{}, creerTableau(0));
    }
    
    int[] creerTableauAleatoire(int v){

        int[] tab=new int[v];
        for(int i=0;i<v;i++){
            tab[i]=(int)(random()*21);
        }
        return tab;
    }
    
    void test_creerTableauAleatoire_valeurs_entre_0_et_20() {
        int[] t = creerTableauAleatoire(100);
        for (int i=0; i<length(t); i++) {
            assertTrue( t[i] >=0 && t[i] <=20 );
        }
    }
    
    void test_creerTableauAleatoire_toutes_les_valeurs_entre_0_et_20_sont_presentes() {
        int[] t = creerTableauAleatoire(1000);
        // Stocke à l'indice i si la valeur i a été rencontrée dans le tableau aléatoire
        boolean[] valeursVues = new boolean[21];
        for (int i=0; i<length(t); i++) {
            valeursVues[t[i]] = true;
        }
        for (int i = 0; i < length(valeursVues); i++) {
            assertTrue(valeursVues[i]);
        }
    }
    
    void algorithm() {
    }

}
