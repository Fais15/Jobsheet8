import java.util.Scanner;

public class Perulanganwhile {
    public static void main(String[] args) {
        
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while( running ) {
            System.out.println("Apakah nda ingin keluar");
            System.out.print(" Jawab Iya/tidak}>");
            
            jawab = scan.nextLine();
            
            if(jawab.equalsIgnoreCase("ya")){
                running = false;
            }
            
            counter++;
        }
        
        System.out.println("Anda sudah melakukan perulangan sebanyak"+counter);
                
    }
}
