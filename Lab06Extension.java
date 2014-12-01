/**
*
* Description of the program goes here  // provide a brief description
*
* @Monica
* @12/1/14
*/

   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   import javax.swing.JOptionPane;
    
   public class Lab06Extension
   {
    public static void main(String[] args) 
      {
         Display.openWorld("maps/Lab06map.map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
      
         task_07(); //go to the beeper or the wall
         task_08(); //go until you are next to another robot, then put all your beepers down
         task_09(); //put down 5 different piles with 4 beepers in each pile
         task_10(); //fill in gaps with a beeper and stop when you reach a wall
         task_11(); //while there is a wall to your right put down one beeper at each step
         task_12(); //go until there is a wall to your right and you are standing on a beeper
      }
      
       public static void task_07()	
      { //go to the beeper or the wall
         Robot temp = new Robot(1, 1, Display.EAST, 0);
         while(temp.frontIsClear() && !temp.nextToABeeper()) {
         temp.move(); }
      }
    
      public static void task_08()	
      { //go until you are next to another robot, then put all your beepers down
         Robot monica = new Robot(4, 2, Display.EAST, 1);
         Robot temp = new Robot(1, 2, Display.EAST, 1);
         while(!temp.nextToARobot()) {
         temp.move(); }
         while(temp.hasBeepers()) {
         temp.putBeeper(); }
      }
                     
       public static void task_09()	
      { //put down 5 different piles with 4 beepers in each pile
         Robot temp = new Robot(1, 3, Display.EAST, 20);
               for(int n = 0; n<5; n++) {
                  for(int k=0; k<4; k++) {
                  temp.putBeeper(); 
                  }
                  temp.move();
                  }
      }
              
       public static void task_10()	
      { //go to the wall, pick up all the beepers (max one per pile)
         Robot temp = new Robot(1, 4, Display.EAST, 2);
         while(temp.frontIsClear()) {
            while(temp.nextToABeeper()) {
               temp.move();
            }
            temp.putBeeper();
            temp.move();
            while(temp.nextToABeeper()) {
               temp.move();
            }
            temp.putBeeper();
            temp.move();
         }            
      }
        
       public static void task_11()	
      { //while there is a wall to your right put down one beeper at each step
         Robot temp = new Robot(1, 5, Display.EAST, Display.INFINITY);
         while(!temp.rightIsClear()) {
         temp.putBeeper();
         temp.move();
         }
        
      }

     
       public static void task_12() 
      { //go until there is a wall to your right and you are standing on a beeper 
      Robot temp = new Robot(1, 6, Display.EAST, 0);
         while(temp.rightIsClear() || !temp.nextToABeeper()) {
         temp.move();
      }
   }
}
