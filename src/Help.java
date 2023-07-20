import java.util.Scanner;

public class Help {
    public static int Programming(int points)
    {
        int help=1;
        int result=1;
        while(result<points)
        {
            result*=2;
        }
        if(result!=points) {
            help++;
        }
        return help;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Points= scanner.nextInt();
        System.out.println(Programming(Points));
    }
}
