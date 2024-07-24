class Cat extends Animal {
    public Cat(int age, String id, String cage) {
        super(age, id, cage);
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}