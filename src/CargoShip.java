public class CargoShip {
    private String name;
    private TypeOfCargo type;

    enum TypeOfCargo {
        LOOSE,
        LIQUID,
        CONTAINER
    }

    public CargoShip(String name, TypeOfCargo type) {
        this.name = name;
        this.type = type;
    }

    public CargoShip() {
        InputOutput.Reader input = new InputOutput.Reader();
        this.name = input.setName();
        this.type = generateRandomTypeOfCargo();
    }

    private TypeOfCargo generateRandomTypeOfCargo() {
        int index = (int) (Math.random() * TypeOfCargo.values().length);
        return TypeOfCargo.values()[index];
    }

    public String getName() {
        return name;
    }

    public TypeOfCargo getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Cargo ship's name - " + getName() + "\nType - " + getType();
    }

}
