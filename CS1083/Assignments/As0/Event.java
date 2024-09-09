public class Event{
    private String artistName; 
    private int id;
    private static int nextID = 6000;

    public Event(String nameIn){ 
        artistName = nameIn;
        id = nextID;
        nextID++;
    }

    public String getArtistName(){
        return artistName;
    }
    
    public int getID(){
        return id; }
}