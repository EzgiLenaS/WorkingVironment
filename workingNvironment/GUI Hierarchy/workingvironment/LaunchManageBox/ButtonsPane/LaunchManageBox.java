package LaunchManageBox.ButtonsPane;
import java.awt.event.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import LaunchManageBox.Buttons.LaunchButton.LaunchButton;
import LaunchManageBox.Buttons.ManageButton.ManageButton;
import LaunchManageBox.BoxDiscriptionLabel.BoxDiscriptionLabel;
import javafx.scene.input.MouseEvent;
import javafx.stage.Window;
import backEnd.*;
import AddWirePopup.*; 
import MainScreen.*;
import ManageScreenPanel.*;

/*
 * GUI version of a Box
 * @author Eyüp Berkan Sivrikaya, Sait Can Baþkol and Osman Semih Tiryaki
 * @version 1.0
 */ 
public class LaunchManageBox extends VBox
   
{   
   //properties
   private LaunchButton launchButton;
   private ManageButton manageButton;
   private Box box;
      
   //constructors
   public LaunchManageBox(String boxName, Box newBox)
   {
      
      super();
      box = newBox;
      launchButton = new LaunchButton();
      launchButton.addEventHandler( MouseEvent.MOUSE_CLICKED ,new ActionListener());
      manageButton = new ManageButton();
      manageButton.addEventHandler( MouseEvent.MOUSE_CLICKED ,new ActionListener());
      this.setPadding(new Insets(15, 12, 15, 12));
      
      this.setSpacing(10);
      
      this.getChildren().addAll(new BoxDiscriptionLabel(boxName),launchButton,manageButton );
      
      this.addEventHandler(MouseEvent.MOUSE_CLICKED, new ActionListener());
      this.setOnMouseClicked(new ActionListener());
   }
         
   // methods 
   public ManageButton getManageButton()
   {
      return this.manageButton;
   }
   
   public Box getBox()
   {
      return this.box;
   }
   
   
   private class ActionListener implements EventHandler<MouseEvent>
   {
      public ActionListener()
      {super();}
      
      @Override
      public void handle(MouseEvent e )
      {
         if(e.getSource() == launchButton)
         {
            box.runAll();
         }
         else if(e.getSource() == manageButton)
         {
            try{
            MainScreen.getWindow().setScene(new Scene(new ManageScreenPanel( box )));
            }
            catch(Exception ex){
               System.out.println(ex);
            }
         }
         
         
         
      }
   }
   
}
