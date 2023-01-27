/**
 * classe pricipale, prova della funzionalità dei metodi
 * @Giada Dall'Ara
 */
public class Test02 {
    public static void main(String[] args) {
        ArithmeticOperators02 arithmeticOperators02 = new ArithmeticOperators02();
        System.out.println("La somma è: " + arithmeticOperators02.sum(3, 4));        //7
        System.out.println("La differenza è: " + arithmeticOperators02.sub(3, 4));   //-1
        System.out.println("Il prodotto è: " + arithmeticOperators02.mul(3, 4));     //12
        System.out.println("La divisione è: " + arithmeticOperators02.div(3, 4));    //0
    }
}
