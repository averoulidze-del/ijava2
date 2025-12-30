class RenduMonnaie extends Program {

    void algorithm(){
        int somme, nb20, nb10, nb5, nb2, nb1, reste;
        print("Quelle est le montant que vous souhaitez rendre en monnaie ?");
        somme = readInt();

        // compléter le calcul SANS UTILISER le mot-clé if !
        nb20=somme/20;
        reste=somme%20;

        nb10=reste/10;
        reste=reste%10;

        nb5=reste/5;
        reste=reste%5;

        nb2=reste/2;
        reste=reste%2;

        nb1=reste/1;
        println("Nombre de billets de 20 : " + nb20);
        println("Nombre de billets de 10 : " + nb10);
        println("Nombre de billets de  5 : " + nb5);
        println("Nombre de pièces  de  2 : " + nb2);
        println("Nombre de pièces  de  1 : " + nb1);
    }

}
