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

public class LaunchManageBox extends VBox
   
{
   
   //properties
   private LaunchButton launchButton;
   private ManageButton manageButton;
   Box box;
   
   
   
   //constructors
   public LaunchManageBox(String boxName, Box newBox)
   {
      
      super();
      box = newBox;
      launchButton = new LaunchButton();
      launchButton.addEventHandler( MouseEvent.MOUSE_CLICKED ,new ActionListener());
      manageButton = new ManageButton();
      this.setPadding(new Insets(15, 12, 15, 12));
      // this.setPadding(new Insets(20, 20, 200, 20));
      
      this.setSpacing(10);
      
      this.getChildren().addAll(new BoxDiscriptionLabel(boxName),launchButton,manageButton );
      
      this.addEventHandler(MouseEvent.MOUSE_CLICKED, new ActionListener());
      this.setOnMouseClicked(new ActionListener());
   }
   
   
//   public HBox addHBox() {
//      HBox hbox = new HBox();
//      hbox.setPadding(new Insets(15, 12, 15, 12));
//      hbox.setSpacing(10);
//      hbox.setStyle("-fx-background-color: #336699;");
//      
//      Button buttonCurrent = new Button("Current");
//      buttonCurrent.setPrefSize(100, 20);
//      
//      Button buttonProjected = new Button("Projected");
//      buttonProjected.setPrefSize(100, 20);
//      hbox.getChildren().addAll(buttonCurrent, buttonProjected);
//      
//      return hbox;
//   }
   
   
   
//   
//   public void setOnMouseClicked(EventHandler<MouseEvent> MousEvent.MOUSE_CLICKED)
//   {}
   
   // methods 
   public ManageButton getManageButton()
   {
      return this.manageButton;
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
            box.getBox().add(new WebPageOpener("berkan" , "https://www.youtube.com/"));
            FileChooser fileChooser = new FileChooser();
            
            box.getBox().add(new WebPageOpener("berkan2" , "https://github.com/buckyroberts/Source-Code-from-Tutorials/blob/master/JavaFX/005_creatingAlertBoxes/AlertBox.java"));
            //box.getBox().add(new AppOpener("berkan" ,fileChooser.showOpenDialog(window) ));
            box.runAll();
            System.out.println("Berkan Reis");
            FileOrLink.display();}
         else if(e.getSource() == manageButton)
         {
            
         }
         
         
         
      }
   }
   
}
