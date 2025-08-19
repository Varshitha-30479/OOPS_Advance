package ques;



class MemoryDemo {
    int instanceVar; 

    MemoryDemo(int value) {
        instanceVar = value;
        System.out.println("Object created: " + instanceVar);
    }

    void show() {
        int localVar = 100; 
        System.out.println("InstanceVar (Heap): " + instanceVar);
        System.out.println("LocalVar (Stack): " + localVar);
    }

    @Override
    protected void finalize() {
        System.out.println("GC removed object: " + instanceVar);
    }
}
public class Q3 {
	public static void main(String[] args) {
        MemoryDemo m1 = new MemoryDemo(10);
        MemoryDemo m2 = new MemoryDemo(20);

        m1.show();
        m2.show();

       
        m1 = null;
        m2 = null;

       
        System.gc();

        System.out.println("End of main method.");
    }
}

