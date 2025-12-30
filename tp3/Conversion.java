class Conversion extends Program {

    void algorithm() {
        // À compléter
        print("Combien de lignes souhaitez-vous ? ");
        int ligne=readInt();
        double yens=135.9;
        for(int i=1;i<=ligne;i++){
            println(i + " euros = " + yens*i + " yens.");
        }
    }

}
