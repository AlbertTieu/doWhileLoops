
public class doWhileLoops
{
    public static void main(String[]args) {
        int i = 0;
        do  {
            System.out.println("i is " + i + " and it's less than 15");
            i = i + 1;
        } while (i < 15);
        int k = 10;
        do {
            System.out.println("k is " + k + " and it's more than 5");
            k = k - 1;
        } while (k > 5);
        int a = 0;
        int b = 0;
        do {
            System.out.println("a is " + a + " and it's less than 10");
            System.out.println("b is " + b + " and it's less than or equal to 20");
            a = a + 1;
            b = b + 1;
        } while (a < 10 && b <= 20);
    }
}
