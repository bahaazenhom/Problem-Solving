class Pair implements Comparable<Pair> {
   private long left;
   private long right;

    public Pair(long left,long right) {
        this.left=left;
        this.right=right;
    }

    public long getLeft() {
        return this.left;
    }

    public long getRight() {
        return this.right;
    }

    public void setLeft(long left) {
        this.left=left;
    }
    public void setRight(long right) {
        this.right=right;
    }

    public static Pair[] sort(Pair[] pairs) {
        Arrays.sort(pairs);
        return pairs;
    }

    @Override
    public int compareTo(Pair pair) {
        if (pair.getLeft() > this.getLeft()) return -1;
        else if (pair.getLeft() < this.getLeft()) return 1;
        else return 0;
    }

    public static void toString(Pair[] pairs) {
        for (int i = 0; i < pairs.length; i++) {
            System.out.print(pairs[i].getLeft() +" "+pairs[i].getRight());
            System.out.println();
        }
    }
}
