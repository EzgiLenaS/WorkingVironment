package backEnd;

import java.util.ArrayList;
import java.io.Serializable;

/**
 * A class for Box  
 * @author Yigit Ekin and Arda Eren
 * @version 1.0 
 */
public class Box implements Serializable
{
   //properties
   private String name;
   private ArrayList<Shortcut> box;
   
   //constructor
   public Box( String name)
   {
      box = new ArrayList<Shortcut>(); 
      this.name = name;
   }
   
   //methods
   /*
    * This method returns the name given to the box by the user 
    * @param none
    * @return name the name of the box
    */
   public String getName()
   {
      return name;
   }
   
   /*
    * This method changes the name of the box
    * @param newName the wanted name of the box
    * @return none
    */
   public void setName( String newName)
   {
      name = newName;
   }
   
   /*
    * This method returns the box
    * @param none
    * @return box the arraylist that includes the shorcut objects 
    */ 
   public ArrayList getBox()
   {
      return box;
   }
   
   /*
    * This method opens all the applications and webpages inside the box
    * @param none
    * @return none 
    */ 
   public void runAll()
   {
      for ( int i = 0; i < box.size(); i++)
      {
         box.get(i).run(); // runs all the shortcuts by polymorphism
      }  
   }
} // end of class