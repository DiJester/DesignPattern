package bridge;

class ColdGift extends Gift{
    public ColdGift(GiftImp imp){
        super(imp);
        trait = "cold";
    }
}
