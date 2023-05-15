package factory;

public class ShapeFactory {
    /**
     * Returns a Shape object based on the input string.
     *
     * @param shapeType the string representation of the desired shape
     * @return a Shape object, or null if the shapeType is not recognized
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        // If shapeType is not recognized, return null
        return null;
    }
}

