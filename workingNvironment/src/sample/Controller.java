package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {
    public void press(ActionEvent actionEvent){
        String title = ((Button)(actionEvent.getSource())).getText();
        if(title.equals("Delete")){
            System.out.println("Deleted");
        }else if(title.equals("Deleteall")){
            System.out.println("All buttons deleted");
        }else if(title.equals("Add")){
            System.out.println("Button Added");
        }
    }
}
