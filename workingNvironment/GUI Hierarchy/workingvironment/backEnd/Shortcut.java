package backEnd;

import java.io.Serializable;

/**
 * Abstract class for shortcut  
 * @author Yigit Ekin and Arda Eren
 * @version 1.0 
 */
abstract class Shortcut implements Serializable
{
   /*
    * abstract method for opening the shortcut object  
    * @param none
    * @return none
    */ 
   abstract void run();
} // end of class