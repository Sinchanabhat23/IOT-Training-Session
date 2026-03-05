package arrayproblems;

public class SparseMatrix {
    public static void main(String[] args) {
        int zeroCount=0;
        int nonZeroCount=0;
        int[][] matrix = {
                {0, 0, 3},
                {0, 0, 0},
                {4, 0, 0}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                } else {
                    nonZeroCount++;
                }
            }
        }
        System.out.println("Zeros in matrix is:" + zeroCount);
        System.out.println("Non zero elements in matrix is:" + nonZeroCount);
        System.out.println(zeroCount > nonZeroCount ? "Sparse" : "Not Sparse");
    }
}
