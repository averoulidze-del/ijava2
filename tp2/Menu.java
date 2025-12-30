class Menu extends Program {

    /*
    Voici les éléments de texte exact à produire:

    Bienvenue dans le SuperLogicielDeLanTroisMille

    1. Ouvrir un document existant.
    2. Créer un nouveau document.
    3. Enregistrer le document courant.
    4. Quitter ce magnifique logiciel.

    Veuillez entrer votre choix:
    Vous avez choisi: " (...) "
    */
    void algorithm(){
        String un="Ouvrir un document existant.";
        String deux="Créer un nouveau document.";
        String trois="Enregistrer le document courant.";
        String quatre="Quitter ce magnifique logiciel.";
        println("Bienvenue dans le SuperLogicielDeLanTroisMille\n");
        println("1. "+un);
        println("2. "+deux);
        println("3. "+trois);
        println("4. "+quatre + "\n");
        print("Veuillez entrer votre choix:");
        int nb = readInt();
        if(nb==1){
            print("Vous avez choisi:" + " \"" +  un +"\"\n" );        
        }if(nb==2){
            print("Vous avez choisi:" +  " \"" + deux +"\"\n");        
        }if(nb==3){
            print("Vous avez choisi:" +  " \"" + trois +"\"\n");        
        }if(nb==4){
            print("Vous avez choisi:" +  " \"" + quatre +"\"\n");        
        }
    
    }
}
