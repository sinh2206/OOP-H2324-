class Dog extends Animal {
    public Dog(int age, String id, String cage) {
        super(age, id, cage);
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}
