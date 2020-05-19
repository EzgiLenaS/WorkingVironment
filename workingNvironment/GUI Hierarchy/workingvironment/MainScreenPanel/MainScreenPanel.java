package MainScreenPanel;

import javafx.scene.Scene;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
import java.util.ArrayList;

public class MainScreenPanel extends HBox implements EventHandler<MouseEvent>
{
   //properties
   ListView<LaunchManageBox> list;
   Stage window;
   public Button button, button2;
   Box box;
   TextField textField;
   Profile p;
//   Scene scene3;
//   ManageScreenPanel layout3;

   
   // constructors
   public MainScreenPanel( Profile pro )
   {      
      super( 20 );
      p = pro;
      button = new Button("Add a new Shortcut");
      button.setPrefSize(85, 145);
      button.setOnMouseClicked(this);
      
      //list of wires
      list = new ListView<LaunchManageBox>();
      
      box = new Box("berkan");
      for(int i= 0; i < p.getBoxes().size(); i++ )
      {
         list.getItems().addAll(new LaunchManageBox(( p.getBoxes().get(i)).getName() , p.getBoxes().get(i) ));
         list.setPrefSize(280 , 170);                  
      }
                 
        this.getChildren().addAll(list,button);
      
   }
   
   public ListView<LaunchManageBox> getList()
   {
      return this.list;
   }
   
   public void handle(MouseEvent e)
   {
      if(e.getSource() == button)
      {          
         list.getItems().addAll(new LaunchManageBox("dsadsa" , new Box("lö")));         
      }
   }
   
   
   
}
