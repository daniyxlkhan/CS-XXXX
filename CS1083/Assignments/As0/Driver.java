/**
This is a driver class for Attendee and VIPAttendee
@author Daniyal Khan 3765942
*/
public class Driver {
    public static void main(String[] args) {
        // ALL EVENTS
        Event event1 = new Event("Billy Currington");
        Event event2 = new Event("Luke Bryan");
        Event event3 = new Event("High Valley");
        Event event4 = new Event("Connor Price");
        Event event5 = new Event("Timberlake");
        Event event6 = new Event("Marianas Trench");
        Event event7 = new Event("Tim McGraw");
        Event event8 = new Event("Deric Ruttan");
        Event event9 = new Event("Billy Currington");
        Event event10 = new Event("High Valley");
        Attendee attendee1 = new Attendee(2);
        Attendee attendee2 = new Attendee(3);
        VIPAttendee VIPattendee1 = new VIPAttendee(false);
        VIPAttendee VIPattendee2 = new VIPAttendee(true);

        // TEST CASE 1
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Test Case 1");
        System.out.println("");
        attendee1.addEvent(event1); // adding events
        attendee1.addEvent(event5);
        attendee1.addEvent(event4);
        attendee1.addEvent(event3);
        attendee1.addEvent(event2);
        attendee1.addEvent(event7);
        attendee1.addEvent(event6); // adding move than 5 events sequentially causing creation of a new array

        attendee1.removeEvent(event7);  // removing an event
        attendee1.removeEvent(event8); // removing an event that does not exist
        System.out.println(attendee1.textuallistOfEvents());
        System.out.println("Total Price: " + attendee1.costOfTicket());

        // TEST CASE 2
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Test Case 2");
        System.out.println("");
        attendee2.addEvent(event1); // Events added and dropped, where the current number of events attended
        attendee2.addEvent(event5); // never exceeds 5, but the total added + dropped exceeds 5.
        attendee2.addEvent(event4);
        attendee2.addEvent(event3);
        attendee2.addEvent(event2);

        attendee2.removeEvent(event5);
        attendee2.addEvent(event7);
        attendee2.removeEvent(event2);
        attendee2.addEvent(event6);
        attendee2.removeEvent(event1);

        System.out.println(attendee2.textuallistOfEvents()); 
        System.out.println("Total Price: " + attendee2.costOfTicket());

        // TEST CASE 3
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Test Case 3");
        System.out.println("");
        VIPattendee1.addEvent(event9); 
        VIPattendee1.addEvent(event1);
        VIPattendee1.addEvent(event9);
        VIPattendee1.addEvent(event1);
        VIPattendee1.addEvent(event9);

        System.out.println(VIPattendee1.textuallistOfEvents()); // VIP Attendee attending same artist events
        System.out.println("Joining with group? " + VIPattendee2.attendingWithGroup());
        System.out.println("Total Price: " + VIPattendee1.costOfTicket());

        // TEST CASE 4
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Test Case 4");
        System.out.println("");
        VIPattendee2.addEvent(event8);
        VIPattendee2.addEvent(event2);
        VIPattendee2.addEvent(event8);
        VIPattendee2.addEvent(event5);
        VIPattendee2.addEvent(event4);
        
        System.out.println(VIPattendee2.textuallistOfEvents()); // VIP Attendee attending different artist events
        System.out.println("Joining with group? " + VIPattendee2.attendingWithGroup());
        System.out.println("Total Price: " + VIPattendee2.costOfTicket());
    }
}