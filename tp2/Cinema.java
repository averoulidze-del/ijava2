class Cinema extends Program {
    void algorithm(){
        print("Age du spectateur : ");
        int age = readInt();
        double prix=12;
        if(age<=10){
            prix=prix/2;
        }else if(age>10 && age<16 || age>60){
            prix=prix-3;
        }
        print("Option 3D ? (1 si oui, autre chiffre si non) : ");
        int option=readInt();
        if(option==1){
            prix=prix+2;
        }
        print("Abonné ? (1 si oui, autre chiffre si non) : ");
        int abonne=readInt();
        if(abonne==1){
            prix=prix*0.80;
        }
        println("Coût du billet : " + prix + " euros");
    }
}
