import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("uppg a");
        Scanner tb = new Scanner(System.in);

        System.out.println("Skriv användarnamn");
        String namn = tb.nextLine();
        System.out.println("Skriv lösneord");
        String passwrd = tb.nextLine();
        
        if(namn.equals("root")&&passwrd.equals("pass")){
            System.out.println("Ditt bankkonto har: 0kr");
        }
        else{
            System.out.println("Fel namn eller lösen");
        }
    
    }
}
