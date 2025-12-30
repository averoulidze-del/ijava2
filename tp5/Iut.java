class Iut extends Program {

    void dessineLigne(int n, char c) {
        // à compléter
        for(int i=0;i<n;i++){
            print(c);
        }
        println("");
    }

    void dessineExtremites(int n, char c) {
        // à compléter
        
        for(int i=0;i<1;i++){
            print(c);
            for(int j=1;j<n-1;j++){
                print(" ");
            }
            print(c);

        }
        println("");
        
    }

    void dessineMilieu(int n, char c) {
        // à compléter
        
            for(int j=0;j<n/2;j++){
                print(" ");
            }
                println(c);

        
        
    }

    void dessineI(int taille, char c) {
        // à compléter
        dessineLigne(taille, c);
        for(int i=0; i<taille-2;i++){
            dessineMilieu(taille, c);
        }
        dessineLigne(taille, c);
        println("");
    }

    void dessineU(int taille, char c) {
        // à compléter
        for(int i=0;i<taille-1;i++){
            dessineExtremites(taille, c);
        }
        dessineLigne(taille, c);
        println("");
    }

    void dessineT(int taille, char c) {
        // à compléter
        dessineLigne(taille, c);
        for(int i=0;i<taille-1;i++){
            dessineMilieu(taille, c);
        }
    }

    void algorithm(){
        print("Taille : ");
        int t = readInt();
        // à compléter
        dessineI(t, 'I');
        dessineU(t, 'U');
        dessineT(t, 'T');
        
    }

}
