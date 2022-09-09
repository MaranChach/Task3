import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Matrix a = new Matrix(2,2);
        Matrix b = new Matrix(2,2);

        int mnozhitel = 2;

        for(int i = 0; i < a.stroki; i++){
            for(int j = 0; j < a.stolb; j++){
                a.massiv[i][j] = random.nextInt(1,11);
                b.massiv[i][j] = random.nextInt(1,11);
            }
        }

        System.out.println("Matrix а");

        a.Print();

        System.out.println("Matrix b");

        b.Print();

        System.out.println("a + b");

        Matrix resultPlus = Matrix.Plus(a, b);

        resultPlus.Print();

        System.out.println("a * " + mnozhitel);

        Matrix resultUmnozhenie = Matrix.Umnozhenie(a, mnozhitel);

        resultUmnozhenie.Print();

        System.out.println("a * b");

        Matrix resultPeremnozhenie = Matrix.Peremnozhenie(a, b);

        resultPeremnozhenie.Print();

    }
}