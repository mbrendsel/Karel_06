/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   import javax.swing.JOptionPane;
    
   public class Lab06Extension
   {
       public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/" + filename + ".map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
      
         task_07(); //go to the first beeper or wall; report number steps taken
         task_08(); //go until next to another robot, then drop all beepers
         task_09(); //place 5 piles of 4 beepers using definite loops
         task_10(); //fill in gaps with a beeper; stop when you reach wall
         task_11(); //while there is a wall on right, put down a beeper.
         task_12(); //go until there is a wall to your right AND you are standing next to a beeper
      }
       public static void task_07()	
      { //go to the first beeper or wall; report number steps taken
         Robot temp = new Robot(1, 1, Display.EAST, 0);
      
      }
       public static void task_08()	
      { //go until next to another robot, then drop all beepers
         Robot temp = new Robot(1, 2, Display.EAST, 0);
      	
      }
       public static void task_09()	
      { //place 5 piles of 4 beepers using definite loops
         Robot temp = new Robot(1, 3, Display.EAST, 0);
       
      }
       public static void task_10()	
      { //fill in gaps with a beeper; stop when you reach wall
         Robot temp = new Robot(1, 4, Display.EAST, 0);
      
      }
       public static void task_11()	
      { //while there is a wall on right, put down a beeper.
         Robot temp = new Robot(1, 5, Display.EAST, 0);
      
      }
       public static void task_12()
      { //go until there is a wall to your right AND you are standing next to a beeper
         Robot temp = new Robot(1, 6, Display.EAST, 0);
      
      }
   }