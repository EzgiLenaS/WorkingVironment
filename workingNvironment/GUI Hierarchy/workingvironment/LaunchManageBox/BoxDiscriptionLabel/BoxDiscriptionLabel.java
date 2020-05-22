package LaunchManageBox.BoxDiscriptionLabel;
import javafx.scene.control.Label;
   

public class BoxDiscriptionLabel extends Label
{
   //properties
   private String discription;
   //constructor
   public BoxDiscriptionLabel(String discription)
   {
      super(discription);
      this.discription = discription;
      this.setPrefSize(100,50);
   }
}