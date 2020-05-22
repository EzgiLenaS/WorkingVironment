package ManageScreenPanel;

import java.io.File;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import backEnd.*;
import MainScreen.*;

/**This class will show the Link Page to users. 
 * In this page they can add their websites and put a name for each
 * also they can add applications from their computers
 *
 * @author Mert Tereci & Ezgi Lena Sönmez 
 * @version 3.0
 */
public class ManageScreenPanel extends HBox 
{
    //properties
    ArrayList<Shortcut> array;//gets the box.getBox => arraylist<shortcut> objects
    TableView<Shortcut> linksTable;// this is the table which has column(s)
    TableColumn<Shortcut, String> linksColumn;// this provides to show the websites and app's names in the table for user
    TextField nameOfLink;// user enters the name of the website link
    TextField urlOfLink;// user enters the url of the website
    TextField nameOfApp;//user enters the name of the app
    TextField nameOfBox;// user can change the name of the created box
    
    Box box;// is a property for calling the arraylist<shortcut>
    
    public ManageScreenPanel( Box box ) throws Exception
    {
        super(15);
        
        this.box = box;
        array = box.getBox();
        
        //Links name column
        linksColumn = new TableColumn<>("links");//name of column
        linksColumn.setMinWidth(300);
        linksColumn.setCellValueFactory( new PropertyValueFactory<>("name") );//this takes the getName for websites and apps
    
        //Name input
        nameOfLink = new TextField();
        nameOfLink.setPromptText( "Link Name" );//back word to show where is for entering the name of the link
        nameOfLink.setMinWidth(100);
        
        //urlOfLink
        urlOfLink = new TextField();
        urlOfLink.setPromptText( "url" );//back word to show where is for entering the url of the link
        urlOfLink.setMinWidth(100);
        
        //nameOfApp
        nameOfApp = new TextField();
        nameOfApp.setPromptText( "App Name" );//back word to show where is for entering the name of the app 
        nameOfApp.setMinWidth(100);
        
        //nameOfBox
        nameOfBox = new TextField();
        nameOfBox.setPromptText( box.getName() ); 
        nameOfBox.setOnAction( e -> changingName() );
      
        //Back button and its method
        Button backButton = new Button( "Back" );
        backButton.setOnAction( e -> turnToHomePage() );//calls the turnToHomePage method
        
        //add Button and its method
        Button addButtonWeb = new Button( "AddWeb" );
        addButtonWeb.setOnAction( e -> addButtonWebClicked() );//calls the addButtonWebClicked method
        
        //add Button and its method
        Button addButtonApp = new Button( "AddApp" );
        addButtonApp.setOnAction( e -> addButtonAppClicked() );//calls the addButtonAppClicked method
        
        //delete Button and its method
        Button deleteButton = new Button( "Delete" );
        deleteButton.setOnAction( e -> deleteButtonClicked() );//calls the deleteButtonClicked method

        //Right side of the page
        VBox rightSide = new VBox();
        rightSide.setPadding( new Insets( 10, 10, 10, 10 ) );
        rightSide.setSpacing( 10 );
        rightSide.getChildren().addAll( nameOfLink, urlOfLink, addButtonWeb, nameOfApp, addButtonApp, deleteButton );
        
        //initializing the table view and add the column in it and adding the links in to the column
        linksTable = new TableView<>();
        linksTable.setItems( getLinks() );// takes the links to show on table in gui
        linksTable.getColumns().addAll( linksColumn );// to show in column on the table in the gui (:
        
        //top part of the gui 
        HBox hBoxOfTop = new HBox(); //top of the gui which has back button and textfield for changing 
        hBoxOfTop.getChildren().addAll( backButton, nameOfBox );
        hBoxOfTop.setPadding( new Insets( 10, 10, 10, 10 ) );
        hBoxOfTop.setSpacing( 10 );
        
        //The horizontal place of table and buttons
        HBox hBoxOfBottom = new HBox();
        hBoxOfBottom.getChildren().addAll( linksTable, rightSide );
        
        //Vbox for adding back button, name of box, table, and buttons
        VBox allLinkPage = new VBox();
        allLinkPage.getChildren().addAll( hBoxOfTop, hBoxOfBottom );
        
        
        this.getChildren().addAll( allLinkPage );
    }
    
    //add Button Clicked for web
    /**
     * This method provides to user to add the website url with its name 
     */
    public void addButtonWebClicked()
    {
        //variables
        WebPageOpener open = new WebPageOpener( nameOfLink.getText(), urlOfLink.getText() );
        //adds the webPageOpener object in to the array
        array.add( open );
        //with this, we can update the table view
        linksTable.setItems( getLinks() );
        //these clean the field when the user finish her/his job
        nameOfLink.clear();
        urlOfLink.clear();
    }
    
    /**
     * This method provides entering the name of the computer app to the tableview
     * and also when they click this method their documents will open and they can select 
     * what they want 
     */
    public void addButtonAppClicked()
    {
        FileChooser fileChooser = new FileChooser();  
        File file = fileChooser.showOpenDialog( MainScreen.getWindow() );

        AppOpener open = new AppOpener( nameOfApp.getText(), file );
        array.add( open );
        nameOfApp.clear();
        linksTable.setItems( getLinks() );
    }
    
    //delete Button Clicked
    /**
     * this method provides user to delete the links both from array 
     * and also remove from tableview
     * If they keep presses the ctr(control) button they can do multiple selection
     * and after they select what they want 
     * when they clicked this button the object will be removed
     */
    public void deleteButtonClicked()
    {
        linksTable.getSelectionModel().setSelectionMode( SelectionMode.MULTIPLE );
        ObservableList<Shortcut> list = linksTable.getSelectionModel().getSelectedItems();
        array.removeAll(list);
        linksTable.getItems().removeAll( list );
    }
    
    /**
     * With this method user can change their boxes ,which keep the whole links in it, name.
     * the name is taken from the textfield nameOfBox
     */
    public void changingName()
    {
        nameOfBox.setPromptText( nameOfBox.getText() );
        nameOfBox.setText(nameOfBox.getText());
        box.setName( nameOfBox.getText() );
    }
    
    /**
     * with this method and after clicking the "back button" user can see the main screen panel
     */
    public void turnToHomePage()
    {
        MainScreen.getWindow().setScene( MainScreen.getScene() );
    }

    //get all of the links
    /**
     * Thanks to this method, we can thake the entered old links from Box class
     * because we equalize array( arrayList ) with Box box 
     * and here we fill the Observablelist links with this array
     * after filling the links list with links 
     * we return the links list to use it in the table view 
     * with this method: linksTable.setItems( getLinks() );
     * @return links list to use it for showing the names of the links in the gui
     */
    public ObservableList<Shortcut> getLinks()
    {
        ObservableList<Shortcut> links = FXCollections.observableArrayList();
        for( int i = 0; i < array.size(); i++ )
        {
            links.add( array.get( i ) );
        }
        return links;
    }
}