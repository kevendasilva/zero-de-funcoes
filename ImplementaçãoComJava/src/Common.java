public class Common{

    public float calculeERR(float xTS, float xNS){
        float ERR;
        // Erro Relativo Real
        ERR = (float) Math.abs( (xTS - xNS) / xTS );
        return ERR;
    }

    public float funcao(float x, int order){
        // Função escolhida: f(x) = x^2 - 1
        float f = 0;
        // Utilizando (float) para "dizer" que f é do tipo float

        

        switch(order){
            case 0:
                f = (float) Math.pow(x, 2) - 1;
                break;
            case 1:
                f = (float) 2 * x;
                break;
            default:
                break;
        }

        return (f);
    }

}