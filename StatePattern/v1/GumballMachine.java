package StatePattern.v1;

public class GumballMachine {

    // four states, according to Mighty Gumball State Diagram.
    final static int SOLD_OUT = 1;
    final static int NO_QUATER = 2;
    final static int HAS_QUATER = 3;
    final static int SOLD = 4;

    int state = SOLD_OUT; // keeps track of current state. (initially assigned to SOLD_OUT state as it has
                          // no gumballs when it is manufactured)
    int count = 0; // no of gumballs in the machine.

    public GumballMachine(int count) {
        this.count = count; // initialise the inventory of gumballs

        if (count > 0) {
            this.state = NO_QUATER; // if inventory isn't zero, the machine enters NO_QUATER state meaning someone
                                    // need to insert the quater, otherwise stays in SOLD_OUT state.
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUATER) {
            System.out.println("You can't insert another quarter");
        } else if (state == NO_QUATER) {
            state = HAS_QUATER;
            System.out.println("You inserted a quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert another quarter, the machine is sold out");
        } else if (state == SOLD) {
            System.out.println("Please wait, we already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUATER) {
            System.out.println("Quarter returned");
            state = NO_QUATER;
        } else if (state == NO_QUATER) {
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD) {
            System.out.println("Sorry, you already turned the crank");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a quarter");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball!");
            state = NO_QUATER;
        } else if (state == NO_QUATER) {
            System.out.println("You turned but there's no quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned but there are no gumballs");
        } else if (state == HAS_QUATER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops! out of gumballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUATER;
            }
        } else if (state == NO_QUATER) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUATER) {
            System.out.println("No gumball dispensed");
        }
    }

    // other methods here like toString() and refill()
}