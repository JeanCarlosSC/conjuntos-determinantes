public class CI3     {
    int[][] mAdyacencia = new int[][]{
        
    };

    public static void main(String[] args) {
        new CI3 ();
    }

    public CI3  () {
        int counter = 1;
        for (int a = 1; a < 29; a++) {
            for (int b = 1; b < 30; b++) {
                for (int c = 1; c < 31; c++) {
                    if(!equals(a, b, c) && isOrdered(a, b, c) && isIndependent(a, b, c)) {
                        System.out.println("Conjunto independiente "+counter+" = {"+a+","+b+","+c+"}");
                        counter++;
                    }
                }
            }
        }
    }

    private boolean isIndependent(int a, int b, int c) {
        return !esAdyacente(a, b) && !esAdyacente(a, c)
                                  && !esAdyacente(b, c); 
    }

    private boolean esAdyacente(int a, int b) {
        return mAdyacencia[a-1][b-1] == 1;
    }

    private boolean isOrdered(int a, int b, int c) {
        return a<b && b<c;
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