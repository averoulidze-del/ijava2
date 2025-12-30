class ExtraireMots extends Program {
    String[] sousTableau(String[] tab, int idxD, int idxF){
        String[] res;
        if(idxD < 0 || idxF < 0 || idxD>length(tab) || idxF>length(tab) || idxD > idxF){
            res=new String[length(tab)];
            idxD=0;
        }else{
            res=new String[idxF-idxD];
        }
        for(int i=0; i<length(res);i++){
            res[i]=tab[idxD+i];
        }
        return res;
    }

    String[] extraireMots(String texte){
        String[] mots=new String[length(texte)];
        for(int i=0;i<length(texte);i++){
            mots[i]="";
        }
        String motsCourant="";
        int idx=0;

        for(int i=0;i<length(texte);i++){
            if(estLettre(charAt(texte, i))){
                motsCourant=motsCourant + charAt(texte, i);
            }else{
                if(!equals(motsCourant,"")){
                    mots[idx]=motsCourant;
                    idx++;
                    motsCourant="";
                }
            }

        }
        
        return sousTableau(mots, 0, idx);
    }

    boolean estLettre(char c){
        if(c>'a' && c<'z'){
            return true;
        }
        return false;
    }
    void test_extraireMots () {
            assertArrayEquals(new String[]{"je", "tu", "elle", "je", "tu"}, extraireMots("je tu elle je tu "));
            assertArrayEquals(new String[]{"je", "tu", "elle", "je", "tu"}, extraireMots(" je tu, elle . je tu ! "));
        }

        void algorithm() {
            // ne rien mettre ici !
        }

}
