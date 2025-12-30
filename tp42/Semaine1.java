class Semaine1 extends Program {

    // Semaine 1 : couleurs
    // On représente une couleur par trois primaryColors numériques
    // correspondant au trois intensité de red, green et blue
    // Ces intensités varient entre 0 et 255.
    // Ainsi, une couleur peut-être représenté par : "255044138"
    // pour red = 255, green = 044 et blue = 138 (le 0 est important!)
    final int RED    = 0;
    final int GREEN  = 1;
    final int BLUE   = 2;

    int charToInt(char chiffre){//retourne l'entier 4
        return chiffre - '0';
    }
    String toString(int composante){ //toString(7) retourne la chaine "007"
        if(composante<10){
            return "00" + composante;
        }
        if(composante<100){
            return "0" + composante;
        }else{
            return "" + composante;
        } 
    }
    String color(int red, int green, int blue){//color(255, 5, 55) retourne "255005055"
        return toString(red) + toString(green) + toString(blue);
    }
    int primaryColorToInt(String primaryColor){ // retourne l'entier 42 de ("042")
        int premier = charToInt(charAt(primaryColor, 0));
        int deuxieme = charToInt(charAt(primaryColor, 1));
        int troisieme = charToInt(charAt(primaryColor, 2));
        return 100*premier + 10*deuxieme + troisieme;
    }
    int primaryColorIndex(int composante){//retourne l'emplacement des colors
        if(composante==RED){
            return 0;
        }if(composante==GREEN){
            return 3;
        }else{
            return 6;
        }
    }
    int get(String color, int primaryColor){// retourne un entier de primaryColor choisi
        int i=primaryColorIndex(primaryColor);
        String res=substring(color, i, i+3);
        return primaryColorToInt(res);
    }
    String set(String color, int primaryColor, int value){
        int i=primaryColorIndex(primaryColor);
        String nouveau=toString(value);
        String avant=substring(color, 0, i);
        String apres=substring(color, i+3, length(color));



        return avant + nouveau + apres;
    }


    void algorithm() {
        println(set(("044255101"), GREEN, 45));
    }

}
