class first_year
{
    void lms()
    {
        System.out.println("first year student is using lms");
    }
}
class second_year extends first_year
{
    void ctc()
    {
        System.out.println("second year student is using ctc");
    }
}
public class demo {
    public static void main(String[] args) {
        second_year s = new second_year();
        s.ctc();
    }
}