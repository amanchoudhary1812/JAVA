public class TotalSurfaceAreaOfCuboid {
    public static void main(String[] args) {
        double Length, Breadth, Height;
        Length = 3.0;
        Breadth = 5.2;
        Height = 8.6;

        Double TSA;

        TSA = 2 * (Length * Breadth + Breadth * Height + Height * Length);

        System.out.println(TSA);

    }
}
