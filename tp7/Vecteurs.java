class Vecteurs extends Program {

    /** La fonction readVector doit saisir les trois éléments du vecteur auprès de l'utilisateur.
     Exemple d'utilisation:
     readVector() retournera le vecteur new int[]{1, 2, 3} si l'utilisateur saisit 1 puis 2 puis 3 */
    int[] readVector(){
        int[] tab= new int[3];
        println("Saisir les trois éléments du vecteur");
        for(int i=0;i<3;i++){
            tab[i]=readInt();
        }
        return tab;
    }

    /** La fonction equals retourne vrai si les deux vecteurs donnés en paramètre contiennent les mêmes valeurs, et retourne faux sinon. */
    boolean equals(int[] v1, int[] v2){
        for(int i=0;i<3;i++){
            if(v1[i]!=v2[i]){
                return false;
            }
        }

        return true;
    }

    void test_equals() {
        assertTrue(equals(new int[]{1,1,1}, new int[]{1,1,1}));
        assertFalse(equals(new int[]{1,1,2}, new int[]{1,1,1}));
    }
    


    /** La fonction toString retourne la représentation d'un vecteur sous forme de chaine de caractères. */
    String toString(int[] v){
        String res="[";
        for(int i=0;i<3;i++){
            res=res+ (i+1);
            if(i<2){
                res=res+", ";
            }else{
                res=res+"]";
            }
        }
        return res;
    }
    
    void test_toString() {
        int[] v = new int[]{1,2,3};
        assertEquals("[1, 2, 3]", toString(v));
    }
    

    /** La fonction add calcule la somme de deux vecteurs.
     *  Rappelons que si v1=[x,y,z] et v2=[a,b,c], alors la somme de v1 et v2 est le vecteur
     *  [x+a, y+b, z+c] */
    int[] add(int[] v1, int[] v2){
        int[] v=new int[3];
        for(int i=0;i<3;i++){
            v[i]=v1[i]+v2[i];
        }
        return v;
    }
    
    void test_add() {
        int[] v1 = new int[]{1,2,3};
        int[] v2 = new int[]{-1,-2,-3};
        assertArrayEquals(new int[]{0,0,0}, add(v1,v2));
    }
    


    /** La fonction scalarProduct calcule le produit scalaire de deux vecteurs.
     *  Rappelons que si v1=[x,y,z] et v2=[a,b,c], alors la somme de v1 et v2 est le nombre
     *  x*a + y*b + z*c */
    int scalarProduct(int[] v1, int[] v2){
        int v=0;
        for(int i=0;i<3;i++){
            v=v+v1[i]*v2[i];
        }
        return v;
    }
    
    void test_scalarProduct() {
        assertEquals(6, scalarProduct(new int[]{1,1,1},
                new int[]{1,2,3}));
        assertEquals(-14, scalarProduct(new int[]{1,2,3},
                new int[]{-1,-2,-3}));
    }
    
    void algorithm() {
    }

}
