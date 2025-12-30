class NuageDeMots extends Program {

    int nbFois(String[] tab, String mot){
        int cpt=0;
        for(int i=0;i<length(tab);i++){
            if(equals(mot, tab[i])){
                cpt++;
            }
        }
        return cpt;
    }

    String[] motsDifferents(String[] mots){
        String[] tab=new String[length(mots)];
        for(int i=0;i<length(mots);i++){
            tab[i]="";
        }
        int libre=0;

        for(int i=0;i<length(mots);i++){ 
            if(nbFois(tab, mots[i])==0){
                tab[libre]=mots[i];
                libre++;
            }
        }
        
        return sousTableau(tab, 0, libre);
    }
    int[] frequences (String[] motsCles, String[] mots){
        int[] cpt=new int[length(motsCles)];
        for(int i=0;i<length(motsCles);i++){
            cpt[i]=(nbFois(mots, motsCles[i]));

        }
        

        return cpt;
    }   
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
        if(c>='a' && c<='z' || c>='A' && c<='Z'){
            return true;
        }
        return false;
    }

    void algorithm() {
        String texte = "Keep it simple, stupid !" +
                       "Keep it stupid simple !" +
                       "Keep it simple and stupid !" +
                       "Keep it small and simple !";

        // complétez le programme pour afficher les mots et leur fréquence

        String[] mots=extraireMots(texte);
        String[] motsDiff=motsDifferents(mots);
        int[] frequences=frequences(motsDiff, mots);
        for(int i=0;i<length(motsDiff);i++){
            println(motsDiff[i] + " : " + frequences[i]);
        }

    }

}
