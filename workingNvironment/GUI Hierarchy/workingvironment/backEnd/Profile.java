package backEnd;

import java.util.ArrayList;
import java.io.Serializable;

/**
 * A class for Profile object  
 * @author Yigit Ekin and Arda Eren
 * @version 1.0 
 */
public class Profile implements Serializable
{
   //properties
   private ArrayList<Box> boxes;
   
   //constructor
   public Profile()
   {
      boxes = new ArrayList<Box>(); 
   }
   
   //methods   
   /*
    * This method returns the collection of boxes specific to the profile
    * @param none
    * @return boxes the arraylist that includes the collection of boxes
    */ 
   public ArrayList<Box> getBoxes()
   {
      return boxes;
   }
} // end of class