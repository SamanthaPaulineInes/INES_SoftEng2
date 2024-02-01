package CarBuilder;
public class CarTest
{
    public static void main(String[] args)
    {
        Car myCar = new Car.CarBuilder()
        .brand("BMW")
        .transmission("Manual")
        .engineType("Diesel")
        .color("BlackOrange")
        .capacity(5)
        .build();

        System.out.print("\n\nMY CAR\n");
        System.out.print("\nBrand: " + myCar.brand);
        System.out.print("\nTransmission: " + myCar.transmission);
        System.out.print("\nEngine Type: " + myCar.engineType);
        System.out.print("\nColor: " + myCar.color);
        System.out.print("\nCapacity: " + myCar.capacity + "\n\n");
    }
}
    