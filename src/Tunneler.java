import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Tunneler extends Application {

//Can use this method OR can use Gluon Scene Builder (probably a better method). Once you have built the GUI
    //in Gluon, then you need to make 2 new directories in the src directory. One is java and the other is resources.
    //Then, move all classes into the java directory. Then you can save the Gluon file into the resources directory.
    @Override
    public void start(Stage window) throws Exception {
        window.setWidth(400.0);
        window.setHeight(300.0);

        //This is necessary when you are loading the GUI from a fxml file.
        //Parent root = FXMLLoader.load(getClass().getResource("tunneler.fxml"));

        BorderPane bp = new BorderPane();
        window.setScene(new Scene(bp));

        //This is what you need to use when you are using a fxml file.
        //window.setScene(new Scene(root));

        window.show();
    }
}

// To have a component be tied to an action, you need to make a class and Call it controller(or whatever). Then you will go back
//to the Gluon window. Tie the component to the controller class on the left. and then also on the right, add the component name and then create the method with that name and
//give it some sort of action.