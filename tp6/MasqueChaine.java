class MasqueChaine extends Program {
    
    String masque(String phrase, char lettre){
        String p="";
        for(int i=0;i<length(phrase);i++){
            char c=charAt(phrase, i);
            if(c==lettre){
                p=p+charAt(phrase, i);
            }else if(charAt(phrase, i)!=lettre){
                p=p+'.';
            }
        }return p;
    }

    void testMasque () {
            assertEquals("a...a...a....",    masque("au bal masqué",    'a'));
            assertEquals("................", masque("Tonari no Totoro", 'u'));
            assertEquals(".o......o..o.o.o", masque("Tonari no Totoro", 'o'));
            assertEquals("",                 masque("",                 'z'));
        }
        void algorithm() {
        }

}
