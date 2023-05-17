package view;

import javafx.event.ActionEvent;

public class ThermalPanel
{
  private ViewHandler viewHandler;
  public void init(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
  }

  public void back(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.FRONT_PAGE);
  }

  public void thermalData(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.THERMAL_DATA);
  }

  public void information(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.INFORMATION);
  }

  public void solarPanel(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.SOLAR_PANEL);
  }
}
