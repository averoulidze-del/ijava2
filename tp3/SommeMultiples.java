class SommeMultiples extends Program {
    void algorithm(){
        int a=readInt();
        int b=readInt();
        int c=readInt();
        int res=0;
        for(int i=a; i<=b;i++){
            if (i%c==0){
                res=res+i;
            }
        }
        println(res);
    }
}
