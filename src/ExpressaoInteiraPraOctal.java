public class ExpressaoInteiraPraOctal implements InterpretadorExpressao{

    private int numeroConverter;

    public ExpressaoInteiraPraOctal(int numero)
    {
        this.numeroConverter = numero;
    }

    @Override
    public String interpretar(InterpretadorContexto interpretador) {
        return interpretador.getBaseOito(this.numeroConverter);
    }
}