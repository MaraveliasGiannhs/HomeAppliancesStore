import javax.naming.Name;

public class HomeAppliancesStore
{ static String Onoma;
    static String Location;
    static int arErgatwn;        // An valw times, oi sunthikes if() den tha treksoun

    public static void main(String args[]) {
        System.out.println("Onoma= " + Onoma + "\nDieuthnish= " + Location + "\nArithmos Ergatwn= " + arErgatwn+"\n");

        if (Onoma == null) {
            System.out.println("Den uparxei onoma.");
        }
        if (Location == null) {
            System.out.println("Den uparxei Dieuthnish.");
        }
        if (arErgatwn == 0) {
            System.out.println("Den uparxoun ergates.");
        }

        if (args.length==1)
        {
            Onoma="1";
        }
        if (args.length==2)
        {
            Location="2";
        }
        if (args.length==3)
        {
            arErgatwn=3;
        }





    }
}