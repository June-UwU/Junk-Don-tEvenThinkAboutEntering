import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class EvenNumber extends Exception
{
    EvenNumber(String str)
    {
        System.out.println(str);
    }
}
class OddNumber extends Exception
{
    OddNumber(String str)
        {
        System.out.println(str);
        }
}
class exceptioned {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number: ");
        try {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 0) {
                throw new EvenNumber("No is even: ");
            } else {
                throw new OddNumber("No is odd: ");
            }
        } catch (EvenNumber e) {
            System.out.println(e);
        } catch (OddNumber e) {
            System.out.println(e);
        }
    }
}
