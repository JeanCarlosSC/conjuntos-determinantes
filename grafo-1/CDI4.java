public class CDI4 {
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
        new CDI4();
    }

    public CDI4() {
        int counter = 1;
        for (int a = 1; a < 15; a++) {
            for (int b = 1; b < 15; b++) {
                for (int c = 1; c < 15; c++) {
                    for (int d = 1; d < 15; d++) {
                        if(!equals(a, b, c, d) && isOrdered(a, b, c, d) && isDominant(a, b, c, d)
                            && isIndependent(a, b, c, d)) {
                            System.out.println("Conjunto dominante independiente "+counter+" = {"+a+","+b+","+c+","+d+"}");
                            counter++;
                        }
                    }
                }
            }
        }
    }

    private boolean isIndependent(int v1, int v2, int v3, int v4) {
        return !esAdyacente(v1, v2) && !esAdyacente(v1, v3) && !esAdyacente(v1, v4)
                                    && !esAdyacente(v2, v3) && !esAdyacente(v2, v4)
                                                            && !esAdyacente(v3, v4); 
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

    private boolean isOrdered(int a, int b, int c, int d) {
        return a<b && b<c && c<d;
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
}