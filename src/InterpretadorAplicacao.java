public class InterpretadorAplicacao {

    public InterpretadorContexto interpretador;

    public InterpretadorAplicacao(InterpretadorContexto i)
    {
        this.interpretador = i;
    }

    public String interpretar(String stringConversao)
    {
        InterpretadorExpressao expressao = null;

        int numero = Integer.parseInt(stringConversao.substring(0, stringConversao.indexOf(" ")));
        if (stringConversao.contains("hexadecimal"))
        {
            expressao = new ExpressaoInteiraPraHexadecimal(numero);
        }
        else if (stringConversao.contains("binario"))
        {
            expressao = new ExpressaoInteiraPraBinario(numero);
        }
        else if (stringConversao.contains("octal"))
        {
            expressao = new ExpressaoInteiraPraOctal(numero);
        }
        else return stringConversao;

        return expressao.interpretar(interpretador);
    }
}
