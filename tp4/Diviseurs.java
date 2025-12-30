class Diviseurs extends Program {

    void algorithm() {
        int n = readInt();
        int p=n;
        print("Diviseurs :");
        // à compléter ...
        while(n!=0){
            if(p%n==0){
                print(" " + n);
            }
            n--;
        }
        println(".");
    }

}
