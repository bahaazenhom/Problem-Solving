class Flash {
    StringTokenizer st;
    BufferedReader br;

    public Flash(InputStream system) {
        br = new BufferedReader(new InputStreamReader(system));
    }

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());

    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public int[] intArr(int n) throws IOException {
        int[] in = new int[n];
        for (int i = 0; i < in.length; i++) in[i] = nextInt();
        return in;
    }

    public long[] longArr(int n) throws IOException {
        long[] in = new long[n];
        for (int i = 0; i < in.length; i++) in[i] = nextLong();
        return in;
    }

    public int[] intSortedArr(int n) throws IOException {
        int[] in = new int[n];
        for (int i = 0; i < in.length; i++) in[i] = nextInt();
        shuffle(in);
        Arrays.sort(in);
        return in;
    }

    public long[] longSortedArr(int n) throws IOException {
        long[] in = new long[n];
        for (int i = 0; i < in.length; i++) in[i] = nextLong();
        shuffle(in);
        Arrays.sort(in);
        return in;
    }

    static void shuffle(int[] in) {
        for (int i = 0; i < in.length; i++) {
            int idx = (int) (Math.random() * in.length);
            int tmp = in[i];
            in[i] = in[idx];
            in[idx] = tmp;
        }
    }

    static void shuffle(long[] in) {
        for (int i = 0; i < in.length; i++) {
            int idx = (int) (Math.random() * in.length);
            long tmp = in[i];
            in[i] = in[idx];
            in[idx] = tmp;
        }
    }
}
