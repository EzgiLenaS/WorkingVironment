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
import javafx.geometry.Insets;
import popup.ConfirmBox;
import java.util.Arrays;

/*
 * @author Osman Semih Tiryaki
 * @version 1.0
 */ 
public class MainScreenPanel extends HBox implements EventHandler<MouseEvent>
{
   //properties
   private ListView<LaunchManageBox> list;
   private Stage window;
   private Button button, deleteButton;
   private Box box;
   private Profile p;
   
   // constructors
   public MainScreenPanel( Profile pro )
   {      
      super( 20 );
      // Getting profile as a parameter
      p = pro;
      
      // Add Button
      button = new Button("Add Box");
      button.setPrefSize(95, 95);
      
      // Delete Button
      deleteButton = new Button("Delete");
      deleteButton.setPrefSize(95, 95);
      
      // Right Side of Scene
      VBox vBox = new VBox(25);
      vBox.setPadding(new Insets(20, 12, 15, 12));
      
      // Adding Buttons to the VBox
      button.setOnMouseClicked(this);
      deleteButton.setOnMouseClicked(this);
      vBox.getChildren().addAll(button, deleteButton);
           
      //list of wires
      list = new ListView<LaunchManageBox>();
      list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
      list.setPrefSize(300,400);
      
      for(int i= 0; i < p.getBoxes().size(); i++ )
      {
         list.getItems().addAll(new LaunchManageBox(( p.getBoxes().get(i)).getName() , p.getBoxes().get(i) ));
         list.setPrefSize(280 , 170);                  
      }
      
      // Adding ListView and VBox to the Scene
      this.getChildren().addAll(list,vBox);      
   }
   
   // Action Listener Method
   public void handle(MouseEvent e)
   {
      if (e.getSource() == button) // if add button clicked
      {
         Box box = new Box( "newbx");
         list.getItems().addAll(new LaunchManageBox("New Box"+ (list.getItems().size() + 1) , box));
         p.getBoxes().add( box );
      }
      
      if ((e.getSource() == deleteButton) &&(ConfirmBox.display("Warning" , "Are you sure?"))) // if delete button clicked
      {
         list.getItems().removeAll(list.getSelectionModel().getSelectedItems());
         ArrayList<Box> boxList;
         boxList = new ArrayList<Box>();         
         for ( int i = 0; i < list.getItems().size(); i++ )
         {
            boxList.add( list.getItems().get(i).getBox());
         }
         p.setBoxes( boxList );
         
      }
   }
   
   
   
}
