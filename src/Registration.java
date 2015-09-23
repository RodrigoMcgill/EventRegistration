/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/



// line 6 "registration.ump"
// line 35 "registration.ump"
public class Registration
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Registration Attributes
  private int id;

  //Registration Associations
  private Participant participant;
  private Event event;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Registration(int aId, Participant aParticipant, Event aEvent)
  {
    id = aId;
    if (!setParticipant(aParticipant))
    {
      throw new RuntimeException("Unable to create Registration due to aParticipant");
    }
    if (!setEvent(aEvent))
    {
      throw new RuntimeException("Unable to create Registration due to aEvent");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(int aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public int getId()
  {
    return id;
  }

  public Participant getParticipant()
  {
    return participant;
  }

  public Event getEvent()
  {
    return event;
  }

  public boolean setParticipant(Participant aNewParticipant)
  {
    boolean wasSet = false;
    if (aNewParticipant != null)
    {
      participant = aNewParticipant;
      wasSet = true;
    }
    return wasSet;
  }

  public boolean setEvent(Event aNewEvent)
  {
    boolean wasSet = false;
    if (aNewEvent != null)
    {
      event = aNewEvent;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    participant = null;
    event = null;
  }


  public String toString()
  {
	  String outputString = "";
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "id" + "=" + (getId() != null ? !getId().equals(this)  ? getId().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "participant = "+(getParticipant()!=null?Integer.toHexString(System.identityHashCode(getParticipant())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "event = "+(getEvent()!=null?Integer.toHexString(System.identityHashCode(getEvent())):"null")
     + outputString;
  }
}