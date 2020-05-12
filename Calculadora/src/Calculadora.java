

class Calculadora{

    private double a;
    private double b;

    Calculadora(double a, double b){
        this.a = a;
        this.b = b;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    double mayor(){return Math.max(a,b);} // Funcion que retorna el numero mayor entre dos numeros(a y b)

    double potencia(){return Math.pow(a,b);} // Funcion que retorna un numero 'a' elevado por 'b'
}