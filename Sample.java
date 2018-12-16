public class Sample {





    public static void main(String[] args) {

        A a = new A ();
        a.counter = 2;
        a.setCounter(5);
        a.setName("Tomek");
        a.setCounter(10);

        System.out.println(a.getCounter());

        System.out.println(a.getName());

        System.out.println("----------------------");

        WashingMachine wm = new WashingMachine();
        wm.modeForSensitiveClothes();
        wm.modeForTowelsAndBedLinen();
        wm.showSettings();

        B b = new B();
        b.setCounter(12);
        System.out.println(" counter: " + b.getCounter());

        Rectangle rectangle = new Rectangle("zielony", 10 ,5);
        rectangle.show();


        }






}

class A {
     int counter;
     String name;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        if (counter > 20) {
            System.out.println("Przekroczyłeś zakres");
        }
        else if (counter < 0) {
            System.out.println("Nie można wartośc ujemna");
        }
        else {
            this.counter = counter;
        }
        System.out.println("Ustawiamy licznik: ");
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class B extends A {
    void show () {
        System.out.println("licznik: " + counter);
        System.out.println("imię: " + name);

    }
    public int getCounter() {
        System.out.printf("Teraz uruchamiany z klasy B");
        return counter;
    }


}
