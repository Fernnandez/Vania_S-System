/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author afbo2
 */
public class ModelProdutos {

    private int idProduto;
    private String proNome;
    private Double proValor;
    private int proEstoque;
    private Double ProValorCompra;
    private Double ProDesconto;

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the proNome
     */
    public String getProNome() {
        return proNome;
    }

    /**
     * @param proNome the proNome to set
     */
    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    /**
     * @return the proValor
     */
    public Double getProValor() {
        return proValor;
    }

    /**
     * @param proValor the proValor to set
     */
    public void setProValor(Double proValor) {
        this.proValor = proValor;
    }

    /**
     * @return the proEstoque
     */
    public int getProEstoque() {
        return proEstoque;
    }

    /**
     * @param proEstoque the proEstoque to set
     */
    public void setProEstoque(int proEstoque) {
        this.proEstoque = proEstoque;
    }

    /**
     * @return the proValorCompra
     */
    public Double getProValorCompra() {
        return ProValorCompra;
    }

    /**
     * @param proValorCompra the proValor to set
     */
    public void setProValorCompra(Double proValorCompra) {
        this.ProValorCompra = proValorCompra;
    }
    
    /**
     * @return the proDesconto
     */
    public Double getProDesconto() {
        return ProDesconto;
    }

    /**
     * @param proDesconto the proValor to set
     */
    public void setProDesconto(Double proDesconto) {
        this.ProDesconto = proDesconto;
    }
}
