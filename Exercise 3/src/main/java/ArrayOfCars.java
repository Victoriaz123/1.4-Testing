public class ArrayOfCars {

    private String[] cars = {"Mercedes", "Toyota", "BMW", "Ford"};

    public String accessInvalidIndex(int index) throws ArrayIndexOutOfBoundsException {

        if (index < 0 || index >= cars.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of limits");
        }
        return cars[index];
    }
}
