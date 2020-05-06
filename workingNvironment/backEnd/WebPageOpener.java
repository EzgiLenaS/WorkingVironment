package workingNvironment.backEnd;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

/**
 * A class for WebPageOpener
 * @author Yigit Ekin and  Arda Eren
 * @version 1.0 
 */
public class WebPageOpener extends Shortcut 
{
   // properties 
   private String name;
   private URI uri;
   
   // constructors 
   public WebPageOpener( String name, String uriToGive) 
   {
      this.name = name;
      
      try
      {
         uri = new URI( uriToGive);
      } 
      
      catch( Exception e) 
      {
         e.printStackTrace();
      }
   }
   
   // methods 
   /** 
    * this method return the name of the WebPage  
    * @param none 
    * @return name the name of the WebPage 
    */  
   public String getName()
   {
      return name;
   }
   
   /** 
    * this method return the uri of the WebPage  
    * @param none 
    * @return uri the uri of the WebPage 
    */  
   public URI getURI()
   {
      return uri;
   }
   
   /*
    * This method changes the name of the  webpage
    * @param newName the wanted name for the webpage
    * @return none
    */
   public void setName( String newName)
   {
      name = newName;
   }
   
   /*
    * This method changes the URI
    * @param newURL the wanted URI
    * @return none
    */
   public void setURI( URI newURL)
   {
      uri = newURL;
   }
   
   /** 
    * this method opens the WebPage 
    * @param none 
    * @return none
    */  
   public void run()
   {  
      try
      {   
         if (java.awt.Desktop.getDesktop().isDesktopSupported()) // if the desktop is supported
         {
            java.awt.Desktop.getDesktop().browse( uri); // browse the url
         }  
      } 
      
      catch (Exception e) 
      {   
         e.printStackTrace();
      }
   }
} // end of class