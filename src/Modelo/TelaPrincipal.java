package Modelo;

import DAO.DAOCliente;
import DAO.DAOFunc;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
//import javax.swing.ButtonModel;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import static Modelo.Verify.temLetra;
import static Modelo.Verify.temNumero;
import static Modelo.Verify.temSimbolo;

public class TelaPrincipal extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public TelaPrincipal() {
        initComponents();
        configurarTabelas();
    }

    private void configurarTabelas() {
        DefaultTableModel modeloFunc = (DefaultTableModel) jTableFunc.getModel();
        jTableFunc.setRowSorter(new TableRowSorter<>(modeloFunc));
        lerTabelaFunc();

        DefaultTableModel modeloCli = (DefaultTableModel) jTableCli.getModel();
        jTableCli.setRowSorter(new TableRowSorter<>(modeloCli));
        lerTabelaCli();
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelFunc = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeFunc = new java.awt.TextField();
        txtCPFFunc = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefoneFunc = new java.awt.TextField();
        btnSalvarFunc = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFunc = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        btnAtualizarFunc = new javax.swing.JButton();
        btnExcluirFunc = new javax.swing.JButton();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        rbOutros = new javax.swing.JRadioButton();
        cbCargo = new javax.swing.JComboBox<>();
        jPanelCli = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomeCli = new javax.swing.JTextField();
        txtEmailCli = new javax.swing.JTextField();
        txtTelefoneCli = new javax.swing.JTextField();
        txtCPFCli = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCli = new javax.swing.JTable();
        btnAtualizarCli = new javax.swing.JButton();
        btnSalvarCli = new javax.swing.JButton();
        btnExcluirCli = new javax.swing.JButton();
        jPanelProd = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento do Restaurante");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastros"));

        
        jLabel1.setText("Nome:");
        jLabel3.setText("CPF:");
        jLabel2.setText("Telefone:");
        jLabel4.setText("Sexo:");
        jLabel16.setText("Cargo:");

        btnSalvarFunc.setText("Salvar");
        btnSalvarFunc.addActionListener(this::btnSalvarFuncActionPerformed);

        btnAtualizarFunc.setText("Atualizar");
        btnAtualizarFunc.addActionListener(this::btnAtualizarFuncActionPerformed);

        btnExcluirFunc.setText("Excluir");
        btnExcluirFunc.addActionListener(this::btnExcluirFuncActionPerformed);
        
        buttonGroup1.add(rbMasculino);
        rbMasculino.setText("Masculino");
        
        buttonGroup1.add(rbFeminino);
        rbFeminino.setText("Feminino");
        
        buttonGroup1.add(rbOutros);
        rbOutros.setText("Outro");

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chefe", "Cozinheiro", "Garçom", "Entregador", "Aux. de Cozinha", "Aux. de Limpeza", "Bartender" }));
        cbCargo.setSelectedIndex(-1);
        
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciar Funcionários"));
        jTableFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"ID", "Nome", "Cargo", "CPF", "Sexo", "Telefone"}
        ) {
            private static final long serialVersionUID = 1L;
			final boolean[] canEdit = new boolean [] {false, false, false, false, false, false};
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFunc);
        
        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout jPanelFuncLayout = new GroupLayout(jPanelFunc);
        jPanelFunc.setLayout(jPanelFuncLayout);
        jPanelFuncLayout.setHorizontalGroup(
            jPanelFuncLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFuncLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelFuncLayout.createSequentialGroup()
                        .addGroup(jPanelFuncLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel16))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFuncLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeFunc, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPFFunc, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefoneFunc, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelFuncLayout.createSequentialGroup()
                                .addComponent(rbMasculino)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbFeminino)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbOutros))
                            .addGroup(jPanelFuncLayout.createSequentialGroup()
                                .addComponent(cbCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluirFunc)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtualizarFunc)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarFunc)))
                        .addGap(10,10,10)))
                .addContainerGap())
        );
        jPanelFuncLayout.setVerticalGroup(
            jPanelFuncLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFuncLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFuncLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeFunc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFuncLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtCPFFunc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFuncLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtTelefoneFunc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFuncLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino)
                    .addComponent(rbOutros))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFuncLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarFunc)
                    .addComponent(btnAtualizarFunc)
                    .addComponent(btnExcluirFunc))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Funcionários", jPanelFunc);

        // Painel de Clientes
        jLabel5.setText("Nome:");
        jLabel6.setText("Email:");
        jLabel7.setText("Telefone:");
        jLabel8.setText("CPF:");
        
        btnSalvarCli.setText("Salvar");
        btnSalvarCli.addActionListener(this::btnSalvarCliActionPerformed);

        btnAtualizarCli.setText("Atualizar");
        btnAtualizarCli.addActionListener(this::btnAtualizarCliActionPerformed);

        btnExcluirCli.setText("Excluir");
        btnExcluirCli.addActionListener(this::btnExcluirCliActionPerformed);
        
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciar Clientes"));
        jTableCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"ID", "Nome", "Email", "Telefone", "CPF"}
        ) {
            private static final long serialVersionUID = 1L;
			final boolean[] canEdit = new boolean [] {false, false, false, false, false};
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCliMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCli);
        
        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        GroupLayout jPanelCliLayout = new GroupLayout(jPanelCli);
        jPanelCli.setLayout(jPanelCliLayout);
        jPanelCliLayout.setHorizontalGroup(
            jPanelCliLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCliLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelCliLayout.createSequentialGroup()
                        .addGroup(jPanelCliLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                           .addComponent(jLabel5).addComponent(jLabel6).addComponent(jLabel7).addComponent(jLabel8))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCliLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeCli, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtEmailCli)
                            .addComponent(txtTelefoneCli)
                            .addComponent(txtCPFCli))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanelCliLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluirCli)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizarCli)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarCli)))
                .addContainerGap())
        );
        jPanelCliLayout.setVerticalGroup(
            jPanelCliLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCliLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5).addComponent(txtNomeCli, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCliLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6).addComponent(txtEmailCli, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCliLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7).addComponent(txtTelefoneCli, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCliLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8).addComponent(txtCPFCli, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCliLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCli).addComponent(btnAtualizarCli).addComponent(btnExcluirCli))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Clientes", jPanelCli);

        // Painel de Produtos
        jLabel9.setText("Nome:");
        jLabel10.setText("Tipo:");
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prato", "Bebida", "Sobremesa" }));
        jComboBox1.setSelectedIndex(-1);
        jButton1.setText("Novo Tipo");
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}},
            new String [] {"Title 1", "Title 2", "Title 3", "Title 4"}
        ));
        jScrollPane3.setViewportView(jTable1);
        
        GroupLayout jPanelProdLayout = new GroupLayout(jPanelProd);
        jPanelProd.setLayout(jPanelProdLayout);
        jPanelProdLayout.setHorizontalGroup(
            jPanelProdLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProdLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 592, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelProdLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProdLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelProdLayout.setVerticalGroup(
            jPanelProdLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9).addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProdLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10).addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Produtos", jPanelProd);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null); // Centraliza a janela
    }
    
    // ... (O restante do seu código: event handlers, métodos lerTabela, main, etc.)
    // O CÓDIGO ABAIXO PERMANECE O MESMO
    
    private void btnSalvarFuncActionPerformed(java.awt.event.ActionEvent evt) {
        boolean podesalvar = true;
        String mensagem = "";
        if (temNumero(txtNomeFunc.getText())) {
            podesalvar = false;
            mensagem = "O campo de nome não pode conter números";
        } else if (temLetra(txtCPFFunc.getText())) {
            podesalvar = false;
            mensagem = "O campo do cpf não pode conter letras";
        } else if (temLetra(txtTelefoneFunc.getText())) {
            podesalvar = false;
            mensagem = "O campo de telefone não pode conter letras";
        } else if (temSimbolo(txtCPFFunc.getText())) {
            podesalvar = false;
            mensagem = "O campo do cpf possui símbolos inválidos";
        } else if (temSimbolo(txtNomeFunc.getText())) {
            podesalvar = false;
            mensagem = "O campo de nome possui símbolos inválidos";
        }

        if (podesalvar) {
            if (!(txtNomeFunc.getText().isEmpty() || txtCPFFunc.getText().isEmpty() || cbCargo.getSelectedIndex() == -1 || IsEvenSelected())) {
                List<String> cpfs = new ArrayList<>();
                Funcionario f = new Funcionario();
                DAOFunc daof = new DAOFunc();
                f.setNome(txtNomeFunc.getText());
                f.setCpf(txtCPFFunc.getText());
                if (rbMasculino.isSelected()) {
                    f.setSexo("Masculino");
                }
                if (rbFeminino.isSelected()) {
                    f.setSexo("Feminino");
                }
                if (rbOutros.isSelected()) {
                    f.setSexo("Outros");
                }
                f.setTelefone(txtTelefoneFunc.getText());
                f.setCargo(cbCargo.getSelectedItem().toString());

                for (Funcionario f1 : DAOFunc.ler()) {
                    cpfs.add(f1.getCpf());
                }
                if (!cpfs.contains(txtCPFFunc.getText())) {
                    daof.salvar(f);
                    lerTabelaFunc();
                    limparCamposFuncionario();
                } else {
                    JOptionPane.showMessageDialog(this, "O CPF digitado já foi cadastrado");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Os campos NOME, CPF, CARGO e SEXO não podem estar vazios.");
            }
        } else {
            JOptionPane.showMessageDialog(this, mensagem);
        }
    }

    private void jTableFuncMouseClicked(java.awt.event.MouseEvent evt) {
        if (jTableFunc.getSelectedRow() != -1) {
            preencherCamposFuncionario();
        }
    }
    
    @SuppressWarnings("unused")
	private void jTableFuncKeyReleased(java.awt.event.KeyEvent evt) {
         if (jTableFunc.getSelectedRow() != -1) {
            preencherCamposFuncionario();
        }
    }

    private void btnExcluirFuncActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTableFunc.getSelectedRow() != -1) {
            Funcionario f = new Funcionario();
            DAOFunc daof = new DAOFunc();
            f.setId((int) jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 0));
            daof.deletar(f);
            lerTabelaFunc();
            limparCamposFuncionario();
        }
    }

    private void btnAtualizarFuncActionPerformed(java.awt.event.ActionEvent evt) {
        boolean podesalvar = true;
        String mensagem = "";
        if (temNumero(txtNomeFunc.getText())) {
            podesalvar = false;
            mensagem = "O campo de nome não pode conter números";
        } else if (temLetra(txtCPFFunc.getText())) {
            podesalvar = false;
            mensagem = "O campo do cpf não pode conter letras";
        } else if (temLetra(txtTelefoneFunc.getText())) {
            podesalvar = false;
            mensagem = "O campo de telefone não pode conter letras";
        } else if (temSimbolo(txtCPFFunc.getText())) {
            podesalvar = false;
            mensagem = "O campo do cpf possui símbolos inválidos";
        } else if (temSimbolo(txtNomeFunc.getText())) {
            podesalvar = false;
            mensagem = "O campo de nome possui símbolos inválidos";
        } else if (txtCPFFunc.getText().length() > 11 || txtCPFFunc.getText().length() < 11) {
            podesalvar = false;
            mensagem = "O campo de cpf deve ter 11 números";
        }

        if (podesalvar) {
            if (!(txtNomeFunc.getText().isEmpty() || txtCPFFunc.getText().isEmpty() || cbCargo.getSelectedIndex() == -1 || IsEvenSelected())) {
                if (jTableFunc.getSelectedRow() != -1) {
                    Funcionario f = new Funcionario();
                    DAOFunc daof = new DAOFunc();
                    f.setNome(txtNomeFunc.getText());
                    f.setCpf(txtCPFFunc.getText());
                    if (rbMasculino.isSelected()) f.setSexo("Masculino");
                    if (rbFeminino.isSelected()) f.setSexo("Feminino");
                    if (rbOutros.isSelected()) f.setSexo("Outros");
                    f.setTelefone(txtTelefoneFunc.getText());
                    f.setCargo(cbCargo.getSelectedItem().toString());
                    f.setId((int) jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 0));
                    daof.atualizar(f);
                    lerTabelaFunc();
                    limparCamposFuncionario();
                } else {
                    JOptionPane.showMessageDialog(this, "Selecione a linha que deseja atualizar");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Os campos NOME, CPF, CARGO e SEXO não podem estar vazios.");
            }
        } else {
            JOptionPane.showMessageDialog(this, mensagem);
        }
    }

    private void jTableCliMouseClicked(java.awt.event.MouseEvent evt) {
        if (jTableCli.getSelectedRow() != -1) {
            preencherCamposCliente();
        }
    }

    @SuppressWarnings("unused")
	private void jTableCliKeyReleased(java.awt.event.KeyEvent evt) {
        if (jTableCli.getSelectedRow() != -1) {
            preencherCamposCliente();
        }
    }

    private void btnSalvarCliActionPerformed(java.awt.event.ActionEvent evt) {
        boolean podesalvar = true;
        String mensagem = "";
        if (temNumero(txtNomeCli.getText())) {
            podesalvar = false;
            mensagem = "O campo de nome não pode conter números";
        } else if (temLetra(txtCPFCli.getText())) {
            podesalvar = false;
            mensagem = "O campo do cpf não pode conter letras";
        } else if (temLetra(txtTelefoneCli.getText())) {
            podesalvar = false;
            mensagem = "O campo de telefone não pode conter letras";
        } else if (temSimbolo(txtCPFCli.getText())) {
            podesalvar = false;
            mensagem = "O campo do cpf possui símbolos inválidos";
        } else if (temSimbolo(txtNomeCli.getText())) {
            podesalvar = false;
            mensagem = "O campo de nome possui símbolos inválidos";
        }

        if (podesalvar) {
            if (!(txtNomeCli.getText().isEmpty() || txtCPFCli.getText().isEmpty())) {
                List<String> cpfs = new ArrayList<>();
                Cliente c = new Cliente();
                DAOCliente daoc = new DAOCliente();
                c.setNome(txtNomeCli.getText());
                c.setEmail(txtEmailCli.getText());
                c.setCpf(txtCPFCli.getText());
                c.setTelefone(txtTelefoneCli.getText());
                for (Cliente f1 : DAOCliente.ler()) {
                    cpfs.add(f1.getCpf());
                }
                if (!cpfs.contains(txtCPFCli.getText())) {
                    daoc.salvar(c);
                    lerTabelaCli();
                    limparCamposCliente();
                } else {
                    JOptionPane.showMessageDialog(this, "O CPF digitado já foi cadastrado");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Os campos NOME e CPF não podem estar vazios.");
            }
        } else {
            JOptionPane.showMessageDialog(this, mensagem);
        }
    }

    private void btnExcluirCliActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTableCli.getSelectedRow() != -1) {
            Cliente c = new Cliente();
            DAOCliente daoc = new DAOCliente();
            c.setId((int) jTableCli.getValueAt(jTableCli.getSelectedRow(), 0));
            daoc.deletar(c);
            lerTabelaCli();
            limparCamposCliente();
        }
    }

    private void btnAtualizarCliActionPerformed(java.awt.event.ActionEvent evt) {
        boolean podesalvar = true;
        String mensagem = "";
        if (temNumero(txtNomeCli.getText())) {
            podesalvar = false;
            mensagem = "O campo de nome não pode conter números";
        } else if (temLetra(txtCPFCli.getText())) {
            podesalvar = false;
            mensagem = "O campo do cpf não pode conter letras";
        } else if (temLetra(txtTelefoneCli.getText())) {
            podesalvar = false;
            mensagem = "O campo de telefone não pode conter letras";
        } else if (temSimbolo(txtCPFCli.getText())) {
            podesalvar = false;
            mensagem = "O campo do cpf possui símbolos inválidos";
        } else if (temSimbolo(txtNomeCli.getText())) {
            podesalvar = false;
            mensagem = "O campo de nome possui símbolos inválidos";
        }

        if (podesalvar) {
            if (!(txtNomeCli.getText().isEmpty() || txtCPFCli.getText().isEmpty())) {
                if (jTableCli.getSelectedRow() != -1) {
                    Cliente c = new Cliente();
                    DAOCliente daoc = new DAOCliente();
                    c.setNome(txtNomeCli.getText());
                    c.setCpf(txtCPFCli.getText());
                    c.setTelefone(txtTelefoneCli.getText());
                    c.setEmail(txtEmailCli.getText());
                    c.setId((int) jTableCli.getValueAt(jTableCli.getSelectedRow(), 0));
                    daoc.atualizar(c);
                    lerTabelaCli();
                    limparCamposCliente();
                } else {
                    JOptionPane.showMessageDialog(this, "Selecione a linha que deseja atualizar");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Os campos NOME e CPF não podem estar vazios.");
            }
        } else {
            JOptionPane.showMessageDialog(this, mensagem);
        }
    }

    @SuppressWarnings("unused")
	private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {}
    @SuppressWarnings("unused")
	private void rbOutrosActionPerformed(java.awt.event.ActionEvent evt) {}
    
    // MÉTODOS AUXILIARES
    
    public boolean IsEvenSelected() {
        return !rbMasculino.isSelected() && !rbFeminino.isSelected() && !rbOutros.isSelected();
    }
    
    private void limparCamposFuncionario() {
        txtNomeFunc.setText("");
        txtCPFFunc.setText("");
        txtTelefoneFunc.setText("");
        buttonGroup1.clearSelection();
        cbCargo.setSelectedIndex(-1);
    }
    
    private void limparCamposCliente() {
        txtNomeCli.setText("");
        txtEmailCli.setText("");
        txtTelefoneCli.setText("");
        txtCPFCli.setText("");
    }
    
    private void preencherCamposFuncionario() {
        int selectedRow = jTableFunc.getSelectedRow();
        txtNomeFunc.setText(jTableFunc.getValueAt(selectedRow, 1).toString());
        cbCargo.setSelectedItem(jTableFunc.getValueAt(selectedRow, 2).toString());
        txtCPFFunc.setText(jTableFunc.getValueAt(selectedRow, 3).toString());
        String sexo = jTableFunc.getValueAt(selectedRow, 4).toString();
        if ("Masculino".equals(sexo)) rbMasculino.setSelected(true);
        else if ("Feminino".equals(sexo)) rbFeminino.setSelected(true);
        else if ("Outros".equals(sexo)) rbOutros.setSelected(true);
        txtTelefoneFunc.setText(jTableFunc.getValueAt(selectedRow, 5).toString());
    }

    private void preencherCamposCliente() {
        int selectedRow = jTableCli.getSelectedRow();
        txtNomeCli.setText(jTableCli.getValueAt(selectedRow, 1).toString());
        txtEmailCli.setText(jTableCli.getValueAt(selectedRow, 2).toString());
        txtTelefoneCli.setText(jTableCli.getValueAt(selectedRow, 3).toString());
        txtCPFCli.setText(jTableCli.getValueAt(selectedRow, 4).toString());
    }

    public void lerTabelaFunc() {
        DefaultTableModel modelo = (DefaultTableModel) jTableFunc.getModel();
        modelo.setNumRows(0);
        
        for (Funcionario f : DAOFunc.ler()) {
            modelo.addRow(new Object[]{
                f.getId(), f.getNome(), f.getCargo(),
                f.getCpf(), f.getSexo(), f.getTelefone()
            });
        }
    }

    public void lerTabelaCli() {
        DefaultTableModel modelo = (DefaultTableModel) jTableCli.getModel();
        modelo.setNumRows(0);
        
        for (Cliente c : DAOCliente.ler()) {
            modelo.addRow(new Object[]{
                c.getId(), c.getNome(), c.getEmail(),
                c.getTelefone(), c.getCpf()
            });
        }
    }
    
    public void lerTabelaProd() {
        // Implementar a lógica para carregar dados na jTable1 (tabela de produtos)
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Declaração de Variáveis
    private javax.swing.JButton btnAtualizarCli;
    private javax.swing.JButton btnAtualizarFunc;
    private javax.swing.JButton btnExcluirCli;
    private javax.swing.JButton btnExcluirFunc;
    private javax.swing.JButton btnSalvarCli;
    private javax.swing.JButton btnSalvarFunc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelCli;
    private javax.swing.JPanel jPanelFunc;
    private javax.swing.JPanel jPanelProd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableCli;
    private javax.swing.JTable jTableFunc;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbOutros;
    private javax.swing.JTextField txtCPFCli;
    private java.awt.TextField txtCPFFunc;
    private javax.swing.JTextField txtEmailCli;
    private javax.swing.JTextField txtNomeCli;
    private java.awt.TextField txtNomeFunc;
    private javax.swing.JTextField txtTelefoneCli;
    private java.awt.TextField txtTelefoneFunc;
}