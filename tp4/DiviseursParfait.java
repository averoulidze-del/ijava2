class DiviseursParfait extends Program {

    void algorithm() {
        int n = readInt();
        int p=n;
        int par=n;
        print("Diviseurs :");
        // à compléter ...
        while(n!=0){
            if(p%n==0){
                print(" " + n);
                par=par-n;
            }
            n--;
        }
        println(".");
        if(par+p == 0){
            println("Nombre parfait !");
        }
    }

}
