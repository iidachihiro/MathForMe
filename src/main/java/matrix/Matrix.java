package matrix;

public class Matrix {
    private double[][] matrix;
    
    public Matrix(double[] vector) {
        this.matrix = new double[vector.length][1];
        for (int i = 0; i < vector.length; i++) {
            matrix[i][0] = vector[i];
        }
    }
    
    public Matrix(double[][] vector) {
        this.matrix = new double[vector.length][vector[0].length];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                matrix[i][j] = vector[i][j];
            }
        }
    }
}
