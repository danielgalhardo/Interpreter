

public class ExpressaoInteiraPraBinario implements InterpretadorExpressao{

    private int numeroConverter;

    public ExpressaoInteiraPraBinario(int numero)
    {
        this.numeroConverter = numero;
    }

    @Override
    public String interpretar(InterpretadorContexto interpretador)
    {
        return interpretador.getBaseDois(this.numeroConverter);
    }


}
