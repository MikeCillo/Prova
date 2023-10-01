public class Calcolatrice {

    private int x;
    private int y;
    private int result;

    public Calcolatrice(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int somma(int x, int y) {
        return result = x + y;
    }

    public int sottrazione(int x, int y) {
        return result = x - y;
    }

    public int divisione(int x, int y) {
        return result = x / y;
    }

    public int moltiplicazione(int x, int y) {
        return result = x * y;
    }

    public void pariDispari(int result) {
        if (result % 2 == 0) {
            System.out.println("numero pari\n");
        } else if (result % 2 != 0) {
            System.out.println("numero dispari\n");
        }


    }
}