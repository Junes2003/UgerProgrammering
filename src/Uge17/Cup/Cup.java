package Uge17.Cup;

public class Cup {
    private String liquidType;
    private  int percentageFilled;

    Cup(String liquidType, int percentageFilled){
        this.liquidType = liquidType;
        this.percentageFilled = percentageFilled;
    }

    public int getPercentageFilled() {
        return percentageFilled;
    }

    public void setPercentageFilled(int percentageFilled) {
        this.percentageFilled = percentageFilled;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public void setLiquidType(String liquidType) {
        this.liquidType = liquidType;
    }
}