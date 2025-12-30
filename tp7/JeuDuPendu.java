class JeuDuPendu extends Program {

    void algorithm () {
        String mot = "programme"; // Peut être modifié pour tester
        int erreurs=5;
        boolean trouver=false;
        boolean gagner=false;
        int taille=length(mot);

        char[] car= new char[taille];
        char[] carMotCacher= new char[taille];

        // Complétez ici
        for(int i=0;i<taille;i++){
            car[i]='*';
        }
        for(int i=0;i<taille;i++){
            carMotCacher[i]=charAt(mot, i) ;
        }
        while(erreurs > 0 && !gagner){    
            trouver=false;

            print("Il vous reste " + erreurs + " erreurs: ");
            for(int i=0;i<taille;i++){
                print(car[i] + " ");
            }
            print("\nEntrez un caractère: ");
            char saisie=readChar();

            for(int i=0;i<taille;i++){
                if(carMotCacher[i]==saisie && car[i]=='*'){
                    trouver=true;
                    car[i]=carMotCacher[i];
                    
                    
                } 
            }
            if(!trouver){
                erreurs--;
            }
            if(erreurs == 0){
                gagner=false;
                print("Vous avez perdu ! Il fallait trouver: ");
                for(int i=0;i<taille;i++){
                    print(carMotCacher[i]);
                }
                println("");
            }
            
            gagner=true;
            for(int i=0;i<taille;i++){
                if(car[i]=='*'){
                    gagner=false;
                }
            }
            if(gagner){
                print("Vous avez gagné ! Il fallait trouver: ");
                for(int i=0;i<taille;i++){
                    print(carMotCacher[i]);
                }
                println("");
            }
        }
    }
}
