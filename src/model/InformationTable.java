package model;

import java.util.Date;

public class InformationTable
{
  private int id;
  private String manufacturer;
  private int placementRow;
  private int placementColumn;
  private Date installDate;
  private String contactInfoEmail;
  private int contactInfoPhone;

  public InformationTable(String manufacturer, int placementRow, int placementColumn,
      Date installDate, String contactInfoEmail, int contactInfoPhone)
  {
    this(-1, manufacturer, placementRow, placementColumn, installDate, contactInfoEmail, contactInfoPhone);
  }

  public InformationTable(int id, String manufacturer, int placementRow, int placementColumn,
      Date installDate, String contactInfoEmail, int contactInfoPhone)
  {
    this.manufacturer = manufacturer;
    this.placementRow = placementRow;
    this.placementColumn = placementColumn;
    this.installDate = installDate;
    this.contactInfoEmail = contactInfoEmail;
    this.contactInfoPhone = contactInfoPhone;
  }

  public String getManufacturer()
  {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer)
  {
    this.manufacturer = manufacturer;
  }

  public int getPlacementRow()
  {
    return placementRow;
  }

  public void setPlacementRow(int placementRow)
  {
    this.placementRow = placementRow;
  }

  public int getPlacementColumn()
  {
    return placementColumn;
  }

  public void setPlacementColumn(int placementColumn)
  {
    this.placementColumn = placementColumn;
  }

  public Date getInstallDate()
  {
    return installDate;
  }

  public void setInstallDate(Date installDate)
  {
    this.installDate = installDate;
  }

  public String getContactInfoEmail()
  {
    return contactInfoEmail;
  }

  public void setContactInfoEmail(String contactInfoEmail)
  {
    this.contactInfoEmail = contactInfoEmail;
  }

  public int getContactInfoPhone()
  {
    return contactInfoPhone;
  }

  public void setContactInfoPhone(int contactInfoPhone)
  {
    this.contactInfoPhone = contactInfoPhone;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }
}
