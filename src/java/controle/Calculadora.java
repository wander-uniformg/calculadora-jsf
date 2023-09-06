/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;
import jakarta.faces.bean.SessionScoped;

/**
 *
 * @author wander
 */
@ManagedBean(name = "calc")
@SessionScoped
public class Calculadora {
    
    private double operador1;
    private double operador2;
    private double resultado;
    
    private String mensagem;

    
    public Calculadora() {
        inicializar();
        
    }
    
    public String voltar() {
        inicializar();
        return "index.xhtml?faces-redirect=true";
    }
    
    private void inicializar() {
        operador1 = 0;
        operador2 = 0;
        resultado = 0;
        mensagem = "operação";
    }
    
    public String somar() {
        resultado = operador1 + operador2;
        mensagem = "soma";
        return "resultado.xhtml?faces-redirect=true";
    }
    
    public String subtrair() {
        resultado = operador1 - operador2;
        mensagem = "subtração";
        return "resultado.xhtml";
    }
    
    public String multiplicar() {
        resultado = operador1 * operador2;
        mensagem = "multiplicação";
        return "resultado.xhtml";
    }
    
    public String dividir() {
        resultado = operador1 / operador2;
        mensagem = "divisão";
        return "resultado.xhtml";
    }

    public double getOperador1() {
        return operador1;
    }

    public void setOperador1(double operador1) {
        this.operador1 = operador1;
    }

    public double getOperador2() {
        return operador2;
    }

    public void setOperador2(double operador2) {
        this.operador2 = operador2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
