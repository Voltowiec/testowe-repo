public class MarsApplication {
    public static void main(String[] args) {

        MarsRobot spirit = new MarsRobot();

        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttribiutes();

        System.out.printf("zwiększenie prędkści do 3.");
        spirit.speed = 3;
        spirit.showAttribiutes();

        System.out.printf("zmiana temperatury do -90.");
        spirit.temperature = -90;
        spirit.showAttribiutes();

        System.out.printf("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttribiutes();

        MarsRobot opportunity = new MarsRobot();

        spirit.status = "eksploracja";
        spirit.speed = 5;
        spirit.temperature = -70;

        spirit.showAttribiutes();

        System.out.printf("zwiększenie prędkści do 7.");
        spirit.speed = 7;
        spirit.showAttribiutes();

        System.out.printf("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttribiutes();

    }
}
