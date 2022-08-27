package Chapters2Thru4;

public class EnumeratedIceCream {
    enum Flavor {vanilla, chocolate, strawberry, fudge, coffee, rockyRoad, cookieDough}
    public static void main(String[] args){
        Flavor cone1, cone2, cone3;

        cone1 = Flavor.rockyRoad;
        cone2 = Flavor.chocolate;

        System.out.println("Cone1 value: " + cone1);
        System.out.println("Cone1 ordinal: " + cone1.ordinal());
        System.out.println("Cone1 name: " + cone1.name() + "\n");


        System.out.println("Cone2 value: " + cone2);
        System.out.println("Cone2 ordinal: " + cone2.ordinal());
        System.out.println("Cone2 name: " + cone2.name());

        cone3 = cone1;

        System.out.println();
        System.out.println("Cone3 value: " + cone3);
        System.out.println("Cone3 ordinal: " + cone3.ordinal());
        System.out.println("Cone3 name: " + cone3.name());




    }
}
