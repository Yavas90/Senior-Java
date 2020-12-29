package Generic;

import java.util.ArrayList;

public class Box <T extends Fruits>{
    private ArrayList<T> box = new ArrayList<>();

    public Box() {
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T o: box
             ) {
            weight += getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        if (getWeight() == anotherBox.getWeight()) {
            return true;
        } return false;
    }

    public void to (Box<T> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruits(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }

    public void showBox(){
        System.out.println(box.toString());
    }
}
