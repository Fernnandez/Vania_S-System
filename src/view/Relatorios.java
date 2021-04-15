package view;

import util.Som;
import controller.ControllerCliente;
import controller.ControllerProdutos;
import controller.ControllerProdutosVendasProdutos;
import controller.ControllerVendas;
import controller.ControllerVendasProdutos;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.event.InternalFrameEvent;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCliente;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendas;
import model.ModelVendasProdutos;

/**
 *
 * @author afbo2
 */
public class Relatorios extends javax.swing.JInternalFrame {

    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();

    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();

    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList<>();

    ArrayList<ModelVendas> listaModelVendas = new ArrayList<>();
    ControllerVendas controllerVendas = new ControllerVendas();
    ModelVendas modelVendas = new ModelVendas();

    ControllerProdutosVendasProdutos controllerProdutosVendasProdutos = new ControllerProdutosVendasProdutos();
    ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
    ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();

    Double ValorCompra = 0.0, Valor = 0.0;
    Som som = new Som();
    String status;

    TableRowSorter classificador;

    public Relatorios() {
        initComponents();
        Indices();
        carregarVendas();
        carregarVendasPendentes();
        customTable();

        painel1.setVisible(false);
        painel2.setVisible(false);
        painelInfoCliente.setEnabled(false);

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(null, Font.BOLD, 20)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelVendas = new javax.swing.JPanel();
        painelTabelas = new javax.swing.JPanel();
        painelTVendas = new javax.swing.JScrollPane();
        jtVendas = new javax.swing.JTable();
        painelTProdutosDaVenda = new javax.swing.JScrollPane();
        jtProdutosDaVenda = new javax.swing.JTable();
        painelBotões = new javax.swing.JPanel();
        jbExibir = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        painelOpcoesSuperior2 = new javax.swing.JPanel();
        painelPesquisaPorData = new javax.swing.JPanel();
        jbPesquisar = new javax.swing.JButton();
        jbRetornar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jdata = new com.toedter.calendar.JDateChooser();
        painelOpcoesSuperior = new javax.swing.JPanel();
        painel1 = new javax.swing.JPanel();
        jtfLucroDaVenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        painel2 = new javax.swing.JPanel();
        jtfQuantidadeDeProdutos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        painelVendasPendentes = new javax.swing.JPanel();
        painelTabelas1 = new javax.swing.JPanel();
        painelTVendas1 = new javax.swing.JScrollPane();
        jtVendasPendentes = new javax.swing.JTable();
        painelTProdutosDaVenda1 = new javax.swing.JScrollPane();
        jtProdutosDaVendaPendente = new javax.swing.JTable();
        painelBotões1 = new javax.swing.JPanel();
        jbExibirVP = new javax.swing.JButton();
        jbVoltarVP = new javax.swing.JButton();
        painelSuperior = new javax.swing.JPanel();
        painelPesquisa = new javax.swing.JPanel();
        painelPesquisaPorData1 = new javax.swing.JPanel();
        jbPesquisar1 = new javax.swing.JButton();
        jdataVP = new com.toedter.calendar.JDateChooser();
        jbRetornar1 = new javax.swing.JButton();
        jtfPesquisaNome = new javax.swing.JTextField();
        jbPesquisarNome = new javax.swing.JButton();
        painelInfoCliente = new javax.swing.JPanel();
        painelTelefone = new javax.swing.JPanel();
        jtfTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        painelCliente = new javax.swing.JPanel();
        jtfCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        painelValor = new javax.swing.JPanel();
        jtfValor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jbExcluirVP = new javax.swing.JButton();
        jbPagarVP = new javax.swing.JButton();
        painelIndicadores = new javax.swing.JPanel();
        jtfMargemDeLucro = new javax.swing.JTextField();
        jtfCapitalInvestido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(null);
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1500, 740));
        setMinimumSize(new java.awt.Dimension(1500, 740));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1500, 740));

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 204));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTabbedPane1.setOpaque(true);

        painelVendas.setBackground(new java.awt.Color(255, 204, 204));
        painelVendas.setPreferredSize(new java.awt.Dimension(1495, 750));

        painelTabelas.setLayout(new javax.swing.OverlayLayout(painelTabelas));

        painelTVendas.setBackground(new java.awt.Color(204, 204, 204));
        painelTVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtVendas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "DATA", "Valor da Venda", "Lucro da Venda", "Tipo da Venda", "Parcelas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtVendas.setGridColor(new java.awt.Color(0, 0, 0));
        jtVendas.setRowHeight(35);
        jtVendas.setRowMargin(10);
        jtVendas.setSelectionBackground(new java.awt.Color(255, 204, 255));
        jtVendas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtVendas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtVendas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtVendasKeyPressed(evt);
            }
        });
        painelTVendas.setViewportView(jtVendas);
        if (jtVendas.getColumnModel().getColumnCount() > 0) {
            jtVendas.getColumnModel().getColumn(0).setMinWidth(90);
            jtVendas.getColumnModel().getColumn(0).setPreferredWidth(90);
            jtVendas.getColumnModel().getColumn(0).setMaxWidth(90);
            jtVendas.getColumnModel().getColumn(1).setMinWidth(180);
            jtVendas.getColumnModel().getColumn(1).setPreferredWidth(180);
            jtVendas.getColumnModel().getColumn(1).setMaxWidth(180);
            jtVendas.getColumnModel().getColumn(2).setMinWidth(180);
            jtVendas.getColumnModel().getColumn(2).setPreferredWidth(180);
            jtVendas.getColumnModel().getColumn(2).setMaxWidth(180);
            jtVendas.getColumnModel().getColumn(3).setMinWidth(180);
            jtVendas.getColumnModel().getColumn(3).setPreferredWidth(180);
            jtVendas.getColumnModel().getColumn(3).setMaxWidth(180);
            jtVendas.getColumnModel().getColumn(4).setHeaderValue("Tipo da Venda");
            jtVendas.getColumnModel().getColumn(5).setMinWidth(90);
            jtVendas.getColumnModel().getColumn(5).setPreferredWidth(90);
            jtVendas.getColumnModel().getColumn(5).setMaxWidth(90);
            jtVendas.getColumnModel().getColumn(5).setHeaderValue("Parcelas");
        }

        painelTabelas.add(painelTVendas);

        painelTProdutosDaVenda.setBackground(new java.awt.Color(204, 204, 204));
        painelTProdutosDaVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtProdutosDaVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtProdutosDaVenda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jtProdutosDaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Produto", "Quantidade Vendida", "Valor de Venda", "Lucro por Unidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProdutosDaVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtProdutosDaVenda.setGridColor(new java.awt.Color(0, 0, 0));
        jtProdutosDaVenda.setRowHeight(35);
        jtProdutosDaVenda.setRowMargin(10);
        jtProdutosDaVenda.setSelectionBackground(new java.awt.Color(255, 204, 255));
        jtProdutosDaVenda.setSelectionForeground(new java.awt.Color(0, 0, 0));
        painelTProdutosDaVenda.setViewportView(jtProdutosDaVenda);
        if (jtProdutosDaVenda.getColumnModel().getColumnCount() > 0) {
            jtProdutosDaVenda.getColumnModel().getColumn(0).setMinWidth(90);
            jtProdutosDaVenda.getColumnModel().getColumn(0).setPreferredWidth(90);
            jtProdutosDaVenda.getColumnModel().getColumn(0).setMaxWidth(90);
        }

        painelTabelas.add(painelTProdutosDaVenda);

        painelBotões.setLayout(new javax.swing.OverlayLayout(painelBotões));

        jbExibir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbExibir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/mais-informacoes.png"))); // NOI18N
        jbExibir.setText("Exibir");
        jbExibir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExibir.setMaximumSize(new java.awt.Dimension(150, 50));
        jbExibir.setMinimumSize(new java.awt.Dimension(150, 50));
        jbExibir.setPreferredSize(new java.awt.Dimension(150, 50));
        jbExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExibirActionPerformed(evt);
            }
        });
        painelBotões.add(jbExibir);

        jbVoltar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/undo.png"))); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbVoltar.setMaximumSize(new java.awt.Dimension(150, 50));
        jbVoltar.setMinimumSize(new java.awt.Dimension(150, 50));
        jbVoltar.setPreferredSize(new java.awt.Dimension(150, 50));
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });
        painelBotões.add(jbVoltar);

        jbExcluir.setBackground(new java.awt.Color(255, 51, 51));
        jbExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/file.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExcluir.setMaximumSize(new java.awt.Dimension(100, 50));
        jbExcluir.setMinimumSize(new java.awt.Dimension(100, 50));
        jbExcluir.setPreferredSize(new java.awt.Dimension(100, 50));
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

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

        painelOpcoesSuperior2.setBackground(new java.awt.Color(255, 204, 204));

        painelPesquisaPorData.setBackground(new java.awt.Color(255, 204, 204));

        jbPesquisar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/pesquisa-de-dados.png"))); // NOI18N
        jbPesquisar.setText("Pesquisar");
        jbPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbRetornar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jbRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/undo.png"))); // NOI18N
        jbRetornar.setText("Retornar");
        jbRetornar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRetornar.setEnabled(false);
        jbRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetornarActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/icone_2.png"))); // NOI18N

        jdata.setBackground(new java.awt.Color(255, 204, 255));
        jdata.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout painelPesquisaPorDataLayout = new javax.swing.GroupLayout(painelPesquisaPorData);
        painelPesquisaPorData.setLayout(painelPesquisaPorDataLayout);
        painelPesquisaPorDataLayout.setHorizontalGroup(
            painelPesquisaPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaPorDataLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jdata, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(painelPesquisaPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jbRetornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(229, 229, 229))
        );
        painelPesquisaPorDataLayout.setVerticalGroup(
            painelPesquisaPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaPorDataLayout.createSequentialGroup()
                .addGroup(painelPesquisaPorDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPesquisaPorDataLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jbPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbRetornar))
                    .addGroup(painelPesquisaPorDataLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPesquisaPorDataLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jdata, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout painelOpcoesSuperior2Layout = new javax.swing.GroupLayout(painelOpcoesSuperior2);
        painelOpcoesSuperior2.setLayout(painelOpcoesSuperior2Layout);
        painelOpcoesSuperior2Layout.setHorizontalGroup(
            painelOpcoesSuperior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOpcoesSuperior2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(painelPesquisaPorData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelOpcoesSuperior2Layout.setVerticalGroup(
            painelOpcoesSuperior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOpcoesSuperior2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(painelPesquisaPorData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(painelOpcoesSuperior2);

        painelOpcoesSuperior.setBackground(new java.awt.Color(255, 204, 204));

        painel1.setBackground(new java.awt.Color(255, 204, 204));

        jtfLucroDaVenda.setEditable(false);
        jtfLucroDaVenda.setBackground(new java.awt.Color(255, 204, 204));
        jtfLucroDaVenda.setFont(new java.awt.Font("Maiandra GD", 0, 36)); // NOI18N
        jtfLucroDaVenda.setForeground(new java.awt.Color(0, 0, 0));
        jtfLucroDaVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLucroDaVenda.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Lucro da venda");

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jtfLucroDaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(129, 129, 129))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfLucroDaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        painel2.setBackground(new java.awt.Color(255, 204, 204));

        jtfQuantidadeDeProdutos.setEditable(false);
        jtfQuantidadeDeProdutos.setBackground(new java.awt.Color(255, 204, 204));
        jtfQuantidadeDeProdutos.setFont(new java.awt.Font("Maiandra GD", 0, 36)); // NOI18N
        jtfQuantidadeDeProdutos.setForeground(new java.awt.Color(0, 0, 0));
        jtfQuantidadeDeProdutos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfQuantidadeDeProdutos.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Quantidade de Produtos");

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfQuantidadeDeProdutos)
                .addContainerGap())
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel4)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jtfQuantidadeDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout painelOpcoesSuperiorLayout = new javax.swing.GroupLayout(painelOpcoesSuperior);
        painelOpcoesSuperior.setLayout(painelOpcoesSuperiorLayout);
        painelOpcoesSuperiorLayout.setHorizontalGroup(
            painelOpcoesSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOpcoesSuperiorLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        painelOpcoesSuperiorLayout.setVerticalGroup(
            painelOpcoesSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOpcoesSuperiorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelOpcoesSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(painelOpcoesSuperior);

        javax.swing.GroupLayout painelVendasLayout = new javax.swing.GroupLayout(painelVendas);
        painelVendas.setLayout(painelVendasLayout);
        painelVendasLayout.setHorizontalGroup(
            painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVendasLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelBotões, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(524, 524, 524))
            .addGroup(painelVendasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        painelVendasLayout.setVerticalGroup(
            painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelTabelas, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelBotões, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        jTabbedPane1.addTab("Vendas", painelVendas);

        painelVendasPendentes.setBackground(new java.awt.Color(255, 204, 204));
        painelVendasPendentes.setPreferredSize(new java.awt.Dimension(1495, 750));

        painelTabelas1.setLayout(new javax.swing.OverlayLayout(painelTabelas1));

        painelTVendas1.setBackground(new java.awt.Color(204, 204, 204));
        painelTVendas1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtVendasPendentes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtVendasPendentes.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jtVendasPendentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "DATA", "Cliente", "Valor da Venda", "Lucro da Venda", "Estado da venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtVendasPendentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtVendasPendentes.setGridColor(new java.awt.Color(0, 0, 0));
        jtVendasPendentes.setRowHeight(40);
        jtVendasPendentes.setRowMargin(10);
        jtVendasPendentes.setSelectionBackground(new java.awt.Color(255, 204, 255));
        jtVendasPendentes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtVendasPendentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtVendasPendentes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtVendasPendentesKeyPressed(evt);
            }
        });
        painelTVendas1.setViewportView(jtVendasPendentes);
        if (jtVendasPendentes.getColumnModel().getColumnCount() > 0) {
            jtVendasPendentes.getColumnModel().getColumn(0).setMinWidth(90);
            jtVendasPendentes.getColumnModel().getColumn(0).setPreferredWidth(90);
            jtVendasPendentes.getColumnModel().getColumn(0).setMaxWidth(90);
            jtVendasPendentes.getColumnModel().getColumn(1).setMinWidth(180);
            jtVendasPendentes.getColumnModel().getColumn(1).setPreferredWidth(180);
            jtVendasPendentes.getColumnModel().getColumn(1).setMaxWidth(180);
            jtVendasPendentes.getColumnModel().getColumn(3).setMinWidth(180);
            jtVendasPendentes.getColumnModel().getColumn(3).setPreferredWidth(180);
            jtVendasPendentes.getColumnModel().getColumn(3).setMaxWidth(180);
            jtVendasPendentes.getColumnModel().getColumn(4).setMinWidth(180);
            jtVendasPendentes.getColumnModel().getColumn(4).setPreferredWidth(180);
            jtVendasPendentes.getColumnModel().getColumn(4).setMaxWidth(180);
            jtVendasPendentes.getColumnModel().getColumn(5).setMinWidth(180);
            jtVendasPendentes.getColumnModel().getColumn(5).setPreferredWidth(180);
            jtVendasPendentes.getColumnModel().getColumn(5).setMaxWidth(180);
        }

        painelTabelas1.add(painelTVendas1);

        painelTProdutosDaVenda1.setBackground(new java.awt.Color(204, 204, 204));
        painelTProdutosDaVenda1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtProdutosDaVendaPendente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtProdutosDaVendaPendente.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jtProdutosDaVendaPendente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Produto", "Quantidade Vendida", "Valor de Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProdutosDaVendaPendente.setGridColor(new java.awt.Color(0, 0, 0));
        jtProdutosDaVendaPendente.setRowHeight(40);
        jtProdutosDaVendaPendente.setRowMargin(10);
        jtProdutosDaVendaPendente.setSelectionBackground(new java.awt.Color(255, 204, 255));
        jtProdutosDaVendaPendente.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtProdutosDaVendaPendente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        painelTProdutosDaVenda1.setViewportView(jtProdutosDaVendaPendente);
        if (jtProdutosDaVendaPendente.getColumnModel().getColumnCount() > 0) {
            jtProdutosDaVendaPendente.getColumnModel().getColumn(0).setMinWidth(90);
            jtProdutosDaVendaPendente.getColumnModel().getColumn(0).setPreferredWidth(90);
            jtProdutosDaVendaPendente.getColumnModel().getColumn(0).setMaxWidth(90);
        }

        painelTabelas1.add(painelTProdutosDaVenda1);

        painelBotões1.setLayout(new javax.swing.OverlayLayout(painelBotões1));

        jbExibirVP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbExibirVP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/mais-informacoes.png"))); // NOI18N
        jbExibirVP.setText("Exibir");
        jbExibirVP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExibirVP.setMaximumSize(new java.awt.Dimension(150, 50));
        jbExibirVP.setMinimumSize(new java.awt.Dimension(150, 50));
        jbExibirVP.setPreferredSize(new java.awt.Dimension(150, 50));
        jbExibirVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExibirVPActionPerformed(evt);
            }
        });
        painelBotões1.add(jbExibirVP);

        jbVoltarVP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbVoltarVP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/undo.png"))); // NOI18N
        jbVoltarVP.setText("Voltar");
        jbVoltarVP.setMaximumSize(new java.awt.Dimension(150, 50));
        jbVoltarVP.setMinimumSize(new java.awt.Dimension(150, 50));
        jbVoltarVP.setPreferredSize(new java.awt.Dimension(150, 50));
        jbVoltarVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarVPActionPerformed(evt);
            }
        });
        painelBotões1.add(jbVoltarVP);

        painelSuperior.setBackground(new java.awt.Color(255, 204, 204));
        painelSuperior.setLayout(new javax.swing.OverlayLayout(painelSuperior));

        painelPesquisa.setBackground(new java.awt.Color(255, 204, 204));

        painelPesquisaPorData1.setBackground(new java.awt.Color(255, 204, 204));

        jbPesquisar1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jbPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/pesquisa-de-dados.png"))); // NOI18N
        jbPesquisar1.setText("Pesquisar");
        jbPesquisar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisar1ActionPerformed(evt);
            }
        });

        jdataVP.setToolTipText("Infome a data");
        jdataVP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jbRetornar1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jbRetornar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/undo.png"))); // NOI18N
        jbRetornar1.setText("Retornar");
        jbRetornar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRetornar1.setEnabled(false);
        jbRetornar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetornar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPesquisaPorData1Layout = new javax.swing.GroupLayout(painelPesquisaPorData1);
        painelPesquisaPorData1.setLayout(painelPesquisaPorData1Layout);
        painelPesquisaPorData1Layout.setHorizontalGroup(
            painelPesquisaPorData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaPorData1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdataVP, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(painelPesquisaPorData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbPesquisar1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jbRetornar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        painelPesquisaPorData1Layout.setVerticalGroup(
            painelPesquisaPorData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaPorData1Layout.createSequentialGroup()
                .addGroup(painelPesquisaPorData1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPesquisaPorData1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jdataVP, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPesquisaPorData1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jbPesquisar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbRetornar1)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jtfPesquisaNome.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jtfPesquisaNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfPesquisaNome.setText("Nome do Cliente");
        jtfPesquisaNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfPesquisaNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfPesquisaNomeFocusLost(evt);
            }
        });
        jtfPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisaNomeActionPerformed(evt);
            }
        });
        jtfPesquisaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesquisaNomeKeyTyped(evt);
            }
        });

        jbPesquisarNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbPesquisarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/undo.png"))); // NOI18N
        jbPesquisarNome.setText("Retornar");
        jbPesquisarNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPesquisarNome.setEnabled(false);
        jbPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPesquisaLayout = new javax.swing.GroupLayout(painelPesquisa);
        painelPesquisa.setLayout(painelPesquisaLayout);
        painelPesquisaLayout.setHorizontalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(painelPesquisaPorData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(jtfPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbPesquisarNome)
                .addGap(19, 19, 19))
        );
        painelPesquisaLayout.setVerticalGroup(
            painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaLayout.createSequentialGroup()
                .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPesquisaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(painelPesquisaPorData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPesquisaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(painelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbPesquisarNome)
                            .addComponent(jtfPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSuperior.add(painelPesquisa);

        painelInfoCliente.setBackground(new java.awt.Color(255, 204, 204));

        painelTelefone.setBackground(new java.awt.Color(255, 204, 204));

        jtfTelefone.setEditable(false);
        jtfTelefone.setBackground(new java.awt.Color(255, 204, 204));
        jtfTelefone.setFont(new java.awt.Font("Maiandra GD", 0, 36)); // NOI18N
        jtfTelefone.setForeground(new java.awt.Color(0, 0, 0));
        jtfTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfTelefone.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefone");

        javax.swing.GroupLayout painelTelefoneLayout = new javax.swing.GroupLayout(painelTelefone);
        painelTelefone.setLayout(painelTelefoneLayout);
        painelTelefoneLayout.setHorizontalGroup(
            painelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelefoneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTelefoneLayout.createSequentialGroup()
                        .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTelefoneLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(136, 136, 136))))
        );
        painelTelefoneLayout.setVerticalGroup(
            painelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTelefoneLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        painelCliente.setBackground(new java.awt.Color(255, 204, 204));

        jtfCliente.setEditable(false);
        jtfCliente.setBackground(new java.awt.Color(255, 204, 204));
        jtfCliente.setFont(new java.awt.Font("Maiandra GD", 0, 36)); // NOI18N
        jtfCliente.setForeground(new java.awt.Color(0, 0, 0));
        jtfCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCliente.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cliente");

        javax.swing.GroupLayout painelClienteLayout = new javax.swing.GroupLayout(painelCliente);
        painelCliente.setLayout(painelClienteLayout);
        painelClienteLayout.setHorizontalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfCliente)
                .addContainerGap())
            .addGroup(painelClienteLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel6)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClienteLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jtfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        painelValor.setBackground(new java.awt.Color(255, 204, 204));

        jtfValor.setEditable(false);
        jtfValor.setBackground(new java.awt.Color(255, 204, 204));
        jtfValor.setFont(new java.awt.Font("Maiandra GD", 0, 36)); // NOI18N
        jtfValor.setForeground(new java.awt.Color(0, 0, 0));
        jtfValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfValor.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Valor da Venda");

        javax.swing.GroupLayout painelValorLayout = new javax.swing.GroupLayout(painelValor);
        painelValor.setLayout(painelValorLayout);
        painelValorLayout.setHorizontalGroup(
            painelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelValorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelValorLayout.createSequentialGroup()
                        .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelValorLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(94, 94, 94))))
        );
        painelValorLayout.setVerticalGroup(
            painelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelValorLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout painelInfoClienteLayout = new javax.swing.GroupLayout(painelInfoCliente);
        painelInfoCliente.setLayout(painelInfoClienteLayout);
        painelInfoClienteLayout.setHorizontalGroup(
            painelInfoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(painelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(painelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelInfoClienteLayout.setVerticalGroup(
            painelInfoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelInfoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSuperior.add(painelInfoCliente);

        jbExcluirVP.setBackground(new java.awt.Color(255, 51, 51));
        jbExcluirVP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbExcluirVP.setForeground(new java.awt.Color(0, 0, 0));
        jbExcluirVP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/file.png"))); // NOI18N
        jbExcluirVP.setText("Excluir");
        jbExcluirVP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExcluirVP.setMaximumSize(new java.awt.Dimension(150, 50));
        jbExcluirVP.setMinimumSize(new java.awt.Dimension(150, 50));
        jbExcluirVP.setPreferredSize(new java.awt.Dimension(150, 50));
        jbExcluirVP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbExcluirVPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbExcluirVPMouseExited(evt);
            }
        });
        jbExcluirVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirVPActionPerformed(evt);
            }
        });

        jbPagarVP.setBackground(new java.awt.Color(102, 255, 102));
        jbPagarVP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbPagarVP.setForeground(new java.awt.Color(0, 0, 0));
        jbPagarVP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vania's bg/receber-valor.png"))); // NOI18N
        jbPagarVP.setText("Pagar");
        jbPagarVP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPagarVP.setMaximumSize(new java.awt.Dimension(150, 50));
        jbPagarVP.setMinimumSize(new java.awt.Dimension(150, 50));
        jbPagarVP.setPreferredSize(new java.awt.Dimension(150, 50));
        jbPagarVP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPagarVPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbPagarVPMouseExited(evt);
            }
        });
        jbPagarVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPagarVPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelVendasPendentesLayout = new javax.swing.GroupLayout(painelVendasPendentes);
        painelVendasPendentes.setLayout(painelVendasPendentesLayout);
        painelVendasPendentesLayout.setHorizontalGroup(
            painelVendasPendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendasPendentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVendasPendentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTabelas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVendasPendentesLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jbExcluirVP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbPagarVP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelBotões1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(527, 527, 527))
        );
        painelVendasPendentesLayout.setVerticalGroup(
            painelVendasPendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVendasPendentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelTabelas1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelVendasPendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotões1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelVendasPendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbExcluirVP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbPagarVP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vendas Pendentes", painelVendasPendentes);

        jtfMargemDeLucro.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jtfMargemDeLucro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtfCapitalInvestido.setEditable(false);
        jtfCapitalInvestido.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jtfCapitalInvestido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Margem de lucro");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Capital Investido");

        javax.swing.GroupLayout painelIndicadoresLayout = new javax.swing.GroupLayout(painelIndicadores);
        painelIndicadores.setLayout(painelIndicadoresLayout);
        painelIndicadoresLayout.setHorizontalGroup(
            painelIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelIndicadoresLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jtfCapitalInvestido, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 562, Short.MAX_VALUE)
                .addComponent(jtfMargemDeLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelIndicadoresLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(123, 123, 123))
        );
        painelIndicadoresLayout.setVerticalGroup(
            painelIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelIndicadoresLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(painelIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(painelIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCapitalInvestido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMargemDeLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(359, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Indicadores", painelIndicadores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetornarActionPerformed
        pesquisarTudo();
        jdata.setDate(null);
        jbRetornar.setEnabled(false);
    }//GEN-LAST:event_jbRetornarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        if (jdata.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhuma data informada!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        pesquisar();
        jbRetornar.setEnabled(true);
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = jtVendas.getSelectedRow();
        try {
            int codigoVenda = (int) jtVendas.getValueAt(linha, 0);

            som.som();
            int respostaConfirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Você está prestes a excluir um registro.\n\n"
                    + "Deseja continuar?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);

            if (respostaConfirmacao == JOptionPane.NO_OPTION) {
                //sai do método
                return;
            }

            controllerVendasProdutos.excluirVendasProdutosController(codigoVenda);
            if (controllerVendas.excluirVendasController(codigoVenda)) {
                JOptionPane.showMessageDialog(this, "Registro da venda excluido com sucesso ", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir registro da venda", "ERRO", JOptionPane.ERROR_MESSAGE);
            }

            listaModelProdutos = new ArrayList<>();
            listaModelProdutosVendasProdutos = controllerProdutosVendasProdutos.getListaProdutosVendaProdutosController(codigoVenda);
            for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getIdProduto());
                modelProdutos.setProEstoque(
                        listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProEstoque()
                        + listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade());
                listaModelProdutos.add(modelProdutos);
            }
            //alterando o estoque passando a lista de produtos da venda cancelada
            if (controllerProdutos.alterarEstoqueProdutosController(listaModelProdutos)) {
                controllerVendasProdutos.excluirVendasProdutosController(codigoVenda);
                if (controllerVendas.excluirVendasController(codigoVenda)) {
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao retornar os produtos da venda para o estoque", "ERRO", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir venda", "ERRO", JOptionPane.ERROR_MESSAGE);
            }

            this.carregarVendas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro foi selecionado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExibirActionPerformed
        exibir();
    }//GEN-LAST:event_jbExibirActionPerformed

    private void jtVendasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtVendasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            exibir();
        }
    }//GEN-LAST:event_jtVendasKeyPressed

    private void jtVendasPendentesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtVendasPendentesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVendasPendentesKeyPressed

    private void jbExibirVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExibirVPActionPerformed
        enviarValor();

    }//GEN-LAST:event_jbExibirVPActionPerformed

    private void jbVoltarVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarVPActionPerformed
        voltarVP();
    }//GEN-LAST:event_jbVoltarVPActionPerformed

    private void jbExcluirVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirVPActionPerformed
        int linha = jtVendasPendentes.getSelectedRow();
        try {
            int codigoVenda = (int) jtVendasPendentes.getValueAt(linha, 0);

            som.som();
            int respostaConfirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Você está prestes a excluir um registro.\n\n"
                    + "Deseja continuar?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);

            if (respostaConfirmacao == JOptionPane.NO_OPTION) {
                //sai do método
                return;
            }

            listaModelProdutos = new ArrayList<>();
            listaModelProdutosVendasProdutos = controllerProdutosVendasProdutos.getListaProdutosVendaProdutosController(codigoVenda);
            for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getIdProduto());
                modelProdutos.setProEstoque(
                        listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProEstoque()
                        + listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade());
                listaModelProdutos.add(modelProdutos);
            }
            //alterando o estoque passando a lista de produtos da venda cancelada
            if (controllerProdutos.alterarEstoqueProdutosController(listaModelProdutos)) {
                controllerVendasProdutos.excluirVendasProdutosController(codigoVenda);
                if (controllerVendas.excluirVendasController(codigoVenda)) {
                    JOptionPane.showMessageDialog(this, "Registro da venda excluido com sucesso ", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao retornar para o estoque os produtos da venda", "ERRO", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir registro da venda", "ERRO", JOptionPane.ERROR_MESSAGE);
            }

            this.carregarVendasPendentes();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro foi selecionado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbExcluirVPActionPerformed

    private void jbPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisar1ActionPerformed
        if (jdata.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhuma data informada!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        jbRetornar1.setEnabled(true);
        pesquisarDataVP();
    }//GEN-LAST:event_jbPesquisar1ActionPerformed

    private void jbRetornar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetornar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRetornar1ActionPerformed

    private void jtfPesquisaNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPesquisaNomeFocusGained
        jbPesquisarNome.setEnabled(true);
        jtfPesquisaNome.setText("");
    }//GEN-LAST:event_jtfPesquisaNomeFocusGained

    private void jtfPesquisaNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPesquisaNomeFocusLost
        if (jtfPesquisaNome.getText().equals("")) {
            jtfPesquisaNome.setText("Nome do Produto");
            jbPesquisarNome.setEnabled(false);
        }
    }//GEN-LAST:event_jtfPesquisaNomeFocusLost

    private void jbPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarNomeActionPerformed
        jtfPesquisaNome.setText("");
        pesquisarVP();
    }//GEN-LAST:event_jbPesquisarNomeActionPerformed

    private void jtfPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisaNomeActionPerformed

    private void jtfPesquisaNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaNomeKeyTyped
        DefaultTableModel modelo = (DefaultTableModel) this.jtVendasPendentes.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);

        jtfPesquisaNome.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                classificador.setRowFilter(RowFilter.regexFilter("(?i)" + jtfPesquisaNome.getText(), 2));
                jtVendasPendentes.setRowSorter(classificador);
            }
        });

    }//GEN-LAST:event_jtfPesquisaNomeKeyTyped

    private void jbPagarVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPagarVPActionPerformed
        int linha = jtVendasPendentes.getSelectedRow();
        try {
            int codigoVenda = (int) jtVendasPendentes.getValueAt(linha, 0);
            modelVendas = controllerVendas.getVendasController(codigoVenda);
            int codigoCliente = modelVendas.getCliente();
            modelCliente = controllerCliente.getClienteController(codigoCliente);
            int respostaConfirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Confirma ter recebido o valor de R$" + modelVendas.getVenValorLiquido() + "\n\n"
                    + "Da venda efetuada para o cliente " + modelCliente.getCliNome(),
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION
            );
            if (respostaConfirmacao == JOptionPane.NO_OPTION) {
                //sai do método
                return;
            }
            modelVendas.setVenEstado("Pago");
            if (controllerVendas.atualizarEstadoVendasController(modelVendas)) {
                JOptionPane.showMessageDialog(this, "Pagamento da divida efetuado com sucesso!!", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
                carregarVendasPendentes();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao efetuar o pagamento!!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro foi selecionado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbPagarVPActionPerformed

    private void jbExcluirVPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirVPMouseEntered
        jbExcluirVP.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_jbExcluirVPMouseEntered

    private void jbExcluirVPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirVPMouseExited
        jbExcluirVP.setBackground(new java.awt.Color(255, 51, 51));
    }//GEN-LAST:event_jbExcluirVPMouseExited

    private void jbExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirMouseEntered
        jbExcluir.setBackground(new java.awt.Color(255, 102, 102));
    }//GEN-LAST:event_jbExcluirMouseEntered

    private void jbExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirMouseExited
        jbExcluir.setBackground(new java.awt.Color(255, 51, 51));
    }//GEN-LAST:event_jbExcluirMouseExited

    private void jbPagarVPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPagarVPMouseEntered
        jbPagarVP.setBackground(new java.awt.Color(153, 255, 153));
    }//GEN-LAST:event_jbPagarVPMouseEntered

    private void jbPagarVPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPagarVPMouseExited
        jbPagarVP.setBackground(new java.awt.Color(102,255,102));
    }//GEN-LAST:event_jbPagarVPMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbExcluirVP;
    private javax.swing.JButton jbExibir;
    private javax.swing.JButton jbExibirVP;
    private javax.swing.JButton jbPagarVP;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbPesquisar1;
    private javax.swing.JButton jbPesquisarNome;
    private javax.swing.JButton jbRetornar;
    private javax.swing.JButton jbRetornar1;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JButton jbVoltarVP;
    private com.toedter.calendar.JDateChooser jdata;
    private com.toedter.calendar.JDateChooser jdataVP;
    private javax.swing.JTable jtProdutosDaVenda;
    private javax.swing.JTable jtProdutosDaVendaPendente;
    private javax.swing.JTable jtVendas;
    private javax.swing.JTable jtVendasPendentes;
    private javax.swing.JTextField jtfCapitalInvestido;
    private javax.swing.JTextField jtfCliente;
    private javax.swing.JTextField jtfLucroDaVenda;
    private javax.swing.JTextField jtfMargemDeLucro;
    private javax.swing.JTextField jtfPesquisaNome;
    private javax.swing.JTextField jtfQuantidadeDeProdutos;
    private javax.swing.JTextField jtfTelefone;
    private javax.swing.JTextField jtfValor;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painelBotões;
    private javax.swing.JPanel painelBotões1;
    private javax.swing.JPanel painelCliente;
    private javax.swing.JPanel painelIndicadores;
    private javax.swing.JPanel painelInfoCliente;
    private javax.swing.JPanel painelOpcoesSuperior;
    private javax.swing.JPanel painelOpcoesSuperior2;
    private javax.swing.JPanel painelPesquisa;
    private javax.swing.JPanel painelPesquisaPorData;
    private javax.swing.JPanel painelPesquisaPorData1;
    private javax.swing.JPanel painelSuperior;
    private javax.swing.JScrollPane painelTProdutosDaVenda;
    private javax.swing.JScrollPane painelTProdutosDaVenda1;
    private javax.swing.JScrollPane painelTVendas;
    private javax.swing.JScrollPane painelTVendas1;
    private javax.swing.JPanel painelTabelas;
    private javax.swing.JPanel painelTabelas1;
    private javax.swing.JPanel painelTelefone;
    private javax.swing.JPanel painelValor;
    private javax.swing.JPanel painelVendas;
    private javax.swing.JPanel painelVendasPendentes;
    // End of variables declaration//GEN-END:variables

    //MÉTODOS COMPARTILHADOS
    //
    //customiza as tabelas
    private void customTable() {

        JTableHeader cabecalho = jtProdutosDaVenda.getTableHeader();
        cabecalho.setFont((new java.awt.Font("Dialog", 1, 18)));

        JTableHeader cabecalho2 = jtVendas.getTableHeader();
        cabecalho2.setFont((new java.awt.Font("Dialog", 1, 18)));

        JTableHeader cabecalho3 = jtVendasPendentes.getTableHeader();
        cabecalho3.setFont((new java.awt.Font("Dialog", 1, 18)));

        JTableHeader cabecalho4 = jtProdutosDaVendaPendente.getTableHeader();
        cabecalho4.setFont((new java.awt.Font("Dialog", 1, 18)));

    }

    //seta a interface como nula ao fechar
    //
    public void internalFrameClosed(InternalFrameEvent e) {
        ViewPrincipal principal = new ViewPrincipal();
        principal.relatorios = null;

    }

    public void Refresh() {
        carregarVendas();
        carregarVendasPendentes();
        voltar();
        voltarVP();
    }

    //FIM MÉTODOS COMPARTILHADOS
    //
    //MÉTODOS Vendas
    //
    //Carrega as vendas feitas na tabela
    private void voltar() {
        painelTVendas.setVisible(true);
        painelTProdutosDaVenda.setVisible(false);
        jbExibir.setVisible(true);
        jbVoltar.setVisible(false);
        painel1.setVisible(false);
        painel2.setVisible(false);
        jbExcluir.setVisible(true);
        painelOpcoesSuperior2.setVisible(true);
    }

    private void carregarVendas() {
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        modelo.setNumRows(0);
        listaModelVendas = controllerVendas.getListaVendasController();
        int cont = listaModelVendas.size();
        modelo.setNumRows(0);
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelVendas.get(i).getIdVenda(),
                listaModelVendas.get(i).getVenDataVenda(),
                listaModelVendas.get(i).getVenValorBruto(),
                listaModelVendas.get(i).getVenValorLiquido() - listaModelVendas.get(i).getVenCusto(),
                listaModelVendas.get(i).getVenTipo(),
                listaModelVendas.get(i).getVenParcelas()
            });
        }
    }

    private void exibir() {
        int linha = jtVendas.getSelectedRow();
        try {
            int codigoVenda = (int) jtVendas.getValueAt(linha, 0);
            double lucro;
            listaModelProdutosVendasProdutos = controllerProdutosVendasProdutos.getListaProdutosVendaProdutosController(codigoVenda);
            DefaultTableModel modelo = (DefaultTableModel) jtProdutosDaVenda.getModel();
            modelo.setNumRows(0);
            for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
                modelo.addRow(new Object[]{
                    listaModelProdutosVendasProdutos.get(i).getModelProdutos().getIdProduto(),
                    listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProNome(),
                    listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade(),
                    //valor total
                    listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade()
                    * listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProValor(),});
            }

            for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
                lucro = lucroDoProduto(i);
                modelo.setValueAt(lucro, i, 4);
            }

            painelTVendas.setEnabled(false);
            painelTVendas.setVisible(false);
            painelTProdutosDaVenda.setVisible(true);
            jbExibir.setVisible(false);
            jbVoltar.setVisible(true);
            painel1.setVisible(true);
            painel2.setVisible(true);
            jbExcluir.setVisible(false);
            painelOpcoesSuperior2.setVisible(false);
            painelOpcoesSuperior2.setEnabled(false);

            lucroDaVenda();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro foi selecionado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }

    private double lucroDoProduto(int i) {
        int codigoProduto;
        int cont = jtProdutosDaVenda.getRowCount();
        double lucro = 0;
        codigoProduto = (int) jtProdutosDaVenda.getValueAt(i, 0);
        modelProdutos = controllerProdutos.retornarProdutoController(codigoProduto);
        lucro = (modelProdutos.getProValor() - modelProdutos.getProValorCompra());
        return lucro;
    }

    private void lucroDaVenda() {
        int codigoProduto;
        String texto, texto1;
        int cont = jtProdutosDaVenda.getRowCount();
        double lucro = 0;
        int unidades = 0;
        for (int i = 0; i < cont; i++) {
            codigoProduto = (int) jtProdutosDaVenda.getValueAt(i, 0);
            modelProdutos = controllerProdutos.retornarProdutoController(codigoProduto);
            unidades = unidades + (((int) jtProdutosDaVenda.getValueAt(i, 2)));
            lucro = lucro + ((modelProdutos.getProValor() - modelProdutos.getProValorCompra()) * unidades);
        }
        texto = "R$" + (String.valueOf(lucro));
        jtfLucroDaVenda.setText(texto);
        texto1 = String.valueOf(unidades) + " Produtos Vendidos";
        jtfQuantidadeDeProdutos.setText(texto1);
    }

    //pesquisa as vendas pela data informada
    private void pesquisar() {

        Date data = jdata.getDate();
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");

        String dataFormatada = formatador.format(data);
        DefaultTableModel modelo = (DefaultTableModel) this.jtVendas.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtVendas.setRowSorter(classificador);
        classificador.setRowFilter(RowFilter.regexFilter(dataFormatada, 1));

        if (jtVendas.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Não existem registros de vendas \n para a data solicitada ",
                    "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
            pesquisarTudo();
        }
    }

    //mantém a lista de produtos completa mesmo após pesquisa
    private void pesquisarTudo() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtVendas.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtVendas.setRowSorter(classificador);
        jdata.setDate(null);
        String textoPesquisa = "";
        classificador.setRowFilter(RowFilter.regexFilter(textoPesquisa, 1));
    }

    // FIM MÉTODOS Vendas
    //
    //MÉTODOS Vendas Pendentes
    //
    //Tela retorna ao valor inicial
    private void voltarVP() {
        painelTVendas1.setVisible(true);
        painelTProdutosDaVenda1.setVisible(false);
        jbExibirVP.setVisible(true);
        jbVoltarVP.setVisible(false);
        painelInfoCliente.setVisible(false);
        painelPesquisa.setVisible(true);
        jbExcluirVP.setVisible(true);
        jbPagarVP.setVisible(true);
    }

    //carrega as vendas pendentes
    private void carregarVendasPendentes() {
        DefaultTableModel modelo = (DefaultTableModel) jtVendasPendentes.getModel();
        modelo.setNumRows(0);
        listaModelVendas = controllerVendas.getListaVendasPendentesController();
        int cont = listaModelVendas.size();
        modelo.setNumRows(0);
        for (int i = 0; i < cont; i++) {
            modelCliente = controllerCliente.getClienteController(listaModelVendas.get(i).getCliente());
            modelo.addRow(new Object[]{
                listaModelVendas.get(i).getIdVenda(),
                listaModelVendas.get(i).getVenDataVenda(),
                modelCliente.getCliNome(),
                listaModelVendas.get(i).getVenValorBruto(),
                listaModelVendas.get(i).getVenValorLiquido() - listaModelVendas.get(i).getVenCusto(),
                listaModelVendas.get(i).getVenEstado()
            });
        }
        carregarVendas();
    }

    //exibi os componentes da venda selecionada
    private void exibirVendaPendentes(int codigoCliente) {
        double valorVenda = 0;
        int linha = jtVendasPendentes.getSelectedRow();
        int codigoVenda = (int) jtVendasPendentes.getValueAt(linha, 0);

        modelCliente = controllerCliente.getClienteController(codigoCliente);

        listaModelProdutosVendasProdutos = controllerProdutosVendasProdutos.getListaProdutosVendaProdutosController(codigoVenda);
        DefaultTableModel modelo = (DefaultTableModel) jtProdutosDaVendaPendente.getModel();
        modelo.setNumRows(0);

        for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
            modelo.addRow(new Object[]{
                listaModelProdutosVendasProdutos.get(i).getModelProdutos().getIdProduto(),
                listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProNome(),
                listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade(),
                //valor total
                listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade()
                * listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProValor(),});
        }

        int cont = jtProdutosDaVendaPendente.getRowCount();

        for (int i = 0; i < cont; i++) {
            valorVenda = valorVenda + ((double) jtProdutosDaVendaPendente.getValueAt(i, 3));
        }

        jtfCliente.setText(modelCliente.getCliNome());
        jtfTelefone.setText(modelCliente.getCliTelefone());
        jtfValor.setText("R$" + String.valueOf(valorVenda));

        painelTVendas1.setVisible(false);
        painelTProdutosDaVenda1.setVisible(true);
        jbExibirVP.setVisible(false);
        jbVoltarVP.setVisible(true);
        painelInfoCliente.setVisible(true);
        painelPesquisa.setVisible(false);
        jbExcluirVP.setVisible(false);
        jbPagarVP.setVisible(false);

    }

    //envia os dados do cliente para preenchimento 
    private void enviarValor() {
        int codigoCliente;
        try {
            int linha = jtVendasPendentes.getSelectedRow();
            codigoCliente = listaModelVendas.get(linha).getCliente();
            exibirVendaPendentes(codigoCliente);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro foi selecionado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void pesquisarDataVP() {
        Date data = jdataVP.getDate();
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");

        String dataFormatada = formatador.format(data);
        DefaultTableModel modelo = (DefaultTableModel) this.jtVendasPendentes.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtVendasPendentes.setRowSorter(classificador);
        classificador.setRowFilter(RowFilter.regexFilter(dataFormatada, 1));

        if (jtVendasPendentes.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "Não existem registros de vendas \n para a data solicitada ",
                    "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
            pesquisarDataTudoVP();
        }
    }

    private void pesquisarVP() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtVendasPendentes.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtVendasPendentes.setRowSorter(classificador);
        String textoPesquisa = "";
        classificador.setRowFilter(RowFilter.regexFilter("(?i)" + textoPesquisa, 2));

    }

    private void pesquisarDataTudoVP() {
        DefaultTableModel modelo = (DefaultTableModel) this.jtVendasPendentes.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtVendasPendentes.setRowSorter(classificador);
        jdataVP.setDate(null);
        String textoPesquisa = "";
        classificador.setRowFilter(RowFilter.regexFilter(textoPesquisa, 2));
    }

    //
    //FIM MÉTODOS Vendas Pendentes
    //
    //MÉTODOS Indices
    private void Indices() {
        double ValorCompra = 0, Valor = 0;
        double lucro = 0, investimento = 0;

        listaModelProdutos = controllerProdutos.retornarListaProdutoController();

        int cont = listaModelProdutos.size();
        for (int i = 0; i < cont; i++) {
            Valor = (double) listaModelProdutos.get(i).getProValor();
            ValorCompra = (double) listaModelProdutos.get(i).getProValorCompra();
            lucro = lucro + (Valor - ValorCompra);
            investimento = investimento + ValorCompra;
        }
        String texto = "R$" + (String.valueOf(lucro));
        String texto2 = "R$" + (String.valueOf(investimento));
        jtfMargemDeLucro.setText(texto);
        jtfCapitalInvestido.setText(texto2);
    }
    //
    //FIMMÉTODOS Indices
}
