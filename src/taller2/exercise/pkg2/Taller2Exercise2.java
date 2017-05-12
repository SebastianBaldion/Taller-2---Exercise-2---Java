
package taller2.exercise.pkg2;

/**
 *
 * @author Sebastian Baldion
 */
public class Taller2Exercise2 {

    public static void main(String[] args) {
        int A[] = {50, 100, 79, 20, 50, 61, 20, 79, 61, 510 ,100};   
        int cont = 0;
        
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {

                if (A[i] == A[j]) {

                    cont++;
            }
        }

            if (cont == 1) {
            System.out.println("El valor que no se repite en la secuencia es: " + A[i]);
        }
                cont = 0;
        }

    }

}

