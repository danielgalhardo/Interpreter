public class ExpressaoInteiraPraHexadecimal implements InterpretadorExpressao{

    private int numeroConverter;

    public ExpressaoInteiraPraHexadecimal(int numero)
    {
        this.numeroConverter = numero;
    }


    @Override
    public String interpretar(InterpretadorContexto interpretador) {
        return interpretador.getBaseDezesseis(this.numeroConverter);
    }
}
