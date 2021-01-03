package src.arrayList;

import java.util.ArrayList;

class arrayListRemove {

    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(10f);
        random.add(10f);

        random.remove(3); // removes element at index 3
        random.add(3,15f);

        random.removeIf(s -> s.equals(10f)); // removes all instances, not just the 1st one

        printList(random);
    }

    public static void printList(ArrayList<Float> arr) {
        for(Float num: arr) {
            System.out.println(num);
        }
    }
}
