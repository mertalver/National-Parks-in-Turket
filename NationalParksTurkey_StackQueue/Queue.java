public class Queue {
    private int head;
    private int back;
    private int parkSayisi;
    private MilliPark queueListesi[] = new MilliPark[48];

    public Queue()
    {
        head = 0;
        back = -1;
        parkSayisi = 0;
    }

    public void ElemanEkle(MilliPark milliPark)
    {
        if(back == 47)
            back = -1;
        queueListesi[++back] = milliPark;
        parkSayisi++;
    }

    public MilliPark ElemanSil()
    {
        MilliPark milliPark = queueListesi[head++];
        if(head == 48) {
            head = 0;
        }
        parkSayisi--;
        return milliPark;
    }

    public boolean BosMu()
    {
        return (parkSayisi==0);
    }

    public int BoyutGoster()
    {
        return parkSayisi;
    }
}
