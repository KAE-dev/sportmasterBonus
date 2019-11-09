package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportmasterBonusServiceTest {

    @Test
    void sumPriceZero() {
        SportmasterBonusService bonusService = new SportmasterBonusService();
        int bonusCalculate = bonusService.bonusCalculate(0, 9000);
        assertEquals(0, bonusCalculate);
    }

    @Test
    void sumPriceMin() {
        SportmasterBonusService bonusService = new SportmasterBonusService();
        int bonusCalculate = bonusService.bonusCalculate(3_000, 9000);
        assertEquals(450, bonusCalculate);
    }

    @Test
    void sumPriceAverage() {
        SportmasterBonusService bonusService = new SportmasterBonusService();
        int bonusCalculate = bonusService.bonusCalculate(16_000, 9000);
        assertEquals(630, bonusCalculate);
    }

    @Test
    void sumPriceMax() {
        SportmasterBonusService bonusService = new SportmasterBonusService();
        int bonusCalculate = bonusService.bonusCalculate(160_000, 9000);
        assertEquals(900, bonusCalculate);
    }
}