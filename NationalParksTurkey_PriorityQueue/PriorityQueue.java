import java.util.ArrayList;
import java.util.List;

public class PriorityQueue {

    private int kuyrukBuyuklugu;
    private int back;
    private List<MilliPark> PriorityQueueListesi = new ArrayList<>();

    public PriorityQueue(int size)
    {
        kuyrukBuyuklugu = size;
        back = -1;
    }

    public void ElemanEkle(MilliPark milliPark)
    {
        if(back == kuyrukBuyuklugu-1) {
            back = -1;
        }
        PriorityQueueListesi.add(++back,milliPark);
    }

    public MilliPark ElemanSil()
    {
        MilliPark milliPark;
        MilliPark milliParkYeni = null;
        double min = PriorityQueueListesi.get(0).getYuzOlcumu();
        int index = 0;

        for (int x = 0; x < kuyrukBuyuklugu; x++) {
            milliPark = PriorityQueueListesi.get(x);

            if(min > milliPark.getYuzOlcumu()) {
                min = milliPark.getYuzOlcumu();
                index = x;
                milliParkYeni = PriorityQueueListesi.get(x);
            }

            if(kuyrukBuyuklugu == 1) {
                milliParkYeni = milliPark;
            }

            if(index == 0) {
                milliParkYeni = PriorityQueueListesi.get(0);
            }
        }

        PriorityQueueListesi.remove(index);
        kuyrukBuyuklugu--;
        return milliParkYeni;
    }

    public boolean BosMu()
    {
        return (kuyrukBuyuklugu==0);
    }
}
