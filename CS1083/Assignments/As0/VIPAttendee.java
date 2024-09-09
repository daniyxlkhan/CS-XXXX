/**
This is class represents a VIP attendee which is a subclass of Attendee
@author Daniyal Khan 3765942
*/
public class VIPAttendee extends Attendee {
    private boolean group;
    private final double DEFAULTFEE;
    public VIPAttendee(boolean group) {
        super(4); // VIPAttendee attend all 4 days
        this.group = group;
        DEFAULTFEE = 209.99;
    }

    public boolean attendingWithGroup() {
        return group;
    }

    public void updateGroup() {
        group = !group;
    }

    public double costOfTicket() {
        double cost = DEFAULTFEE;
        Event events[] = super.listOfEvents();
        String[] artists = new String[events.length];
        int uniqueArtistCount = 0;
        
        for (int i = 0; i < events.length; i++) {
            artists[i] = events[i].getArtistName();
        }

        for (int j = 0; j < artists.length-1; j++) {
            if (artists[j] != artists[j+1]) {
                uniqueArtistCount++;
            }
        }

        if(uniqueArtistCount >= 1) { // if attendee is attending different artist events
            cost = super.costOfTicket();
        }

        return cost;
    }
}