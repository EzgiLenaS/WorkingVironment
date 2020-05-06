package workingNvironment.backEnd;

import java.awt.Desktop;
import java.io.File;

/**
 * A class for AppOpener
 * @author Yigit Ekin and Arda Eren
 * @version 1.0 
 */
public class AppOpener extends Shortcut 
{
   // properties 
   private String name;
   private File app;
   
   // constructors 
   // constructor with the parameters as strings
   public AppOpener( String name, String pathName) 
   {
      this.name = name;
      
      try
      {   
         app = new File( pathName);   
      } 
      
      catch (Exception e) 
      {
         e.printStackTrace(); 
      }
   }
   
   // constructor with the parameters as string and file
   public AppOpener( String name, File app) 
   {
      this.name = name;
      
      try
      {   
         this.app = app; 
      } 
      
      catch (Exception e) 
      { 
         e.printStackTrace();
      }
   }
   
   // methods 
   /** 
    * this method return the name of the application 
    * @param none 
    * @return name the name of the application
    */  
   public String getName()
   {
      return name;
   }
   
   /** 
    * this method return the file object of the app
    * @param none 
    * @return app the applicziton in a file object
    */  
   public File getApp()
   {
      return app;
   }
   
   /*
    * This method changes the name of the  app
    * @param newName the new name for the app
    * @return none
    */
   public void setName( String newName)
   {
      name = newName;
   }
   
   /*
    * This method changes the applications path
    * @param newApp the new application in the form of a file
    * @return none
    */
   public void setApp( File newApp)
   {
      app = newApp;
   }
   
   /** 
    * this method opens the application on the Desktop
    * @param none
    * @return none
    */  
   public void run()
   {  
      try
      {   
         if (java.awt.Desktop.getDesktop().isDesktopSupported()) // if the desktop is supported
         {
            java.awt.Desktop.getDesktop().open( app); // opens the app
         }
      } 
      
      catch (Exception e) 
      {
         e.printStackTrace(); 
      }
   }
} // end of class