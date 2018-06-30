/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thefinalproyect;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dam_9
 */
public class MaynGUI extends javax.swing.JFrame {

    /**
     * Creates new form MaynGUI
     */
    public MaynGUI() {
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

        AgregarCampos = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_Campos = new javax.swing.JList<>();
        jb_AgregarCampo = new javax.swing.JButton();
        jb_LlavePrimaria = new javax.swing.JButton();
        jb_GuardarC = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        AbrirArchivo = new javax.swing.JMenuItem();
        Salvar = new javax.swing.JMenuItem();
        CerrarArchivo = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        CrearCampos = new javax.swing.JMenuItem();
        GuardarCampos = new javax.swing.JMenuItem();
        ListarCampos = new javax.swing.JMenuItem();
        ModificarCampos = new javax.swing.JMenuItem();
        BorrarCampos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        CargarPrueba = new javax.swing.JMenuItem();
        IntroducirRegistros = new javax.swing.JMenuItem();
        ModificarRegistros = new javax.swing.JMenuItem();
        BuscarRegistros = new javax.swing.JMenuItem();
        BorrarRegistros = new javax.swing.JMenuItem();
        ListarRegistros = new javax.swing.JMenuItem();
        CruzarArchivos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        CrearIndice = new javax.swing.JMenuItem();
        ReIndexarArchviso = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ExportarExcel = new javax.swing.JMenuItem();
        ExportarXML = new javax.swing.JMenuItem();

        AgregarCampos.setTitle("Agregando Campos");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Campos actuales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 14))); // NOI18N

        jl_Campos.setModel(new DefaultListModel());
        jl_Campos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jl_Campos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        jb_AgregarCampo.setText("Agregar Campo");
        jb_AgregarCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_AgregarCampoMouseClicked(evt);
            }
        });

        jb_LlavePrimaria.setText("Seleccionar como llave primaria");
        jb_LlavePrimaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_LlavePrimariaMouseClicked(evt);
            }
        });

        jb_GuardarC.setText("Guardar los campos");
        jb_GuardarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_AgregarCampo)
                    .addComponent(jb_LlavePrimaria)
                    .addComponent(jb_GuardarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jb_AgregarCampo)
                        .addGap(18, 18, 18)
                        .addComponent(jb_LlavePrimaria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_GuardarC)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AgregarCamposLayout = new javax.swing.GroupLayout(AgregarCampos.getContentPane());
        AgregarCampos.getContentPane().setLayout(AgregarCamposLayout);
        AgregarCamposLayout.setHorizontalGroup(
            AgregarCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AgregarCamposLayout.setVerticalGroup(
            AgregarCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Archivo");

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        jMenu2.add(Nuevo);

        AbrirArchivo.setText("Abrir");
        AbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirArchivoActionPerformed(evt);
            }
        });
        jMenu2.add(AbrirArchivo);

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        jMenu2.add(Salvar);

        CerrarArchivo.setText("Cerrar");
        CerrarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarArchivoActionPerformed(evt);
            }
        });
        jMenu2.add(CerrarArchivo);

        Exit.setText("Salir");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu2.add(Exit);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Campos");

        CrearCampos.setText("Crear Campos");
        CrearCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCamposActionPerformed(evt);
            }
        });
        jMenu1.add(CrearCampos);

        GuardarCampos.setText("Guardar Campos");
        GuardarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCamposActionPerformed(evt);
            }
        });
        jMenu1.add(GuardarCampos);

        ListarCampos.setText("Listar Campos");
        ListarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarCamposActionPerformed(evt);
            }
        });
        jMenu1.add(ListarCampos);

        ModificarCampos.setText("Modificar Campos");
        ModificarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarCamposActionPerformed(evt);
            }
        });
        jMenu1.add(ModificarCampos);

        BorrarCampos.setText("Borrar Campos");
        BorrarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarCamposActionPerformed(evt);
            }
        });
        jMenu1.add(BorrarCampos);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Registros");

        CargarPrueba.setText("Cargar Registros de Prueba");
        jMenu3.add(CargarPrueba);

        IntroducirRegistros.setText("Crear Registros");
        jMenu3.add(IntroducirRegistros);

        ModificarRegistros.setText("Modificar Registros");
        jMenu3.add(ModificarRegistros);

        BuscarRegistros.setText("Buscar Registros");
        jMenu3.add(BuscarRegistros);

        BorrarRegistros.setText("Borrar Registros");
        jMenu3.add(BorrarRegistros);

        ListarRegistros.setText("Listar Registros");
        jMenu3.add(ListarRegistros);

        CruzarArchivos.setText("Cruzar Archivos");
        jMenu3.add(CruzarArchivos);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Indices");

        CrearIndice.setText("Crear Indice");
        CrearIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearIndiceActionPerformed(evt);
            }
        });
        jMenu4.add(CrearIndice);

        ReIndexarArchviso.setText("ReIndexar Archivos");
        jMenu4.add(ReIndexarArchviso);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Utilidades");

        ExportarExcel.setText("Exportar Excel");
        jMenu5.add(ExportarExcel);

        ExportarXML.setText("Exportar XML");
        jMenu5.add(ExportarXML);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        Writer writer = null;
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File save = new File(fileChooser.getSelectedFile() + ".txt");
                try (FileWriter fw = new FileWriter(fileChooser.getSelectedFile() + ".txt")) {
                    fw.write("");
                    fw.close();
                    ArchivoActual = fileChooser.getSelectedFile().getAbsolutePath() + ".txt";
                } catch (Exception e) {
                }
            }
            //outFile = new PrintWriter(file); // TODO Auto-generated catch block

            JOptionPane.showMessageDialog(this, "Se ha creado el archivo de texto");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_NuevoActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        if (ArchivoActual == null) {
            JOptionPane.showMessageDialog(this, "No se ha creado un archivo");
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void CerrarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarArchivoActionPerformed
        if (ArchivoActual == null) {
            JOptionPane.showMessageDialog(this, "No se ha creado un archivo");
        } else {
            ArchivoActual = null;
        }
    }//GEN-LAST:event_CerrarArchivoActionPerformed

    private void CrearIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearIndiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearIndiceActionPerformed

    private void ListarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarCamposActionPerformed
        if (ArchivoActual == null) {
            JOptionPane.showMessageDialog(this, "No se ha creado un archivo");
        } else {
            StringTokenizer tokens;
            StringTokenizer tokens2;
            String cadena = "";
            String cadena2 = "";
            tokens = new StringTokenizer(cadena, "|");
            tokens2 = new StringTokenizer(cadena, ";git statuis");
            while (tokens.hasMoreTokens()) {
                cadena2 = cadena2 + ": " + tokens.nextToken();
            }
        }
    }//GEN-LAST:event_ListarCamposActionPerformed

    private void CrearCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCamposActionPerformed
        BufferedReader br=null;
        try {
            br=new BufferedReader(new FileReader(ArchivoActual));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MaynGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ArchivoActual == null) {
            JOptionPane.showMessageDialog(this, "No se ha creado un archivo");

        } else try {
            if (br.readLine()==null) {
                JOptionPane.showMessageDialog(this, "Ya existe Los Campos");
            } else {
                AgregarCampos.pack();
                AgregarCampos.show();
                AgregarCampos.setVisible(true);
                AgregarCampos.setEnabled(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(MaynGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_CrearCamposActionPerformed

    private void jb_AgregarCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_AgregarCampoMouseClicked
        String Tipo, Nombre;
        Nombre = JOptionPane.showInputDialog(this, "Introdusca el nombre del campo");
        Tipo = JOptionPane.showInputDialog(this, "Ingrese el tipo del dato (String, Integer, Double, Character, etc.");
        Campos c = new Campos(Tipo, Nombre);
        DefaultListModel Modelo = (DefaultListModel) jl_Campos.getModel();
        Modelo.addElement(c);
    }//GEN-LAST:event_jb_AgregarCampoMouseClicked

    private void jb_LlavePrimariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_LlavePrimariaMouseClicked
        DefaultListModel Modelo = (DefaultListModel) jl_Campos.getModel();
        if (!jl_Campos.isSelectionEmpty()) {
            Campos CL = jl_Campos.getSelectedValue();
            CL.setNombre("*" + CL.getNombre());
        } else {
            JOptionPane.showMessageDialog(this, "No hay ningun elemento seleccionado");
        }
        jb_LlavePrimaria.setVisible(false);
    }//GEN-LAST:event_jb_LlavePrimariaMouseClicked

    private void jb_GuardarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarCMouseClicked
        DefaultListModel Modelo = (DefaultListModel) jl_Campos.getModel();
        if (Modelo.getSize() != 0) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                for (int i = 0; i < Modelo.getSize(); i++) {
                    Campos CL = (Campos) Modelo.get(i);
                    fw = new FileWriter(ArchivoActual, true);
                    bw = new BufferedWriter(fw);
                    bw.write(CL.toString());

                }
                bw.flush();
                JOptionPane.showMessageDialog(AgregarCampos, "Se han guardado los campos en " + ArchivoActual);
                AgregarCampos.dispose();

                try {
                    fw.close();
                    bw.close();
                } catch (Exception Ex) {
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Esto se fue a la mier**");
            }
        } else {
            JOptionPane.showMessageDialog(this, "La lista esta actualmente vacia");

        }
    }//GEN-LAST:event_jb_GuardarCMouseClicked

    private void GuardarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCamposActionPerformed

        if (ArchivoActual == null) {
            JOptionPane.showMessageDialog(this, "No se ha creado un archivo");
        } else {
            DefaultListModel modelo = (DefaultListModel) jl_Campos.getModel();

        }
    }//GEN-LAST:event_GuardarCamposActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ModificarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarCamposActionPerformed
        if (ArchivoActual == null) {
            JOptionPane.showMessageDialog(this, "No se ha creado un archivo");
        }
    }//GEN-LAST:event_ModificarCamposActionPerformed

    private void BorrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarCamposActionPerformed
        if (ArchivoActual == null) {
            JOptionPane.showMessageDialog(this, "No se ha creado un archivo");
        }
    }//GEN-LAST:event_BorrarCamposActionPerformed

    private void AbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirArchivoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        fileChooser.setFileFilter(filter);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ArchivoActual = fileChooser.getSelectedFile().getAbsolutePath();
        }
    }//GEN-LAST:event_AbrirArchivoActionPerformed

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
            java.util.logging.Logger.getLogger(MaynGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaynGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaynGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaynGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaynGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AbrirArchivo;
    private javax.swing.JDialog AgregarCampos;
    private javax.swing.JMenuItem BorrarCampos;
    private javax.swing.JMenuItem BorrarRegistros;
    private javax.swing.JMenuItem BuscarRegistros;
    private javax.swing.JMenuItem CargarPrueba;
    private javax.swing.JMenuItem CerrarArchivo;
    private javax.swing.JMenuItem CrearCampos;
    private javax.swing.JMenuItem CrearIndice;
    private javax.swing.JMenuItem CruzarArchivos;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem ExportarExcel;
    private javax.swing.JMenuItem ExportarXML;
    private javax.swing.JMenuItem GuardarCampos;
    private javax.swing.JMenuItem IntroducirRegistros;
    private javax.swing.JMenuItem ListarCampos;
    private javax.swing.JMenuItem ListarRegistros;
    private javax.swing.JMenuItem ModificarCampos;
    private javax.swing.JMenuItem ModificarRegistros;
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JMenuItem ReIndexarArchviso;
    private javax.swing.JMenuItem Salvar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_AgregarCampo;
    private javax.swing.JButton jb_GuardarC;
    private javax.swing.JButton jb_LlavePrimaria;
    private javax.swing.JList<Campos> jl_Campos;
    // End of variables declaration//GEN-END:variables
   String ArchivoActual;
    String TipoCampo = "";
    int contador = 0;
    String NombreCampo = "";
    ArrayList<Campos> CamposDArchivo = new ArrayList();
    int Cantidad = 0;
    Campos c;

}
