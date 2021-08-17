/* commonly Control flow goes from top to bottom, Java uses numerous ways of controlling the program flow
        the 3 control flow statements are:
                                    Decision Statements
                                    Looping Statements
                                    Branching Statements


 */

public class Main {                                                         // this is the program entry point

    public void CheckId(boolean validId, int age, boolean buyingAlc) {       // Public Class void returns holds no data 'CheckId' is the 'method' name
        if (validId) {
            System.out.println("Valid ID presented");
            if ((age > 21) && buyingAlc) {
                System.out.println("Customer legal to purchase alcohol");    // statement has 2 expressions that evaluate a condition
                checkId(validId:true, age:22, buyingAlc:true);
            }
        }
    }


    public static void main(String[] args) {                        // main method from boiler 'main' -- the entry point

        if (true) {                                                 // simplest 'Decision statement'
            System.out.println("Hello Trelvyn");                    // 'sout' creates System.out.println
        }
        if (3 > 2) {
            System.out.println("3 is bigger than 2");               // use the 'if statement' to evaluate expression
        }                                                           // that resolve to a boolean value

        int x = 3;

        if (5 > x) {
            System.out.println("5 is bigger than x");               // handles the boolean value
        }

        int count = 60;
        if (count > 20) {
            String msg = "Count is large";                          // 'Count is large'
            if (count >50) {                                        // 'count is VERY large'
                msg = msg + "\ncount is VERY large";
            }
            System.out.println(msg);
        }


    }


}

