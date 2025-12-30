class Temperature extends Program {

    void algorithm() {
        println("Saisir une suite de valeurs entières terminée par -273.");
        int temperature = readInt();
        int maximum=temperature;
        // à compléter ...
        while(temperature!=-273){
            temperature=readInt();
            if(temperature>maximum){
                maximum=temperature;
            }
        }
        println("Le maximum est "+ maximum+".");
    }

}
