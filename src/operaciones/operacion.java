
package operaciones;

public class operacion {
      private int a;
    private int b;

    public operacion() {
    }

    public operacion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("operacion{a=").append(a);
        sb.append(", b=").append(b);
        sb.append('}');
        return sb.toString();
    }

    //metodo de suma
    public static int sumar(int a, int b){
        return a + b;     
    }
    
    //metodo de suma
    public static int resta(int a, int b){
        return a - b;      
    }
    //metodo de suma
    public static int multiplicacion(int a, int b){
    return a * b;
    }
    
    //metodo de suma
    public static int division(int a, int b){
    return a / b;    
    }
    
}
