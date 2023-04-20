public class TypeCast {
    public static void main(String[] args) {

        //____________________________AUTOMATIC CASTING________________________________________

        // LONG TO DOUBLE - Working
        long l = 2373345l;
        System.out.println(l);
        double d = l;
        System.out.println(d);

        // DOUBLE TO LONG - Not Working
        // double d1 = 45.6d;
        // System.out.println(d1);
        // long l1 = d1;
        // System.out.println(l1);


        //____________________________Manual CASTING___________________________________________

        // LONG TO DOUBLE - Working
        long l3 = 2373345l;
        System.out.println(l3);
        double d3 = (double)l3;
        System.out.println(d3);

        // DOUBLE TO LONG - Working
        double d4 = 45.6d;
        System.out.println(d4);
        long l4 = (long)d4;
        System.out.println(l4);

    }
}
