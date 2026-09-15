interface Cookable {
    void cook();
}

class BakedDish implements Cookable {

    @Override
    public void cook() {
        System.out.println("Baked dish is being cooked.");
    }
}

public class ProblemB {

    public static void main(String[] args) {

        BakedDish dish = new BakedDish();

        dish.cook();
    }
}