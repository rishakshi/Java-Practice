public class Loops {
    public static void main(String[] args) {

        // FOR LOOP
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i is : " + i);
        }

        // FOR IN FOR --> NESTED FOR
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("The value of i is " + i + " and j is " + j);
            }
        }

        // WHILE LOOP
        int i=0;
        while(i<10){
            System.out.println("The value of i is : " + i);
            i++;
        }
    }
}
