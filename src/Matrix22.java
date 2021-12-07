public class Matrix22 {
    private final double[][] matrix = new double[2][2];

    public Matrix22(double a, double b, double c, double d) {
        this(new double[][]{{a, b}, {c, d}});
    }

    private Matrix22() {
        this(new double[][]{{0, 0}, {0, 0}});
    }

    public Matrix22(double[][] matrix) {
        for (int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                this.matrix[i][j] = matrix[i][j];
    }

    public double[][] getArray() {
        return new Matrix22(this.matrix).matrix;
    }

    public double[] getASD() {
        return new double[]{this.matrix[0][0] + this.matrix[1][1], this.matrix[0][0] * this.matrix[1][1] - this.matrix[0][1] * this.matrix[1][0]};
    }


    @Override
    public String toString() {
        return "{{" + this.matrix[0][0] + "," + this.matrix[0][1] + "},{" + this.matrix[1][0] + "," + this.matrix[1][1] + "}}";
    }

    public void print() {
        String s = "";
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                double cur = this.matrix[i][j];
                s += cur + " ".repeat(String.valueOf(Math.max(this.matrix[0][j], this.matrix[1][j])).length() - String.valueOf(cur).length() + 1);
            }
            s += '\n';
        }
        System.out.print(s);
    }

    public Matrix22 add(Matrix22 mat) {
        Matrix22 res = new Matrix22();
        for (int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                res.matrix[i][j] = this.matrix[i][j] + mat.matrix[i][j];
        return res;
    }

    public Matrix22 mul(Matrix22 mat) {
        Matrix22 res = new Matrix22();
        for (int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                res.matrix[i][j] = this.matrix[i][0] * mat.matrix[0][j] + this.matrix[i][1] * mat.matrix[1][j];
        return res;
    }

    public Matrix22 pow(int n) {
        Matrix22 res = this;
        for (int i = 1; i < n; ++i)
            res = res.mul(this);
        return res;
    }

    public static class Rotation extends Matrix22 {
        private final double angle;

        public Rotation(double angle) {
            super(Math.sin(angle * Math.PI / 180), Math.cos(angle * Math.PI / 180), -Math.cos(angle * Math.PI / 180), Math.sin(angle * Math.PI / 180));
            this.angle = angle;
        }

        public double getAngle() {

            return this.angle;
        }
    }
}
