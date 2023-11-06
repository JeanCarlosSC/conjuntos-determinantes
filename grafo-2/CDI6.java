public class CDI6 {
    int[][] mAdyacencia = new int[][]{
        {0,	1,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0},
        {1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0},
        {0,	1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0},
        {0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0},
        {0,	0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0},
        {0,	0,	0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0},
        {0,	0,	0,	0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1},
        {0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0},
        {0,	0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1},
        {1,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0},
        {0,	1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0},
        {0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0},
        {1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	0,	0,	0},
        {0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	1,	0,	0,	0},
        {0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	1,	0,	0},
        {0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	1,	0,	0,	0},
        {0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	1,	0,	0},
        {0,	0,	0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	0,	0},
        {0,	0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1},
        {0,	0,	0,	0,	0,	0,	1,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0,	1,	0}
    };

    public static void main(String[] args) {
        new CDI6();
    }

    public CDI6() {
        int counter = 1;
        for (int v1 = 1; v1 < 16; v1++) {
            for (int v2 = 1; v2 < 17; v2++) {
                for (int v3 = 1; v3 < 18; v3++) {
                    for (int v4 = 1; v4 < 19; v4++) {
                        for (int v5 = 1; v5 < 20; v5++) {
                            for (int v6 = 1; v6 < 21; v6++) {
                                if(!equals(v1, v2, v3, v4, v5, v6) && isOrdered(v1, v2, v3, v4, v5, v6) 
                                    && isDominant(v1, v2, v3, v4, v5, v6) && isIndependent(v1, v2, v3, v4, v5, v6)) {
                                    System.out.println("Conjunto dominante independiente "+counter+" = {"
                                        +v1+","+v2+","+v3+","+v4+","+v5+","+v6+"}");
                                    counter++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private boolean isIndependent(int v1, int v2, int v3, int v4, int v5, int v6) {
        return !esAdyacente(v1, v2) && !esAdyacente(v1, v3) && !esAdyacente(v1, v4) && !esAdyacente(v1, v5) && !esAdyacente(v1, v6)
                                    && !esAdyacente(v2, v3) && !esAdyacente(v2, v4) && !esAdyacente(v2, v5) && !esAdyacente(v2, v6)
                                                            && !esAdyacente(v3, v4) && !esAdyacente(v3, v5) && !esAdyacente(v3, v6)
                                                                                    && !esAdyacente(v4, v5) && !esAdyacente(v4, v6)
                                                                                                            && !esAdyacente(v5, v6); 
    }

    private boolean esAdyacente(int a, int b) {
        return mAdyacencia[a-1][b-1] == 1;
    }

    private boolean isDominant(int a, int b, int c, int d, int e, int f) {
        for (int i = 1; i < 21; i++) {
            if(i!=a && i!=b && i!=c && i!=d && i!=e && i!=f) {
                if(!esAdyacente(i, a) && !esAdyacente(i, b) && !esAdyacente(i, c) && !esAdyacente(i, d) && !esAdyacente(i, e)
                    && !esAdyacente(i, f)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isOrdered(int a, int b, int c, int d, int e, int f) {
        return a<b && b<c && c<d && d<e && e<f;
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