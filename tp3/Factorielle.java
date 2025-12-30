class Factorielle extends Program {

    // À compléter
    void algorithm(){
        print("Nombre pour le calcul de la factorielle : ");
        int nb=readInt();
        int cpt=0;
        int res=1;
        while(cpt<nb){
            cpt++;
            res=res*cpt;
        }
        println(nb + "! = " + res);

    }
}
