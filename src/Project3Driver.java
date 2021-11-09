import java.lang.reflect.Member;
import java.util.*;

public class Project3Driver
{


    static final int memberCount = 5;
    static int memberCounter = 0;
    static String name;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Project3Member member1 = new Project3Member();
        Project3Member member2 = new Project3Member();
        Project3Member member3 = new Project3Member();
        Project3Member member4 = new Project3Member();
        Project3Member member5 = new Project3Member();

        System.out.println("Enter a member's name:");
        name = input.nextLine();
        member1.setMemberName( name );
        memberCounter++;

    }
}
