package model.enums;

public enum Color {
    YELLOW("Yellow"),
    BROWN("Brown"),
    BLACK("Black"),
    WHITE("White"),
    SILVER("Silver"),
    BLUE("Blue"),
    RED("Red"),
    GREEN("Green");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color;
    }
}
