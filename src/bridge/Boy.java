package bridge;

class Boy extends Person{
    public Boy(String name) {
        super(name);
    }

    public void chase(Girl girl,Gift gift){
        give(girl,gift);
    }
}
