import service.SportmasterBonusService;

public class Main {
    public static void main(String[] args) {
        SportmasterBonusService sportmasterBonus = new SportmasterBonusService();
        int bonusCalculate = sportmasterBonus.bonusCalculate(0, 2000);
        System.out.println(bonusCalculate);

    }
}
