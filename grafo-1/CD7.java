public class Main7 {
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
        new Main7();
    }

    public Main7() {
        int count = 2033;
        for (int v1 = 1; v1 < 15; v1++) {
            for (int v2 = 1; v2 < 15; v2++) {
                for (int v3 = 1; v3 < 15; v3++) {
                    for (int v4 = 1; v4 < 15; v4++) {
                        for (int v5 = 1; v5 < 15; v5++) {
                            for (int v6 = 0; v6 < 15; v6++) {
                                for (int v7 = 1; v7 < 15; v7++) {
                                    if(!equals(v1, v2, v3, v4, v5, v6, v7)
                                        && isOrdered(v1, v2, v3, v4, v5, v6, v7)
                                        && isDominant(v1, v2, v3, v4, v5, v6, v7)
                                    ) {
                                        System.out.println("Conjunto dominante "+count+" = {"
                                            +v1+","+v2+","+v3+","+v4+","+v5+","+v6+","+v7+"}");
                                        count++;
                                    }
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

    private boolean isDominant(int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        for (int i = 1; i < 15; i++) {
            if(i!=v1 && i!=v2 && i!=v3 && i!=v4 && i!=v5 && i!=v6 && i!=v7) {
                if(!esAdyacente(i, v1) && !esAdyacente(i, v2) && !esAdyacente(i, v3) && !esAdyacente(i, v4) && !esAdyacente(i, v5)
                    && !esAdyacente(i, v6) && !esAdyacente(i, v7)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isOrdered(int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        return v1<v2 && v2<v3 && v3<v4 && v4<v5 && v5<v6 && v6<v7;
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

    private boolean equals(int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        return equals(v1, v2, v3, v4, v5, v6) || equals(v1, v2, v3, v4, v5, v7) || equals(v2, v3, v4, v5, v6, v7);
    }
}
