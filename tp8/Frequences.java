class Frequences extends Program {

    int nbFois(String[] tab, String mot){
        int cpt=0;
        for(int i=0;i<length(tab);i++){
            if(equals(mot, tab[i])){
                cpt++;
            }
        }
        return cpt;
    }
    int[] frequences (String[] motsCles, String[] mots){
        int[] cpt=new int[length(motsCles)];
        for(int i=0;i<length(motsCles);i++){
            cpt[i]=(nbFois(mots, motsCles[i]));

        }
        

        return cpt;
    }    
    void test_frequences_je_tu_elle() {
            String[] motsCles = new String[]{"je", "tu", "elle"};
            int[]    freq     = new int[]{3, 2, 1};
            String[] mots     = new String[]{"je", "tu", "tu", "elle", "je", "je"};
            assertArrayEquals(freq, frequences(motsCles, mots));
        }

        void algorithm() {
        }

}
