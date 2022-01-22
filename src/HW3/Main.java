package HW3;

public class Main {
    public static void main(String[] args) {
        createFruitBoxes();
    }

    public static void createFruitBoxes() {

        Box <Apple> appleBox = new Box <Apple> (1.5f);
        Box <Orange> orangeBox = new Box <Orange>(1f);

        orangeBox.addFruit(new Orange());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        System.out.println("Weight appleBox: " + appleBox.getWeight());
        System.out.println("Weight orangeBox: " + orangeBox.getWeight());

        System.out.println("Compare: " + appleBox.compare(orangeBox));

        Box <Orange> orangeBox2 = new Box <Orange>(1f);
        orangeBox2.addFruit(new Orange());

        orangeBox.mergeBoxes(orangeBox2);
    }

public static void changePositionInArray (Object[] array, int firstIndex, int secondIndex) {
    Object temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
    }
}
