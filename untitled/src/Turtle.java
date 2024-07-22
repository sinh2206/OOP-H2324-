class Turtle extends Animal {
    public Turtle(int age, String id, String cage) {
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