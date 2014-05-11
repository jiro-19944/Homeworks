public class Parz_tiv {
    private int i=2;
    private int parza;

    public int parz(int tiv){
	parza=1;
       for (int i=2;  i <= tiv / 2; i++){

            if(tiv % i == 0){
                parza=0;
                break;
            }
        }
        


        return parza;
    }
}
