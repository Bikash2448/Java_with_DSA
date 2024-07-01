public class opppac {
    public static class shape{
        String colour;
        String name;
    }
    public static class tringle extends shape{
        int price;
    }
    public static void main(String[] args) {
        tringle a = new tringle();
        a.colour="Blue";
        a.price = 50;
        System.out.println(a.colour);
        System.out.println(a.price);
    }
}