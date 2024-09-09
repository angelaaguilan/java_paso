package ejercicios;

public class DecimalABinario {
    public static void main(String[] args) {
        /* 14. Conversión de decimal a binario
            Descripción: Dado el número decimal a = 45, conviértelo a binario.
            Variables: a = 45.
            EJEMPLO: a = 79, binario = 1111001.
79, es un número impar, por lo que tomamos el 1. Lo dividimos entre 2 (39, redondeamos sin decimales).
39, es un número impar, tomamos otro 1. Lo dividimos entre dos (19, igualmente redondeado, sin decimales).
19, también número impar, tomamos otro 1. Lo dividimos entre dos (9, siempre redondeamos sin decimales).
9, otro número impar, por lo que tomamos otro 1. Lo dividimos entre dos (4, redondeado hacia abajo, siempre).
4, es un número par, así que tomamos un 0. Lo dividimos entre dos (2, división exacta por lo que no hay que redondear).
2, es número par, otro 0 que sacamos. Lo dividimos entre dos (1, también división exacta).
1, número impar, tomamos otro 1.
Ya hemos llegado al uno así que ya no se puede dividir más.
Apuntamos los resultados del primero al último y nos da que al convertir de decimal a binario el número 79 nos sale 1111001.
         */

        int a = 45;
        int b = a;
        String binario = "";
        while (b > 0) {
            if (Math.round(b % 2) == 0) {
                binario = "0" + binario;
            } else {
                binario = "1" + binario;
            }
            b =  Math.round(b/2);
            System.out.println(binario);
        }
        System.out.println("El binario de " + a + " es " + binario );
    }
}
