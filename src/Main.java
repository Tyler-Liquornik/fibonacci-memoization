import java.util.HashMap;

public class Main
{
    public static long fib(int n, HashMap<Integer, Long> m)
    {
        if (m.containsKey(n)) {return m.get(n);}
        if (n == 0) {return 0;}
        else if (n == 1) {return 1;}
        else
        {
            long result = fib(n-1, m) + fib(n-2, m);
            m.put(n, result);
            return result;
        }
    }

    public static void printFib(int n)
    {
        for (int i = 0; i <= n; i++)
        {
            System.out.printf("Fib #%d: %d%n", i, fib(i, new HashMap<>()));
        }
    }

    public static void main(String[] args)
    {
        printFib(90);
    }
}