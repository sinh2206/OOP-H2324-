class Fish extends Animal {
    public Fish(int age, String id, String cage) {
        super(age, id, cage);
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return false;
    }
}