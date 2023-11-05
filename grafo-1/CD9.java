public class CD9 {
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
        new CD9();
    }

    public CD9() {
        int count = 6520;
        for (int v1 = 1; v1 < 15; v1++) {
            for (int v2 = 1; v2 < 15; v2++) {
                for (int v3 = 1; v3 < 15; v3++) {
                    for (int v4 = 1; v4 < 15; v4++) {
                        for (int v5 = 1; v5 < 15; v5++) {
                            for (int v6 = 1; v6 < 15; v6++) {
                                for (int v7 = 1; v7 < 15; v7++) {
                                    for (int v8 = 1; v8 < 15; v8++) {
                                        for (int v9 = 1; v9 < 15; v9++) {
                                            if(!equals(v1, v2, v3, v4, v5, v6, v7, v8, v9)
                                                && isOrdered(v1, v2, v3, v4, v5, v6, v7, v8, v9)
                                                && isDominant(v1, v2, v3, v4, v5, v6, v7, v8, v9)
                                            ) {
                                                System.out.println("Conjunto dominante "+count+" = {"
                                                    +v1+","+v2+","+v3+","+v4+","+v5+","+v6+","+v7+","+v8+","+v9+"}");
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
        }
    }

    private boolean esAdyacente(int a, int b) {
        return mAdyacencia[a-1][b-1] == 1;
    }

    private boolean isDominant(int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9) {
        for (int i = 1; i < 15; i++) {
            if(i!=v1 && i!=v2 && i!=v3 && i!=v4 && i!=v5 && i!=v6 && i!=v7) {
                if(!esAdyacente(i, v1) && !esAdyacente(i, v2) && !esAdyacente(i, v3) && !esAdyacente(i, v4) && !esAdyacente(i, v5)
                    && !esAdyacente(i, v6) && !esAdyacente(i, v7) && !esAdyacente(i, v8) && !esAdyacente(i, v9)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isOrdered(int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9) {
        return v1<v2 && v2<v3 && v3<v4 && v4<v5 && v5<v6 && v6<v7 && v7<v8 && v8<v9;
    }

    private boolean equals(int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9) {
        return v1==v2 || v1==v3 || v1==v4 || v1==v5 || v1==v6 || v1==v7 || v1==v8 || v1==v9
                      || v2==v3 || v2==v4 || v2==v5 || v2==v6 || v2==v7 || v2==v8 || v2==v9
                                || v3==v4 || v3==v5 || v3==v6 || v3==v7 || v3==v8 || v3==v9
                                          || v4==v5 || v4==v6 || v4==v7 || v4==v8 || v4==v9
                                                    || v5==v6 || v5==v7 || v5==v8 || v5==v9
                                                              || v6==v7 || v6==v8 || v6==v9
                                                                        || v7==v8 || v7==v9
                                                                                  || v8==v9;
    }
}
