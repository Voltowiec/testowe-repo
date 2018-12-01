public class Log {
    public static void main(String[] args) {

        //negacje ;
        //koniunkcja &&
        //alternatywa ||

        int x = 0;
        int y = 5;

        boolean test = (x >= 0) || (y++ > 3);
        System.out.println(test);

        System.out.println(y);

        int w = 6 + 4 / 2;
        System.out.println(w);

        System.out.println( 1 + 2 + "z");
        System.out.println( "z" + 1 + 2);
    }
}
