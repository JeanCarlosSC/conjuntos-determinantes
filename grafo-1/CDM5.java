public class CDM5 {
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

    int[][] dominantesMinimos = new int[][] {
        {1,2,8,13}, {1,2,8,14}, {1,2,9,13}, {1,2,9,14}, {1,2,10,13}, {1,2,10,14}, {1,2,11,13}, {1,2,11,14}, {1,2,12,13}, {1,2,12,14}, 
        {1,2,13,14}, {1,3,8,13}, {1,3,8,14}, {1,3,9,13}, {1,3,9,14}, {1,3,10,13}, {1,3,10,14}, {1,3,11,13}, {1,3,11,14}, {1,3,12,13}, 
        {1,3,12,14}, {1,3,13,14}, {1,4,8,13}, {1,4,8,14}, {1,4,9,13}, {1,4,9,14}, {1,4,10,13}, {1,4,10,14}, {1,4,11,13}, {1,4,11,14}, 
        {1,4,12,13}, {1,4,12,14}, {1,4,13,14}, {1,5,8,13}, {1,5,8,14}, {1,5,9,13}, {1,5,9,14}, {1,5,10,13}, {1,5,10,14}, {1,5,11,13}, 
        {1,5,11,14}, {1,5,12,13}, {1,5,12,14}, {1,5,13,14}, {1,6,8,13}, {1,6,8,14}, {1,6,9,13}, {1,6,9,14}, {1,6,10,13}, {1,6,10,14}, 
        {1,6,11,13}, {1,6,11,14}, {1,6,12,13}, {1,6,12,14}, {1,6,13,14}, {1,7,8,13}, {1,7,8,14}, {1,7,9,13}, {1,7,9,14}, {1,7,10,13}, 
        {1,7,10,14}, {1,7,11,13}, {1,7,11,14}, {1,7,12,13}, {1,7,12,14}, {1,7,13,14}, {2,3,8,13}, {2,3,8,14}, {2,3,9,13}, {2,3,9,14}, 
        {2,3,10,13}, {2,3,10,14}, {2,3,11,13}, {2,3,11,14}, {2,3,12,13}, {2,3,12,14}, {2,3,13,14}, {2,4,8,13}, {2,4,8,14}, {2,4,9,13}, 
        {2,4,9,14}, {2,4,10,13}, {2,4,10,14}, {2,4,11,13}, {2,4,11,14}, {2,4,12,13}, {2,4,12,14}, {2,4,13,14}, {2,5,8,13}, {2,5,8,14}, 
        {2,5,9,13}, {2,5,9,14}, {2,5,10,13}, {2,5,10,14}, {2,5,11,13}, {2,5,11,14}, {2,5,12,13}, {2,5,12,14}, {2,5,13,14}, {2,6,8,13}, 
        {2,6,8,14}, {2,6,9,13}, {2,6,9,14}, {2,6,10,13}, {2,6,10,14}, {2,6,11,13}, {2,6,11,14}, {2,6,12,13}, {2,6,12,14}, {2,6,13,14}, 
        {2,7,8,13}, {2,7,8,14}, {2,7,9,13}, {2,7,9,14}, {2,7,10,13}, {2,7,10,14}, {2,7,11,13}, {2,7,11,14}, {2,7,12,13}, {2,7,12,14}, 
        {2,7,13,14}
    };
    public static void main(String[] args) {
        new CDM5();
    }

    public CDM5() {
        int c = 1;
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                for (int j2 = 1; j2 < 15; j2++) {
                    for (int k = 1; k < 15; k++) {
                        for (int k2 = 1; k2 < 15; k2++) {
                            if(!equals(i, j, j2, k, k2) && isOrdered(i, j, j2, k, k2)
                                && isDominant(i, j, j2, k, k2) && esDominanteMinimo(i, j, j2, k, k2)) {
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

    private boolean esDominanteMinimo(int v1, int v2, int v3, int v4, int v5) {
        boolean respuesta = false;

        for (int[] a1 : dominantesMinimos) {
            respuesta = true;
            for (int i1 : a1) {
                if(respuesta && !(i1 == v1 || i1 == v2 || i1 == v3 || i1 == v4 || i1 == v5)) {
                    respuesta = false;
                }
            }
            if(respuesta) {
                return true;
            }
        }
        return false;
    }

    private boolean isDominant(int a, int b, int c, int d, int e) {
        for (int i = 1; i < 15; i++) {
            if(i!=a && i!=b && i!=c && i!=d && i!=e) {
                if(!esAdyacente(i, a) && !esAdyacente(i, b) && !esAdyacente(i, c) && !esAdyacente(i, d) && !esAdyacente(i, e)) {
                    return true;
                }
            }
        }
        return false;
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
