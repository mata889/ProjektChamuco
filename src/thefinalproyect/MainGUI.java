package thefinalproyect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dam_9
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_NuevoCampo = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtf_NombreCampo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        RB_Int = new javax.swing.JRadioButton();
        RB_String = new javax.swing.JRadioButton();
        RB_Double = new javax.swing.JRadioButton();
        RB_Char = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        bg_Tipo = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LArchivo = new javax.swing.JLabel();
        LCampos = new javax.swing.JLabel();
        LRegistros = new javax.swing.JLabel();
        LIndices = new javax.swing.JLabel();
        LEstandarizacion = new javax.swing.JLabel();
        LSalida = new javax.swing.JLabel();
        LSalida1 = new javax.swing.JLabel();
        PanelCambio = new javax.swing.JPanel();
        Archivo = new javax.swing.JPanel();
        bt_CrearArchivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jb_LeerCampos = new javax.swing.JButton();
        Campos = new javax.swing.JPanel();
        bt_CrearCampo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jb_GuardarCampos = new javax.swing.JButton();
        Registros = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Indices = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Estandar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jd_NuevoCampo.setTitle("Nuevo Campo");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Nombre del campo:");

        jLabel7.setText("Tipo del Campo:");

        bg_Tipo.add(RB_Int);
        RB_Int.setText("Integer");

        bg_Tipo.add(RB_String);
        RB_String.setText("String");

        bg_Tipo.add(RB_Double);
        RB_Double.setText("Double");

        bg_Tipo.add(RB_Char);
        RB_Char.setText("Char");

        jButton1.setText("Aceptar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_NombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(RB_Int))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB_Double)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB_Char)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB_String)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_NombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_Int)
                    .addComponent(RB_Double)
                    .addComponent(RB_Char)
                    .addComponent(RB_String))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_NuevoCampoLayout = new javax.swing.GroupLayout(jd_NuevoCampo.getContentPane());
        jd_NuevoCampo.getContentPane().setLayout(jd_NuevoCampoLayout);
        jd_NuevoCampoLayout.setHorizontalGroup(
            jd_NuevoCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_NuevoCampoLayout.setVerticalGroup(
            jd_NuevoCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProyectoEDDII");
        setUndecorated(true);

        PanelPrincipal.setBackground(new java.awt.Color(0, 153, 153));
        PanelPrincipal.setForeground(new java.awt.Color(0, 153, 153));
        PanelPrincipal.setAutoscrolls(true);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        LArchivo.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        LArchivo.setForeground(new java.awt.Color(255, 255, 255));
        LArchivo.setText("\t\tArchivo");
        LArchivo.setToolTipText("");
        LArchivo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        LArchivo.setMaximumSize(new java.awt.Dimension(100, 100));
        LArchivo.setMinimumSize(new java.awt.Dimension(100, 100));
        LArchivo.setPreferredSize(new java.awt.Dimension(100, 100));
        LArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LArchivoMouseClicked(evt);
            }
        });

        LCampos.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        LCampos.setForeground(new java.awt.Color(255, 255, 255));
        LCampos.setText("Campos");
        LCampos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        LCampos.setMaximumSize(new java.awt.Dimension(100, 100));
        LCampos.setMinimumSize(new java.awt.Dimension(100, 100));
        LCampos.setPreferredSize(new java.awt.Dimension(100, 100));
        LCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LCamposMouseClicked(evt);
            }
        });

        LRegistros.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        LRegistros.setForeground(new java.awt.Color(255, 255, 255));
        LRegistros.setText("Registros");
        LRegistros.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        LRegistros.setMaximumSize(new java.awt.Dimension(100, 100));
        LRegistros.setMinimumSize(new java.awt.Dimension(100, 100));
        LRegistros.setPreferredSize(new java.awt.Dimension(100, 100));
        LRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LRegistrosMouseClicked(evt);
            }
        });

        LIndices.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        LIndices.setForeground(new java.awt.Color(255, 255, 255));
        LIndices.setText("Indices");
        LIndices.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        LIndices.setMaximumSize(new java.awt.Dimension(100, 100));
        LIndices.setMinimumSize(new java.awt.Dimension(100, 100));
        LIndices.setPreferredSize(new java.awt.Dimension(100, 100));
        LIndices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LIndicesMouseClicked(evt);
            }
        });

        LEstandarizacion.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        LEstandarizacion.setForeground(new java.awt.Color(255, 255, 255));
        LEstandarizacion.setText("Estandarizacion");
        LEstandarizacion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        LEstandarizacion.setMaximumSize(new java.awt.Dimension(100, 100));
        LEstandarizacion.setMinimumSize(new java.awt.Dimension(100, 100));
        LEstandarizacion.setPreferredSize(new java.awt.Dimension(100, 100));
        LEstandarizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LEstandarizacionMouseClicked(evt);
            }
        });

        LSalida.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        LSalida.setForeground(new java.awt.Color(255, 255, 255));
        LSalida.setText("<html>DiegoMatamoros 11641131<br/>RicardoSanchez 11641051</html>");
        LSalida.setMaximumSize(new java.awt.Dimension(100, 100));
        LSalida.setMinimumSize(new java.awt.Dimension(100, 100));
        LSalida.setPreferredSize(new java.awt.Dimension(100, 100));
        LSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LSalidaMouseClicked(evt);
            }
        });

        LSalida1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LSalida1.setForeground(new java.awt.Color(255, 255, 255));
        LSalida1.setText("Salida");
        LSalida1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        LSalida1.setMaximumSize(new java.awt.Dimension(100, 100));
        LSalida1.setMinimumSize(new java.awt.Dimension(100, 100));
        LSalida1.setPreferredSize(new java.awt.Dimension(100, 100));
        LSalida1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LSalida1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LSalida1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LIndices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LSalida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LEstandarizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(LCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(LRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(LIndices, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(LEstandarizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelCambio.setBackground(new java.awt.Color(0, 153, 153));
        PanelCambio.setLayout(new java.awt.CardLayout());

        Archivo.setBackground(new java.awt.Color(0, 153, 204));
        Archivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_CrearArchivo.setText("Crear Archivo");
        bt_CrearArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_CrearArchivoMouseClicked(evt);
            }
        });
        bt_CrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CrearArchivoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Archivo");

        jb_LeerCampos.setText("Leer Campos de un Archivo");
        jb_LeerCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_LeerCamposMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ArchivoLayout = new javax.swing.GroupLayout(Archivo);
        Archivo.setLayout(ArchivoLayout);
        ArchivoLayout.setHorizontalGroup(
            ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ArchivoLayout.createSequentialGroup()
                .addContainerGap(392, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(375, 375, 375))
            .addGroup(ArchivoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_LeerCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_CrearArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ArchivoLayout.setVerticalGroup(
            ArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArchivoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(bt_CrearArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jb_LeerCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(501, Short.MAX_VALUE))
        );

        PanelCambio.add(Archivo, "card2");

        Campos.setBackground(new java.awt.Color(0, 153, 204));

        bt_CrearCampo.setText("CrearCampos");
        bt_CrearCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_CrearCampoMouseClicked(evt);
            }
        });
        bt_CrearCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CrearCampoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Campos");

        jb_GuardarCampos.setText("Guardar Campos");
        jb_GuardarCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarCamposMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CamposLayout = new javax.swing.GroupLayout(Campos);
        Campos.setLayout(CamposLayout);
        CamposLayout.setHorizontalGroup(
            CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CamposLayout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(383, 383, 383))
            .addGroup(CamposLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_GuardarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_CrearCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CamposLayout.setVerticalGroup(
            CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CamposLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(bt_CrearCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_GuardarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(529, Short.MAX_VALUE))
        );

        PanelCambio.add(Campos, "card2");

        Registros.setBackground(new java.awt.Color(0, 153, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Registros");

        javax.swing.GroupLayout RegistrosLayout = new javax.swing.GroupLayout(Registros);
        Registros.setLayout(RegistrosLayout);
        RegistrosLayout.setHorizontalGroup(
            RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrosLayout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel3)
                .addContainerGap(388, Short.MAX_VALUE))
        );
        RegistrosLayout.setVerticalGroup(
            RegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addContainerGap(732, Short.MAX_VALUE))
        );

        PanelCambio.add(Registros, "card2");

        Indices.setBackground(new java.awt.Color(0, 153, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("Indices");

        javax.swing.GroupLayout IndicesLayout = new javax.swing.GroupLayout(Indices);
        Indices.setLayout(IndicesLayout);
        IndicesLayout.setHorizontalGroup(
            IndicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IndicesLayout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel4)
                .addContainerGap(431, Short.MAX_VALUE))
        );
        IndicesLayout.setVerticalGroup(
            IndicesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IndicesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addContainerGap(732, Short.MAX_VALUE))
        );

        PanelCambio.add(Indices, "card2");

        Estandar.setBackground(new java.awt.Color(0, 153, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("Estandarizacion");

        javax.swing.GroupLayout EstandarLayout = new javax.swing.GroupLayout(Estandar);
        Estandar.setLayout(EstandarLayout);
        EstandarLayout.setHorizontalGroup(
            EstandarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstandarLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel5)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        EstandarLayout.setVerticalGroup(
            EstandarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstandarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addContainerGap(733, Short.MAX_VALUE))
        );

        PanelCambio.add(Estandar, "card2");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LArchivoMouseClicked
        PanelCambio.removeAll();
        PanelCambio.repaint();
        PanelCambio.revalidate();

        PanelCambio.add(Archivo);
        PanelCambio.repaint();
        PanelCambio.revalidate();
    }//GEN-LAST:event_LArchivoMouseClicked

    private void bt_CrearCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CrearCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_CrearCampoActionPerformed

    private void LCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LCamposMouseClicked
        PanelCambio.removeAll();
        PanelCambio.repaint();
        PanelCambio.revalidate();

        PanelCambio.add(Campos);
        PanelCambio.repaint();
        PanelCambio.revalidate();
    }//GEN-LAST:event_LCamposMouseClicked

    private void LSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LSalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LSalidaMouseClicked

    private void LSalida1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LSalida1MouseClicked

    }//GEN-LAST:event_LSalida1MouseClicked

    private void LSalida1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LSalida1MousePressed
        System.exit(0);
    }//GEN-LAST:event_LSalida1MousePressed

    private void bt_CrearArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CrearArchivoMouseClicked
        Writer writer = null;
        String NombreA = (JOptionPane.showInputDialog("Ingrese el nombre del archivo") + ".txt");

        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(NombreA), "utf-8"));
            //writer.write("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Campos, "Ocurrio un error al intentar crear el archivo");
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Campos, "Ocurrio un error al intentar crear el archivo");
            }
        }
        JOptionPane.showMessageDialog(Campos, "Se ha creado el archivo de texto");
    }//GEN-LAST:event_bt_CrearArchivoMouseClicked

    private void bt_CrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CrearArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_CrearArchivoActionPerformed

    private void LRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LRegistrosMouseClicked
        PanelCambio.removeAll();
        PanelCambio.repaint();
        PanelCambio.revalidate();

        PanelCambio.add(Registros);
        PanelCambio.repaint();
        PanelCambio.revalidate();
    }//GEN-LAST:event_LRegistrosMouseClicked

    private void LIndicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LIndicesMouseClicked
        PanelCambio.removeAll();
        PanelCambio.repaint();
        PanelCambio.revalidate();

        PanelCambio.add(Indices);
        PanelCambio.repaint();
        PanelCambio.revalidate();
    }//GEN-LAST:event_LIndicesMouseClicked

    private void LEstandarizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LEstandarizacionMouseClicked
        PanelCambio.removeAll();
        PanelCambio.repaint();
        PanelCambio.revalidate();

        PanelCambio.add(Estandar);
        PanelCambio.repaint();
        PanelCambio.revalidate();
    }//GEN-LAST:event_LEstandarizacionMouseClicked

    private void bt_CrearCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CrearCampoMouseClicked
        //int Cantidad = Integer.getInteger(JOptionPane.showInputDialog("Ingrese la cantidad de campos a guardar"));
        Scanner sc = new Scanner(System.in);

        Boolean IsNumeric = false;
        while (IsNumeric == false) {
            String algo = JOptionPane.showInputDialog("Ingrese la cantidad de campos");
            try {
                Cantidad = Integer.parseInt(algo);
                IsNumeric = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Porfavor introduzca un Numero");
                IsNumeric = false;
            }
        }

        jtf_NombreCampo.setText("");
        jd_NuevoCampo.pack();
        jd_NuevoCampo.show();
        jd_NuevoCampo.setVisible(true);
        jd_NuevoCampo.setEnabled(true);

    }//GEN-LAST:event_bt_CrearCampoMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        TipoCampo = "String";
        NombreCampo = jtf_NombreCampo.getText();
        if (RB_Int.isSelected()) {
            TipoCampo = "int";
        } else if (RB_Double.isSelected()) {
            TipoCampo = "Double";
        } else if (RB_Char.isSelected()) {
            TipoCampo = "char";
        } else if (RB_String.isSelected()) {
            TipoCampo = "String";
        }
        //jd_NuevoCampo.dispose();
        c = new Campos(TipoCampo, NombreCampo);
        CamposDArchivo.add(c);
        bg_Tipo.clearSelection();
        contador++;
        jtf_NombreCampo.setText(" ");
        if (contador == Cantidad) {
            jd_NuevoCampo.dispose();
            /*for (int i = 0; i < CamposDArchivo.size(); i++) {
                System.out.println(CamposDArchivo.get(i).toString());
            }*/
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jb_GuardarCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarCamposMouseClicked
        JFileChooser jfc = new JFileChooser();
        int seleccion = jfc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File fichero = jfc.getSelectedFile();
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);
                //bw.write(c.toString());
                for (Campos ca : CamposDArchivo) {
                    bw.write(ca.toString());
                }
                bw.flush();
                JOptionPane.showMessageDialog(this, "Campos guardados exitosamente");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_jb_GuardarCamposMouseClicked

    private void jb_LeerCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_LeerCamposMouseClicked
        Scanner sc = null;
        File archivo = null;
        BufferedReader br = null;
        FileReader fr = null;
        try {
            JFileChooser jcf = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
            FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("Imagenes", "jpg", "png", "bmp");
            jcf.setFileFilter(filtro);
            jcf.addChoosableFileFilter(filtro2);
            int seleccion = jcf.showOpenDialog(this);
            ///////////////////////////////////////////
            if(seleccion == JFileChooser.APPROVE_OPTION){
                 archivo = jcf.getSelectedFile();
                 fr = new FileReader(archivo);
                 br = new BufferedReader(fr);
                 String linea = "";
                 linea = br.readLine();
                 JOptionPane.showMessageDialog(Campos, linea);
            }else{
                JOptionPane.showMessageDialog(Campos, "El archivo esta vacio");
            }
            ////////////////////////////////
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_LeerCamposMouseClicked

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Archivo;
    private javax.swing.JPanel Campos;
    private javax.swing.JPanel Estandar;
    private javax.swing.JPanel Indices;
    private javax.swing.JLabel LArchivo;
    private javax.swing.JLabel LCampos;
    private javax.swing.JLabel LEstandarizacion;
    private javax.swing.JLabel LIndices;
    private javax.swing.JLabel LRegistros;
    private javax.swing.JLabel LSalida;
    private javax.swing.JLabel LSalida1;
    private javax.swing.JPanel PanelCambio;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JRadioButton RB_Char;
    private javax.swing.JRadioButton RB_Double;
    private javax.swing.JRadioButton RB_Int;
    private javax.swing.JRadioButton RB_String;
    private javax.swing.JPanel Registros;
    private javax.swing.ButtonGroup bg_Tipo;
    private javax.swing.JButton bt_CrearArchivo;
    private javax.swing.JButton bt_CrearCampo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_GuardarCampos;
    private javax.swing.JButton jb_LeerCampos;
    private javax.swing.JDialog jd_NuevoCampo;
    private javax.swing.JTextField jtf_NombreCampo;
    // End of variables declaration//GEN-END:variables
    File ArchivoActual;
    String TipoCampo = "";
    int contador = 0;
    String NombreCampo = "";
    ArrayList<Campos> CamposDArchivo = new ArrayList();
    int Cantidad = 0;
    Campos c;
}
