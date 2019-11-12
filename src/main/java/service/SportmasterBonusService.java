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


        int bonusCoefficient = purchasePrice / minPurchasePrice;

        if (sumPricePurchase > 0 && sumPricePurchase <= blueCardLimit) {
            sumBonus = bonusCoefficient * blueCardBonus;
            return sumBonus;
        }
        if (sumPricePurchase > blueCardLimit && sumPricePurchase <= silverCardLimit) {
            sumBonus = bonusCoefficient * silverCardBonus;
            return sumBonus;
        }
        if (sumPricePurchase > silverCardLimit) {
            sumBonus = bonusCoefficient * goldCardBonus;
            return sumBonus;
        }

        return sumBonus;
    }
}
