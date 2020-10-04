package bridge;

class WarmGift extends Gift{

    public WarmGift(GiftImp imp) {
        super(imp);
        trait = "warm";
    }
}
