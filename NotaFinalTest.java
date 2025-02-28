package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotaFinalTest {
    private Estudante estudante1, estudante2, estudante3, estudante4;
    private avaliadorDeNotas avaliadorDeNotas; // Adicionando a instância do avaliador de notas

    @BeforeEach
    public void setup() {
        estudante1 = new Estudante("Matheus", 85.0);
        estudante2 = new Estudante("Stevao", 95.0);
        estudante3 = new Estudante("Pedro", 45.0);
        estudante4 = new Estudante("Leandro", 20.0);
    }

    @Test
    public void testDeAprovacao() {
        String notaFinal = avaliadorDeNotas.calcularNotaFinal(estudante1);
        assertEquals("Bom!", notaFinal,
                "Parabens, desempenho incrível!");
    }

    @Test
    public void testDeAprovacao2() {
        String notaFinal = avaliadorDeNotas.calcularNotaFinal(estudante2);
        assertEquals("Excelente!", notaFinal,
                "Seu desempenho foi bom, continue assim!");
    }

    @Test
    public void testDeRegularidadee() {
        String notaFinal = avaliadorDeNotas.calcularNotaFinal(estudante3);
        assertEquals("Reprovado!", notaFinal,
                "Você nao passou, mas nao desista, pode melhorar!");
    }

    @Test
    public void testDeAprovacaoIns() {
        String notaFinal = avaliadorDeNotas.calcularNotaFinal(estudante4);
        assertEquals("Reprovado!", notaFinal,
                "Você foi reprovado, estude mais para a proxima!");
    }
}
