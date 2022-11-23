package okulYonetimPlatformuProjesi;

public class Kisi {


    private String isim;
    private String SoyIsim;
    private String tcNo;
    private int yas;

    public Kisi(String isim, String soyIsim, String tcNo, int yas) {
        this.isim = isim;
        SoyIsim = soyIsim;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    public Kisi() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {

        this.isim = isim;
    }

    public String getSoyIsim() {
        return SoyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        SoyIsim = soyIsim;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", SoyIsim='" + SoyIsim + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
