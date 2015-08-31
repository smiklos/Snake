import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

 public class KeyboardListener extends KeyAdapter{
 	
	 public static final int RIGHT = 39;
	 public static final int LEFT= 38;
	 public static final int UP = 37;
	 public static final int DOWN = 36;
	 
	 
 		public void keyPressed(KeyEvent e){
 		    switch(e.getKeyCode()){
		    	case RIGHT:	// -> Right 
		    				//if it's not the opposite direction
		    				if(ThreadsController.directionSnake!=2) 
		    					ThreadsController.directionSnake=1;
		    			  	break;
		    	case LEFT:	// -> Top
							if(ThreadsController.directionSnake!=4) 
								ThreadsController.directionSnake=3;
		    				break;
		    				
		    	case 37: 	// -> Left 
							if(ThreadsController.directionSnake!=1)
								ThreadsController.directionSnake=2;
		    				break;
		    				
		    	case 40:	// -> Bottom
							if(ThreadsController.directionSnake!=3)
								ThreadsController.directionSnake=4;
		    				break;
		    	
		    	default: 	break;
 		    }
 		}
 	
 }
