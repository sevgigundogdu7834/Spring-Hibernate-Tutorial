package _04_DI;

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWork() {
        return "Spend 30 hours on baseBallCoach .  ";
    }
}
