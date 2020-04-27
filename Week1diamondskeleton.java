package mooc.vandy.java4android.diamonds.logic;

import android.text.InputFilter;
import android.util.Log;
import android.util.Size;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here

/**
 * Intial Step involves framing of the Art with - & +
 * Considering Length & Breadth Variable we can assign symbol based on it
 * Rest will be passed on to a helper method names diamondPattern
 */
        int Length = size * 2 + 2;
        int Breadth = size * 2 + 1;
            for (int i=1; i<=Breadth;i++) {
                for(int j=1; j<=Length; j++) {
                    if ((i == 1 || i == Breadth) && (j == 1 || j == Length))
                        mOut.print("+");
                    else if (i == 1 || i == Breadth)
                        mOut.print("-");
                    else if (j == 1 || j == Length)
                        mOut.print("|");
                    else {
                        diamondPattern(i, j, size, Length,Breadth);

                    }
                }
                mOut.print("\n");
            }

    }
    private void diamondPattern(int i, int j, int size, int Length, int breadth){ ;
        int Mid= size +1;

        /**
         * Using ? operator assign different character case wise
         */
        char slash1 =i<Mid ?'/' : '\\';
        char slash2 =i<Mid ?'\\' :'/';
        char seperator = i%2==0 ? '=' :'-';
        /**
         * Using three seperate section : Upper when i<Mid , Mid when i=Mid , Down when i>Mid
         */

        if (i==Mid){
            if (j==2){
                mOut.print("<");
            }
            else if (j==Length-1){
                mOut.print(">");
            }
            else if (j>Mid-i+1 && j<Mid+i){
                mOut.print(seperator);
            }

        }
        else if (i<Mid) {
                if (j == Mid - i + 2) {
                    mOut.print(slash1);
                }
                else if (j == Mid + i - 1) {
                    mOut.print(slash2);
                }
                 else if (j>Mid-i+1 && j<Mid+i){
                    mOut.print(seperator);
                 }

            else
            {mOut.print(" ");}
        }
        else {
            i=breadth-i+1;

             if (j == Mid - i + 2) {
                mOut.print(slash1);
             }
             else if (j == Mid + i - 1) {
                mOut.print(slash2);
             }
             else if (j>Mid-i+1 && j<Mid+i){
                mOut.print(seperator);
             }

            else
            {mOut.print(" ");}

        }

    }

    }



