package _08__PracticeActivity;

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getDailyWork() {

        return " BaseBall Coach class: getDailyWork method";
    }

    public String getDailyFortune() {

        return "BaseBall Coach class: getDailyFortune method ";
    }
}
