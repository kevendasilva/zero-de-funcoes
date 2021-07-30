public class RegulaFalsi{

    private float a;
    private float b;
    private float xTS;
    private float ERR;
    private float xNS;
    private int n;

    public RegulaFalsi(float a, float b, float xTS){
        this.a = a; // [0, 3]
        this.b = b;
        this.xTS = xTS;

        n = 0; // Número de iterações
        ERR = 0; // Erro Relativo Real
    }

    public void iteration(){
        Common operator = new Common();
        xNS = (a * operator.funcao(b, 0) - b * operator.funcao(a, 0)) / (operator.funcao(b, 0) - operator.funcao(a, 0));
        if (compare(operator.funcao(a, 0), operator.funcao(xNS, 0))){
            b = xNS;
        } else {
            a = xNS;
        }
        ERR = operator.calculeERR(xTS, xNS);
        n++;
    }

    private boolean compare(float a, float b){ // Definindo novo intervalo
        /* A função verifica se o resultado de a * b é menor que 0
            Se sim:
                Saída: valor lógico "true".
            Senão:
                Saída: valor lógico "false".
        */
        if ( a * b < 0 ) {
            return true;
        } else {
            return false;
        }
    }

    public float getERR(){
        return this.ERR;
    }

    public float getxNS(){
        return this.xNS;
    }

    public int getN(){
        return this.n;
    }

}