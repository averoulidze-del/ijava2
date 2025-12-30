class Decompte extends Program {
    String genereNombresPairs1(int nbr){
        String res="";
        while(nbr!=0){
            res=res+nbr;
            nbr=nbr-2;
        }
        return res;
    }
    String genereNombresPairs2(int nbr){
        String res2="";
        res2=res2+"*";
        while(nbr!=0){
        
            res2=res2+nbr;
            nbr=nbr-2;
        
        }
    
        res2=res2+"*";

        return res2;
    }
    String genereNombresPairs3(int nbr){
        String res2="";
        while(nbr!=0){
            res2=res2+nbr;
            if(nbr!=2){
                res2=res2+"*";
            } 
            nbr=nbr-2;
        
        }
    
        

        return res2;
    }
    void test_genereNombresPairs1() {
        assertEquals("8642",     genereNombresPairs1(8));
        assertEquals("12108642", genereNombresPairs1(12));
        assertEquals("2",        genereNombresPairs1(2));
        }
        
        void test_genereNombresPairs2() {
            assertEquals("*8642*",     genereNombresPairs2(8));
            assertEquals("*12108642*", genereNombresPairs2(12));
            assertEquals("*2*",        genereNombresPairs2(2));
            }
            
    
        void test_genereNombresPairs3() {
            assertEquals("8*6*4*2",       genereNombresPairs3(8));
            assertEquals("12*10*8*6*4*2", genereNombresPairs3(12));
            assertEquals("2",             genereNombresPairs3(2));
        }
    
        void algorithm() {
            println(genereNombresPairs1(8));
            println(genereNombresPairs2(8));
        }

}
