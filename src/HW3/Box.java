package HW3;

import java.util.ArrayList;

public class Box <F> {

    private final float fruitWeight;
    ArrayList <F> fruits = new ArrayList();

    public float getWeight() {
        return fruits.size() * fruitWeight;
    }

    public Box(float fruitWeight) {
        this.fruitWeight = fruitWeight;
    }

    public boolean compare (Box <?> box){
        return Math.abs(getWeight() - box.getWeight()) < 0.00001;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public void mergeBoxes (Box <F> box){
        System.out.println("Before merging. Quantity box 1: " + fruits.size());
        System.out.println("Before merging. Quantity box 2: " + box.fruits.size());
        fruits.addAll(box.fruits);
        box.fruits.clear();
        box.fruits.trimToSize();
        System.out.println("After merging. Quantity box 1: " + fruits.size());
        System.out.println("After merging. Quantity box 2: " + box.fruits.size());
    }
}
