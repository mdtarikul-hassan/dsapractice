public class RotateMatrix {
    static int[][] rotateClockwise(int[][] matrix){
    // --------- brute force approach ----------- O(n2)
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j< n; j++){
                rotated[j][n-i-1] = matrix[i][j];
            }
        }
        return rotated;
    }
    public static void main(String[] args) {
         int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] rotated = rotateClockwise(mat);

        for (int[] row : rotated) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
