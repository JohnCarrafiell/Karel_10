/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;

public class Lab10 {
	 
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
		 Athlete athena = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
		 clearMaze(athena);
	 }
	 
	 public static void clearMaze(Athlete arg) {
	 while (!arg.nextToABeeper()){
       while (!arg.frontIsClear()&&!arg.leftIsClear()&&!arg.rightIsClear()){
       arg.turnAround();
       arg.move();
       }
       while (arg.frontIsClear()&&!arg.leftIsClear()){
       arg.move();
       }
       while (arg.frontIsClear()&&arg.leftIsClear()&&!arg.rightIsClear()){
       arg.turnLeft();
       arg.move();
       }
       while (!arg.frontIsClear()&&!arg.leftIsClear()&&arg.rightIsClear()){
       arg.turnRight();
       arg.move();
       }
       while (!arg.frontIsClear()&&arg.leftIsClear()){
       arg.turnLeft();
       arg.move();
       }
    }
 }
 }