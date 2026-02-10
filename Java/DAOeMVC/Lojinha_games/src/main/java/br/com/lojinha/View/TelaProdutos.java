package br.com.lojinha.View;

import br.com.lojinha.dao.JogoDAO;
import br.com.lojinha.model.Jogo;
import br.com.lojinha.util.imageStorage;
import javax.swing.table.DefaultTableColumnModel;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class TelaProdutos extends javax.swing.JFrame {

    private final JogoDAO dao = new JogoDAO();
    private File imagemEscolhida;
    // guarda o id selecionado na
    private Integer idSelecionado = null;

    /**
     *
     *
     *
     * Creates new form TelaProdutos
     */
    public TelaProdutos() {
        initComponents(); // monta os componentes do formulario(gerado pelo maravilhoso netBeans sqn)
        configurarTabela(); // configura clique/seleção da tabela
        recarregarTabela(); // configura o carregamento dos dados  do banco
        novo();// deixa tudo limpo para cadastrar um game novo

    }

    // =================== logica =========================
    private void configurarTabela() {
        // garante que só um item por vez pode ser selecionado
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabela.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int row = tabela.getSelectedRow();
                if (row >= 0) {
                    // Pega o id (coluna 0) da linha
                    int id = (int) tabela.getModel().getValueAt(row, 0);
                    // carrega esse jogo nos campos para editar
                    carregarParaEditar(id);
                }

            }
        });

    }

    private void carregarParaEditar(int id) {
        // Buscar o jogo no banco pelo ID
        Jogo jogo = dao.buscarPorId(0);
        // se não encontrou, não faz nada
        if (jogo == null) {
            return;
        }

        // Marca que agora estamos editando( não é mais "novo")
        idSelecionado = jogo.getId();
        // Preenche os campos

        txtTitulo.setText(jogo.getTitulo());
        txtPlataforma.setText(jogo.getPlataforma());
        txtPreco.setText(String.valueOf(jogo.getPreco()));
        // mostra o caminho da imagem(ou mensagem se não tiver )
        txtImagem.setText(jogo.getImagemPath() == null ? " Nenhuma imagem " : jogo.getImagemPath());

        imagemEscolhida = null;

        mostrarImagem(jogo.getImagemPath(),false);

        mostrarImagem = null;



    }
    public  void novo(){
        idSelecionado = null;
        imagemEscolhida = null;


        txtTitulo.setText("");
        txtPlataforma.setText("");
        txtPreco.setText("");
        txtImagem.setText("Nenhuma imagem");

        // Limpa preview
        lblCapa.setIcon(null);
        lblCapa.setText("Selecione um item");
        // remove seleção da tabela
        tabela.clearSelection();
    }
    private void escolherImagem(){
        // Abre a janela do windows para escolher o arquivo
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Escolha a imagem do produto");

        // Mostra a janela

        int result = chooser.showOpenDialog(this);
        // se o usuario clicou em "abrir"
        if (result == JFileChooser.APPROVE_OPTION) {
            // salva o arqivo escolhido
            imagemEscolhida = chooser.getSelectedFile();

            //Mostra preview imediatamente usando o caminho absoluto do Windows
            mostrarImagem(imagemEscolhida.getAbsoluteFile(),true);

            txtImagem.setText("Será copiada ao salvar(./imagens/)");
        }

    }
    private void salvarOnAtualizar(){
        // Validação: impede salvar campos vazios
        if (txtTitulo.getText().isBlank()) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblPlataforma = new javax.swing.JLabel();
        txtPlataforma = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblImagem = new javax.swing.JLabel();
        txtImagem = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblAlerta = new javax.swing.JLabel();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        panelCapas = new javax.swing.JPanel();
        lblCapa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 40, 56));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));

        jPanel2.setBackground(new java.awt.Color(23, 26, 33));

        lblTitle.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("LOJINHA DOS GAMES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lblTitle)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(lblTitle)
                                .addContainerGap(43, Short.MAX_VALUE))
        );

        panelForm.setBackground(new java.awt.Color(42, 71, 94));
        panelForm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Nirmala UI Semilight", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        panelForm.setVerifyInputWhenFocusTarget(false);

        lblNome.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");

        lblPlataforma.setBackground(new java.awt.Color(255, 255, 255));
        lblPlataforma.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        lblPlataforma.setForeground(new java.awt.Color(255, 255, 255));
        lblPlataforma.setText("Plataforma");

        txtPlataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlataformaActionPerformed(evt);
            }
        });

        lblPreco.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco.setText("Preço");

        lblImagem.setForeground(new java.awt.Color(255, 255, 255));
        lblImagem.setText("Imagem");

        txtImagem.setEditable(false);
        txtImagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImagemActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.setBorderPainted(false);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnSalvar.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar/edit");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnExcluir.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setText("Enviar imagem");

        lblAlerta.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        lblAlerta.setForeground(new java.awt.Color(255, 255, 255));
        lblAlerta.setText("Tome cuidado ao excluir produtos");

        javax.swing.GroupLayout panelFormLayout = new javax.swing.GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(
                panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormLayout.createSequentialGroup()
                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormLayout.createSequentialGroup()
                                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelFormLayout.createSequentialGroup()
                                                                .addGap(155, 155, 155)
                                                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(panelFormLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblPlataforma)
                                                                        .addComponent(lblNome))))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtImagem, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtPreco, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtPlataforma, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(panelFormLayout.createSequentialGroup()
                                                                .addGap(51, 51, 51)
                                                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(panelFormLayout.createSequentialGroup()
                                                                                .addComponent(lblAlerta)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(panelFormLayout.createSequentialGroup()
                                                                                .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                                                                .addGap(41, 41, 41)
                                                                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(88, 88, 88))))
                                                        .addGroup(panelFormLayout.createSequentialGroup()
                                                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblPreco)
                                                                        .addComponent(lblImagem))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap())
        );
        panelFormLayout.setVerticalGroup(
                panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelFormLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPlataforma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(13, 13, 13)
                                .addComponent(txtImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnNovo)
                                        .addComponent(btnSalvar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(lblAlerta)
                                .addGap(37, 37, 37)
                                .addComponent(btnExcluir)
                                .addGap(73, 73, 73))
        );

        panelTable.setBackground(new java.awt.Color(42, 71, 94));
        panelTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabela", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Nirmala UI Semilight", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        panelTable.setForeground(new java.awt.Color(255, 255, 255));
        panelTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelTable.setMaximumSize(new java.awt.Dimension(2000, 2000));

        tabela.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "Nome", "Preço", "Plataforma", "Imagem", "id"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
                panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                                .addContainerGap())
        );
        panelTableLayout.setVerticalGroup(
                panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTableLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCapas.setBackground(new java.awt.Color(42, 71, 94));
        panelCapas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Capas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Nirmala UI Semilight", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        panelCapas.setMaximumSize(new java.awt.Dimension(300, 300));

        lblCapa.setText("capas");

        javax.swing.GroupLayout panelCapasLayout = new javax.swing.GroupLayout(panelCapas);
        panelCapas.setLayout(panelCapasLayout);
        panelCapasLayout.setHorizontalGroup(
                panelCapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCapasLayout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(lblCapa)
                                .addContainerGap(185, Short.MAX_VALUE))
        );
        panelCapasLayout.setVerticalGroup(
                panelCapasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCapasLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lblCapa)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(panelCapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panelCapas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1901, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void txtPlataformaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtImagemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblCapa;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPlataforma;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelCapas;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelTable;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtImagem;
    private javax.swing.JTextField txtPlataforma;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration
}
