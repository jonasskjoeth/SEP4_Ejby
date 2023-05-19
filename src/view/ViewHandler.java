package view;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class ViewHandler
{
  private Stage primaryStage;

  private Scene frontPage;
  private Scene solarPanelScene;
  private Scene thermalPanelScene;
  private Scene solarDataScene;
  private Scene thermalDataScene;
  private Scene informationScene;
  private Scene addScene;
  private FrontPage frontPageController;
  private SolarPanel solarPanelController;
  private ThermalPanel thermalPanelController;
  private SolarData solarDataController;
  private ThermalData thermalDataController;
  private Information informationController;
  private addController addController;

  public static final String FRONT_PAGE = "FRONT_PAGE";
  public static final String SOLAR_PANEL = "SOLAR_PANEL";
  public static final String THERMAL_PANEL = "THERMAL_PANEL";
  public static final String SOLAR_DATA = "SOLAR_DATA";
  public static final String THERMAL_DATA = "THERMAL_DATA";
  public static final String INFORMATION = "INFORMATION";
  public static final String ADD = "ADD";
  public static final String EDIT = "EDIT";
  public static final String DELETE = "DELETE";

  private DatabaseConnector connector;

  public ViewHandler(Stage primaryStage, DatabaseConnector connector)
  {
    this.primaryStage = primaryStage;
    this.connector = connector;

    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("frontPage.fxml"));
    try
    {
      frontPage = new Scene(loader.load());
      frontPageController = loader.getController();
      frontPageController.init(this);
    }
    catch (IOException e)
    {
      System.out.println("Failed to load front-page.fxml");
      System.exit(1);
    }

    loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("solarPanel.fxml"));
    try
    {
      solarPanelScene = new Scene(loader.load());
      solarPanelController = loader.getController();
      solarPanelController.init(this);
    }
    catch (IOException e)
    {
      System.out.println("Failed to load solarpanel.fxml");
      System.exit(1);
    }

    loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("ThermalPanel.fxml"));
    try
    {
      thermalPanelScene = new Scene(loader.load());
      thermalPanelController = loader.getController();
      thermalPanelController.init(this);
    }
    catch (IOException e)
    {
      System.out.println("Failed to load thermalPanel.fxml");
      System.exit(1);
    }

    loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("informationPage.fxml"));
    try
    {
      informationScene = new Scene(loader.load());
      informationController = loader.getController();
      informationController.init(this);
    }
    catch (IOException e)
    {
      System.out.println("Failed to load informationPage.fxml");
      System.exit(1);
    }

//    loader = new FXMLLoader();
//    loader.setLocation(getClass().getResource("addScene.fxml"));
//    try
//    {
//      addScene = new Scene(loader.load());
//      addController = loader.getController();
//      addController.init(this);
//    }
//    catch (IOException e)
//    {
//      System.out.println("Failed to load addScene.fxml");
//      System.exit(1);
//    }

//    loader = new FXMLLoader();
//    loader.setLocation(getClass().getResource("SolarData.fxml"));
//    try
//    {
//      solarDataScene = new Scene(loader.load());
//      solarPanelController = loader.getController();
//      solarPanelController.init(this);
//    }
//    catch (IOException e)
//    {
//      System.out.println("Failed to load SolarData.fxml");
//      System.exit(1);
//    }
//
//    loader = new FXMLLoader();
//    loader.setLocation(getClass().getResource("ThermalData.fxml"));
//    try
//    {
//      thermalDataScene = new Scene(loader.load());
//      thermalDataController = loader.getController();
//      thermalDataController.init(this);
//    }
//    catch (IOException e)
//    {
//      System.out.println("Failed to load ThermalData.fxml");
//      System.exit(1);
//    }

    changeScene(FRONT_PAGE);
  }

  public void changeScene(String sceneName)
  {
    if (FRONT_PAGE.equals(sceneName))
    {
      primaryStage.setTitle("Front Page");
      primaryStage.setScene(frontPage);
      primaryStage.show();
    }
    else if (SOLAR_PANEL.equals(sceneName))
    {
      primaryStage.setTitle("Solar Panel");
      primaryStage.setScene(solarPanelScene);
      primaryStage.show();
     // solarPanelController.updateView();
    }
    else if (THERMAL_PANEL.equals(sceneName))
    {
      primaryStage.setTitle("Thermal Panel");
      primaryStage.setScene(thermalPanelScene);
      primaryStage.show();
      //thermalPanelController.updateView();
    }
    else if (INFORMATION.equals(sceneName))
    {
      primaryStage.setTitle("Information");
      primaryStage.setScene(informationScene);
      primaryStage.show();
      //thermalPanelController.updateView();
    }
//    else if (ADD.equals(sceneName))
//    {
//      primaryStage.setTitle("Add");
//      primaryStage.setScene(addScene);
//      primaryStage.show();
//      addController.updateView();
//    }
  }

  public DatabaseConnector getConnection()
  {
    return connector;
  }
}
