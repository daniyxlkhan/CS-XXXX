public abstract class Item implements Comparable<Item> {
    private String desc;
    private double cost;

    public Item(String desc, double cost) {
        this.desc = desc;
        this.cost = cost;
    }

    public int toCompare(Item other) {
        if(this.cost < other.getCost()) {
            return -1;
        } else if (this.cost > other.getCost()) {
            return 1;
        } else {
            return 0;
        }
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDesc() {
        return desc;
    }

    public double getCost() {
        return cost;
    }

    public boolean equals(Item other) {
        return this.cost == other.cost && this.desc.equals(other.getDesc());
    }
}