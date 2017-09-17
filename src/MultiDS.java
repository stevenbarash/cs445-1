import java.util.Arrays;
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
        bag[numberOfEntries - 1] = null;
        return deletedValue;
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
        return bagSize;
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

    }

    // Remove the logical last item of the DS and put it at the
    // front.  As with reverse(), this can be done physically in
    // different ways depending on the underlying implementation.
    public void shiftRight() {

    }


    public void PRINTALLSTUFF() {
        for (T t : bag) {
            System.out.println(t);
        }
    }

    // Remove the logical first item of the DS and put it at the
    // end.  As above, this can be done in different ways.
    public void shiftLeft() {

        tempBag = (T[]) new Object[numberOfEntries];
        for (int i = bag.length - 1; i >= 0; --i) {
            if (bag[i] != null) {
                tempBag[i] = bag[i];
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

            bag[numberOfEntries - 1] = itemBeingMoved;
        }
    }


    public void shuffle() {

    }
    // Reorganize the items in the object in a pseudo-random way.  The exact
    // way is up to you but it should utilize a Random object (see Random in
    // the Java API).  Thus, after this operation the "oldest" item in the
    // DS could be arbitrary.
}