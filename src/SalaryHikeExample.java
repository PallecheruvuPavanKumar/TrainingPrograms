import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryHikeExample {
    public static void main(String[] args){
        DecimalFormat decimalFormat=new DecimalFormat();
        decimalFormat.applyPattern(".##");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Current Package : ");
        double currentPackage=scanner.nextInt();
        System.out.println("Enter your Hike Amount : ");
        double hikePercentage= scanner.nextInt();
        double monthlySalary = Double.parseDouble(decimalFormat.format(currentPackage / 12));
        double afterIncrement =  ((hikePercentage / 100) * currentPackage);
        System.out.println("Your Monthly Salary is : "+monthlySalary);
        System.out.println("Incremented salary is : "+afterIncrement );
        double totalSalary =  ((currentPackage + afterIncrement) / 12);
        double basicSalary = totalSalary / 0.12;
        double pfAmount = basicSalary / 0.18;
        System.out.println("Basic Salary is : "+basicSalary);
        double afterCutting = (totalSalary- pfAmount);
        System.out.println("After PF cutting amount :"+afterCutting);
        String format = decimalFormat.format(totalSalary);
        System.out.println("Total Salary after increment : "+format);
    }
}
