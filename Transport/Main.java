
// Author: Ani G.
//Ays file-um bervac e Main class-i nkaragrutyuny, vory veradardznum e cankali gumari shrjanakanerum transportneri cucaky

public class Main{
    public static void main(String[] args) {
        int x;
        try{
            x = Integer.parseInt(args[0]);
        }catch(Exception e){
            x = 10000;
        }

        Metro metro= new Metro();
        if (x >= metro.get_tomsi_gin() && metro.azat_texeri_qanak()>0) { 
            System.out.println("\nMetro.");
            System.out.println(" Tomsi arjeqn e` " + metro.get_tomsi_gin() +"dram");
            System.out.println(" Azat texeri qanakn e` " + metro.azat_texeri_qanak());
        }

        Ertuxayin ertuxayin = new Ertuxayin();        
        if (x  >= ertuxayin.get_tomsi_gin() && ertuxayin.azat_texeri_qanak()>0 ) {
            System.out.println("\nErtuxayin.");
            System.out.println(" Tomsi arjeqn e` " + ertuxayin.get_tomsi_gin() +"dram");
            System.out.println(" Azat texeri qanakn e` " + ertuxayin.azat_texeri_qanak());
        }

        if (x < metro.get_tomsi_gin() && x < ertuxayin.get_tomsi_gin() ) { 

            System.out.println("Dzez harmar transport chka ;)\n");
        }
    }	
}
