public class NewtonRaphson{

    private float a;
    private float xTS;
    private float ERR;
    private float xNS;
    private int n;

    public NewtonRaphson(float a, float xTS){
        this.a = a; // Tentativa inicial de solução
        this.xTS = xTS; // Solução real

        n = 0; // Número de iterações
        ERR = 0; // Erro Relativo Real
    }
    
    public void iteration(){
        Common operator = new Common();
        xNS = a - (operator.funcao(a, 0) / operator.funcao(a, 1));
        ERR = operator.calculeERR(xTS, xNS);
        a = xNS; // Novo valor de "a"
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