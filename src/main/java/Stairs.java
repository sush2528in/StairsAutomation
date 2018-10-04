/**
 * CODE (provided by DEVELOPER)
 */
public class Stairs {

        // A simple recursive program number
        static int fib(int n)
        {
            if (n <= 1){
                return n;
            }
            else {
                return fib(n-1) + fib(n-2);
            }
        }

        // Returns number of ways to reach s'th stair
        public int countWays(int s)
        {
            return fib(s + 1);
        }

        /* Driver program to test above function */
        public static void main (String args[])
        {
            Stairs s= new Stairs();
            // input parameter is int and args[0] is String which needs to be parsed as Integer to make compiler happy.
            //System.out.println("Number of ways = "+ s.countWays(Integer.parseInt(args[0])));
            //System.out.println("Number of ways = "+ s.countWays(-1));
            //System.out.println("Number of ways = "+ s.countWays(Integer.parseInt("99")));
            //System.out.println("Number of ways = "+ s.countWays(Integer.parseInt("99")));
        }
    }
