import java.util.*;

public class Project3Member
{
    Scanner input = new Scanner(System.in);

    private String memberName;
    private int memberPhone;

    public Project3Member()
    {
        this.memberName = " ";
        this.memberPhone = 0;
    }
    public Project3Member( String memberName )
    {
        this.memberName = memberName;
        this.memberPhone = 0;
    }
    public Project3Member( int memberPhone )
    {
        this.memberName = " ";
        this.memberPhone = memberPhone;
    }
    public Project3Member( String memberName, int memberPhone )
    {
        this.memberName = memberName;
        this.memberPhone = memberPhone;
    }

    public String getMemberName()
    {
        return memberName;
    }

    public int getMemberPhone()
    {
        return memberPhone;
    }

    public void setMemberName( String memberName )
    {
        this.memberName = memberName;
    }

    public void setMemberPhone()
    {
        this.memberPhone = memberPhone;
    }
}
