/**
 * raccolta dei principali operatori matematici
 * @Giada Dall'Ara
 */
public class ArithmeticOperators02 {
    /**
     * metodo per determinare la somma di due valori
     * @param num1 -> primo valore preso
     * @param num2 -> secondo valore preso
     * @return -> ritorna la somma dei valori presi
     */
    public int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    /**
     * metodo per determinare la differenza di due valori
     * @param num1 ->primo valore preso
     * @param num2 ->secondo valore preso
     * @return ->ritorna la differenza dei valori, il risultato sarà negativo
     */
    public int sub(int num1, int num2){
        int sub = num1 - num2;
        return sub;
    }
    /**
     * metodo per determinare il prodotto fra due valori
     * @param num1 ->primo valore preso
     * @param num2 ->secondo valore preso
     * @return ->ritorna il prodotto
     */
    public int mul(int num1, int num2){
        int mul = num1 * num2;
        return mul;
    }

    /**
     * metodo: divisione fra interi, non verranno presi in considerazione i decimali
     * @param num1
     * @param num2
     * @return
     */
    public int div(int num1, int num2){
        int div = num1/num2;
        return div;
    }
}
