package _02_IOC;

public class MyApp {

    public static void main(String[] args) {

        Coach coach=new TrackCoach();
        System.out.println(coach.getDailyWork());
    }
}
