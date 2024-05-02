import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input scroe ");
        int score = scanner.nextInt();

        if(score >= 80)
        {
            System.out.println("Grade 4 " +"\n"+score);
        }
        else if (score >= 75)
        {
            System.out.println("Grade 3.5 "+"\n"+score);
        }
        else if (score >= 70)
        {
            System.out.println("Grade 3 "+"\n"+score);
        }
        else if (score >= 65)
        {
            System.out.println("Grade 2.5 "+"\n"+score);
        }
        else if (score >= 60)
        {
        System.out.println("Grade 2 "+"\n"+score);
        }
        else if (score >= 55)
        {
            System.out.println("Grade 1.5 "+"\n"+score);
        }
        else if (score >= 50)
        {
            System.out.println("Grade 1 "+"\n"+score);
        }
        else
        {
            System.out.println("Grade 0 "+"\n"+score);
        }
}
}