public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private String ogrNo;
    Ogrenci ogrenci;
    private double gano;
    private int bolumKodu;

    public String toString(){
        ganoTest(gano);
        return ad + " " + bolum + " " + ogrNoOlusturma() + " " + gano;
    }

    public Ogrenci(String ogrNo, String bolum){
        this.ogrNo = ogrNo;
        this.girisYili = 2020;
        if (bolum.equals("Ceng") || bolum.equals("Bilgisayar Müh")) this.bolumKodu = 505;
    }
    public Ogrenci(Ogrenci ogrenci){
        this.ogrenci = ogrenci;
    }

    public Ogrenci(String ad, String bolum, int girisYili, double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.gano = gano;
        if (bolum.equals("Ceng") || bolum.equals("Bilgisayar Müh")) this.bolumKodu = 101;
        if (bolum.equals("EEE")|| bolum.equals("Elektrik-Elektronik Müh")) this.bolumKodu = 610;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public int harcHesaplama(){
        int eksikYil = 2019 - girisYili;
        return Math.max(eksikYil*480 , 0);
    }

    static int i = 1;

    public String ogrNoOlusturma() {
        String sira = String.format("%03d",i);
        String girisYiliString = Integer.toString(girisYili);
        String bolumKoduString = Integer.toString(bolumKodu);

        return girisYiliString + bolumKoduString + sira;


    }
    public void ganoTest(double gano){
        if (gano > 4 || gano < 0){
            throw new ArithmeticException("Hatalı gano! ");
        }
    }
}