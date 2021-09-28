public class HeapStack {
    public static void main(String[] args) {
        int stackVar1 = 100;
        int stackVar2 = stackVar1;
    
        System.out.printf("stack 1: %d, stack 2: %d\n", stackVar1, stackVar2);
    
        stackVar2 = 99;
    
        System.out.printf("stack 1: %d, stack 2: %d\n", stackVar1, stackVar2);
    
        Rectangle heapVar1 = new Rectangle();
        heapVar1.setHeight(1);
        heapVar1.setWidth(1);
        heapVar1.setColor("red");
    
        Rectangle heapVar2 = heapVar1;
    
        heapVar1.print();
        heapVar2.print();
    
        System.out.println("Now we change one color:");
        heapVar2.setColor("blue");
    
        heapVar1.print();
        heapVar2.print();

        System.out.println(heapVar1);
        System.out.println(heapVar2);

        System.out.println("Do stuff:");
        doStuff(heapVar1, stackVar2);
        System.out.println("After dostuff:");
        System.out.println(stackVar2);
        heapVar1.print();
    }

    public static void doStuff(Rectangle r, int i) {
        i = 100;
        r.setColor("yellow");

        System.out.println(i);
        r.print();
    }
}
