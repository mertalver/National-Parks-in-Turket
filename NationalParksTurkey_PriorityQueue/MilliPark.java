public class MilliPark {
    private String milliParkAdi;
    private String ilAdlari;
    private String ilanYili;
    private double yuzOlcumu;


    public MilliPark(String milliParkAdi, String ilAdlari, String ilanYili, double yuzOlcumu) {
        this.milliParkAdi = milliParkAdi;
        this.ilAdlari = ilAdlari;
        this.ilanYili = ilanYili;
        this.yuzOlcumu = yuzOlcumu;
    }

    public double getYuzOlcumu() {
        return yuzOlcumu;
    }

    @Override
    public String toString() {
        return (milliParkAdi+" | "+ilAdlari+" | "+ilanYili+" | "+yuzOlcumu+"\n");
    }
}
