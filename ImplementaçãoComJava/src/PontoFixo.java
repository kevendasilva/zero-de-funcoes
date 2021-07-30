public class PontoFixo{

    private float a;
    private float xTS;
    private float ERR;
    private float xNS;
    private int n;

    public PontoFixo(float a, float xTS){
        this.a = a; // Solução inicial
        this.xTS = xTS; // Solução real

        n = 0; // Número de iterações
        ERR = 0; // Erro Relativo Real
    }

    private float funcaoG(float x){
        // Como utilizamos g(x) = x, onde f(x) + x = x = g(x) ( f(x) = 0 )
        // precisamos determinar um ponto próximo ao ponto fixo
        // Onde o ponto fixo é dado por
        //
        // g(x) = y, onde y = x.
        //
        // Nota: O valor de |g'(x)| deve ser menor que 1 na vizinhança do ponto fixo.
        //
        // 
        float g;
        g = (x + (float) Math.pow(Math.E, x)) / (1 + x * ( (float) Math.pow(Math.E, x) ));
        return g;
    }
        
    public void iteration(){
        Common operator = new Common();
        xNS = funcaoG(a);
        ERR = operator.calculeERR(xTS, xNS);
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