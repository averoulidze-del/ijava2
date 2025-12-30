class Suffixe extends Program {
    void algorithm(){
        print("Entrez une chaîne de caractère : ");
        String chaine = readString();
        print("Nombre de lettres de fin souhaitées : ");
        int nbLettres=readInt();
        String result="";
        int tailleMot=length(chaine);
        if(tailleMot<nbLettres){
            println("Erreur, pas assez de caractères !");
        }else{
            for(int i=tailleMot-nbLettres; i<tailleMot ; i++){
                result=result + charAt(chaine, i);
            }
            println("Résultat : " + result);

        }

    }
}