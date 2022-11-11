import java.util.Scanner;

public class logg  {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String värde =scan.nextLine();
        Namn seli= new Namn();
       model bil= new model();

        System.out.println(värde+seli+bil);
        }



    }
