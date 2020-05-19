/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainScreen;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author EZG� LENA S�NMEZ
 */
public class ManageScreenPanel extends HBox 
{
    TableView<Links> linksTable;
    TableColumn<Links, String> linksColumn;
    TextField nameOfLink;
    
    public ManageScreenPanel() throws Exception
    {
        super(15);
        //Parent root = FXMLLoader.load( getClass().getResource( "BackButton.fxml" ) );
        //Links name column
        linksColumn = new TableColumn<>("links");
        linksColumn.setMinWidth(300);
        linksColumn.setCellValueFactory( new PropertyValueFactory<>("name") );
    
        //Name input
        nameOfLink = new TextField();
        nameOfLink.setPromptText( "name" );
        nameOfLink.setMinWidth(100);
        
        //Label
        //Label label = new Label();
        //Back button
        //Button backButton = new Button( "Back" );
        //backButton.setOnAction( e -> addButtonClicked() );
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
        vBox.getChildren().addAll( nameOfLink, addButton, deleteButton );
        
        linksTable = new TableView<>();
        linksTable.setItems( getLinks() );
        linksTable.getColumns().addAll( linksColumn );
        
        //The horizontal place of table and buttons
        //HBox hBox = new HBox();
        this.getChildren().addAll( linksTable, vBox );
        
        //Vbox for adding back button and label
        //VBox buttonLabel = new VBox();
        //buttonLabel.getChildren().addAll( root, hBox );
        
        
        //this.getChildren().addAll( hBox  );
    }
    
    //add Button Clicked
    public void addButtonClicked()
    {
        Links link = new Links( nameOfLink.getText() );
        //link.setName( nameOfLink.getText() );
        linksTable.getItems().add(link);
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

    //get all of the links
    public ObservableList<Links> getLinks()
    {
        ObservableList<Links> links = FXCollections.observableArrayList();
        
        //box.get(i).getName
        links.add( new Links( "Moodle" ) );
        links.add( new Links( "netbeans" ) );
        links.add( new Links( "bits and pieces" ) );
        links.add( new Links( "spotify" ) );
        links.add( new Links( "whatsapp" ) );
        links.add( new Links( "whatsapp" ) );

        return links;
    }
}