import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Choose Veg Pizza or Non Veg Pizza");
        String choose = sc.nextLine();
        choose = choose.toLowerCase();

        boolean ch = false;

        if(choose.equals("veg"))
        {
            ch = true;
        }
        else if(choose.equals("non veg")){
            ch = false;
        }
        else if(choose.equals("nonveg")){
            ch = false;
        }
        else
        {
            System.out.println("WRONG INPUT: PLEASE CHOOSE VALID CHOICE");
            sc.close();
            System.exit(1);
        }

        System.out.println("1. Base Pizza || 2. Deluxe Pizza");
        int cho = sc.nextInt();
        sc.nextLine();

        if(cho == 1)
        {
            Pizza basePizza = new Pizza(ch);

            System.out.println("Do you want Extra Cheese?");
            String extracheese = sc.nextLine().toLowerCase();
            if(extracheese.equals("yes"))
            {
                basePizza.addExtraCheese();
            }
            else{
            }


            System.out.println("Do you want Extra Toppings?");
            String extratoppings = sc.nextLine().toLowerCase();
            if(extratoppings.equals("yes"))
            {
                basePizza.addExtraToppings();
            }
            else{
            }
            
            System.out.println("Do you want Take Away?");
            String opt = sc.nextLine().toLowerCase();
            if(opt.equals("yes"))
            {
                basePizza.takeAway();
            }
            else{
            }
            System.out.println("---------------------");
            basePizza.getBill();
        }

        else if(cho == 2)
        {
            DeluxePizza dp = new DeluxePizza(ch);
            
            System.out.println("Do you want Take Away?");
            String opt = sc.nextLine().toLowerCase();
            if(opt.equals("yes"))
            {
                dp.takeAway();
            }
            else{
            }
            System.out.println("---------------------");
            dp.getBill();
        }
        
        else
        {
            System.out.println("WRONG INPUT!!");
            System.exit(1);
        }
        

        sc.close();
    }
}
