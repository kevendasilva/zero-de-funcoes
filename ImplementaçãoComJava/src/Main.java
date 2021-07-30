class Main{
    public static void main(String[] args){
        // Erro mínimo escolhido
        float e = 0.003f;
        // Vá para a classe Common se desejar alterar a função utilizada nos métodos.
        // Em caso de alteração da função escolhida, deve-se também alterar a função
        // iterativa (g(x)) do método do ponto fixo.


        
        /* Método da Bisseção */

        // Os parâmetros são a e b, tal que [a, b], e a solução pertence ao intervalo
        // E o último parâmetro é o valor exato da solução.
        System.out.print("\n \n /* Método da Bisseção */ \n \n");
        Bissecao method1 = new Bissecao(0, 3, 1);
        do {
            method1.iteration();
            System.out.printf("Iteração %d e o valor de ERR =  %.4f .\n", method1.getN(), method1.getERR());
        } while(method1.getERR() > e);
        System.out.printf("\n O número de iterações foi %d e o valor de xNS = %.6f.\n\n", method1.getN(), method1.getxNS());
        


        /* Método Regula Falsi */

        // Os parâmetros são a e b, tal que [a, b], e a solução pertence ao intervalo
        // E o último parâmetro é o valor exato da solução.
        RegulaFalsi method2 = new RegulaFalsi(0, 3, 1);
        System.out.print("\n \n /* Método Regula Falsi */ \n \n");
        do {
            method2.iteration();
            System.out.printf("Iteração %d e o valor de ERR =  %.4f .\n", method2.getN(), method2.getERR());
        } while(method2.getERR() > e);
        System.out.printf("\n O número de iterações foi %d e o valor de xNS = %.6f.\n\n", method2.getN(), method2.getxNS());



        /* Método da Secante */

        // Os parâmetros são a e b, são dois pontos na vizinhança da solução
        // E o último parâmetro é o valor exato da solução.
        Secante method3 = new Secante(2, 3, 1);
        System.out.print("\n \n /* Método da Secante */ \n \n");
        do {
            method3.iteration();
            System.out.printf("Iteração %d e o valor de ERR =  %.4f .\n", method3.getN(), method3.getERR());
        } while(method3.getERR() > e);
        System.out.printf("\n O número de iterações foi %d e o valor de xNS = %.6f.\n\n", method3.getN(), method3.getxNS());



        /* Método do Ponto Fixo */
        
        // O 'a' indica a primeira estimativa de solução.
        // E o último parâmetro é o valor exato da solução.
        PontoFixo method4 = new PontoFixo(2, 1);
        System.out.print("\n \n /* Método do Ponto Fixo */ \n \n");
        do {
            method4.iteration();
            System.out.printf("Iteração %d e o valor de ERR =  %.4f .\n", method4.getN(), method4.getERR());
        } while(method4.getERR() > e);
        System.out.printf("\n O número de iterações foi %d e o valor de xNS = %.6f.\n\n", method4.getN(), method4.getxNS());



        /* Método de Newton-Raphson */
        
        // O 'a' indica a primeira estimativa de solução.
        // E o último parâmetro é o valor exato da solução.
        NewtonRaphson method5 = new NewtonRaphson(3, 1);
        System.out.print("\n \n /* Método de Newton-Raphson */ \n \n");
        do {
            method5.iteration();
            System.out.printf("Iteração %d e o valor de ERR =  %.4f .\n", method5.getN(), method5.getERR());
        } while(method5.getERR() > e);
        System.out.printf("\n O número de iterações foi %d e o valor de xNS = %.6f.\n\n", method5.getN(), method5.getxNS());

    }
}