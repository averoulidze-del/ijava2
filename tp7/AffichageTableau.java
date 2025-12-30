class AffichageTableau extends Program {

    String toString(int[] tab){
        String res="";
        for(int i=0; i<length(tab);i++){
            res=res+tab[i]+" ";
        }

        return res;
    }
    String toString(String[] tab){
        String res="";
        for(int i=0;i<length(tab);i++){
            res=res+tab[i]+" ";
        }
        return res;
    }
    
    void test_toString_tab_int () {
        assertEquals("1 2 3 ", toString(new int[]{1,2,3}));
        assertEquals("", toString(new int[0]));
    }
    

    
    void test_toString_tab_string () {
        assertEquals("un deux trois ", toString(new String[]{"un", "deux", "trois"}));
        assertEquals("", toString(new String[0]));
    }
    

    void algorithm() {
        int[] tabInt = new int[]{1,2,3};
        String[] tabString = new String[]{"un", "deux", "trois"};
        println(toString(tabInt));
        println(toString(tabString));
    }

}
