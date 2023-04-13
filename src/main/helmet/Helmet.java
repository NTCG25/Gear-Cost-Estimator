public class Helmet {
    private String helmetName;
    private int helmetCost;
    public String getHelmetName() {
        return helmetName;
    }
    public void setHelmetName(String helmetName) {
        this.helmetName = helmetName;
    }
    public int getHelmetCost() {
        return helmetCost;
    }
    public void setHelmetCost(int helmetCost) {
        this.helmetCost = helmetCost;

    }
    @Override
    public String toString() {
        return "Helmet [helmetName=" + helmetName + ", helmetCost=" + helmetCost + "]";
    } 
    
}
