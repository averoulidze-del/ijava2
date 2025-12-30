class ctp extends Program{
    
    final int RED_COMPONENT = 0;
    final int GREEN_COMPONENT = 1;
    final int BLUE_COMPONENT = 2;


    int[][] creer(int taille, int r, int g, int b){
        int[][] image =new int [3][taille*taille];
        for(int i =0; i<length(taille*taille);i++){
            image[RED_COMPONENT][i]=r;
            image[GREEN_COMPONENT][i]=g;
            image[BLUE_COMPONENT][i]=b;
        }
        return image;
    }

    String toString(int nb){
        if(nb<10){
            return "00" + nb;
        }else if(nb<100){
            return "0" + nb;
        }else{
            return "" + nb;
        }
    }

    String debug(int [][] image){
        String res= "";
        int taille=(int)sqrt(length(image[0]));
        for(int ligne=0; ligne<taille; ligne++){
            for(int col=0; col<taille;col++){
                int i=ligne *taille + col;
                res+= "(" + toString(image[RED_COMPONENT][i]) + "," + toString(image[GREEN_COMPONENT][i]) + "," + toString(image[BLUE_COMPONENT][i]) + ")";
                if(col<taille -1){
                    res+=" ";
                }
            }
            res+="\n";
             
        }
    
        return res;
    }
    void show(int[][] image) {
        int taille = (int) sqrt(image[0].length); // taille de l'image (ex : 2, 3, 5...)
    
        for (int ligne = 0; ligne < taille; ligne++) {
            for (int col = 0; col < taille; col++) {
                int index = ligne * taille + col; // position du pixel
                int r = image[RED_COMPONENT][index];
                int g = image[GREEN_COMPONENT][index];
                int b = image[BLUE_COMPONENT][index];
            
            // On affiche un espace coloré (ou carré) pour représenter le pixel
                print(rgb(r, g, b, false) + "  " + RESET);
            }
            println(); // retour à la ligne après chaque rangée de pixels
        }
    }


    void algorithm(){
        int[][] image2x2 = new int[][]{
            {0, 32, 64, 128},
            {0, 32, 64, 128},
            {0, 32, 64, 128}
        };
        println(debug(image2x2));

        // Exemple : création d'une image rouge
        int[][] rouge = creer(2, 255, 0, 0);
        println(debug(rouge));
         show(rouge);  // si la fonction rgb() est disponible
    }
}