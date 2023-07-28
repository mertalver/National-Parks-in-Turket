public class Main {
    public static void main(String[] args) {
        ListeyeEkle listeyeEkle = new ListeyeEkle();

        System.out.println("\n"+" Yüzölçümü 15000 hektardan küçük olan Milli Parklar");
        System.out.println(" --------------------------------------------------");
        System.out.println(" "+listeyeEkle.parklar[0].toString().replaceAll("[\\[\\]]","").replace(",", ""));

        System.out.println(" Yüzölçümü 15000 hektardan büyük olan Milli Parklar");
        System.out.println(" --------------------------------------------------");
        System.out.println(" "+listeyeEkle.parklar[1].toString().replaceAll("[\\[\\]]","").replace(",", ""));

        System.out.println(" 15000 Hektardan Küçük Olan Milli Parkların Toplam Yüzölçümü: "+ listeyeEkle.toplamHektar1+" hektar");
        System.out.println(" 15000 Hektardan Büyük Olan Milli Parkların Toplam Yüzölçümü: "+ listeyeEkle.toplamHektar2+" hektar");
    }
}