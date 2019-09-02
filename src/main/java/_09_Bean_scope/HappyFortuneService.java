package _09_Bean_scope;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    String[] fortuneArray={

                    "Working the balls",
                     "Thunderballs and Firebats",
                     "Front Foot Damsels"
    };



    public String getFortune() {

        Random random=new Random();
        int index=random.nextInt(fortuneArray.length);

        return fortuneArray[index];


    }
}
