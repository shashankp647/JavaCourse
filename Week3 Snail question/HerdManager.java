package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mEastGate;

    /**
     * The output Gate object.
     */
    private Gate mWestGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }
    public static final int HERD=24;


    public void simulateHerd(Random rand) {
        int pin = HERD;
        int pasture = 0;
        int Gate = 0;
        int SnailCount = 0;
        int SnailCountSign;
        mOut.println("There are currently " + pin + " snails in the pen and " + pasture + " snails in the pasture");
        for (int i = 0; i < MAX_ITERATIONS; i++) {
            if (pin != 0 && pasture != 0) {
                Gate = rand.nextInt(2);
                if (Gate == 0) {
                    SnailCount = rand.nextInt(pin) + 1;
                    SnailCountSign = mWestGate.thru(SnailCount);
                    pin+= SnailCountSign;
                } else {
                    SnailCount = rand.nextInt(pasture) + 1;
                    SnailCountSign = mEastGate.thru(SnailCount);
                    pin+= SnailCountSign;
                }


            } else if (pin == 0) {
                SnailCount = rand.nextInt(pasture) + 1;
                SnailCountSign = mWestGate.thru(SnailCount);
                pin += SnailCountSign;
            } else if (pasture == 0) {
                SnailCount = rand.nextInt(pin) + 1;
                SnailCountSign = mEastGate.thru(SnailCount);
                pin += SnailCountSign;
            }

            pasture=HERD-pin;
            mOut.println("There are currently " + pin + " snails in the pen and " + pasture + " snails in the pasture ");
        }

    }
    // TODO -- Fill your code in here


}
