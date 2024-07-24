public abstract class Animal {
    private int age; // Tính bằng tháng
    private String id;
    private String cage;

    public Animal(int age, String id, String cage) {
        this.age = age;
        this.id = id;
        this.cage = cage;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getCage() {
        return cage;
    }

    //Có biết bơi hay không.
    public abstract boolean canSwim();
    //Có đi trên cạn hay không .
    public abstract boolean canWalk();
}
