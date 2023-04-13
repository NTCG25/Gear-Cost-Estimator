public class jacket {
    private String jacketName;
    private int jacketCost;
    public String getJacketName() {
        return jacketName;
    }
    public void setJacketName(String jacketName) {
        this.jacketName = jacketName;
    }
    public int getJacketCost() {
        return jacketCost;
    }
    public void setJacketCost(int jacketCost) {
        this.jacketCost = jacketCost;
    }
    @Override
    public String toString() {
        return "jacket [jacketName=" + jacketName + ", jacketCost=" + jacketCost + "]";
    }
}
