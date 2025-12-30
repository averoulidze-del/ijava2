class SousTableau extends Program {

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

    void testSousTableau () {
            assertArrayEquals(new String[]{"a", "b", "c"},
                sousTableau(new String[]{"a", "b", "c", "d", "e"}, 0, 3));
            assertArrayEquals(new String[]{"a", "b"},
                sousTableau(new String[]{"a", "b"}, 0, 5));
            assertArrayEquals(new String[]{},
                sousTableau(new String[]{"a", "b", "c"}, 0, 0));
            assertArrayEquals(new String[]{"a", "b"},
                sousTableau(new String[]{"a", "b"}, 0, -5));

            // L’assertion suivante sert à tester qu’on retourne bien une copie du tableau
            // et non le tableau lui-même
            String[] tab = new String[]{"a", "b"};
            assertNotEquals(tab, sousTableau(tab,  2, 1));
            assertNotEquals(tab, sousTableau(tab, -1, 2));
            assertNotEquals(tab, sousTableau(tab,  1, 7));
        }

        void algorithm() {
            // ne rien mettre ici !
        }

}
