package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.InformationTable;

import java.util.Date;

public class Information
{
  @FXML private TableView<InformationTable> informationTableView;
  @FXML private TableColumn<Information, String> manufacture;
  @FXML private TableColumn<Information, Integer> placementRow;
  @FXML private TableColumn<Information, Integer> placementColumn;
  @FXML private TableColumn<Information, Date> installDate;
  @FXML private TableColumn<Information, String> contactInfoEmail;
  @FXML private TableColumn<Information, Integer> contactInfoPhone;

  private ViewHandler viewHandler;

  public void init(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
  }

  public void add(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.ADD);
  }

  public void edit(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.EDIT);
  }

  public void delete(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.DELETE);
  }

  public void  information(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.FRONT_PAGE);
  }

  public void solarPanel(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.SOLAR_PANEL);
  }

  public void thermalPanel(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.THERMAL_PANEL);
  }

  public void updateView() {
    //		System.out.println("view.AverageSpeedsController Update View called");
    manufacture.setCellValueFactory(new PropertyValueFactory<>("manufacture"));
    placementRow.setCellValueFactory(new PropertyValueFactory<>("placementRow"));
    placementColumn.setCellValueFactory(new PropertyValueFactory<>("placementColumn"));
    installDate.setCellValueFactory(new PropertyValueFactory<>("installDate"));
    contactInfoEmail.setCellValueFactory(new PropertyValueFactory<>("contactInfoEmail"));
    contactInfoPhone.setCellValueFactory(new PropertyValueFactory<>("contactInfoPhone"));

    informationTableView.setItems(viewHandler.getConnection().retrieveInformationTable());
  }
}

