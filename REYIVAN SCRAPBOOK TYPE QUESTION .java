import java.util.Scanner;

import javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon;

class HelloWorld {
    public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("what is your name: ");
    String name = scanner.nextLine();

    System.out.print("what is your age: ");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.print("what is your favorite Anime: ");
    String anime = scanner.nextLine();

    System.out.print("where do you live: ");
    String live = scanner.nextLine();
    
     
    System.out.print("who is your crush: ");
    String crush = scanner.nextLine();
    
    System.out.print("what is your favorite food: ");
    String food = scanner.nextLine();
   

    System.out.print("what is your favorite color: ");
    String color = scanner.nextLine();
    

    System.out.print("what is your favorite game: ");
    String game = scanner.nextLine();
   
    
    System.out.print("what is your favorite subject: ");
    String subject = scanner.nextLine();
    

    System.out.print("Are you inlove: ");
    String inlove = scanner.nextLine();
    

    System.out.println("------------- SCRAPBOOK TYPE QUESTION --------" );
    System.out.println("your name: " + name);
    System.out.println("your age: " + age);
    System.out.println("your favorite Anime: " + anime);
    System.out.println("your place: " + live);
    System.out.println("your crush: " + crush);
    System.out.println("your favorite food: " + food);
    System.out.println("your favorite color: " + color);
    System.out.println("your favorite game: " + game);
    System.out.println("your favorite subject: " + subject);
    System.out.println("inlove?: " + inlove);


    }
}
