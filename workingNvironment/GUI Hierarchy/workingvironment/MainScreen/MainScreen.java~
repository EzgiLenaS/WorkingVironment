package MainScreen;

/*
 * @author Saitcan Ba?kol
 * @version 1.2
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.image.Image;
import javafx.collections.*;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.*;
import LaunchManageBox.ButtonsPane.LaunchManageBox;
import javafx.scene.input.MouseEvent;
import backEnd.*;
import MainScreenPanel.*;
import java.io.*;


public class MainScreen extends Application 

{
   //properties
   private static Stage window;
   private static Scene scene;
   private static Scene  scene2;
   private Profile p;
   private MainScreenPanel mainScreenLayout;
   
   @Override
   public void start(Stage primaryStage) throws Exception
   {
      window = primaryStage;
      p = new Profile();
      //loading p from file
      try
      {     
         // Reading the object from a file 
         FileInputStream file = new FileInputStream("DO NOT DELETE!!"); 
         ObjectInputStream in = new ObjectInputStream(file); 
         
         // Method for deserialization of object 
         p = (Profile)in.readObject(); 
         
         in.close(); 
         file.close(); 
      } 
      
      catch(IOException ex) 
      { 
         p = new Profile();
      }

      window.setResizable(false); 
      //title
      window.setTitle("WorkingVirement");
      //icon
      window.getIcons().add(new Image("/icons/output-onlinejpgtools.png"));
      mainScreenLayout = new MainScreenPanel( p );
      /*creating first scene from mainScreenObject 
      for user to choose to launch box*/
      scene = new Scene(mainScreenLayout,450,400);
      
      window.setScene(scene); // setting initial scene 
      
      window.show();
      
   }
   
   public static Stage getWindow()
   {
      return window;
   }
   
   public static Scene getScene2()
   {
      return scene2;
   }
   
   public static Scene getScene()
   {
      return scene;
   }

   @Override
   public void stop()
   {
      try
      {     
         FileOutputStream file = new FileOutputStream("DO NOT DELETE!!"); 
         ObjectOutputStream out = new ObjectOutputStream(file); 
         
         // Method for serialization of object 
         out.writeObject(p); 
         
         out.close(); 
         file.close();      
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      
   }
   
   public static void main(String[] args)
   { launch(args);  }
}