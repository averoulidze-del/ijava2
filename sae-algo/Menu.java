class Menu{
    class Oraculix extends Program{
    
    void menuAccueil(){
        print("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
        print("X                                     X\n");
        print("X        Bienvenue dans le jeu        X\n");
        print("X              Oraculix !             X\n");
        print("X                                     X\n");
        println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
        println("1. Jouer");
        println("2. Classement");
        println("3. Règles du jeu");
        println("4. Nombre de joueurs\n");

        print("Veuillez entrer votre choix (1-4) : ");
        int choix = readInt();
        println("");
        if(choix == 1){
            menuJouer();

            // Lancer le jeu
        } else if(choix == 2){
            print("Affichage du classement...\n");
            println("");
            // Afficher le classement
        } else if(choix == 3){
            print("Affichage des règles du jeu...\n");
            // Afficher les règles
        } else if(choix == 4){
            print("Affichage du nombre de joueurs...\n");
            // Afficher le nombre de joueurs
        } else{
            print("Choix invalide. Veuillez réessayer.\n");
            menuAccueil();
            
        }
    }
    
    void menuJouer(){
        println("Menu de jeu :");
        println("1. Nouvelle partie");
        println("2. Charger une partie\n");
        print("Veuillez entrer votre choix (1-2) : ");
        int choix = readInt();
        println("");
        if(choix == 1){
            print("Démarrage d'une nouvelle partie...\n");
            // Initialiser une nouvelle partie
        } else if(choix == 2){
            print("Chargement d'une partie existante...\n");
            // Charger une partie sauvegardée
        } else{
            print("Choix invalide. Veuillez réessayer.\n");
            menuJouer();
        }
    }
    
    
    void algorithm(){
        menuAccueil();
        
    }


}
}