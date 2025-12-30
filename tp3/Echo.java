class Echo extends Program {

    void algorithm() {
        // Saisir la chaine à répéter
        print("Chaîne à répéter : ");
        String chaine=readString();
        // Saisir le nombre de fois
        print("Nombre de fois : ");
        int nb=readInt();
        // Répéter et afficher
        for(int i=0; i<nb; i++){
            println(chaine);
        }
    }

}
