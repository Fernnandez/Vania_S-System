/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelVendas;
import model.ModelVendasCliente;

/**
 *
 * @author afbo2
 */
public class DAOVendasCliente extends ConexaoMySql {

    public ArrayList<ModelVendasCliente> getListaVendasClienteDAO() {
        ArrayList<ModelVendasCliente> listaModelVendasCliente = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendasCliente modelVendasCliente = new ModelVendasCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tbl_vendas.pk_id_vendas,"
                    + "tbl_vendas.fk_cliente,"
                    + "tbl_vendas.ven_data_venda,"
                    + "tbl_vendas.ven_valor_liquido,"
                    + "tbl_vendas.ven_valor_bruto,"
                    + "tbl_vendas.ven_desc,"
                    + "tbl_cliente.pk_id_cliente,"
                    + "tbl_cliente.cli_nome,"
                    + "tbl_cliente.cli_endereco,"
                    + "tbl_cliente.cli_bairro,"
                    + "tbl_cliente.cli_cidade,"
                    + "tbl_cliente.cli_uf,"
                    + "tbl_cliente.cli_cep,"
                    + "tbl_cliente.cli_telefone"
                    + " FROM tbl_vendas INNER JOIN tbl_cliente ON (tbl_cliente.pk_id_cliente = tbl_vendas.fk_cliente); "
                    + ";"
            );

            while (this.getResultSet().next()) {

                modelVendas = new ModelVendas();
                modelCliente = new ModelCliente();
                modelVendasCliente = new ModelVendasCliente();
                //vendas
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
                //cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(7));
                modelCliente.setCliNome(this.getResultSet().getString(8));

                modelVendasCliente.setModelVendas(modelVendas);
                modelVendasCliente.setModelCliente(modelCliente);

                listaModelVendasCliente.add(modelVendasCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVendasCliente;
    }
}
