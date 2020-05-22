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
      System.out.println("Manage screen");
   }
   
}

