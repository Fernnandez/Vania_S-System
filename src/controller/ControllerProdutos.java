/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import java.util.List;
import model.ModelProdutos;

/**
 *
 * @author afbo2
 */
public class ControllerProdutos {
    
    private DaoProdutos daoProdutos = new DaoProdutos();
    
    /**
     * Salvar Produtos Controller
     * @param pModelProdutos
     * @return 
     */
    public int salvarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    
    }
    /**
     * Excluir um produto pelo código
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoController(int pCodigo){
        
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    /**
     * Alterar um Produto
     * @param pModelProdutos
     * @return int Codigo
     */
    public boolean alterarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    /**
     * retorna produto pelo código
     * @param pCodigo
     * @return model Produto
     */
    public  ModelProdutos retornarProdutoController(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    /**
     * retorna produto pelo código
     * @param pNomeProduto
     * @return model Produto
     */
    public  ModelProdutos retornarProdutoController(String pNomeProduto){
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }
    
    /**
     * retornar uma lista de produtos
     * @return Lista Model Produtos
     */
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
        return this.daoProdutos.retornarListaPordutosDAO();
    }    

    //alterar o estoque passando uma lista de produtos daa venda
    public boolean alterarEstoqueProdutosController(ArrayList<ModelProdutos> pListaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutosDAO(pListaModelProdutos);
    }  
}
    
