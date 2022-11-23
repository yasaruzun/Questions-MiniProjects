package okulYonetimPlatformuProjesi;

public class Ogrenci extends Kisi {
    private int ogrNo;
    private String sinif;

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public Ogrenci(String isim, String soyIsim, String tcNo, int yas, int ogrNo, String sinif) {
        super(isim, soyIsim, tcNo, yas);
        this.ogrNo = ogrNo;
        this.sinif = sinif;
    }



    public Ogrenci() {

    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrNo=" + ogrNo +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
