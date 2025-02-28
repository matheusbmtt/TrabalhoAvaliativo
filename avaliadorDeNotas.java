package org.example;

public class avaliadorDeNotas {
    public static String calcularNotaFinal(Estudante Estudante) {
        if (Estudante.getNotaFinal() < 0 || Estudante.getNotaFinal() > 100) {
            return "Erro: A nota do estudante deve estar entre 0 e 100!";
        }

        if (Estudante.getNotaFinal() >= 90) {
            return "Excelente!";

        } else if (Estudante.getNotaFinal() < 90) {
            return "Bom!";
        } else if (Estudante.getNotaFinal() >= 75) {
            return "Bom!";
        } else if (Estudante.getNotaFinal() <= 75) {
            return "Regular!";
        } else if (Estudante.getNotaFinal() >= 50) {
            return "Regular!";
        } else if (Estudante.getNotaFinal() < 50) {
            return "Insuficiente";
        } else if (Estudante.getNotaFinal() >= 30) {
            return "Insuficiente";
        } else if (Estudante.getNotaFinal() < 30) {
            return "Reprovado";
        } else {
            return "Esta é a nota final do estudante!";
        }
    }
}
