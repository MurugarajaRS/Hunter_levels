import java.util.*;
public class Space_removal
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for(int i=0;i<str.length();i++)
            str=str.replaceAll("  "," ");
        System.out.println(str);
    }
}
