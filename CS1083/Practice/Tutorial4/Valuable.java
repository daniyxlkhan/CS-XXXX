public interface Valuable extends Comparable<Valuable> {
    public double getInitialCost();
    public int getYear();
    public double currentCost();
    // public int toCompare(); because of extends Comparable<Valuable>
}