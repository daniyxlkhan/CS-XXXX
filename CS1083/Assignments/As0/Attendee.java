/**
This is class represents a Attendee 
@author Daniyal Khan 3765942
*/
public class Attendee {
    private int daysAttended;
    private int numOfEventsVisited;

    private Event[] events;
    private int eventsAttended; // companion variable

    public Attendee(int daysAttended) {
        events = new Event[5];
        eventsAttended = 0;
        numOfEventsVisited = 0;
        this.daysAttended = daysAttended;
    }

    public void addEvent(Event event) {
        if(eventsAttended >= 5) {
            Event[] moreEvents = new Event[events.length+1];
            System.arraycopy(events, 0, moreEvents, 0, events.length);
            events = moreEvents;
        }
        events[eventsAttended] = event;
        numOfEventsVisited++;
        eventsAttended++;
    }

    /* Fixing method after assignment grading (mine was maintaining the order even though i didnt have to*/

    public boolean removeEvent(Event eventToBeRemoved) {
        boolean removed = false;
        for (int i =0; i < eventsAttended; i++) {
            if (events[i].getID() == eventToBeRemoved.getID()) {
                events[i] = events[eventsAttended-1];
                eventsAttended--;
                removed = true;
            }
        }
        return removed;
    }

    /* public boolean removeEvent(Event eventToBeRemoved) {
        boolean removed = false;
        for (int i = 0; i < eventsAttended; i++) {
            if (events[i].getID() == eventToBeRemoved.getID()) {
                for (int j = i; j < eventsAttended-1; j++) {
                    events[j] = events[j+1];
                }
                events[eventsAttended-1] = null;
                eventsAttended--;
                removed = true;
            }
        }
        return removed;
    }
    */
    public Event[] listOfEvents() {
        return events;
    }

    public double costOfTicket() {
        double cost = 189.99;
        if (eventsAttended > 4) {
            cost = 279.99;
        }
        return cost;
    }

    public String textuallistOfEvents() {
        String allEvents = "";
        for (int i = 0; i < eventsAttended; i++) {
            allEvents += events[i].getID() + "   " + events[i].getArtistName() + "\n";
        }
        return allEvents;
    }
}