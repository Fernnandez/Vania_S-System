/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author afbo2
 */
public class TableModelProdutos extends AbstractTableModel {

    private ArrayList<ModelProdutos> listaDeProdutos;
    private ModelProdutos modelProduto;
    private String[] colunas = {"CÓDIGO", "Produto", "Valor"};

    public TableModelProdutos() {
        this.listaDeProdutos = new ArrayList<>();
    }

    public void addProduto(ModelProdutos pProduto) {
        this.listaDeProdutos.add(pProduto);
        fireTableDataChanged();
    }

    public void removeProduto(int rowIndex) {
        this.listaDeProdutos.remove(rowIndex);
        fireTableDataChanged();
    }

    public ModelProdutos getProduto(int rowIndex) {
        return this.listaDeProdutos.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return this.listaDeProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                return this.listaDeProdutos.get(rowIndex).getIdProduto();

            case 1:
                return this.listaDeProdutos.get(rowIndex).getProNome();

            case 2:
                return this.listaDeProdutos.get(rowIndex).getProValor();

            default:
                return this.listaDeProdutos.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }


}
