package model;

public class CalculadoraModel {
    private double resultado;
    private double operando;
    private String operacao;

    public CalculadoraModel() {
        this.resultado = 0;
        this.operando = 0;
        this.operacao = "";
    }

 
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getOperando() {
        return operando;
    }

    public void setOperando(double operando) {
        this.operando = operando;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    @Override
    public String toString() {
        return "CalculadoraModel [resultado=" + resultado + ", operando=" + operando + ", operacao=" + operacao + "]";
    }
}
