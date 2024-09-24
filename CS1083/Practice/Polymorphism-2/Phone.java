public class Phone implements Audible{
    private String owner;
    
    public Phone(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public String makeNoise() {
        return "Ring";
    }
}