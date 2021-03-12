package model.enums;

public enum Brand {
    TOYOTA("Toyota"),
    BMW("BMW"),
    VOLKSWAGEN("Volkswagen"),
    FORD("Ford"),
    HONDA("Honda"),
    SUBARU("Subaru"),
    CHEVROLET("Chevrolet"),
    MAZDA("Mazda"),
    DAEWOO("Daewoo");

    private String name;

    Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
