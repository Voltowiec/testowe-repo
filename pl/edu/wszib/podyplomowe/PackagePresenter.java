package pl.edu.wszib.podyplomowe;

public class PackagePresenter {

    public void showPackage () {
        System.out.println("To jest obiekt klasy w " + this.getClass().getName());
        System.out.println(" w pakiecie " + this.getClass().getPackage());
    }
}
