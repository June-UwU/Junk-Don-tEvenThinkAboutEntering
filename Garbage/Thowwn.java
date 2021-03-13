import java.util.Scanner;
Class OddNumber extends Exception
{
    OddNumber(){}
    private String what = "The Number is Odd";
    public String toString()
    {
        return what;
    }
}
Class EvenNumber extends Exception
{
    EvenNumber(){}
    private String what = "The Number is Even";
    public String toString()
    {
        return what;
    }
}

class Thowwn
{
    public static Void main(String[]arg )
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter any number");
        try
        {
            int i = s.nextInt();
            if(i%2 == 0)
            {
                throw new OddNumber();
            }
            else
            {
                throw new EvenNumber();
            }
        }catch(OddNumber o)
        {
           System.out.print(o); 
        }catch(EvenNumber o)
        {
            System.out.print(o);
        }
    }
}