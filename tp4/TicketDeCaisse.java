class TicketDeCaisse extends Program {
    void algorithm(){

        int a=readInt();
        int res=a;
        while(a!=0){
            a=readInt();
            res=res+a;
            
        }
        println("Total=" + res);
    }
}
