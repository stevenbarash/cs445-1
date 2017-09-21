import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MultiDS<T> implements PrimQ<T>, Reorder {
    // Add a new Object to the PrimQ<T> in the next available location.  If
    // all goes well, return true.  If there is no room in the PrimQ for
    // the new item, return false (you should NOT resize it)

    private T[] bag;
    private T[] tempBag; //bag used for data manipulation
    private int bagSize;
    private int numberOfEntries;
    private boolean initialized = false;
    private int maxCapacity = 10000;

    public MultiDS(int desiredCapacity) {
        if (desiredCapacity <= maxCapacity) {
            bag = (T[]) new Object[desiredCapacity];
            initialized = true;
            bagSize = desiredCapacity;
        } else {
            throw new IllegalStateException("Attempted to create a bag that exceeds maximum allowed capacity");
        }
    }

    // Remove and return the "oldest" item in the PrimQ.  If the PrimQ
    // is empty, return null.
    @Override
    public T removeItem() {
        T deletedValue = bag[0];
        shiftLeft();
        if (numberOfEntries != 0) {
            bag[numberOfEntries - 1] = null;
        }
        if (deletedValue != null) {
            numberOfEntries--;
            return deletedValue;
        } else {
            return null;
        }
    }

    // Returns the "oldest" item in the PrimQ.  If the PrimQ
    // is empty, return null.
    @Override

    public boolean addItem(T input) {
        if (numberOfEntries != bagSize) {
            bag[numberOfEntries] = input;
            numberOfEntries++;
        }
        return false;
    }

    public T top() {
        return null;
    }

    // Return true if the PrimQ is full, and false otherwise
    @Override

    public boolean full() {
        return numberOfEntries >= bag.length;
    }

    // Return true if the PrimQ is empty, and false otherwise
    @Override

    public boolean empty() {
        return numberOfEntries == 0;
    }

    // Return the number of items currently in the PrimQ
    @Override

    public int size() {
        return numberOfEntries;
    }

    // Reset the PrimQ to empty status by reinitializing the variables
    // appropriately
    @Override
    public void clear() {
        for (int i = 0; i <= numberOfEntries; i++) {
            bag[i] = null;
        }
        numberOfEntries = 0;
    }

    // Logically reverse the data in the Reorder object so that the item
    // that was logically first will now be logically last and vice
    // versa.  The physical implementation of this can be done in
    // many different ways, depending upon how you actually implemented
    // your physical MultiDS<T> class
    public void reverse() {
        Collections.reverse(Arrays.asList(bag));
    }

    // Remove the logical last item of the DS and put it at the
    // front.  As with reverse(), this can be done physically in
    // different ways depending on the underlying implementation.
    public void shiftRight() {
        Collections.rotate(Arrays.asList(bag), numberOfEntries * -1);
        StringBuilder sb = new StringBuilder();
        for (T t : bag) {
            if (t != null) {
                sb.append(t.toString() + " ");

            }
        }
        System.out.println(sb.toString()); //TODO find out why dis dont work

        System.out.println("\nFirst \n"); //TODO find out why dis dont work
        Collections.rotate(Arrays.asList(bag), numberOfEntries * -1);
        for (T t : bag) {
            if (t != null) {
                sb.append(t.toString() + " ");

            }
        }
        System.out.println(sb.toString()); //TODO find out why dis dont work


    }


    public void PRINTALLSTUFF() {
        for (T t : bag) {
            System.out.println(t);
        }
    }

    // Remove the logical first item of the DS and put it at the
    // end.  As above, this can be done in different ways.
    public void shiftLeft() {
        Collections.rotate(Arrays.asList(bag), numberOfEntries);

        StringBuilder sb = new StringBuilder();
        System.out.println("\nDEBug\n"); //TODO find out why dis dont work

        for (T t : bag) {
            if (t != null) {
                sb.append(t.toString() + " ");

            }
        }
        System.out.println(sb.toString()); //TODO find out why dis dont work

        Collections.rotate(Arrays.asList(bag), numberOfEntries);
        System.out.println("\nDEBug\n"); //TODO find out why dis dont work
        for (T t : bag) {
            if (t != null) {
                sb.append(t.toString() + " ");

            }
        }
        System.out.println(sb.toString()); //TODO find out why dis dont work

/*
        tempBag = (T[]) new Object[numberOfEntries];
        for (int i = bag.length - 1; i >= 0; --i) {
            try {
                if (bag[i] != null) {
                    tempBag[i] = bag[i];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
        T itemBeingMoved = bag[0];
        for (int i = 0; i < maxCapacity; i++) {
            try {
                if (bag[i] != null) {
                    System.arraycopy(tempBag, i + 1, bag, i, 1);

                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }

            if (numberOfEntries != 0) {
                bag[numberOfEntries - 1] = itemBeingMoved;
            }
        }
        */
    }


    public void shuffle() {
        Random rand = new Random();
        Collections.shuffle(Arrays.asList(bag), rand);

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : bag) {
            if (t != null) {
                sb.append(t.toString() + " ");

            }
        }
        return sb.toString();
    }
    // Reorganize the items in the object in a pseudo-random way.  The exact
    // way is up to you but it should utilize a Random object (see Random in
    // the Java API).  Thus, after this operation the "oldest" item in the
    // DS could be arbitrary.
}