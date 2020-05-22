package MainScreen;

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
import LaunchManageBox.Buttons.LaunchButton.LaunchButton;
import LaunchManageBox.ButtonsPane.LaunchManageBox;
import javafx.scene.input.MouseEvent;
import backEnd.*;
import javafx.stage.FileChooser;
import javafx.scene.control.TextField;
import MainScreenPanel.*;
import LaunchManageBox.Buttons.ManageButton.*;
import ManageScreenPanel.*;
import java.io.*;


public class MainScreen extends Application 
   implements EventHandler<MouseEvent>
{
   //properties
   ListView<LaunchManageBox > list;
   static Stage window;
   static Scene scene;
   public static Scene  scene3;
   Button button, button2;
   Box box;
   TextField textField;
   Profile p;
   ManageScreenPanel layout3;
   MainScreenPanel layout;
   
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
      layout = new MainScreenPanel( p );
      
      for(int i = 0; i<layout.getList().getItems().size();i++ ){
         layout.getList().getItems().get(i).getManageButton().setOnAction(e -> System.out.println("yeahhhh"));}

      
      button2 = new Button("berkan2");
      
      button2.setOnMouseClicked(this);
      
      scene = new Scene(layout,450,400);
      
      window.setScene(scene); 
      window.setResizable(false);
      window.setTitle("WorkingVirement");
      window.getIcons().add(new Image("/icons/output-onlinejpgtools.png"));
      
      window.show();
      
   }
   
   public static Stage getWindow()
   {
      return window;
   }
   
   public static Scene getScene3()
   {
      return scene3;
   }
   
   public static Scene getScene()
   {
      return scene;
   }
   public void handle(MouseEvent e)
   {
        
      for ( int i = 0; true; i++)
      {
         System.out.println(i);
         if ( layout.getList().getItems().get(i).getManageButton() == (ManageButton)e.getSource())
         {
            System.out.println("mainScreen");
            window.setScene( scene3);
         }
      }
      
      
      
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