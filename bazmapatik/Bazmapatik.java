public class Bazmapatik {
    private int bazm;
    private int max;

    public int bazma(int tiv1 ,int tiv2){
        if(tiv1 > tiv2){
            max=tiv1;
        }else{
            max=tiv2;
        }

        int i=max;
        while (true){
            if(i%tiv1==0  && i%tiv2==0 ) {
              bazm=i;
           break;
            } else{
            i=i+max;
            }
        }
        return bazm;
    }
}
