import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        String nome[] = new String[11];
        int idade[] = new int[11];
        int maior = -100, menor = 100;


        for (int i=1; i<11; i++) {
            System.out.println (i + "° Please, "+"enter your name: ");
            nome[i] = scan.nextLine();
            }
        
        int i=0;
        
        for (int j=1; j<11; j++) {
            System.out.println ("How old are you?: " + nome[i++]);
            idade[j] = scan.nextInt();
            }
        
        for (int j=1; j<=10; j++) {
            
            if (idade[j] < menor) {  
            menor = idade[j];
            }
        for (j=1; j<=10; j++) {
            if (idade[j] > maior) {
            maior = idade[j];
        }
     
}
        System.out.println("Older typed: " + maior);
    
        }
    }
}
