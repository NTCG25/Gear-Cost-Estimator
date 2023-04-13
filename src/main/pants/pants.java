public class pants {
    private String pantsName;
    private int pantsCost;
    public String getPantsName() {
        return pantsName;
    }
    public void setPantsName(String pantsName) {
        this.pantsName = pantsName;
    }
    public int getPantsCost() {
        return pantsCost;
    }
    public void setPantsCost(int pantsCost) {
        this.pantsCost = pantsCost;
    }
    @Override
    public String toString() {
        return "pants [pantsName=" + pantsName + ", pantsCost=" + pantsCost + "]";
    } 
}
