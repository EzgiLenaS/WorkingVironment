package LaunchManageBox.Buttons.ManageButton;
import javafx.event.*;
import LaunchManageBox.Buttons.LaunchManageButtons.LaunchManageButtons;

public class ManageButton extends LaunchManageButtons
{
   
   //constructor
   public ManageButton()
   {
      super("Manage ");
   }
   
   //methods
   public void handle(ActionEvent e)
   {
      //iteration or manage part
      System.out.println("Manage screen");
   }
   
}

