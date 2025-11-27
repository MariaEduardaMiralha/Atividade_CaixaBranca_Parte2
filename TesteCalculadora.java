package calculadora;

/**
 * <p><strong>Classe de Execução e Verificação da Calculadora</strong></p>
 *
 * <p>Esta classe tem como finalidade executar uma sequência de testes com a
 * classe {@link Calculadora}, permitindo observar o funcionamento das operações
 * aritméticas implementadas e verificar o comportamento da aplicação diante de
 * situações inválidas.</p>
 *
 * <p>Ao longo da execução, diferentes cenários são avaliados:</p>
 * <ul>
 *     <li>Chamadas diretas ao método {@code calcular()}</li>
 *     <li>Exibição dos resultados de operações matemáticas simples</li>
 *     <li>Tratamento de erros decorrentes de entradas inadequadas</li>
 * </ul>
 *
 * <p>Esta classe é utilizada exclusivamente para fins de teste e ilustração,
 * não sendo parte essencial da lógica de negócio.</p>
 *
 * @author Maria Eduarda Miralha
 */
public class TesteCalculadora {

    /**
     * <p>Método principal responsável por iniciar a execução dos testes realizados
     * com a classe {@link Calculadora}. Cada operação é avaliada individualmente,
     * exibindo seu resultado ou a mensagem de erro correspondente.</p>
     *
     * <p>Entre os cenários apresentados estão:</p>
     * <ul>
     *     <li>Operações válidas envolvendo adição, subtração, multiplicação e divisão</li>
     *     <li>Teste de divisão por zero, que gera exceção</li>
     *     <li>Envio de operador inválido, também resultando em exceção</li>
     * </ul>
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


