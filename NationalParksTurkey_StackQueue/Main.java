public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();
        VeriEkleme veriEkleme = new VeriEkleme(stack, queue);
        //STACK VE QUEUE'YA EKLEMELER VeriEkleme CLASSINDA YAPILMIŞTIR.

        System.out.println("Stack kullanarak yazdırma:");
        System.out.println("----------------------------");
        while(!stack.BosMu()) {
            System.out.println(stack.ElemanCikar());
        }

        System.out.println("\n\n\n");

        System.out.println("Queue kullanarak yazdırma:");
        System.out.println("----------------------------");
        while(!queue.BosMu()) {
            System.out.print(queue.ElemanSil()+"\n");
        }
    }
}