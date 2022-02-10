public class InterpretadorContexto {

    public String getBaseDois(int i)
    {
        return  Integer.toBinaryString(i);
    }

    public String getBaseDezesseis(int i) {
        return  Integer.toHexString(i);
    }

    public String getBaseOito(int i) {
        return  Integer.toOctalString(i);
    }
}
