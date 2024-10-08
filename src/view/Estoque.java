/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerProdutos;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.InternalFrameEvent;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelProdutos;
import util.Formatador;

/**
 *
 * @author afbo2
 */
public class Estoque extends javax.swing.JInternalFrame {

    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    String salvarAlterar;
    Formatador formatador = new Formatador();

    /**
     * Creates new form Estoque
     */
    public Estoque() {
        initComponents();
        carregarProdutos();
        customTable();
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(null, Font.BOLD, 20))); // Aqui você muda o nome e tamanho da fonte.
        salvarAlterar = "salvar";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelEstoque = new javax.swing.JTabbedPane();
        painelConsulta = new javax.swing.JPanel();
        jtfPesquisa = new javax.swing.JTextField();
        jbRetornar = new javax.swing.JButton();
        painelListaDeProdutos = new javax.swing.JScrollPane();
        jtListaDeProdutos = new javax.swing.JTable();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        painelCadastro = new javax.swing.JPanel();
        jbSalvar = new javax.swing.JButton();
        jtfNomeProduto = new javax.swing.JTextField();
        jtfValorCompra = new javax.swing.JFormattedTextField();
        jtfValorVenda = new javax.swing.JFormattedTextField();
        jtfQuantidade = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(null);
        setClosable(true);
        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(1010, 580));
        setMinimumSize(new java.awt.Dimension(1010, 580));
        setPreferredSize(new java.awt.Dimension(1010, 580));

        painelEstoque.setBackground(new java.awt.Color(255, 204, 204));
        painelEstoque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        painelEstoque.setMaximumSize(new java.awt.Dimension(1010, 560));
        painelEstoque.setMinimumSize(new java.awt.Dimension(1010, 560));
        painelEstoque.setOpaque(true);
        painelEstoque.setPreferredSize(new java.awt.Dimension(1010, 560));

        painelConsulta.setBackground(new java.awt.Color(255, 204, 204));
        painelConsulta.setMaximumSize(new java.awt.Dimension(1010, 560));
        painelConsulta.setMinimumSize(new java.awt.Dimension(1010, 560));
        painelConsulta.setPreferredSize(new java.awt.Dimension(1010, 560));

        jtfPesquisa.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jtfPesquisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfPesquisa.setText("Nome do Produto");
        jtfPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfPesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfPesquisaFocusLost(evt);
            }
        });
        jtfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesquisaKeyTyped(evt);
            }
        });

        jbRetornar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/undo.png"))); // NOI18N
        jbRetornar.setText("Retornar");
        jbRetornar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRetornar.setEnabled(false);
        jbRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetornarActionPerformed(evt);
            }
        });

        painelListaDeProdutos.setBackground(new java.awt.Color(0, 0, 0));
        painelListaDeProdutos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelListaDeProdutos.setForeground(new java.awt.Color(255, 255, 255));

        jtListaDeProdutos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jtListaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Estoque", "Valor C", "Valor V", "Investimento", "Lucro U", "Lucro T"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtListaDeProdutos.setToolTipText("");
        jtListaDeProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtListaDeProdutos.setGridColor(new java.awt.Color(0, 0, 0));
        jtListaDeProdutos.setRowHeight(40);
        jtListaDeProdutos.setRowMargin(10);
        jtListaDeProdutos.setSelectionBackground(new java.awt.Color(255, 204, 255));
        jtListaDeProdutos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtListaDeProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        painelListaDeProdutos.setViewportView(jtListaDeProdutos);
        if (jtListaDeProdutos.getColumnModel().getColumnCount() > 0) {
            jtListaDeProdutos.getColumnModel().getColumn(0).setMinWidth(40);
            jtListaDeProdutos.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtListaDeProdutos.getColumnModel().getColumn(0).setMaxWidth(40);
            jtListaDeProdutos.getColumnModel().getColumn(2).setMinWidth(80);
            jtListaDeProdutos.getColumnModel().getColumn(2).setPreferredWidth(80);
            jtListaDeProdutos.getColumnModel().getColumn(2).setMaxWidth(80);
            jtListaDeProdutos.getColumnModel().getColumn(3).setMinWidth(90);
            jtListaDeProdutos.getColumnModel().getColumn(3).setPreferredWidth(90);
            jtListaDeProdutos.getColumnModel().getColumn(3).setMaxWidth(90);
            jtListaDeProdutos.getColumnModel().getColumn(4).setMinWidth(90);
            jtListaDeProdutos.getColumnModel().getColumn(4).setPreferredWidth(90);
            jtListaDeProdutos.getColumnModel().getColumn(4).setMaxWidth(90);
            jtListaDeProdutos.getColumnModel().getColumn(5).setMinWidth(150);
            jtListaDeProdutos.getColumnModel().getColumn(5).setPreferredWidth(150);
            jtListaDeProdutos.getColumnModel().getColumn(5).setMaxWidth(150);
            jtListaDeProdutos.getColumnModel().getColumn(6).setMinWidth(80);
            jtListaDeProdutos.getColumnModel().getColumn(6).setPreferredWidth(80);
            jtListaDeProdutos.getColumnModel().getColumn(6).setMaxWidth(80);
            jtListaDeProdutos.getColumnModel().getColumn(7).setMinWidth(80);
            jtListaDeProdutos.getColumnModel().getColumn(7).setPreferredWidth(80);
            jtListaDeProdutos.getColumnModel().getColumn(7).setMaxWidth(80);
        }

        jbAlterar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/pencil.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setBackground(new java.awt.Color(255, 51, 51));
        jbExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/file.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbExcluirMouseExited(evt);
            }
        });
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConsultaLayout = new javax.swing.GroupLayout(painelConsulta);
        painelConsulta.setLayout(painelConsultaLayout);
        painelConsultaLayout.setHorizontalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelListaDeProdutos)
                    .addGroup(painelConsultaLayout.createSequentialGroup()
                        .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(jbAlterar)
                        .addGap(65, 65, 65)
                        .addComponent(jbExcluir)))
                .addGap(18, 18, 18))
        );
        painelConsultaLayout.setVerticalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRetornar)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(painelListaDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelEstoque.addTab("Consulta", painelConsulta);

        painelCadastro.setBackground(new java.awt.Color(255, 204, 204));
        painelCadastro.setMaximumSize(new java.awt.Dimension(1010, 560));
        painelCadastro.setMinimumSize(new java.awt.Dimension(1010, 560));

        jbSalvar.setBackground(new java.awt.Color(102, 255, 102));
        jbSalvar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/salve-.png"))); // NOI18N
        jbSalvar.setText(" Salvar");
        jbSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jtfNomeProduto.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jtfNomeProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtfValorCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####.00"))));
        jtfValorCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfValorCompra.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jtfValorVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####.00"))));
        jtfValorVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfValorVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jtfQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfQuantidade.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/pacote.png"))); // NOI18N
        jLabel1.setText("Quantidade do Produto");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/escreve-carta.png"))); // NOI18N
        jLabel2.setText("Nome do Produto");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/money (2).png"))); // NOI18N
        jLabel3.setText("Valor de Compra");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/return-on-investment.png"))); // NOI18N
        jLabel4.setText("Valor de Venda");

        jbCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jbCancelar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/cancelar.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jtfValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jtfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jtfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(123, 123, 123)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jtfNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtfValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jtfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(jbSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCancelar)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        painelEstoque.addTab("Cadastro", painelCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirMouseEntered
        jbExcluir.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_jbExcluirMouseEntered

    private void jbExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirMouseExited
        jbExcluir.setBackground(new java.awt.Color(255, 51, 51));
    }//GEN-LAST:event_jbExcluirMouseExited

    private void jtfPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPesquisaFocusGained
        jtfPesquisa.setText("");
        jbRetornar.setEnabled(true);
    }//GEN-LAST:event_jtfPesquisaFocusGained

    private void jtfPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPesquisaFocusLost
        if (jtfPesquisa.getText().equals("")) {
            jtfPesquisa.setText("Nome do Produto");
        }
    }//GEN-LAST:event_jtfPesquisaFocusLost

    private void jbRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetornarActionPerformed
        jtfPesquisa.setText("Nome do Produto");

        pesquisarTudo();
        jbRetornar.setEnabled(false);
    }//GEN-LAST:event_jbRetornarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        //EXCLUI UM PRODUTO DO BANCO
        int respostaConfirmacao = JOptionPane.showConfirmDialog(
                rootPane,
                "Você está prestes a excluir o cadastro de um produto\n\n"
                + "(produtos vendidos não podem ser excluidos)\n\n"
                + "Deseja continuar ?",
                " Confirmação",
                JOptionPane.YES_NO_OPTION);

        //se resposa for não para continuar o registro da venda
        if (respostaConfirmacao == JOptionPane.NO_OPTION || respostaConfirmacao == JOptionPane.CLOSED_OPTION) {
            //sai do método 
            return;
        }
        int linha = jtListaDeProdutos.getSelectedRow();
        try {
            int codigoProduto = (int) jtListaDeProdutos.getValueAt(linha, 0);
            if (controllerProdutos.excluirProdutoController(codigoProduto)) {
                JOptionPane.showMessageDialog(this, "Registro do produto excluido com sucesso!!", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
                this.carregarProdutos();
            } else {
                JOptionPane.showMessageDialog(this, "Possivelmente esse produto está ligado a alguma venda \n\n"
                        + "Caso não esteja, é uma falha no sistema, entre em contato com o ADM",
                        "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro foi selecionado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if (jtfNomeProduto.getText().equals("") || jtfQuantidade.getText().equals("") || jtfValorVenda.getText().equals("")
                || jtfValorCompra.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor preencha todos os campos", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            modelProdutos.setProNome(jtfNomeProduto.getText());
            modelProdutos.setProValor(formatador.converterVirgulaParaPonto(jtfValorVenda.getText()));
            modelProdutos.setProEstoque(Integer.valueOf(jtfQuantidade.getText()));
            modelProdutos.setProValorCompra(formatador.converterVirgulaParaPonto(jtfValorCompra.getText()));
            modelProdutos.setProDesconto(10.0);
            if (salvarAlterar == "alterar") {
                if (controllerProdutos.alterarProdutoController(modelProdutos)) {
                    JOptionPane.showMessageDialog(this, "Registro do produto alterado com sucesso!!", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
                    this.carregarProdutos();
                    this.limparCampos();
                    this.painelEstoque.setSelectedIndex(0);
                    salvarAlterar = "salvar";
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao alterar o registro do produto!!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (controllerProdutos.salvarProdutoController(modelProdutos) > 0) {
                    JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!!", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
                    this.carregarProdutos();
                    this.limparCampos();

                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar o produto!!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        salvarAlterar = "alterar";
        int linha = jtListaDeProdutos.getSelectedRow();
        try {
            int codigoProduto = (int) jtListaDeProdutos.getValueAt(linha, 0);
            //recupera os dados do BD
            modelProdutos = controllerProdutos.retornarProdutoController(codigoProduto);
            //setar na interface
            jtfNomeProduto.setText(modelProdutos.getProNome());
            jtfQuantidade.setText(String.valueOf(modelProdutos.getProEstoque()));
            jtfValorVenda.setText(String.valueOf(modelProdutos.getProValor()));
            jtfValorCompra.setText(String.valueOf(modelProdutos.getProValorCompra()));
            painelEstoque.setSelectedIndex(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro foi selecionado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        int respostaConfirmacao = JOptionPane.showConfirmDialog(
                rootPane,
                "Você está prester a cancelar a operação\n\n"
                + "Deseja continuar?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

        //se resposa for não para continuar o registro da venda
        if (respostaConfirmacao == JOptionPane.NO_OPTION || respostaConfirmacao == JOptionPane.CLOSED_OPTION) {
            //sai do método 
            return;
        }

        if (salvarAlterar == "salvar") {
            limparCampos();
        } else {
            limparCampos();
            painelEstoque.setSelectedIndex(0);
            salvarAlterar = "salvar";
        }
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyTyped
        DefaultTableModel modelo = (DefaultTableModel) this.jtListaDeProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);

        jtfPesquisa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                classificador.setRowFilter(RowFilter.regexFilter("(?i)" + jtfPesquisa.getText(), 1));
                jtListaDeProdutos.setRowSorter(classificador);
            }
        });
    }//GEN-LAST:event_jtfPesquisaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbRetornar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable jtListaDeProdutos;
    private javax.swing.JTextField jtfNomeProduto;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JFormattedTextField jtfQuantidade;
    private javax.swing.JFormattedTextField jtfValorCompra;
    private javax.swing.JFormattedTextField jtfValorVenda;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPanel painelConsulta;
    private javax.swing.JTabbedPane painelEstoque;
    private javax.swing.JScrollPane painelListaDeProdutos;
    // End of variables declaration//GEN-END:variables

    //carrega os produtos do estoque
    private void carregarProdutos() {
        listaModelProdutos = controllerProdutos.retornarListaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) jtListaDeProdutos.getModel();
        double lucroUnd, lucroParcial;
        modelo.setNumRows(0);
        //inserir produtos na tabela
        int cont = listaModelProdutos.size();
        for (int i = 0; i < cont; i++) {
            lucroUnd = ((listaModelProdutos.get(i).getProValor()) - (listaModelProdutos.get(i).getProValorCompra()));
            lucroParcial = (((listaModelProdutos.get(i).getProValor()) - (listaModelProdutos.get(i).getProValorCompra())) * listaModelProdutos.get(i).getProEstoque());
            modelo.addRow(new Object[]{
                listaModelProdutos.get(i).getIdProduto(),
                listaModelProdutos.get(i).getProNome(),
                listaModelProdutos.get(i).getProEstoque(),
                listaModelProdutos.get(i).getProValorCompra(),
                listaModelProdutos.get(i).getProValor(),
                listaModelProdutos.get(i).getProValorCompra() * listaModelProdutos.get(i).getProEstoque(),
                lucroUnd,
                lucroParcial
            });
        }
    }

    //pesquisa na tabela lista de produtos com base no nome
    private void pesquisar() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtListaDeProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtListaDeProdutos.setRowSorter(classificador);
        String textoPesquisa = jtfPesquisa.getText();
        classificador.setRowFilter(RowFilter.regexFilter("(?i)" + textoPesquisa, 1));
    }

    private void pesquisarTudo() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtListaDeProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtListaDeProdutos.setRowSorter(classificador);
        String textoPesquisa = "";
        classificador.setRowFilter(RowFilter.regexFilter("(?i)" + textoPesquisa, 1));
    }

    //customização das tabelas na interface
    private void customTable() {

        JTableHeader cabecalho = jtListaDeProdutos.getTableHeader();
        cabecalho.setBackground(new java.awt.Color(255, 255, 255));
        cabecalho.setFont((new java.awt.Font("Dialog", 1, 18)));

        JTableHeader cabecalho2 = jtListaDeProdutos.getTableHeader();
        cabecalho2.setFont((new java.awt.Font("Dialog", 1, 18)));

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);

        jtListaDeProdutos.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        jtListaDeProdutos.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        jtListaDeProdutos.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        jtListaDeProdutos.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        jtListaDeProdutos.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        jtListaDeProdutos.getColumnModel().getColumn(5).setCellRenderer(centralizado);
        jtListaDeProdutos.getColumnModel().getColumn(6).setCellRenderer(centralizado);
        jtListaDeProdutos.getColumnModel().getColumn(7).setCellRenderer(centralizado);

    }

    private void limparCampos() {
        jtfNomeProduto.setText("");
        jtfQuantidade.setText("");
        jtfValorCompra.setText("");
        jtfValorVenda.setText("");
    }

    public void internalFrameClosed(InternalFrameEvent e) {
        ViewPrincipal principal = new ViewPrincipal();
        principal.estoque = null;

    }

    public void Refresh() {
        carregarProdutos();
        pesquisarTudo();
        jtfPesquisa.setText("Nome do Produto");
        painelEstoque.setSelectedIndex(0);
    }
}
