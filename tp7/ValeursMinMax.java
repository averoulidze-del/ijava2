class ValeursMinMax extends Program {

    int[] minMax(int[] val){
        int[] tab=new int[2];
        int min=val[0];
        int max=val[0];
        for(int i=0;i<length(val);i++){
            if(val[i]>max){
                max=val[i];
            }
            if(val[i]<min){
                min=val[i];
            }
            
        }
        tab[0]=min;
        tab[1]=max;
        return tab;
    } 
    int[] indicesMinMax(double[] val){
        int[] tab=new int[2];
        int min=0;
        int max=0;
        for(int i=0;i<length(val);i++){
            
            if(val[i]>val[max]){
                max=i;
            }
            if(val[i]<val[min]){
                min=i;
            }
            if(min==max){
                max=0;
                min=0;
            }
            
        }
        tab[0]=min;
        tab[1]=max;
        return tab;
    } 

    void test_minMax() {
        assertArrayEquals(new int[]{1,3}, minMax(new int[]{2,1,3}));
        assertArrayEquals(new int[]{2,2}, minMax(new int[]{2,2,2}));
        assertArrayEquals(new int[]{-1,3}, minMax(new int[]{3,-1,2}));
    }
    
    void test_indicesMinMax() {
        assertArrayEquals(new int[]{1,2}, indicesMinMax(new double[]{2.1, 1.5, 3.0}));
        assertArrayEquals(new int[]{0,0}, indicesMinMax(new double[]{2.1, 2.1, 2.1}));
        assertArrayEquals(new int[]{1,0}, indicesMinMax(new double[]{3.0, -1.9, 2.5}));
    }
    
    void algorithm() {
    }

}
