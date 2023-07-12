import java.util.Arrays;
import java.util.List;

public class Pair<E, K> implements Comparable<Pair<E, K>> {

    E left;
    K right;

    public Pair() {
        this.left = null;
        this.right = null;
    }

    public Pair(E left, K right) {
        this.left = left;
        this.right = right;
    }

    public E getLeft() {
        return this.left;
    }

    public K getRight() {
        return this.right;
    }

    public void setLeft(E left) {
        this.left = left;
    }

    public void setRight(K right) {
        this.right = right;
    }

    public static Pair[] sort(Pair[] pairs) {
        Arrays.sort(pairs);
        return pairs;
    }


    public static void toString(Pair[] pairs) {
        for (int i = 0; i < pairs.length; i++) {
            System.out.print(" [ " + pairs[i].getLeft() + " " + pairs[i].getRight() + " ] ");
            //   System.out.println();
        }
    }

    public static void toString(List<Pair> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getLeft() + " " + list.get(i).getRight());
            System.out.println();
        }
    }
    @Override
    public int compareTo(Pair<E, K> o) {
        return ((Long) this.getLeft()).compareTo((Long) o.getLeft());
    }
}