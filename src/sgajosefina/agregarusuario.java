/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgajosefina;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bolivar
 */
public class agregarusuario extends javax.swing.JFrame {

    /**
     * Creates new form agregarusuario
     */
    public agregarusuario(Point p) {
        initComponents();
        setLocation(p);
        setTitle("Agregar Usuario");
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pas1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        pas2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cbxtipouser = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre de usuario:");

        jLabel2.setText("Contraseña:");

        jLabel3.setText("Confirmar contraseña:");

        jLabel4.setText("Tipo de usuario:");

        cbxtipouser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Administrador" }));

        jButton1.setText("Crear Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(32, 32, 32)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pas1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pas2)
                                    .addComponent(cbxtipouser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxtipouser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean validarusuario(String usuario){

    String registro="";
        String nombre="";
        String marca="";
        boolean comprueba=true;
        
        // cargado el combo box
        try{
          FileReader leer=new FileReader("datos/sfx.data");
       BufferedReader contenido=new BufferedReader(leer);
       
       
       registro=contenido.readLine();
       
       while(registro!=null){
              

  
    
        
           for(int i=0;i<registro.length();i++){
           // lee nombre articulo
               if(registro.charAt(i)=='#'){
               
                   for(int j=i+1;registro.charAt(j)!='$';j++){
                   nombre+=registro.charAt(j);
                   } 
                
           
              }
               if(nombre.equals(usuario))comprueba=false;
                // lee marca articulo
               if(registro.charAt(i)=='$'){
               
                   for(int j=i+1;registro.charAt(j)!='%';j++){
                   marca+=registro.charAt(j);
                   } 
           
              }
               
                
               
           }
           
        
              
                  registro="";
                  nombre="";
                  marca="";
                  registro=contenido.readLine();
  
                  
       }
       
       //cerrando el flujo de lectura
       leer.close();
       contenido.close();
 
      
        }catch(Exception e){
        
            
        
        }
    
    
    
    
    
return comprueba;
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username=txtusername.getText();
        String contra1=new String(pas1.getPassword());
        String contra2=new String(pas2.getPassword());
        String preciorango="";
        String unidades="43242";
        boolean comp=false;
        
        if(contra1.equals(contra2)){
        comp=true;
        }else{
        
        JOptionPane.showMessageDialog(null,"Confirme la contraseña!");
        }
        
        
       

if(validarusuario(username) && comp ){
    
    try{
        //agregando articulo
        FileWriter fw=new FileWriter("datos/sfx.data",true);




/*
        lectura sin utilidad
        FileReader leer=new FileReader("datos/articulos.txt");
       BufferedReader contenido=new BufferedReader(leer);
*/
       fw.write("\r\n");
       
    
       /*
       while(contenido.readLine()!=null){
        fw.write("\r\n");
System.out.println("X");
        }
*/


        //escribiendo nombre

        try{

fw.write('#');
for(int i=0;i<username.length();i++){

fw.write(username.charAt(i));
}



}catch(IOException e){
}
        
                //escribiendo marca
        try{

fw.write('$');
for(int i=0;i<contra2.length();i++){

fw.write(contra2.charAt(i));
}



}catch(IOException e){
}
        
                   //escribiendo precio
        try{
if(cbxtipouser.getSelectedItem().equals("Normal")){
preciorango="500";
}else{
preciorango="1500";

}
fw.write('%');
for(int i=0;i<preciorango.length();i++){

fw.write(preciorango.charAt(i));
}

}catch(IOException e){
    JOptionPane.showMessageDialog(null,"Quien esta detras de ti?");
}
  
                        //escribiendo unidades
        try{

fw.write('@');
for(int i=0;i<unidades.length();i++){

fw.write(unidades.charAt(i));
}



}catch(IOException e){
    JOptionPane.showMessageDialog(null,"Solo ingrese numeros enteros en unidades");
}
        

//close file
    JOptionPane.showMessageDialog(null,"Nuevo usuario creado!");
    fw.close();
 

        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null,"Error al crear usuario");
        }
    
    
    

    
} 
else{
      JOptionPane.showMessageDialog(null,"El usuario: "+username+" ya existe!");
                      
}
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ajustes go=new ajustes(this.getLocation());
        go.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxtipouser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pas1;
    private javax.swing.JPasswordField pas2;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
