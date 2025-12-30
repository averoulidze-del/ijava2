class SommeMinMax extends Program {
    void algorithm(){
        int a=readInt();
        int b=readInt();
        int res=0;
        for(int i=a; i<=b;i++){
            res=res+i;
        }
        println(res);
    }
}
