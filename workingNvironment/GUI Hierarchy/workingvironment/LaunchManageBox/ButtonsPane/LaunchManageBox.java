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
import MainScreen.*;
import ManageScreenPanel.*;

public class LaunchManageBox extends VBox
   
{
   
   //properties
   private LaunchButton launchButton;
   private ManageButton manageButton;
   private Box box;
   
   
   
   //constructors
   public LaunchManageBox(String boxName, Box box)
   {
      
      super(10);
      this.box = box;
      this.setPadding(new Insets(15, 12, 15, 12));
      
      //launchButton part(initialisation, adding listener)
      launchButton = new LaunchButton();
      launchButton.addEventHandler( MouseEvent.MOUSE_CLICKED 
                                        ,new ActionListener());
      
      //manageButton part(initialisation, adding listener)
      manageButton = new ManageButton();
      manageButton.addEventHandler( MouseEvent.MOUSE_CLICKED 
                                        ,new ActionListener());
      
      //Adding everything to pane
      this.getChildren().addAll(new BoxDiscriptionLabel(boxName)
                                      ,launchButton,manageButton );
      
      this.addEventHandler(MouseEvent.MOUSE_CLICKED, new ActionListener());
      this.setOnMouseClicked(new ActionListener());
   }
   
   
   
   // methods 
   
   public Box getBox()
   {
      return this.box;
   }
   
   //Inner class for actionlistener
   private class ActionListener implements EventHandler<MouseEvent>
   {
      public ActionListener()
      {super();}
      
      @Override
      public void handle(MouseEvent e )
      {
         if(e.getSource() == launchButton)
         {
            box.runAll(); //Launching all added files or links 
         }
         else if(e.getSource() == manageButton) 
         { // changing scene to ManageScreen
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
