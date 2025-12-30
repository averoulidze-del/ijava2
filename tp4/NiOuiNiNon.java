class NiOuiNiNon extends Program {
    void algorithm() {
        String m = readString();
        boolean la =false;
        if(equals(m, "oui") || equals(m, "non")){
                    println("Perdu!");

            }else{
        // à compléter ...
            while(!la){
                m=readString();
                if(equals(m, "oui") || equals(m, "non")){
                    la=true;
                    println("Perdu!");

                }
            } 
            }   
        
        
    }
}
