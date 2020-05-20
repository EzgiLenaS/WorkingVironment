package LaunchManageBox.Buttons.LaunchButton;
import javafx.event.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Cell;
import LaunchManageBox.Buttons.LaunchManageButtons.LaunchManageButtons;




public class LaunchButton extends LaunchManageButtons
{
   //properties
   //Box box;
   //constructor
   public LaunchButton()
   {
      super("Launch ");
      //box = new Box();
   }
   
   
   //methods
    public void handle(ActionEvent e)
   {
      //iteration 
      System.out.println("iteration");
      //Profile.get(getInt()).runAll();
       //JavafxAppTry.list.setEditable(true);
      //box.runAll();
     

   }
   
   
   
}