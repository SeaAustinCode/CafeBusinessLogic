import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil{
    public int getStreakGoal(){
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;
        for(int i=0; i<numArray.length; i++){
            sum += numArray[i];
        }return sum;
    }


    public double getOrderTotal(double[]prices){
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum = sum + prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++) {
            String showMenu = menuItems.get(i);
            System.out.println((i) + " " + showMenu);
        } 
    }


    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        System.out.println("There are" + " " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }

}
