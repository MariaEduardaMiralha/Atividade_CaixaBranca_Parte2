package calculadora;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a operação
 * desejada com base em um operador informado pelo usuário.</p>
 *
 * <p>Esse projeto é utilizado para demonstrar:</p>
 * <ul>
 *     <li>Técnicas de revisão estática (caixa branca)</li>
 *     <li>Técnicas de revisão (caixa branca)</li>
 *     <li>Aplicação de refatoração em código Java</li>
 *     <li>Documentação com Javadoc</li>
 * </ul>
 *
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 *
 * @author Maria Eduarda Miralha
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * subtrai dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da subtração de {@code a} e {@code b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da multiplicação de {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * divide dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da divisão de {@code a} e {@code b}
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * <p>Executa a operação matemática solicitada com base no operador informado.</p>
     *
     * <p>Operadores aceitos:</p>
     * <ul>
     *     <li>"+": Soma</li>
     *     <li>"-": Subtração</li>
     *     <li>"*": Multiplicação</li>
     *     <li>"/": Divisão</li>
     * </ul>
     *
     * <p>Qualquer operador inválido resulta em exceção.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação correspondente ao operador informado
     * @throws IllegalArgumentException se o operador não for um símbolo válido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}
