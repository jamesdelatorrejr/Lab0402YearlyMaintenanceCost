public class Lab0402YearlyMaintenanceCost
{
    public static void main(String[] args)
    {
        double springCost = 125.73;
        double summerCost = 759.24;
        double fallCost = 234.22;
        double winterCost = 252.22;
        double yearCost = 0;

        yearCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Your cost for the Spring is " + springCost + ". " + "Your cost for the Summer is " + summerCost + ". " + "Your cost for the Fall is " + fallCost + ". "
          + "Your cost for the Winter is " + winterCost + ". " + "Your total cost is " + yearCost + ".");
    }
}
