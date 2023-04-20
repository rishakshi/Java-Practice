public class Conditional {
    public static void main(String[] args) {
        int age = 21;
        if(age >= 18){
            System.out.println("You are ready to get married");
        }
        else{
            System.out.println("No eligible to get married");
        }

        int n=2;
        switch(n){
            case 1:
                System.out.println("Sunday");
                break;
            case 2: 
                System.out.println("Monday");
                break;
        }
    }
}
