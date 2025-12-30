class VoteMajoritaire extends Program {

    boolean estAdopte(boolean[] tab){
        int pour=0;
        int contre=0;
        

        for(int i=0;i<length(tab);i++){
            if(tab[i]){
                pour++;
            }else{
                contre++;
            }
        }
        return pour > contre;
    }
    void test_estAdopte(){
        assertFalse(estAdopte(new boolean[]{true,false}));
        assertTrue(estAdopte(new boolean[]{true,true,false}));
    }

    void algorithm() {
    }

}
