import javafx.application.Application;
import javafx.stage.Stage;
import view.DatabaseConnector;
import view.ViewHandler;

public class Main extends Application
{
  private ViewHandler viewHandler;
  private DatabaseConnector connection;

  @Override public void start(Stage primaryStage)
  {
    connection = new DatabaseConnector();
    connection.connect("kandula.db.elephantsql.com", 5432, "ectwvevf", "AnbDAZ4iNpY4toS8S4Cg27JwPN-pk2LW"); //ElephantSQL (online) database connection

    viewHandler = new ViewHandler(primaryStage, connection);
  }

  public static void main(String[] args)
  {
    Application.launch(Main.class);
  }
}
