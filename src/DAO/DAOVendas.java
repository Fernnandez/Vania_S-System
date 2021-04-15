package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVendas;

/**
 *
 * @author Fernandes
 */
public class DAOVendas extends ConexaoMySql {

    /**
     * grava VendasEfetuadas
     *
     * @param pModelVendasEfetuadas
     * @return int
     */
    public int salvarVendasDAO(ModelVendas pModelVendas) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_vendas ("
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto,"
                    + "ven_tipo,"
                    + "ven_parcelas,"
                    + "fk_cliente,"
                    + "ven_estado,"
                    + "ven_custo"
                    + ") VALUES ("
                    + "'" + pModelVendas.getVenDataVenda() + "',"
                    + "'" + pModelVendas.getVenValorLiquido() + "',"
                    + "'" + pModelVendas.getVenValorBruto() + "',"
                    + "'" + pModelVendas.getVenDesconto() + "',"
                    + "'" + pModelVendas.getVenTipo() + "',"
                    + "'" + pModelVendas.getVenParcelas() + "',"
                    + "'" + pModelVendas.getCliente() + "',"
                    + "'" + pModelVendas.getVenEstado() + "',"
                    + "'" + pModelVendas.getVenCusto() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera VendasEfetuadas
     *
     * @param pIdVenda
     * @return ModelVendasEfetuadas
     */
    public ModelVendas getVendasDAO(int pIdVenda) {
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_vendas,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto,"
                    + "ven_tipo,"
                    + "ven_parcelas,"
                    + "fk_cliente,"
                    + "ven_estado,"
                    + "ven_custo"
                    + " FROM"
                    + " tbl_vendas"
                    + " WHERE"
                    + " pk_id_vendas = '" + pIdVenda + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(2));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(3));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(4));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(5));
                modelVendas.setVenTipo(this.getResultSet().getString(6));
                modelVendas.setVenParcelas(this.getResultSet().getInt(7));
                modelVendas.setCliente(this.getResultSet().getInt(8));
                modelVendas.setVenEstado(this.getResultSet().getString(9));
                modelVendas.setVenCusto(this.getResultSet().getDouble(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendas;
    }

    /**
     * recupera uma lista de VendasEfetuadas
     *
     * @return ArrayList
     */
    public ArrayList<ModelVendas> getListaVendasDAO() {
        ArrayList<ModelVendas> listamodelVendas = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_vendas,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto,"
                    + "ven_tipo,"
                    + "ven_parcelas,"
                    + "fk_cliente,"
                    + "ven_estado,"
                    + "ven_custo"
                    + " FROM"
                    + " tbl_vendas WHERE ven_estado = 'pago' ORDER BY ven_data_venda DESC"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendas = new ModelVendas();
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(2));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(3));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(4));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(5));
                modelVendas.setVenTipo(this.getResultSet().getString(6));
                modelVendas.setVenParcelas(this.getResultSet().getInt(7));
                modelVendas.setCliente(this.getResultSet().getInt(8));
                modelVendas.setVenEstado(this.getResultSet().getString(9));
                modelVendas.setVenCusto(this.getResultSet().getDouble(10));
                listamodelVendas.add(modelVendas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendas;
    }

    public ArrayList<ModelVendas> getListaVendasPendentesDAO() {
        ArrayList<ModelVendas> listamodelVendas = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_vendas,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto,"
                    + "ven_tipo,"
                    + "ven_parcelas,"
                    + "fk_cliente,"
                    + "ven_estado,"
                    + "ven_custo"
                    + " FROM"
                    + " tbl_vendas WHERE ven_estado = 'pendente' ORDER BY ven_data_venda DESC"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendas = new ModelVendas();
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(2));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(3));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(4));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(5));
                modelVendas.setVenTipo(this.getResultSet().getString(6));
                modelVendas.setVenParcelas(this.getResultSet().getInt(7));
                modelVendas.setCliente(this.getResultSet().getInt(8));
                modelVendas.setVenEstado(this.getResultSet().getString(9));
                modelVendas.setVenCusto(this.getResultSet().getDouble(10));
                listamodelVendas.add(modelVendas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendas;
    }

    /**
     * atualiza VendasEfetuadas
     *
     * @param pModelVendasEfetuadas
     * @return boolean
     */
    public boolean atualizarVendasDAO(ModelVendas pModelVendas) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_vendas SET "
                    + "pk_id_vendas = '" + pModelVendas.getIdVenda() + "',"
                    + "ven_data_venda = '" + pModelVendas.getVenDataVenda() + "',"
                    + "ven_valor_liquido = '" + pModelVendas.getVenValorLiquido() + "',"
                    + "ven_valor_bruto = '" + pModelVendas.getVenValorBruto() + "',"
                    + "ven_desconto = '" + pModelVendas.getVenDesconto() + "',"
                    + "ven_tipo = '" + pModelVendas.getVenTipo() + "',"
                    + "ven_parcelas = '" + pModelVendas.getVenParcelas() + "',"
                    + "fk_cliente = '" + pModelVendas.getCliente() + "',"
                    + "ven_estado = '" + pModelVendas.getVenEstado() + "',"
                    + "ven_custo = '" + pModelVendas.getVenEstado() + "'"
                    + " WHERE "
                    + "pk_id_vendas = '" + pModelVendas.getIdVenda() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean atualizarEstadoVendasDAO(ModelVendas pModelVendas) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_vendas SET "
                    + "ven_estado = '" + pModelVendas.getVenEstado() + "'"
                    + " WHERE "
                    + "pk_id_vendas = '" + pModelVendas.getIdVenda() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui VendasEfetuadas
     *
     * @param pIdVenda
     * @return boolean
     */
    public boolean excluirVendasDAO(int pIdVenda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_vendas "
                    + " WHERE "
                    + "pk_id_vendas = '" + pIdVenda + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
