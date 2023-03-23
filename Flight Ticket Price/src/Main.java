import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int distance,age,tripType;
        double normalAmount,totalAmount,ageDiscount,discountedAmount,roundTripDiscount;
        System.out.print("How many kilometers will you go?: ");
        distance = scanner.nextInt();
        System.out.print("How old are you?: ");
        age = scanner.nextInt();
        System.out.print("(1==>one way\t 2==>round trip):");
        tripType = scanner.nextInt();

        normalAmount = distance * 0.10;

        if(distance>=0 && age>=0 && (tripType==1 || tripType ==2)){
             if(age<12){
                 ageDiscount = normalAmount * 0.5;
                 discountedAmount = normalAmount-ageDiscount;
                 if(tripType==1){
                     totalAmount = discountedAmount;
                     System.out.println("total amount: "+totalAmount);
                 }else{
                     roundTripDiscount = discountedAmount * 0.2;
                     totalAmount = (discountedAmount-roundTripDiscount)*2;
                     System.out.println("Total amount: "+totalAmount);
                 }
             }else if(age<=24){
                 ageDiscount = normalAmount * 0.1;
                 discountedAmount = normalAmount-ageDiscount;
                 if(tripType==1){
                     totalAmount = discountedAmount;
                     System.out.println("total amount: "+totalAmount);
                 }else{
                     roundTripDiscount = discountedAmount * 0.2;
                     totalAmount = (discountedAmount-roundTripDiscount)*2;
                     System.out.println("Total amount: "+totalAmount);
                 }

             }else if(age>65){
                 ageDiscount = normalAmount * 0.3;
                 discountedAmount = normalAmount-ageDiscount;
                 if(tripType==1){
                     totalAmount = discountedAmount;
                     System.out.println("total amount: "+totalAmount);
                 }else{
                     roundTripDiscount = discountedAmount * 0.2;
                     totalAmount = (discountedAmount-roundTripDiscount)*2;
                     System.out.println("Total amount: "+totalAmount);
                 }
             }else{
                 if(tripType==1){
                     totalAmount = normalAmount;
                     System.out.println("total amount: "+totalAmount);
                 }else{
                     roundTripDiscount = normalAmount * 0.2;
                     totalAmount = (normalAmount-roundTripDiscount)*2;
                     System.out.println("Total amount: "+totalAmount);
                 }
             }
        }else{
            System.out.println("You Entered Wrong Data!");
        }
    }
}
