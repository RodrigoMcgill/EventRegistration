/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/


import java.sql.Date;
import java.sql.Time;

// line 14 "registration.ump"
// line 40 "registration.ump"
public class Event
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Event Attributes
  private String name;
  private Date eventtime;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Event(String aName, Date aEventtime)
  {
    name = aName;
    eventtime = aEventtime;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setEventtime(Date aEventtime)
  {
    boolean wasSet = false;
    eventtime = aEventtime;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public Date getEventtime()
  {
    return eventtime;
  }

  public void delete()
  {}


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "eventtime" + "=" + (getEventtime() != null ? !getEventtime().equals(this)  ? getEventtime().toString().replaceAll("  ","    ") : "this" : "null")
     + outputString;
  }  
  //------------------------
  // DEVELOPER CODE - PROVIDED AS-IS
  //------------------------
  
  // line 17 registration.ump
 Time starttime;
 Time endtime;
  
}