package Modelo;

import DAO.DAOCliente;
import DAO.DAOFunc;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static Modelo.Verify.temLetra;
import static Modelo.Verify.temNumero;
import static Modelo.Verify.temSimbolo;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class TelaPrincipal extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public TelaPrincipal() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) jTableFunc.getModel();
        jTableFunc.setRowSorter(new TableRowSorter(modelo));
        lerTabelaFunc();
        lerTabelaCli();
        
    }

    int idst = 1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(24, 240, 240));
        setSize(new java.awt.Dimension(0, 0));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastros"));
        jTabbedPane1.setToolTipText("");

        jPanelFunc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome:");
        jPanelFunc.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel3.setText("CPF:");
        jPanelFunc.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel2.setText("Telefone:");
        jPanelFunc.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtNomeFunc.setName(""); // NOI18N
        jPanelFunc.add(txtNomeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 10, 290, -1));

        txtCPFFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanelFunc.add(txtCPFFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 40, 190, -1));

        jLabel4.setText("Sexo:");
        jPanelFunc.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanelFunc.add(txtTelefoneFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 71, 190, -1));

        btnSalvarFunc.setText("Salvar");
        btnSalvarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncActionPerformed(evt);
            }
        });
        jPanelFunc.add(btnSalvarFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciar Funcionários"));

        jTableFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cargo", "CPF", "Sexo", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFunc.getTableHeader().setReorderingAllowed(false);
        jTableFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncMouseClicked(evt);
            }
        });
        jTableFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableFuncKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFunc);
        if (jTableFunc.getColumnModel().getColumnCount() > 0) {
            jTableFunc.getColumnModel().getColumn(2).setHeaderValue("Cargo");
            jTableFunc.getColumnModel().getColumn(4).setHeaderValue("Sexo");
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(446, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanelFunc.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 920, 280));

        jLabel16.setText("Cargo:");
        jPanelFunc.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 50, -1));

        btnAtualizarFunc.setText("Atualizar");
        btnAtualizarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarFuncActionPerformed(evt);
            }
        });
        jPanelFunc.add(btnAtualizarFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        btnExcluirFunc.setText("Excluir");
        btnExcluirFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFuncActionPerformed(evt);
            }
        });
        jPanelFunc.add(btnExcluirFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        buttonGroup1.add(rbMasculino);
        rbMasculino.setText("Masculino");
        jPanelFunc.add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        buttonGroup1.add(rbFeminino);
        rbFeminino.setText("Feminino");
        rbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemininoActionPerformed(evt);
            }
        });
        jPanelFunc.add(rbFeminino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        buttonGroup1.add(rbOutros);
        rbOutros.setText("Outro");
        rbOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOutrosActionPerformed(evt);
            }
        });
        jPanelFunc.add(rbOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chefe", "Cozinheiro", "Garçom", "Entregador", "Aux. de Cozinha", "Aux. de Limpeza", "Bartender" }));
        cbCargo.setSelectedIndex(-1);
        jPanelFunc.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jTabbedPane1.addTab("Funcionários", jPanelFunc);

        jLabel5.setText("Nome:");

        jLabel6.setText("Email:");

        jLabel7.setText("Telefone:");

        jLabel8.setText("CPF:");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciar Clientes"));

        jTableCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Email", "Telefone", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCli.getTableHeader().setReorderingAllowed(false);
        jTableCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCliMouseClicked(evt);
            }
        });
        jTableCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableCliKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCli);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        btnAtualizarCli.setText("Atualizar");
        btnAtualizarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarCliActionPerformed(evt);
            }
        });

        btnSalvarCli.setText("Salvar");
        btnSalvarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCliActionPerformed(evt);
            }
        });

        btnExcluirCli.setText("Excluir");
        btnExcluirCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCliLayout = new javax.swing.GroupLayout(jPanelCli);
        jPanelCli.setLayout(jPanelCliLayout);
        jPanelCliLayout.setHorizontalGroup(
            jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCliLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailCli)
                    .addGroup(jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTelefoneCli, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCPFCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluirCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCli)
                .addGap(337, 337, 337))
            .addGroup(jPanelCliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanelCliLayout.setVerticalGroup(
            jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCliLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCPFCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarCli)
                    .addComponent(btnSalvarCli)
                    .addComponent(btnExcluirCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Clientes", jPanelCli);

        jLabel9.setText("Nome:");

        jLabel10.setText("Tipo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prato", "Bebida", "Sobremesa" }));
        jComboBox1.setSelectedIndex(-1);

        jButton1.setText("Novo Tipo");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelProdLayout = new javax.swing.GroupLayout(jPanelProd);
        jPanelProd.setLayout(jPanelProdLayout);
        jPanelProdLayout.setHorizontalGroup(
            jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelProdLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(jPanelProdLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanelProdLayout.setVerticalGroup(
            jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Produtos", jPanelProd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncActionPerformed
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
                ButtonModel btm = rbMasculino.getModel();
                ButtonModel btf = rbFeminino.getModel();
                ButtonModel bto = rbOutros.getModel();
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
                    txtNomeFunc.setText(null);
                    txtCPFFunc.setText(null);
                    buttonGroup1.setSelected(btf, false);
                    buttonGroup1.setSelected(btm, false);
                    buttonGroup1.setSelected(bto, false);
                    txtTelefoneFunc.setText(null);
                    cbCargo.setSelectedIndex(-1);
                } else {
                    JOptionPane.showMessageDialog(this, "O CPF digitado já foi cadastrado");

                }
            } else {
                JOptionPane.showMessageDialog(this, "Os campos NOME, CPF, CARGO e SEXO não podem estar vazios.");

            }
        } else {
            JOptionPane.showMessageDialog(this, mensagem);
        }

    }//GEN-LAST:event_btnSalvarFuncActionPerformed

    private void jTableFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncMouseClicked
        ButtonModel btm = rbMasculino.getModel();
        ButtonModel btf = rbFeminino.getModel();
        ButtonModel bto = rbOutros.getModel();

        if (jTableFunc.getSelectedRow() != -1) {
            txtNomeFunc.setText(jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 1).toString());
            cbCargo.setSelectedItem(jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 2).toString());
            txtCPFFunc.setText(jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 3).toString());
            if ((jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 4).toString()).equals("Masculino")) {
                buttonGroup1.setSelected(btm, true);
            }
            if ((jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 4).toString()).equals("Feminino")) {
                buttonGroup1.setSelected(btf, true);
            }
            if ((jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 4).toString()).equals("Outros")) {
                buttonGroup1.setSelected(bto, true);
            }
            txtTelefoneFunc.setText(jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jTableFuncMouseClicked

    private void jTableFuncKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableFuncKeyReleased
        ButtonModel btm = rbMasculino.getModel();
        ButtonModel btf = rbFeminino.getModel();
        ButtonModel bto = rbOutros.getModel();

        if (jTableFunc.getSelectedRow() != -1) {
            txtNomeFunc.setText(jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 1).toString());
            cbCargo.setSelectedItem(jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 2).toString());
            txtCPFFunc.setText(jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 3).toString());

            if ((jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 4).toString()).equals("Masculino")) {
                buttonGroup1.setSelected(btm, true);
            }
            if ((jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 4).toString()).equals("Feminino")) {
                buttonGroup1.setSelected(btf, true);
            }
            if ((jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 4).toString()).equals("Outros")) {
                buttonGroup1.setSelected(bto, true);
            }
            txtTelefoneFunc.setText(jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_jTableFuncKeyReleased

    private void btnExcluirFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFuncActionPerformed
        ButtonModel btm = rbMasculino.getModel();
        ButtonModel btf = rbFeminino.getModel();
        ButtonModel bto = rbOutros.getModel();

        if (jTableFunc.getSelectedRow() != -1) {
            Funcionario f = new Funcionario();
            DAOFunc daof = new DAOFunc();

            f.setId((int) jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 0));

            daof.deletar(f);

            lerTabelaFunc();

            txtNomeFunc.setText(null);
            txtCPFFunc.setText(null);
            buttonGroup1.setSelected(btf, false);
            buttonGroup1.setSelected(btm, false);
            buttonGroup1.setSelected(bto, false);
            txtTelefoneFunc.setText(null);
            cbCargo.setSelectedIndex(-1);

        }
    }//GEN-LAST:event_btnExcluirFuncActionPerformed
    public boolean IsEvenSelected() {
        boolean bl;
        if (rbMasculino.isSelected()
                || rbFeminino.isSelected()
                || rbOutros.isSelected()) {
            bl = false;

        } else {
            bl = true;
        }
        return bl;
    }


    private void btnAtualizarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarFuncActionPerformed
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

            ButtonModel btm = rbMasculino.getModel();
            ButtonModel btf = rbFeminino.getModel();
            ButtonModel bto = rbOutros.getModel();

            if (!(txtNomeFunc.getText().isEmpty() || txtCPFFunc.getText().isEmpty() || cbCargo.getSelectedIndex() == -1 || IsEvenSelected())) {
                if (jTableFunc.getSelectedRow() != -1) {
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
                    f.setId((int) jTableFunc.getValueAt(jTableFunc.getSelectedRow(), 0));

                    daof.atualizar(f);

                    lerTabelaFunc();

                    txtNomeFunc.setText(null);
                    txtCPFFunc.setText(null);
                    txtTelefoneFunc.setText(null);
                    buttonGroup1.setSelected(btf, false);
                    buttonGroup1.setSelected(btm, false);
                    buttonGroup1.setSelected(bto, false);

                    cbCargo.setSelectedIndex(-1);

                } else {
                    if (jTableFunc.getSelectedRow() == -1) {
                        JOptionPane.showMessageDialog(this, "Selecione a linha que deseja atualizar");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Os campos NOME, CPF, CARGO e SEXO não podem estar vazios.");

            }
        } else {
            JOptionPane.showMessageDialog(this, mensagem);
        }

    }//GEN-LAST:event_btnAtualizarFuncActionPerformed

    private void jTableCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCliMouseClicked
        if (jTableCli.getSelectedRow() != -1) {
            txtNomeCli.setText(jTableCli.getValueAt(jTableCli.getSelectedRow(), 1).toString());
            txtEmailCli.setText(jTableCli.getValueAt(jTableCli.getSelectedRow(), 2).toString());
            txtTelefoneCli.setText(jTableCli.getValueAt(jTableCli.getSelectedRow(), 3).toString());
            txtCPFCli.setText(jTableCli.getValueAt(jTableCli.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_jTableCliMouseClicked

    private void jTableCliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableCliKeyReleased
        if (jTableCli.getSelectedRow() != -1) {
            txtNomeCli.setText(jTableCli.getValueAt(jTableCli.getSelectedRow(), 1).toString());
            txtEmailCli.setText(jTableCli.getValueAt(jTableCli.getSelectedRow(), 2).toString());
            txtTelefoneCli.setText(jTableCli.getValueAt(jTableCli.getSelectedRow(), 3).toString());
            txtCPFCli.setText(jTableCli.getValueAt(jTableCli.getSelectedRow(), 4).toString());

        }
    }//GEN-LAST:event_jTableCliKeyReleased

    private void btnSalvarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCliActionPerformed
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
                    txtNomeCli.setText(null);
                    txtCPFCli.setText(null);
                    txtTelefoneCli.setText(null);
                    txtEmailCli.setText(null);
                } else {
                    JOptionPane.showMessageDialog(this, "O CPF digitado já foi cadastrado");

                }
            } else {
                JOptionPane.showMessageDialog(this, "Os campos NOME e CPF não podem estar vazios.");

            }

        } else {
            JOptionPane.showMessageDialog(this, mensagem);
        }
    }//GEN-LAST:event_btnSalvarCliActionPerformed

    private void btnExcluirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCliActionPerformed
        if (jTableCli.getSelectedRow() != -1) {
            Cliente c = new Cliente();
            DAOCliente daoc = new DAOCliente();

            c.setId((int) jTableCli.getValueAt(jTableCli.getSelectedRow(), 0));

            daoc.deletar(c);

            lerTabelaCli();

            txtNomeCli.setText(null);
            txtCPFCli.setText(null);
            txtTelefoneCli.setText(null);
            txtEmailCli.setText(null);

        }
    }//GEN-LAST:event_btnExcluirCliActionPerformed

    private void btnAtualizarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarCliActionPerformed
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
                    DAOCliente daof = new DAOCliente();

                    c.setNome(txtNomeCli.getText());
                    c.setCpf(txtCPFCli.getText());
                    c.setTelefone(txtTelefoneCli.getText());
                    c.setEmail(txtEmailCli.getText());
                    c.setId((int) jTableCli.getValueAt(jTableCli.getSelectedRow(), 0));

                    daof.atualizar(c);

                    lerTabelaCli();

                    txtNomeCli.setText(null);
                    txtCPFCli.setText(null);
                    txtTelefoneCli.setText(null);
                    txtEmailCli.setText(null);

                } else {
                    if (jTableCli.getSelectedRow() == -1) {
                        JOptionPane.showMessageDialog(this, "Selecione a linha que deseja atualizar");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Os campos NOME e CPF não podem estar vazios.");

            }
        } else {
            JOptionPane.showMessageDialog(this, mensagem);
        }
    }//GEN-LAST:event_btnAtualizarCliActionPerformed

    private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemininoActionPerformed

    private void rbOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOutrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOutrosActionPerformed
    public void lerTabelaFunc() {
        DefaultTableModel modelo = (DefaultTableModel) jTableFunc.getModel();
        modelo.setNumRows(0);
        DAOFunc daof = new DAOFunc();
        for (Funcionario f : daof.ler()) {

            modelo.addRow(new Object[]{
                f.getId(),
                f.getNome(),
                f.getCargo(),
                f.getCpf(),
                f.getSexo(),
                f.getTelefone()

            });

        }

    }

    public void lerTabelaCli() {
        DefaultTableModel modelo = (DefaultTableModel) jTableCli.getModel();
        modelo.setNumRows(0);
        DAOCliente daoc = new DAOCliente();
        for (Cliente c : daoc.ler()) {

            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getEmail(),
                c.getTelefone(),
                c.getCpf(),});

        }

    }
    
    public void lerTabelaProd() {
        DefaultTableModel modelo = (DefaultTableModel) jTableFunc.getModel();
        modelo.setNumRows(0);
        DAOFunc daof = new DAOFunc();
        for (Funcionario f : daof.ler()) {

            modelo.addRow(new Object[]{
                f.getId(),
                f.getNome(),
                f.getCargo(),
                f.getCpf(),
                f.getSexo(),
                f.getTelefone()

            });
        }
        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
