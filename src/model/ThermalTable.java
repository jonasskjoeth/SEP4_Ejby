package model;

import java.util.Date;

public class ThermalTable
{
    private int id;
    private Date datestamp;
    private float time;
    private float tempOut;
    private float tempCONTROL;
    private float tempIn;

    public ThermalTable(Date datestamp, float time, float tempOut, float tempCONTROL, float tempIn)
    {
      this(-1, datestamp, time, tempOut, tempCONTROL, tempIn);
    }

    public ThermalTable(int id, Date datestamp, float time, float tempOut, float tempCONTROL, float tempIn)
  {
    this.id = id;
    this.datestamp = datestamp;
    this.time = time;
    this.tempOut = tempOut;
    this.tempCONTROL = tempCONTROL;
    this.tempIn = tempIn;
  }

  public Date getDatestamp() {
    return datestamp;
  }

  public void setDatestamp(Date datestamp) {
    this.datestamp = datestamp;
  }

  public float getTime()
  {
    return time;
  }

  public void setTime(float time)
  {
    this.time = time;
  }

  public float getTempOut()
  {
    return tempOut;
  }

  public void setTempOut(float tempOut)
  {
    this.tempOut = tempOut;
  }

  public float getTempCONTROL()
  {
    return tempCONTROL;
  }

  public void setTempCONTROL(float tempCONTROL)
  {
    this.tempCONTROL = tempCONTROL;
  }

  public float getTempIn()
  {
    return tempIn;
  }

  public void setTempIn(float tempIn)
  {
    this.tempIn = tempIn;
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
