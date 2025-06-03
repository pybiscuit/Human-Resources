class Person {
    private String name;
    private double height;
    private double weight;

    public Person() {
        this.height = 0.0;
        this.weight = 0.0;
        this.name = "The Swamp Thing";
    }

    public Person(String name, double height, double weight) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return this.name + " is " + this.height + " meters tall, and weighs " 
                + this.weight + " Kilograms.";
    }
}
