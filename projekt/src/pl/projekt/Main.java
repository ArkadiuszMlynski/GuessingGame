package pl.projekt;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       Random r = new Random();
       TrashTalk trashTalk = new TrashTalk();
       System.out.println("Pick a number from 1 to 10:");
       int randomNumber = new Random().nextInt(10) +1;
       int livesLeft = 2;
       int chances = 2;
       for (int i=0;i<3;i++) {
       int input = keyboard.nextInt();
       
       
       if (input == randomNumber) {
    	   System.out.println("You won!");
       }
       else if (chances==0) {
    	   System.out.println("This was your last try.");
    	   System.out.println("Lives left: " + livesLeft);
       }
       
       else {
    	  
    	   System.out.println(trashTalk.getTrashTalks(r.nextInt(3)));
    	   System.out.println("Lives left: " + livesLeft--);
    	   chances--;
       }
       
	}
       System.out.println("You lost!");
       System.out.println("Correct number was " +randomNumber+ ".");
       keyboard.close();
}
}