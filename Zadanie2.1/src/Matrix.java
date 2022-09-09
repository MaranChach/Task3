public class Matrix {
    int stroki;
    int stolb;
    int[][] massiv;

    public Matrix(int stroki_, int stolb_){
        stroki = stroki_;
        stolb = stolb_;
        massiv = new int[stroki_][stolb_];
    }

    public void Print(){
        for(int i = 0; i < stroki; i++){
            for(int j = 0; j < stolb; j++){
                System.out.print("\t" + massiv[i][j]);
            }
            System.out.println();
        }
    }

    public static Matrix Plus(Matrix a, Matrix b){
        Matrix result = new Matrix(a.stroki, a.stolb);

        for(int i = 0; i < a.stroki; i++){
            for(int j = 0; j < a.stolb; j++){
                result.massiv[i][j] = a.massiv[i][j] + b.massiv[i][j];
            }
        }

        return result;
    }

    public static Matrix Umnozhenie(Matrix a, int mnozhitel){
        Matrix result = new Matrix(a.stroki, a.stolb);

        for(int i = 0; i < a.stroki; i++){
            for(int j = 0; j < a.stolb; j++){
                result.massiv[i][j] = a.massiv[i][j] * mnozhitel;
            }
        }

        return result;
    }

    public static Matrix Peremnozhenie(Matrix a, Matrix b){
        Matrix result = new Matrix(a.stroki, a.stolb);

        for(int i = 0; i < a.stroki; i++){
            for(int j = 0; j < a.stolb; j++){
                for(int k = 0; k < a.stolb; k++) {
                    result.massiv[i][j] = result.massiv[i][j] + a.massiv[i][k] * b.massiv[k][j];
                }
            }
        }

        return result;
    }


}
