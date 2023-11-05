public class Main5 {
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
        new Main5();
    }

    public Main5() {
        int c = 122;
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                for (int j2 = 1; j2 < 15; j2++) {
                    for (int k = 1; k < 15; k++) {
                        for (int k2 = 1; k2 < 15; k2++) {
                            if(!equals(i, j, j2, k, k2) && isOrdered(i, j, j2, k, k2) && isDominant(i, j, j2, k, k2)) {
                                System.out.println("Conjunto dominante "+c+" = {"+i+","+j+","+j2+","+k+","+k2+"}");
                                c++;
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

    private boolean isOrdered(int a, int b, int c, int d) {
        return a<b && b<c && c<d;
    }

    private boolean isOrdered(int a, int b, int c, int d, int e) {
        return isOrdered(a, b, c, d) && d<e;
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
}
