
//package linkpageofabox;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import workingNvironment.backEnd.AppOpener;
import workingNvironment.backEnd.Box;
import workingNvironment.backEnd.WebPageOpener;

/**
 *
 * @author Mert Tereci and Ezgi Lena Sönmez
 */
public class ManageScreenPanel extends HBox 
{
//    ArrayList<Shortcut> 
    TableView<Links> linksTable;
    TableColumn<Links, String> linksColumn;
    TextField nameOfLink;
    TextField urlOfLink;
    TextField nameOfApp;
    
    Box box;
    
    public ManageScreenPanel( Box box ) throws Exception
    {
        super(15);
        
        this.box = box;
        
        //Links name column
        linksColumn = new TableColumn<>("links");
        linksColumn.setMinWidth(300);
        linksColumn.setCellValueFactory( new PropertyValueFactory<>("links") );
    
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
        Button addButton = new Button( "Add" );
        addButton.setOnAction( e -> addButtonClicked() );
        //delete Button
        Button deleteButton = new Button( "Delete" );
        deleteButton.setOnAction( e -> deleteButtonClicked() );

        //Right side of the page
        VBox vBox = new VBox();
        vBox.setPadding( new Insets( 10, 10, 10, 10 ) );
        vBox.setSpacing( 10 );
        vBox.getChildren().addAll( nameOfLink, urlOfLink, nameOfApp, addButton, deleteButton );
        
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
    public void addButtonClicked()
    {
        FileChooser chooser = new FileChooser();
        //File file = chooser.showOpenDialog( ownerWindow );
        WebPageOpener open = new WebPageOpener(nameOfLink.getText(), nameOfLink.getText());

        box.getBox().add( open );

        nameOfLink.clear();
    }
    
    //delete Button Clicked
    public void deleteButtonClicked()
    {
        linksTable.getSelectionModel().setSelectionMode( SelectionMode.MULTIPLE );
        ObservableList<Links> list = linksTable.getSelectionModel().getSelectedItems();
        //System.out.println( "lala" + list.get( 0 ) );
        linksTable.getItems().removeAll( list );
        //System.out.println( "lili" + list.get( 0 ) );
//        ObservableList<Links> linksSelected, allLinks;
//        allLinks = linksTable.getItems();
//        linksSelected = linksTable.getSelectionModel().getSelectedItems();
//        
//        linksSelected.forEach( allLinks::remove );
    }
    
    public void turnToHomePage()
    {
        System.out.println( "test" );
    }

    //get all of the links
    public ObservableList<Links> getLinks()
    {
        ObservableList<Links> links = FXCollections.observableArrayList();
//        for( int i = 0; i < anan.size(); i++ )
//        {
//            box.getBox().get( 0 ).getName();
            //WebPageOpener openneerr = (WebPageOpener)box.getBox().get( i );
            links.add( new Links( "" ) );//Casting?
//        }//(WebPageOpener)(box.getBox().get(i)).getName()
        //box.get(i).getName
        
        links.add( new Links( "netbeans" ) );
        links.add( new Links( "bits and pieces" ) );
        links.add( new Links( "spotify" ) );
        links.add( new Links( "whatsapp" ) );
        links.add( new Links( "moodle" ) );

        return links;
    }
}
