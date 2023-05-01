package chapter9;

public class test {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 40);

        System.out.println(r1.height);
        System.out.println(r1.width);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());


        Fan fan = new Fan();
        System.out.println(fan.toString());

        Fan fan2 = new Fan();
        fan2.setOn(true);
        System.out.println(fan2.toString());

        double[][] a = {{1}, {2}};
        Location loc = Location.locateLargest(a);
        System.out.println(loc.MAXVALUE + loc.COL + loc.ROW);
    }
}
