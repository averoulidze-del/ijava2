class HeureEuVersUs extends Program {
    void algorithm(){
        print("Saisir heures: ");
        int h=readInt();
        print("Saisir minutes: ");
        int m=readInt();
        

        
            if(h<12 && h>0){
                println(h + ":" + m + "AM");
            }else if(h==0){
                println(h+12 + ":" + m + "AM");
            }
        
            if(h>12){
                println(h-12 + ":" + m + "PM");
            }else if(h==12){
                println(h + ":" + m + "PM");
            }

    }

}
