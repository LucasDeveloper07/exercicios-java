package Composicao.Ex01.Entities;

import Composicao.Ex01.EntitiesEnum.NivelTrabalhador;
import java.util.ArrayList;
import java.util.Calendar;

public class Trabalhador {
    
    private String nome;
    private NivelTrabalhador nivel;
    private Double salarioBase;

    private Departamento departamento;
    private ArrayList<ContratoHoras> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public ArrayList<ContratoHoras> getContratoHoras() {
        return contratos;
    }

    public void addContrato(ContratoHoras contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(ContratoHoras contrato) {
        contratos.remove(contrato);
    }

    public double renda(int ano, int mes) {
        double soma = salarioBase;
        Calendar calendar = Calendar.getInstance();

        for (ContratoHoras contrato : contratos) {
            calendar.setTime(contrato.getData());
            int c_ano = calendar.get(Calendar.YEAR);
            int c_mes = 1 + calendar.get(Calendar.MONTH);

            if (c_ano == ano && c_mes == mes) {
                soma += contrato.totalContrato();
            }
        }

        return soma;
    }
}
