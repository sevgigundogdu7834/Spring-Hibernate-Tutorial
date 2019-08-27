package _05.DI_SetterInjection;

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWork() {
        return "Spend 30 hours on baseBallCoach .  ";
    }

    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }
}
