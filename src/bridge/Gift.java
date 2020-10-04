package bridge;

 abstract class Gift {
     String trait;
     GiftImp giftImp;
     public Gift(GiftImp imp) {
         this.giftImp = imp;
     }
}
