/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0.5146 modeling language!*/


import java.util.*; 
import java.sql.Date;

// line 21 "registration.ump"
// line 45 "registration.ump"
public class RegistrationManager
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //RegistrationManager Associations
  private List<Event> event;
  private List<Registration> registration;
  private List<Participant> participant;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RegistrationManager()
  {
    event = new ArrayList<Event>();
    registration = new ArrayList<Registration>();
    participant = new ArrayList<Participant>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public Event getEvent(int index)
  {
    Event aEvent = event.get(index);
    return aEvent;
  }

  public List<Event> getEvent()
  {
    List<Event> newEvent = Collections.unmodifiableList(event);
    return newEvent;
  }

  public int numberOfEvent()
  {
    int number = event.size();
    return number;
  }

  public boolean hasEvent()
  {
    boolean has = event.size() > 0;
    return has;
  }

  public int indexOfEvent(Event aEvent)
  {
    int index = event.indexOf(aEvent);
    return index;
  }

  public Registration getRegistration(int index)
  {
    Registration aRegistration = registration.get(index);
    return aRegistration;
  }

  public List<Registration> getRegistration()
  {
    List<Registration> newRegistration = Collections.unmodifiableList(registration);
    return newRegistration;
  }

  public int numberOfRegistration()
  {
    int number = registration.size();
    return number;
  }

  public boolean hasRegistration()
  {
    boolean has = registration.size() > 0;
    return has;
  }

  public int indexOfRegistration(Registration aRegistration)
  {
    int index = registration.indexOf(aRegistration);
    return index;
  }

  public Participant getParticipant(int index)
  {
    Participant aParticipant = participant.get(index);
    return aParticipant;
  }

  public List<Participant> getParticipant()
  {
    List<Participant> newParticipant = Collections.unmodifiableList(participant);
    return newParticipant;
  }

  public int numberOfParticipant()
  {
    int number = participant.size();
    return number;
  }

  public boolean hasParticipant()
  {
    boolean has = participant.size() > 0;
    return has;
  }

  public int indexOfParticipant(Participant aParticipant)
  {
    int index = participant.indexOf(aParticipant);
    return index;
  }

  public static int minimumNumberOfEvent()
  {
    return 0;
  }

  public boolean addEvent(Event aEvent)
  {
    boolean wasAdded = false;
    if (event.contains(aEvent)) { return false; }
    event.add(aEvent);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEvent(Event aEvent)
  {
    boolean wasRemoved = false;
    if (event.contains(aEvent))
    {
      event.remove(aEvent);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addEventAt(Event aEvent, int index)
  {  
    boolean wasAdded = false;
    if(addEvent(aEvent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEvent()) { index = numberOfEvent() - 1; }
      event.remove(aEvent);
      event.add(index, aEvent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEventAt(Event aEvent, int index)
  {
    boolean wasAdded = false;
    if(event.contains(aEvent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEvent()) { index = numberOfEvent() - 1; }
      event.remove(aEvent);
      event.add(index, aEvent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEventAt(aEvent, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfRegistration()
  {
    return 0;
  }

  public boolean addRegistration(Registration aRegistration)
  {
    boolean wasAdded = false;
    if (registration.contains(aRegistration)) { return false; }
    registration.add(aRegistration);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeRegistration(Registration aRegistration)
  {
    boolean wasRemoved = false;
    if (registration.contains(aRegistration))
    {
      registration.remove(aRegistration);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addRegistrationAt(Registration aRegistration, int index)
  {  
    boolean wasAdded = false;
    if(addRegistration(aRegistration))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRegistration()) { index = numberOfRegistration() - 1; }
      registration.remove(aRegistration);
      registration.add(index, aRegistration);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRegistrationAt(Registration aRegistration, int index)
  {
    boolean wasAdded = false;
    if(registration.contains(aRegistration))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRegistration()) { index = numberOfRegistration() - 1; }
      registration.remove(aRegistration);
      registration.add(index, aRegistration);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRegistrationAt(aRegistration, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfParticipant()
  {
    return 0;
  }

  public boolean addParticipant(Participant aParticipant)
  {
    boolean wasAdded = false;
    if (participant.contains(aParticipant)) { return false; }
    participant.add(aParticipant);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeParticipant(Participant aParticipant)
  {
    boolean wasRemoved = false;
    if (participant.contains(aParticipant))
    {
      participant.remove(aParticipant);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addParticipantAt(Participant aParticipant, int index)
  {  
    boolean wasAdded = false;
    if(addParticipant(aParticipant))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParticipant()) { index = numberOfParticipant() - 1; }
      participant.remove(aParticipant);
      participant.add(index, aParticipant);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveParticipantAt(Participant aParticipant, int index)
  {
    boolean wasAdded = false;
    if(participant.contains(aParticipant))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParticipant()) { index = numberOfParticipant() - 1; }
      participant.remove(aParticipant);
      participant.add(index, aParticipant);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addParticipantAt(aParticipant, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    event.clear();
    registration.clear();
    participant.clear();
  }

}