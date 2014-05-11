public class Main{
    public static void main(String[]args){
       int yndhanur_bazmapatik=1;
        int tiv=Integer.parseInt(args[0]);
        Bazmapatik bazmapatik= new Bazmapatik();
        for(int i=1; i<=tiv; i++ ){
            
           yndhanur_bazmapatik=bazmapatik.bazma(yndhanur_bazmapatik , i);
        }
        System.out.println(yndhanur_bazmapatik);

    }

}
