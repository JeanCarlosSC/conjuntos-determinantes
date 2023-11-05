public class CD6 {
    int[][] mAdyacencia = new int[][]{
        {0,	0,	1,	1,	1,	1,	1,	0,	0,	0,	0,	0,	0,	0},
        {0,	0,	1,	1,	1,	1,	1,	0,	0,	0,	0,	0,	0,	0},
        {1,	1,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0},
        {1,	1,	0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0},
        {1,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0},
        {1,	1,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	0},
        {1,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0},
        {0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	1},
        {0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	1,	1},
        {0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	1},
        {0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	1,	1},
        {0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	1,	1},
        {0,	0,	0,	0,	0,	0,	0,	1,	1,	1,	1,	1,	0,	0},
        {0,	0,	0,	0,	0,	0,	0,	1,	1,	1,	1,	1,	0,	0}
    };

    public static void main(String[] args) {
        new CD6();
    }

    public CD6() {
        int count = 672;
        for (int a = 1; a < 15; a++) {
            for (int b = 1; b < 15; b++) {
                for (int c = 1; c < 15; c++) {
                    for (int d = 1; d < 15; d++) {
                        for (int e = 1; e < 15; e++) {
                            for (int f = 0; f < 15; f++) {
                                if(!equals(a, b, c, d, e, f) && isOrdered(a, b, c, d, e, f) && isDominant(a, b, c, d, e, f)) {
                                    System.out.println("Conjunto dominante "+count+" = {"+a+","+b+","+c+","+d+","+e+","+f+"}");
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean esAdyacente(int a, int b) {
        return mAdyacencia[a-1][b-1] == 1;
    }

    private boolean isDominant(int a, int b, int c, int d) {
        for (int i = 1; i < 15; i++) {
            if(i!=a && i!=b && i!=c && i!=d) {
                if(!esAdyacente(i, a) && !esAdyacente(i, b) && !esAdyacente(i, c) && !esAdyacente(i, d)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isDominant(int a, int b, int c, int d, int e) {
        for (int i = 1; i < 15; i++) {
            if(i!=a && i!=b && i!=c && i!=d && i!=e) {
                if(!esAdyacente(i, a) && !esAdyacente(i, b) && !esAdyacente(i, c) && !esAdyacente(i, d) && !esAdyacente(i, e)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isDominant(int a, int b, int c, int d, int e, int f) {
        for (int i = 1; i < 15; i++) {
            if(i!=a && i!=b && i!=c && i!=d && i!=e && i!=f) {
                if(!esAdyacente(i, a) && !esAdyacente(i, b) && !esAdyacente(i, c) && !esAdyacente(i, d) && !esAdyacente(i, e)
                    && !esAdyacente(i, f)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isOrdered(int a, int b, int c, int d) {
        return a<b && b<c && c<d;
    }

    private boolean isOrdered(int a, int b, int c, int d, int e) {
        return isOrdered(a, b, c, d) && d<e;
    }

    private boolean isOrdered(int a, int b, int c, int d, int e, int f) {
        return isOrdered(a, b, c, d, e) && e<f;
    }

    private boolean equals(int a, int b) {
        return a == b;
    }

    private boolean equals(int a, int b, int c) {
        return equals(a, b) || equals(a, c) || equals(b, c);
    }

    private boolean equals(int a, int b, int c, int d) {
        return equals(a, b, c) || equals(a, b, d) || equals(b, c, d);
    }

    private boolean equals(int a, int b, int c, int d, int e) {
        return equals(a, b, c, d) || equals(a, b, c, e) || equals(b, c, d, e);
    }

    private boolean equals(int a, int b, int c, int d, int e, int f) {
        return equals(a, b, c, d, e) || equals(a, b, c, d, f) || equals(b, c, d, e, f);
    }
}
