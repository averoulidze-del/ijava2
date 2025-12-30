class PGCD extends Program {

    void algorithm() {
        int a = readInt();
        int b = readInt();
        int reste ;
        // à compléter
        if(a<0){
            a=a*-1;
        }
        if(b<0){
            b=b*-1;
        }
        if(b==0){
            println("Le pgcd est " + a);
        }
        reste=a%b;
        while(reste!=0){
            a=b;
            b=reste;
            reste=a%b;
        }
        if(b!=0){
            println("Le pgcd est " + b);

        }
    }

}
