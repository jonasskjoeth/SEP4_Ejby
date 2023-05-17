package view;

import javafx.event.ActionEvent;

public class FrontPage
{
  private ViewHandler viewHandler;
  public void init(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
  }

  public void solarPanel(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.SOLAR_PANEL);
  }

  public void thermalPanel(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.THERMAL_PANEL);
  }

  public void information(ActionEvent e)
  {
    viewHandler.changeScene(ViewHandler.INFORMATION);
  }
}
