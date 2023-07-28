public class Stack {
    private MilliPark yigitListesi[] = new MilliPark[48];
    private int top;

    public Stack() {
        top = -1;
    }

    public void ElemanEkle(MilliPark milliPark)
    {
        yigitListesi[++top] = milliPark;
    }

    public MilliPark ElemanCikar()
    {
        return yigitListesi[top--];
    }

    public boolean BosMu()
    {
        return (top == -1);
    }
}
