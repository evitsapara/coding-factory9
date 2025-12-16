package gr.aueb.cf.cf9.ch17;

/**
 * Sets a class {@link Node}
 * with just one int value.
 */
public class Node {
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
