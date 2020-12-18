
package pacificinstitute;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Valentina
 */
public class VentanaAlumno extends javax.swing.JFrame {

    ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
    public VentanaAlumno() {
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

        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        lblCursos = new javax.swing.JLabel();
        txtCursosCursados = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblRut.setText("Rut");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        lblCursos.setText("Cursos ya cursados");

        txtCursosCursados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCursosCursadosActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAlumnos);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCursos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCursosCursados, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellido)
                                    .addComponent(lblRut)
                                    .addComponent(lblNombre))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRut)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCursos)
                            .addComponent(txtCursosCursados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnListar)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)
                            .addComponent(btnBuscar))))
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    private void txtCursosCursadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursosCursadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursosCursadosActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int rut = Integer.parseInt(txtRut.getText());
        int cursosCursados = Integer.parseInt(txtCursosCursados.getText());
           
        if (!"".equals(nombre) && !"".equals(apellido) && !"".equals(rut)) {
            Alumno alumno = new Alumno (nombre,rut, apellido, cursosCursados);
            Conexion conexion = new Conexion();
            Connection con = conexion.getConexion();
            try {
                PreparedStatement ps = con.prepareStatement("insert into alumnos (Rut, Nombre, Apellido, CursosCursados) values(?,?,?,?)");
                ps.setInt(1, alumno.getRut());
                ps.setString(2, alumno.getNombre());
                ps.setString(3, alumno.getApellido());
                ps.setInt(4, alumno.getCursosCursados());
                int result = ps.executeUpdate();
                if (result > 0) {
                    cargarLista();
                    cargarDatosTabla();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Registro ha sido creado exitosamente");
                }else{
                    JOptionPane.showMessageDialog(null, "Registro no se ha creado");
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }             
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int rut;   
        rut = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el rut del alumno a buscar"));
        
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        
        try {
            PreparedStatement ps = con.prepareStatement("select * from alumnos where rut = "+rut+" limit 1;");
            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            
            if(rs.next()){
                alumno = new Alumno(rs.getString(2), rs.getInt(1), rs.getString(3), rs.getInt(4));
                txtRut.setText(""+alumno.getRut());
                txtNombre.setText(alumno.getNombre());
                txtApellido.setText(alumno.getApellido());
                txtCursosCursados.setText(""+alumno.getCursosCursados());
                JOptionPane.showMessageDialog(null, alumno.mostrarDatos());
            }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado el alumno con el rut: "+rut);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        cargarLista();
        cargarDatosTabla();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int rut = Integer.parseInt(txtRut.getText());
        int cursosCursados = Integer.parseInt(txtCursosCursados.getText());
       
        if (!"".equals(nombre) && !"".equals(apellido) && !"".equals(rut)) {

            Alumno alumno = new Alumno (nombre,rut, apellido, cursosCursados);
                Conexion conexion = new Conexion();
                Connection con = conexion.getConexion();

                try {
                    PreparedStatement ps = con.prepareStatement("select * from alumnos where rut = "+rut+" limit 1;");
                    ResultSet rs = ps.executeQuery();


                    if(rs.next()){
                        ps = con.prepareStatement("update alumnos set nombre=?, apellido=?, cursosCursados=? where rut=?");

                        ps.setString(1, nombre);
                        ps.setString(2, apellido);
                        ps.setInt(3, cursosCursados);
                        ps.setInt(4, rut);
                        int result = ps.executeUpdate();
                        if (result > 0) {
                            cargarLista();
                            cargarDatosTabla();
                            limpiar();
                            JOptionPane.showMessageDialog(null, "Registro ha sido actualizado");
                        }else{
                            JOptionPane.showMessageDialog(null, "Registro no se ha actualizado");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "No se ha encontrado el alumno con el rut: "+rut);
                    }
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaAlumno.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }else {
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
            }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int rut;
        rut = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el rut del alumno a eliminar"));
       
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

            try {
                PreparedStatement ps = con.prepareStatement("select * from alumnos where rut = "+rut+" limit 1;");
                ResultSet rs = ps.executeQuery();


                if(rs.next()){

                    ps = (PreparedStatement) con.prepareStatement("DELETE FROM alumnos WHERE Rut=?");
                    ps.setString(1, String.valueOf(rut));

                    int result = ps.executeUpdate();
                    if(result>0){
                        cargarLista();
                        cargarDatosTabla();  
                        JOptionPane.showMessageDialog(null, "Registro eliminado de manera exitosa");                            
                    }else {
                        JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
                    }
               }else{
                    JOptionPane.showMessageDialog(null, "No se ha encontrado el alumno con el rut: "+rut);
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    public void cargarDatosTabla(){
        
        String array[][] = null;
        
        if (listaAlumnos.size() > 0) {
            array = new String [listaAlumnos.size()][4];
            for (int i = 0; i < listaAlumnos.size(); i++) {
                
                array[i][0]= listaAlumnos.get(i).getNombre();
                array[i][1]= listaAlumnos.get(i).getApellido();
                array[i][2]= String.valueOf (listaAlumnos.get(i).getRut());
                array[i][3]= String.valueOf (listaAlumnos.get(i).getCursosCursados());
                
                tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
                        array,
                        new String[]{
                            "Nombre","Apellido", "Rut","Cursos ya cursados"
                        }
                ));        
            }
        } else {
            tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
                    array,
                    new String[]{
                        "Nombre", "Apellidos", "Rut", "Cursos ya cursados"
                    }
            ));    
        }   
    }
    
    private void cargarLista(){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        try {
            PreparedStatement ps = con.prepareStatement("select * from alumnos;");
            ResultSet rs = ps.executeQuery();
            Alumno alumno;
            listaAlumnos.clear();
            while(rs.next()){
                alumno = new Alumno(rs.getString(2), rs.getInt(1), rs.getString(3), rs.getInt(4));
                listaAlumnos.add(alumno);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void limpiar (){
       txtNombre.setText("");
       txtApellido.setText("");
       txtRut.setText("");
       txtCursosCursados.setText("");
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
            java.util.logging.Logger.getLogger(VentanaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCursos;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRut;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCursosCursados;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}