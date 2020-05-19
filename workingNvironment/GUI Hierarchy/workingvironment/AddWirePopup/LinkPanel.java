import javafx.scene.layout.VBox;
import javafx.scene.control.*;
import backEnd.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
public class LinkPanel extends Stage
{
   //properties
   Label addLink;   
   TextField linkField;
   Label addFile;
   Button addFileButton;
   String link;
   String nameOfLink;
   Box box;
   
   
   //constructors
   public static void displayAdd(Box newBox)
   {
     // super();
      box = newBox;
      
      //pane
      VBox layout = new VBox(15);

      this.initModality(Modality.APPLICATION_MODAL);
      this.setTitle("Add File/App or Link");
      this.setMinWidth(250);
      FileChooser fileChooser = new FileChooser();
      
      //link part
      addLink= new Label("Enter the URL");
      linkField = new TextField("URL");
      linkField.setOnAction(e -> {link = linkField.getText();
         box.getBox().add(new WebPageOpener("" , link));});
      
      //app part
      addFile = new Label("Choose File");
      addFileButton = new Button("To Choose App/File");
      addFileButton.setOnAction(e -> fileChooser.showOpenDialog(this));
      
      
      layout.getChildren().addAll(addLink , linkField , addFile , addFileButton );
      
        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        this.setScene(scene);
        this.showAndWait();
   }
   
   //methods
   public static void main(String[] args)
   {
      new LinkPanel(new Box(""));
   }
   
   
   
}