package CarBuilder;
public class Car
{
    protected final String brand;
    protected final String engineType;
    protected final String transmission;
    protected final String color;
    protected final Integer capacity;

    private Car(CarBuilder builder)
    {
        this.brand = builder.brand;
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.capacity = builder.capacity;
    }

    protected final static class CarBuilder
    {
        private String brand;
        private String engineType;
        private String transmission;
        private String color;
        private Integer capacity;

        public CarBuilder brand(String brand)
        {
            this.brand = brand;
            return this;
        }
        public CarBuilder engineType(String engineType)
        {
            this.engineType = engineType;
            return this;
        }
        public CarBuilder transmission(String transmission)
        {
            this.transmission = transmission;
            return this;
        }
        public CarBuilder color(String color)
        {
            this.color = color;
            return this;
        }
        public CarBuilder capacity(Integer capacity)
        {
            this.capacity = capacity;
            return this;
        }
        public Car build()
        {
            return new Car(this);
        }
    }
}