class TestBissextile extends Program {


    boolean bissextile(int annee) {
        boolean b;
        if(annee % 4==0){
            b=true;
        }if(annee%100==0){
            b=false;
        }else if(annee%400==0){
            b=true;
        }else{
            b=false;
        }
        return b;
    }

    void test_bissextile_true(){
        assertEquals(true, bissextile(2000));
        assertEquals(true, bissextile(2012));
        assertEquals(true, bissextile(2024));
        assertEquals(true, bissextile(1600));
    }
    void test_bissextile_false(){
        assertEquals(false, bissextile(2013));
        assertEquals(false, bissextile(2006));
        assertEquals(false, bissextile(1999));
        assertEquals(false, bissextile(1000));

    }
    
    // Exemples d'années bissextiles : 2000, 2012, 2024, 1600
    // Créer ici la fonction de test pour les années bissextiles
    

    // Exemples d'années non bissextiles : 2013, 2006, 1999, 1000
    // Créer ici la fonction de test pour les années non bissextiles


    void algorithm() {
        int annee=2000;
    }

}
