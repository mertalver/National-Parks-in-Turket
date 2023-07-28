import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class VeriEkleme {
    public VeriEkleme(PriorityQueue priorityQueue) {
        try {
            Document document = Jsoup.connect("https://tr.wikipedia.org/wiki/T%C3%BCrkiye%27deki_mill%C3%AE_parklar_listesi").get();
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
                    sayisalKisim[0] = sayisalKisim[0].replaceAll("\\.", "");
                    double yuzOlcumu1 = Double.parseDouble(sayisalKisim[0]);

                    MilliPark milliPark = new MilliPark(parkAdi,ilAdi,ilanYili,yuzOlcumu1);
                    priorityQueue.ElemanEkle(milliPark);
                }
            }
        }
        catch (Exception exception) {
            System.out.println("HATA! LÜTFEN SİTENİN LİNKİNİ KONTROL EDİNİZ!");
            exception.printStackTrace();
        }
    }
}
