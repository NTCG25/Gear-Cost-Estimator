public class boots {
    private String bootsName; 
    private int bootsCost;
    public String getBootsName() {
        return bootsName;
    }
    public void setBootsName(String bootsName) {
        this.bootsName = bootsName;
    }
    public int getBootsCost() {
        return bootsCost;
    }
    public void setBootsCost(int bootsCost) {
        this.bootsCost = bootsCost;
    }
    @Override
    public String toString() {
        return "boots [bootsName=" + bootsName + ", bootsCost=" + bootsCost + "]";
    } 
    
}
