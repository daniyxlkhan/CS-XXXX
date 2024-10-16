public class TDriver {
    
    public static void main(String[] args) {
        Parent p = new ChildA();
        p.parentSpecfic();
        p.childASpecificMethod();
        p.getMethod();
    }
}
