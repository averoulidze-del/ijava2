class Remplacer extends Program {

    String copieEnRemplacant(String texte, String chercher, String remplacer){
        String res="";
        int i=0;
        if(chercher==""){
            return texte;
        }
        
        while(i<length(texte)){
            if(i+length(chercher)<=length(texte) && equals(substring(texte, i, i+length(chercher)), chercher)){
                res=res+remplacer;
                i=i+length(chercher);
            } else {
                res=res+charAt(texte,i);
                i++;
            }
        }
        return res;

        
    }
    void algorithm() {
            print("Phrase : ");
            String texte = readString();
            print("Avant : ");
            String chercher = readString();
            print("Après : ");
            String remplacer = readString();
            println(copieEnRemplacant(texte, chercher, remplacer));
        }

        void testCopieEnRemplacant () {
            assertEquals("15x35"  , copieEnRemplacant("15*35"     , "*"   , "x"));
            assertEquals("15 + 35", copieEnRemplacant("15 plus 35", "plus", "+"));
            assertEquals("abcd"   , copieEnRemplacant("abcd"      , "cb"  , "xy"));
            assertEquals("abcd"   , copieEnRemplacant("abcd"      , ""    , "x"));
            assertEquals("abcd"   , copieEnRemplacant("-ab-cd-"   , "-"   , ""));
            assertEquals("xx"     , copieEnRemplacant("aaaa"      , "aa"  , "x"));
            assertEquals("xxa"    , copieEnRemplacant("aaaaa"     , "aa"  , "x"));
            assertEquals("9 plus 3 plus 3", copieEnRemplacant("9 moins 3 moins 3", "moins", "plus"));
        }
}
