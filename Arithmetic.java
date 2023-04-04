package Inheritance;

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    public static void main(String[] args)
    {
        Adder adder = new Adder();
        System.out.println(adder.add(11,11));
    }
}
