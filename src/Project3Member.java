public class Project3Member
{
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
    public Project3Member( int memberPhone)
    {
        this.memberName = " ";
        this.memberPhone = memberPhone;
    }
    public Project3Member(String memberName, int memberPhone)
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
}
