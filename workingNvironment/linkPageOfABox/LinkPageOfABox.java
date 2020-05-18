/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkpageofabox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import workingNvironment.backEnd.Box;
//import workingNvironment.backEnd.Box;

/**objects to observable list to javafx table
 *
 * @author EZGİ LENA SÖNMEZ
 */
public class LinkPageOfABox extends Application
{
    //is window necessary?
    Stage window;
    ManageScreenPanel panel;
    Box box;
    
    @Override         //Stage primaryStage
    public void start( Stage primaryStage ) throws Exception
    {
        window = primaryStage;
        window.setTitle( "WorkingVironment" );
        panel = new ManageScreenPanel(box);
        
        Scene scene = new Scene( panel );
        
        window.setScene( scene );
        window.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main( String[] args )
    {
        launch( args );
    }
   
}
