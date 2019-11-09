package service;

public class SportmasterBonusService {
    public int bonusCalculate(int sumPricePurchase, int purchasePrice) {
        int sumBonus = 0;
        int minPurchasePrice = 1000;

        if (sumPricePurchase > 0 && sumPricePurchase <= 15_000) {
            sumBonus = (purchasePrice / minPurchasePrice) * 50;
        }
        if (sumPricePurchase > 15_000 && sumPricePurchase <= 150_000) {
            sumBonus = (purchasePrice / minPurchasePrice) * 70;
        }
        if (sumPricePurchase > 150_000) {
            sumBonus = (purchasePrice / minPurchasePrice) * 100;
        }

        return sumBonus;
    }
}
