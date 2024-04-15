package dto;

public class HistoryDto {
    private Integer ID;
    private Double MY_LAT;
    private Double MY_LNT;
    private String SEARCHED_DATE;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Double getMY_LAT() {
        return MY_LAT;
    }

    public void setMY_LAT(Double MY_LAT) {
        this.MY_LAT = MY_LAT;
    }

    public Double getMY_LNT() {
        return MY_LNT;
    }

    public void setMY_LNT(Double MY_LNT) {
        this.MY_LNT = MY_LNT;
    }

    public String getSEARCHED_DATE() {
        return SEARCHED_DATE;
    }

    public void setSEARCHED_DATE(String SEARCHED_DATE) {
        this.SEARCHED_DATE = SEARCHED_DATE;
    }
}
