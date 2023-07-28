import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public  class ListeyeEkle {
    ArrayList<MilliPark>[] parklar = new ArrayList[2];
    double toplamHektar1 = 0;
    double toplamHektar2 = 0;

    public ListeyeEkle() {
        parklar[0] = new ArrayList<>();
        parklar[1] = new ArrayList<>();

        try {
            //Milli parkların bilgilerini listeye eklemek için jsoup librarysinden yararlanılmıştır.
            Document document = Jsoup.connect("https://tr.wikipedia.org/wiki/T%C3%BCrkiye%27deki_mill%C3%AE_parklar_listesi").get();
            //Üstteki kısıma milli parkların wikipedia linki yazılmıştır. Eğer hata verirse lütfen güncel wikipedia linkini deneyiniz.
            Element table = document.select("table.wikitable.sortable").get(0);
            Elements body = table.select("tbody");
            Elements rows = body.select("tr");

            for (Element row : rows) {
                if (row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                }

                else {
                    String parkAdi = row.select("td:nth-of-type(1)").text();
                    String ilAdi = row.select("td:nth-of-type(2)").text();
                    String ilanYili = row.select("span.sorttext").get(0).text();
                    String yuzOlcumu = row.select("span.sorttext").get(1).text();
                    String[] sayisalKisim = yuzOlcumu.split(" ");
                    sayisalKisim[0]=sayisalKisim[0].replaceAll("\\.", "");
                    double yuzOlcumu1 = Double.parseDouble(sayisalKisim[0]);


                    if (yuzOlcumu1 > 15000) {
                        parklar[1].add(new MilliPark(parkAdi,ilAdi,ilanYili,yuzOlcumu1));
                        toplamHektar2 += yuzOlcumu1;
                    }
                    else {
                        parklar[0].add(new MilliPark(parkAdi,ilAdi,ilanYili,yuzOlcumu1));
                        toplamHektar1 += yuzOlcumu1;
                    }
                }
            }
        }
        catch (Exception exception) {
            System.out.println("HATA! LÜTFEN SİTENİN LİNKİNİ KONTROL EDİNİZ!");
            exception.printStackTrace();
        }
    }
}
