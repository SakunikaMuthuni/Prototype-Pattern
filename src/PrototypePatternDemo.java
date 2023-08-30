public class PrototypePatternDemo {
    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape clone1 = ShapeCache.getShape("1");
        System.out.println("Shape: " + clone1.getType());

        Shape clone2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + clone2.getType());

        Shape clone3 = ShapeCache.getShape("3");
        System.out.println("Shape: " + clone3.getType());
    }
}
