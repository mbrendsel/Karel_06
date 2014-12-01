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
   
    public class Lab06
   {
       public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/" + filename + ".map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
      
         task_01(); //go to the end of the row of beepers
         task_02(); //go to the beeper
         task_03(); //go to the wall
         task_04(); //go to the wall, pick up all the beepers (max one per pile)
         task_05(); //go to the wall, pick up all the beepers
         task_06(); //go to the end of the row of beepers, there is one gap
      }
       public static void task_01()	
      { //go to the end of the row of beepers
         Robot monica = new Robot(1, 1, Display.EAST, 0);
      while(monica.nextToABeeper()) {
      monica.move(); }
      }
       public static void task_02()	
      { //go to the beeper
         Robot bob = new Robot(1, 2, Display.EAST, 0);
      	while(!bob.nextToABeeper()) {
         bob.move(); }
      }
       public static void task_03()	
      { //go to the wall
         Robot max = new Robot(1, 3, Display.EAST, 0);
         while(max.frontIsClear()) {
         max.move(); }
      }
       public static void task_04()	
      { //go to the wall, pick up all the beepers (max one per pile)
         Robot rachel = new Robot(1, 4, Display.EAST, 0);
         while(rachel.frontIsClear()) {
         while(rachel.nextToABeeper()) {
         rachel.pickBeeper(); }
         rachel.move();
         }
         if(!rachel.frontIsClear() && rachel.nextToABeeper()) {
         rachel.pickBeeper();
      }
      }
       public static void task_05()	
      { //go to the wall, pick up all the beepers
         Robot kelly = new Robot(1, 5, Display.EAST, 0);
         while(kelly.frontIsClear()) {
         while(kelly.nextToABeeper()) {
         kelly.pickBeeper(); }
         kelly.move();
         }
         while(!kelly.frontIsClear() && kelly.nextToABeeper()) 
         {
         kelly.pickBeeper();
         }

      }
       public static void task_06()
      { //go to the end of the row of beepers, there is one gap
         Robot jim = new Robot(1, 6, Display.EAST, 0);
         while(jim.nextToABeeper()) 
         {
         jim.move(); 
         }
         if(jim.frontIsClear()) 
         {
         jim.move();
         while(jim.nextToABeeper()) {
         jim.move();
         }
         }
      }
   }
