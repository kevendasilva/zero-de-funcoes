public class Secante{

    private float a;
    private float b;
    private float xTS;
    private float ERR;
    private float xNS;
    private int n;

    public Secante(float a, float b, float xTS){
        // "a" e "b" são dois pontos na vizinhança da solução
        this.a = a; // x_i
        this.b = b; // x_{i - 1}
        this.xTS = xTS; // Solução real

        n = 0; // Número de iterações
        ERR = 0; // Erro Relativo Real
    }

    public void iteration(){
        Common operator = new Common();
        xNS = a - ( ( operator.funcao(a, 0) * (b - a) ) / ( operator.funcao(b, 0) - operator.funcao(a, 0) ) );
        ERR = operator.calculeERR(xTS, xNS);
        // Novos pontos
        b = a;
        a = xNS;
        n++;
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