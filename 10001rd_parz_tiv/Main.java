public class Main{
    public static void main(String[]args){
        int i=2;
        int qanak=0;
        int parz=0;
        int tiv=Integer.parseInt(args[0]);
        
        Parz_tiv parz_tiv= new Parz_tiv();
           
        while (qanak != tiv){

            parz=parz_tiv.parz(i); 
            qanak=qanak+parz;
            i++;
        
        }
        System.out.println(i-1);

    }

}
