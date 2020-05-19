package linkpageofabox;

import java.io.File;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import workingNvironment.backEnd.AppOpener;
import workingNvironment.backEnd.Box;
import workingNvironment.backEnd.Shortcut;
import workingNvironment.backEnd.WebPageOpener;

/**
 *
 * @author Mert Tereci and Ezgi Lena S?nmez 
 * @version 2.0
 */
public class ManageScreenPanel extends HBox 
{
    ArrayList<Shortcut> array;
    TableView<Shortcut> linksTable;
    TableColumn<Shortcut, String> linksColumn;
    TextField nameOfLink;
    TextField urlOfLink;
    TextField nameOfApp;
    
    Box box;
    
    public ManageScreenPanel( Box box ) throws Exception
    {
        super(15);
        
        box = new Box("asd");//box = box; array = bob.gettBox();
        array = box.getBox();
        //Links name column
        linksColumn = new TableColumn<>("links");
        linksColumn.setMinWidth(300);
        linksColumn.setCellValueFactory( new PropertyValueFactory<>("name") );
    
        //Name input
        nameOfLink = new TextField();
        nameOfLink.setPromptText( "Link Name" );
        nameOfLink.setMinWidth(100);
        //urlOfLink
        urlOfLink = new TextField();
        urlOfLink.setPromptText( "url" );
        urlOfLink.setMinWidth(100);
        //nameOfApp
        nameOfApp = new TextField();
        nameOfApp.setPromptText( "App Name" );
        nameOfApp.setMinWidth(100);
        
        //nameOfBox
        TextField nameOfBox = new TextField();
        nameOfBox.setPromptText( "Box Name" ); 
      
        //Back button
        Button backButton = new Button( "Back" );
        backButton.setOnAction( e -> turnToHomePage() );
        //add Button
        Button addButtonWeb = new Button( "AddWeb" );
        addButtonWeb.setOnAction( e -> addButtonWebClicked() );
        //add Button
        Button addButtonApp = new Button( "AddApp" );
        addButtonApp.setOnAction( e -> addButtonAppClicked() );
        //delete Button
        Button deleteButton = new Button( "Delete" );
        deleteButton.setOnAction( e -> deleteButtonClicked() );

        //Right side of the page
        VBox vBox = new VBox();
        vBox.setPadding( new Insets( 10, 10, 10, 10 ) );
        vBox.setSpacing( 10 );
        vBox.getChildren().addAll( nameOfLink, urlOfLink, addButtonWeb, nameOfApp, addButtonApp, deleteButton );
        
        linksTable = new TableView<>();
        linksTable.setItems( getLinks() );
        linksTable.getColumns().addAll( linksColumn );
        
        HBox hBox = new HBox();
        hBox.getChildren().addAll( backButton, nameOfBox );
        hBox.setPadding( new Insets( 10, 10, 10, 10 ) );
        hBox.setSpacing( 10 );
        
        //The horizontal place of table and buttons
        HBox hBoxOfBottom = new HBox();
        hBoxOfBottom.getChildren().addAll( linksTable, vBox );
        
        //Vbox for adding back button and label
        VBox buttonLabel = new VBox();
        buttonLabel.getChildren().addAll( hBox, hBoxOfBottom );
        
        
        this.getChildren().addAll( buttonLabel  );
    }
    
    //add Button Clicked
    public void addButtonWebClicked()
    {
        WebPageOpener open = new WebPageOpener( nameOfLink.getText(), urlOfLink.getText() );
        array.add( open );
        
        linksTable.setItems( getLinks() );
        
        nameOfLink.clear();
        urlOfLink.clear();
    }
    public void addButtonAppClicked()
    {
//        //FileChooser chooser = new FileChooser();
//        //File file = chooser.showOpenDialog( ownerWindow );
//        //WebPageOpener open = new WebPageOpener(nameOfLink.getText(), urlOfLink.getText());
//        //AppOpener open = new AppOpener( file, file );
//        //array.add( open );
//        nameOfLink.clear();
//        urlOfLink.clear();
//        linksTable.setItems( getLinks() );
//        for( int i = 0; i < array.size(); i++ )
//        {
//            System.out.println( array.get( i ) );
//            System.out.println( "control" );
//        }
    }
    
    //delete Button Clicked
    public void deleteButtonClicked()
    {
//        linksTable.getSelectionModel().setSelectionMode( SelectionMode.MULTIPLE );
//        ObservableList<Shortcut> list = linksTable.getSelectionModel().getSelectedItems();
//        //System.out.println( "lala" + list.get( 0 ) );
//        linksTable.getItems().removeAll( list );
//        array.remove(list);
//        //System.out.println( "lili" + list.get( 0 ) );
////        ObservableList<Links> linksSelected, allLinks;
////        allLinks = linksTable.getItems();
////        linksSelected = linksTable.getSelectionModel().getSelectedItems();
////        
////        linksSelected.forEach( allLinks::remove );
    }
    
    public void turnToHomePage()
    {
        System.out.println( "test" );
    }

    //get all of the links
    public ObservableList<Shortcut> getLinks()
    {
        ObservableList<Shortcut> links = FXCollections.observableArrayList();
        for( int i = 0; i < array.size(); i++ )
        {
            links.add( array.get( i ) );//Casting?
        }
        return links;
    }
}