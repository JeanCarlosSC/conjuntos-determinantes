public class CD13 {
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
        new CD13();
    }

    public CD13() {
        int count = 9659;
        for (int v1 = 1; v1 < 3; v1++) {
            for (int v2 = 1; v2 < 4; v2++) {
                for (int v3 = 1; v3 < 5; v3++) {
                    for (int v4 = 1; v4 < 6; v4++) {
                        for (int v5 = 1; v5 < 7; v5++) {
                            for (int v6 = 1; v6 < 8; v6++) {
                                for (int v7 = 1; v7 < 9; v7++) {
                                    for (int v8 = 1; v8 < 10; v8++) {
                                        for (int v9 = 1; v9 < 11; v9++) {
                                            for (int v10 = 1; v10 < 12; v10++) {
                                                for (int v11 = 1; v11 < 13; v11++) {
                                                    for (int v12 = 1; v12 < 14; v12++) {
                                                        for (int v13 = 1; v13 < 15; v13++) {
                                                            if(!equals(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
                                                                && isOrdered(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
                                                                && isDominant(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
                                                            ) {
                                                                System.out.println("Conjunto dominante "+count+" = {"
                                                                    +v1+","+v2+","+v3+","+v4+","+v5+","+v6+","+v7+","+v8+","+v9+","+v10+","+v11+","+v12+","+v13+"}");
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
                }
            }
        }
    }

    private boolean esAdyacente(int a, int b) {
        return mAdyacencia[a-1][b-1] == 1;
    }

    private boolean isDominant(int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, int v10, int v11, int v12, int v13) {
        for (int i = 1; i < 15; i++) {
            if(i!=v1 && i!=v2 && i!=v3 && i!=v4 && i!=v5 && i!=v6 && i!=v7&& i!=v8&& i!=v9 && i!=v10 && i!=v11 && i!=v12 && i!=v13) {
                if(!esAdyacente(i, v1) && !esAdyacente(i, v2) && !esAdyacente(i, v3) && !esAdyacente(i, v4) && !esAdyacente(i, v5)
                    && !esAdyacente(i, v6) && !esAdyacente(i, v7) && !esAdyacente(i, v8) && !esAdyacente(i, v9) && !esAdyacente(i, v10)
                    && !esAdyacente(i, v11) && !esAdyacente(i, v12) && !esAdyacente(i, v13)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isOrdered(int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, int v10, int v11, int v12, int v13) {
        return v1<v2 && v2<v3 && v3<v4 && v4<v5 && v5<v6 && v6<v7 && v7<v8 && v8<v9 && v9<v10 && v10<v11 && v11<v12 && v12<v13;
    }

    private boolean equals(int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, int v10, int v11, int v12, int v13) {
        return v1==v2 || v1==v3 || v1==v4 || v1==v5 || v1==v6 || v1==v7 || v1==v8 || v1==v9 || v1==v10 || v1==v11 || v1==v12 || v1==v13
                      || v2==v3 || v2==v4 || v2==v5 || v2==v6 || v2==v7 || v2==v8 || v2==v9 || v2==v10 || v2==v11 || v2==v12 || v2==v13
                                || v3==v4 || v3==v5 || v3==v6 || v3==v7 || v3==v8 || v3==v9 || v3==v10 || v3==v11 || v3==v12 || v3==v13
                                          || v4==v5 || v4==v6 || v4==v7 || v4==v8 || v4==v9 || v4==v10 || v4==v11 || v4==v12 || v4==v13
                                                    || v5==v6 || v5==v7 || v5==v8 || v5==v9 || v5==v10 || v5==v11 || v5==v12 || v5==v13
                                                              || v6==v7 || v6==v8 || v6==v9 || v6==v10 || v6==v11 || v6==v12 || v6==v13
                                                                        || v7==v8 || v7==v9 || v7==v10 || v7==v11 || v7==v12 || v7==v13
                                                                                  || v8==v9 || v8==v10 || v8==v11 || v8==v12 || v8==v13
                                                                                            || v9==v10 || v9==v11 || v9==v12 || v9==v13
                                                                                                       || v10==v11|| v10==v12|| v10==v13
                                                                                                                  || v11==v12|| v11==v13
                                                                                                                             || v12==v13;
    }
}
