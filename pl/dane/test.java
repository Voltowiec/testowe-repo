package pl.dane;

public class test {
    public static void main(String[] args) {

        DataPresenter dataPresenter = new DataPresenter();
        DataProvider dataProvider = new FileDataProvider ();

        DataProvider [] dataProviders = new DataProvider[10];
        dataProviders [0] = new SimpleDataProvider();
        dataProviders [1] = new FileDataProvider();
        dataProviders [2] = new MyDataPrvider();
        dataProviders [3] = new SimpleDataProvider();
        dataProviders [4] = new FileDataProvider();
        dataProviders [5] = new SimpleDataProvider();
        dataProviders [6] = new MyDataPrvider();
        dataProviders [7] = new SimpleDataProvider();
        dataProviders [8] = new FileDataProvider();
        dataProviders [9] = new MyDataPrvider();

        for (DataProvider dp : dataProviders) {
            dataPresenter.showData(dp);
        }




    }
}
