public class gloves {
    private String glovesName;
    private int glovesCost;
    public String getGlovesName() {
        return glovesName;
    }
    public void setGlovesName(String glovesName) {
        this.glovesName = glovesName;
    }
    public int getGlovesCost() {
        return glovesCost;
    }
    public void setGlovesCost(int glovesCost) {
        this.glovesCost = glovesCost;
    }
    @Override
    public String toString() {
        return "gloves [glovesName=" + glovesName + ", glovesCost=" + glovesCost + "]";
    } 
}
