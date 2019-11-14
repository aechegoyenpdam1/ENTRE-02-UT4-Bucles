import java.util.Random;
/**
 *    @author - Adrian Echegoyen 
 */
public class DemoBucles
{
    private final char ASTERISCO = '*';
    private final char ESPACIO = ' ';
    private Random generador;
    /**
     * Constructor  
     */
    public DemoBucles()
    {
        generador = new Random();
    }

    /**
     * Calcular la mayor potencia de 2 que es menor o igual a numero
     * Asumimos numero > 0
     * 
     * Si numero = 7 devuelve 4             numero = 8 devuelve 8
     *    numero = 19 devuelve 16           numero = 32 devuelve 32
     *    numero = 74 devuelve 64           numero = 1 devuelve 1
     *    numero = 190 devuelve 128
     *    
     *  Usa bucles while
     */
    public int mayorPotencia2(int numero) {
        int potencia = 2;
        int resto = 0;
        while (potencia <= numero){
            potencia *= 2;
        }
        if (potencia > numero){
            potencia /= 2;
        }
        return potencia;
    }

    /**
     * Escribir numero como suma de potencias de 2 
     * tal como indica el enunciado (Se asume numero > 0)
     * 
     * Todos los valores se muestran en pantalla fomateados a 6 posiciones 
     * y ajustados a la derecha
     * 
     * Hay que usar el método anterior - 
     * Utiliza bucles while
     * 
     *  77 =    64     8     4     1
     * 215 =   128    64    16     4     2     1
     *  18 =    16     2
     *  64 =    64
     */
    public void escribirSumaPotencias(int numero) {
        int potencia = 2;
        int n = numero;
        while (potencia < numero){
            potencia *= 2;
        } 
        potencia /= 2;
        while(potencia >= 1){
            n -= potencia;
            if (n <= potencia){
                System.out.print(potencia + "\t");
            }
            potencia /= 2;
        }
    }

    /**
     * Generar aleatorios entre 0 y 255
     * y escribir cada aleatorio como suma de potencias de 2
     * Parar al salir el 0 o despues de generar n aleatorios
     * (ver enunciado)
     * 
     * Hay que usar el método anterior
     * 
     * Utiliza bucles while
     * 
     */
    public void generarAleatorios(int n) {
        int aleatorio = generador.nextInt(51);
        int potencia = 2;
        int contador = 1;
        
        
        while (aleatorio != 0 || contador <= n){
        int naleatorio = generador.nextInt(51);
        System.out.println(aleatorio + " | ");
        while (potencia < aleatorio){
            potencia *= 2;
        } 
        potencia /= 2;
        while(potencia >= 1){
            n -= potencia;
            if (aleatorio <= potencia){
                System.out.print(potencia + "\t");
            }
            potencia /= 2;
        }
        contador++;
        }
    }

    /**
     *  Escribe en pantalla caracter n veces en la misma línes
     *  
     *  Usa bucles for
     */
    public void escribirCaracter(int n, char caracter)
    {
        for (int contador = 1; contador <= n; contador++){
            System.out.print(caracter);
        }
    }

    /**
     *  Genera la figura tal como muestra el enunciado 
     *  con ayuda del método anterior
     *  
     *   Usa bucles for
     */
    public  void mostrarEscalera(int escalones, int alto, int ancho) {
        for (int contador = 1; contador <= escalones; contador++){
            for(int contador2 = 1; contador2 <= ancho; contador2++){
                for(int contador3 = 1; contador2 <= ancho; contador2++){
                    System.out.print(ASTERISCO);
                }
        }
        }
    }
}

