public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(48);
        VeriEkleme veriEkleme = new VeriEkleme(priorityQueue);

        while(!priorityQueue.BosMu()) {
            MilliPark milliPark = priorityQueue.ElemanSil();
            System.out.print(milliPark);
        }
    }
}