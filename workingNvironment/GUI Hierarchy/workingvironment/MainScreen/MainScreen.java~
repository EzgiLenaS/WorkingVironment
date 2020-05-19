package MainScreen;

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


public class MainScreen extends     Application 
   implements  EventHandler<MouseEvent>
{
   //properties
   ListView<LaunchManageBox > list;
   Stage window;
   Scene scene;
   Scene scene2;
   Button button, button2;
   Box box;
   TextField textField;
   Profile p;
   
   @Override
   public void start(Stage primaryStage) throws Exception
   {
      window = primaryStage;
      p = new Profile();
      MainScreenPanel layout = new MainScreenPanel( p );
      StackPane layout2 = new StackPane();
//      button = new Button("berkan");
//      button.setPrefSize(85, 45);
      button2 = new Button("berkan2");
//      button.setPrefSize(85, 45);
//      button.setOnMouseClicked(this);
      button2.setOnMouseClicked(this);
//      
//      //list of wires
//      list = new ListView<LaunchManageBox>();
////      list.setEditable(true);
////      list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
////      System.out.println(list.getSelectionModel().getSelectedIndices());
////      

//      FileChooser fileChooser = new FileChooser();
//      box = new Box("berkan");
//      box.getBox().add(new AppOpener("berkan" ,fileChooser.showOpenDialog(window)));
//      for(int i= 0; i < 3; i++)
//      {
//         list.getItems().addAll(new LaunchManageBox("Berkan" , box  ));
//         list.setPrefSize(280 , 170);
//         
//         
//      }
      
      //list.getItems().addAll(new LaunchManageBox("Berkan" , Box("Berkan")));
      //list.getItems().get(0).box.getBox().add(new AppOpener("Berkan" ,fileChooser.showOpenDialog(window) ));
      
//      layout.getChildren().addAll(list,button);
      layout2.getChildren().add(button2);
      scene = new Scene(layout,480,270);
      scene2 = new Scene(layout2 ,500,300);
      
      
      window.setScene(scene); 
      window.setTitle("WorkingVirement");
      window.getIcons().add(new Image("/icons/output-onlinejpgtools.png"));
      
      window.show();
      
   }
   public void handle(MouseEvent e)
   {
      if(e.getSource() == button){          
         //window.setScene(scene2);
         list.getItems().addAll(new LaunchManageBox("eskik" , new Box("lö")));
         window.setScene(scene2/*lenaScreen*/);
         
      }
      if(e.getSource() == button2)
         window.setScene(scene);
      //if(e.getSource() == berkan)
      
   }
   
   public static void main(String[] args)
   { launch(args);  }
}