package ejercicios;

public class NumeroPrimo {
    public static void main(String[] args) {
        /*  4. Números primos
            Descripción: Dado el número a = 29, determina si es primo.
            Un número primo solo tiene dos divisores: 1 y él mismo.
            Variables: a = 29.
         */
        int a = 29;
        int maximo = Math.round(a/2);

        if (a % 2 == 0) {
            System.out.println("Número no es  primo, es par");
            return;
        } else {
            for (int i = 3; i < maximo; i = i+2) {
                if (a % i == 0) {
                    System.out.println("Número NO es primo");
                    return;
                }
            }   System.out.println("Número es PRIMO");
        }
    }
}
