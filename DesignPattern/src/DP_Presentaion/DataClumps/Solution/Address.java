package DP_Presentaion.DataClumps.Solution;

public class Address {
    private String houseNo;
    private String roadNo;
    private String block;
    private String areaName;

    public String getHouseNo() {
        return houseNo;
    }
    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }
    public String getRoadNo() {
        return roadNo;
    }
    public void setRoadNo(String roadNo) {
        this.roadNo = roadNo;
    }
    public String getBlock() {
        return block;
    }
    public void setBlock(String block) {
        this.block = block;
    }
    public String getAreaName() {
        return areaName;
    }
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getInformation(){
        return " House no. = "+houseNo+" Road no. = "+roadNo+" Block = "+
                block+" Area = "+areaName;
    }
}


