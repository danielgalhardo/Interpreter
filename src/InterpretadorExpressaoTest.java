import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class InterpretadorExpressaoTest {

    @Test
    void deveTransformarStringEmBinario()
    {
        String stringConversao = "2 em binario";
        InterpretadorAplicacao ia = new InterpretadorAplicacao(new InterpretadorContexto());
        assertEquals("10", ia.interpretar(stringConversao));
    }

    @Test
    void deveTransformarStringEmHexadecimal()
    {
        String stringConversao = "17 em hexadecimal";
        InterpretadorAplicacao ia = new InterpretadorAplicacao(new InterpretadorContexto());
        assertEquals("11", ia.interpretar(stringConversao));
    }

    @Test
    void deveTransformarStringEmOctal()
    {
        String stringConversao = "9 em octal";
        InterpretadorAplicacao ia = new InterpretadorAplicacao(new InterpretadorContexto());
        assertEquals("11", ia.interpretar(stringConversao));
    }

    @Test
    void deveRetornarStringEnviada()
    {
        String stringConversao = "300 em base mil";
        InterpretadorAplicacao ia = new InterpretadorAplicacao(new InterpretadorContexto());
        assertEquals("300 em base mil", ia.interpretar(stringConversao));
    }

}
