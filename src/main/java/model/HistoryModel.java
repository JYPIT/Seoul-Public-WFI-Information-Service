package model;

public class HistoryModel {
    private String ID;
    private String LAT;
    private String LNT;
    private String SEARCHED_DATE;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLAT() {
        return LAT;
    }

    public void setLAT(String LAT) {
        this.LAT = LAT;
    }

    public String getLNT() {
        return LNT;
    }

    public void setLNT(String LNT) {
        this.LNT = LNT;
    }

    public String getSEARCHED_DATE() {
        return SEARCHED_DATE;
    }

    public void setSEARCHED_DATE(String SEARCHED_DATE) {
        this.SEARCHED_DATE = SEARCHED_DATE;
    }
}
