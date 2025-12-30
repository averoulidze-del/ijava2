class HeureUsVersEu extends Program {
    void algorithm(){
        print("Saisir heures: ");
        int h=readInt();
        print("Saisir minutes: ");
        int m=readInt();
        print("Saisir AM/PM: ");
        String v=readString();

        if(v=="AM"){
            if(h==12){
                println(h-12 + ":" + m);
            }else{
                println(h + ":" + m);
            }
        }
        if(equals(v, "PM")){
            if(h<12){
                println(h+12 + ":" + m);
            }else{
                println(h + ":" + m);
            }
        }


    }
}
