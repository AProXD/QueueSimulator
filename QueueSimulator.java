//imports start
import java.util.*;
//imports end
public class QueueSimulator{
   public static void main(String[] args) throws InterruptedException{
      
      Random rand = new Random();
      String[] names = {"Bob","James","Ryan","Samantha","Sophia","Robert","Linus","David","Hugo","Juan","Pepe","Patrick","Alonso","Diego","Josue","Francesco","Juanteo","Fabrizio","Rodrigo","Racquel","Sam","Bella","Sophia","Steve","Alex","Elliot"};
      Scanner fetch = new Scanner(System.in);
      Queue<String> people = new LinkedList<String>();
      
      //----Game Start----
      while(true){
      
         int pplNumb = rand.nextInt(20)+1;
      
         System.out.println("----Queue Simulator----");
         System.out.println("You are in a line for a concert, the line has " + pplNumb +  " people, " + (pplNumb + 1) + "(including you).  you are the last one. ");
         fetch.nextLine();
         System.out.println("list of people on the line: " );
         
         for(int i = 1; i <= pplNumb; i ++){
            int coom = rand.nextInt(names.length);
           
            System.out.println(i + ": " + names[coom]);
            people.add(names[coom]);
         }
         System.out.println((pplNumb + 1) + ": " + "You");
         fetch.nextLine();
         System.out.println("people will leave the line every 5-10 seconds, you just have to wait till you enter the concert");
         fetch.nextLine();
         
         while(!people.isEmpty()){
            Thread.sleep(rand.nextInt(5000)+ 5000);
            System.out.println( people.remove() + " left the queue and entered the concert");
         }
         System.out.println("you are next in line, will you enter the concert? (yes/no)");
         String answer = fetch.nextLine();
         
         switch(answer){
            case "yes": System.out.println("You entered the Concert and Finished The Queue Simulator, Congrats!");
               break;
            case "no": System.out.println("You didnt enter the Concert, but atleast you finished the Queue Simulator, Congrats!");
               break;
            default: System.out.println("you finished the Queue Simulator, Congrats!");
               break;
         }  
         
         System.out.println("would you wish to play again?"); 
         System.out.println("type 'play' if you wish to play again,type 'exit' to exit.");   
         String lasagna = fetch.nextLine();
         
         switch(lasagna){
            case "exit": System.exit(0);
               break;
            case "play": System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
               break;
            default:
               {
                  System.out.println("we didnt quite understand you, so you're gonna play again, lol.");
                  Thread.sleep(4000);
                  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
               }
               break;
         } 
               
            
      }
      //----Game End----
      
   
   
   }
}
