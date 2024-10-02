public class ArrayOfCars {

    public void accessInvalidIndex() {
        String[] cars = {"Mercedes", "Toyota", "BMW", "Ford"};

        int invalidAccess = Integer.parseInt(cars[4]);
    }
}