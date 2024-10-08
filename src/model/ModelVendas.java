package model;

import java.sql.Date;

/**
 *
 * @author Fernandes
 */
public class ModelVendas {

    private int idVenda;
    private Date venDataVenda;
    private double venValorLiquido;
    private double venValorBruto;
    private double venDesconto;
    private String venTipo;
    private int venParcelas;
    private int idCliente;
    private String venEstado;
    private double venCusto;
    private double venValorPendente;
    private double venValorPago;
    /**
     * Construtor
     */
    public ModelVendas() {
    }

    /**
     * seta o valor de idVenda
     *
     * @param pIdVenda
     */
    public void setIdVenda(int pIdVenda) {
        this.idVenda = pIdVenda;
    }

    /**
     * @return pk_idVenda
     */
    public int getIdVenda() {
        return this.idVenda;
    }

    /**
     * seta o valor de venData
     *
     * @param pVenData
     */
    public void setVenDataVenda(Date pVenData) {
        this.venDataVenda = pVenData;
    }

    /**
     * @return venData
     */
    public Date getVenDataVenda() {
        return this.venDataVenda;
    }

    /**
     * seta o valor de venValorLiquido
     *
     * @param pVenValorLiquido
     */
    public void setVenValorLiquido(double pVenValorLiquido) {
        this.venValorLiquido = pVenValorLiquido;
    }

    /**
     * @return venValorLiquido
     */
    public double getVenValorLiquido() {
        return this.venValorLiquido;
    }

    /**
     * seta o valor de venValorBruto
     *
     * @param pVenValorBruto
     */
    public void setVenValorBruto(double pVenValorBruto) {
        this.venValorBruto = pVenValorBruto;
    }

    /**
     * @return venValorBruto
     */
    public double getVenValorBruto() {
        return this.venValorBruto;
    }

    /**
     * seta o valor de venDesconto
     *
     * @param pVenDesconto
     */
    public void setVenDesconto(double pVenDesconto) {
        this.venDesconto = pVenDesconto;
    }

    /**
     * @return venDesconto
     */
    public double getVenDesconto() {
        return this.venDesconto;
    }

    /**
     * seta o valor de venTipo
     *
     * @param pVenTipo
     */
    public void setVenTipo(String pVenTipo) {
        this.venTipo = pVenTipo;
    }

    /**
     * @return venTipo
     */
    public String getVenTipo() {
        return this.venTipo;
    }

    /**
     * seta o valor de venParcelas
     *
     * @param pVenParcelas
     */
    public void setVenParcelas(int pVenParcelas) {
        this.venParcelas = pVenParcelas;
    }

    /**
     * @return venParcelas
     */
    public int getVenParcelas() {
        return this.venParcelas;
    }

    /**
     * seta o valor do Cliente
     *
     * @param pIdVenda
     */
    public void setCliente(int pIdCliente) {
        this.idCliente = pIdCliente;
    }

    /**
     * @return fk_Cliente
     */
    public int getCliente() {
        return this.idCliente;
    }

    /**
     * seta o valor de venEstado
     *
     * @param pVenEstado
     */
    public void setVenEstado(String pVenEstado) {
        this.venEstado = pVenEstado;
    }

    /**
     * @return venEstado
     */
    public String getVenEstado() {
        return this.venEstado;
    }

    /**
     * seta o valor de custo da venda
     *
     * @param pVenCusto
     */
    public void setVenCusto(double pVenCusto) {
        this.venCusto = pVenCusto;
    }

    /**
     * @return venCusto
     */
    public double getVenCusto() {
        return this.venCusto;
    }
    
        /**
     * seta o valor de custo da venda
     *
     * @param pVenCusto
     */
    public void setVenValorPendente(double pVenValorPendente) {
        this.venValorPendente = pVenValorPendente;
    }

    /**
     * @return venCusto
     */
    public double getVenValorPendente() {
        return this.venValorPendente;
    }
    
            /**
     * seta o valor de custo da venda
     *
     * @param pVenCusto
     */
    public void setVenValorPago(double pVenValorPago) {
        this.venValorPago = pVenValorPago;
    }

    /**
     * @return venCusto
     */
    public double getVenValorPago() {
        return this.venValorPago;
    }

    @Override
    public String toString() {
        return "ModelVendasEfetuadas {" + "::idVenda = " + this.idVenda + "::venData = " + this.venDataVenda + "::venValorLiquido = " + this.venValorLiquido + "::venValorBruto = " + this.venValorBruto + "::venDesconto = " + this.venDesconto + "::venTipo = " + this.venTipo + "::venParcelas = " + this.venParcelas + "}";
    }
}
