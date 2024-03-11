public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogrenciler = {
                new Ogrenci("2022101001","Bilgisayar Müh"),
                new Ogrenci("Emre", "Bilgisayar  Müh", 2022, 0.0),
                new Ogrenci("Ensar","Bilgisayar Müh",2016,3.51)
        };
        System.out.println("Öğrenci Bilgileri");
        for (int k =0;k<ogrenciler.length;k++){
            System.out.println("OGR-"+(k+1)+" "+ogrenciler[k]);
            Ogrenci.i++;
            if (ogrenciler[k].harcHesaplama() > 0) System.out.println(k +". Öğrencinin Ödeyeceği Harç = " +ogrenciler[k].harcHesaplama());
        }
    }
}