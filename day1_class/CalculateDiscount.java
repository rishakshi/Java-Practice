public class CalculateDiscount {

    public static int calc(int... price){
        int totalCost = 0;
        for(int i=0; i<price.length; i++){
            totalCost += price[i];
        }
        return totalCost;
    }

    private static int discount(int totalCost) {
        if(totalCost > 10000){
            return totalCost/10;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int totalCost = calc(150, 600, 789, 990, 1168, 2300, 9000);
        int discount = discount(totalCost);
        int balance = totalCost - discount;
        System.out.println(balance);
    }

    
}
