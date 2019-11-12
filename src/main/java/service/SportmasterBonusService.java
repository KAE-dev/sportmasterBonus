package service;

public class SportmasterBonusService {
    public int bonusCalculate(int sumPricePurchase, int purchasePrice) {
        int sumBonus = 0;
        int minPurchasePrice = 1000;
        int blueCardLimit = 15_000;
        int silverCardLimit = 150_000;
        int blueCardBonus = 50;
        int silverCardBonus = 70;
        int goldCardBonus = 100;

        if (sumPricePurchase > 0 && sumPricePurchase <= blueCardLimit) {
            sumBonus = (purchasePrice / minPurchasePrice) * blueCardBonus;
            return sumBonus;
        }
        if (sumPricePurchase > blueCardLimit && sumPricePurchase <= silverCardLimit) {
            sumBonus = (purchasePrice / minPurchasePrice) * silverCardBonus;
            return sumBonus;
        }
        if (sumPricePurchase > silverCardLimit) {
            sumBonus = (purchasePrice / minPurchasePrice) * goldCardBonus;
            return sumBonus;
        }

        return sumBonus;
    }
}
