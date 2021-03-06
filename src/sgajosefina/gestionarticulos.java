/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgajosefina;

import java.awt.Color;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Bolivar
 */
public class gestionarticulos extends javax.swing.JFrame {

    /**
     * Creates new form gestionarticulos
     */
    public gestionarticulos(Point p) {
        initComponents();
        setLocation(p);
        setResizable(false);
        buttoneliminar.setEnabled(false);
        botoneditar.setEnabled(false);
        jButton1.setEnabled(false);
        if(frame1.getrango().equals("500")) botonagregar.setEnabled(false);
        
        
        setTitle("Gestion de Articulos");
        txtnombre.setEditable(false);
        txtmarca.setEditable(false);
        txtprecio.setEditable(false);
        txtunidades.setEditable(false);
        txtPreciocompra.setEditable(false);
        String registro="";
        String nombre="";
        String marca="";
        
        // cargado el combo box
        try{
          FileReader leer=new FileReader("datos/articulos.data");
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
               
                // lee marca articulo
               if(registro.charAt(i)=='$'){
               
                   for(int j=i+1;registro.charAt(j)!='%';j++){
                   marca+=registro.charAt(j);
                   } 
           
              }
               
                
               
           }
           
           if(registro.equals("")==false)cbxarticulo.addItem(nombre+" ("+marca+")");
           
              
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxarticulo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtunidades = new javax.swing.JTextField();
        botoneditar = new javax.swing.JButton();
        botonagregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        buttoneliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblcompraprecio = new javax.swing.JLabel();
        txtPreciocompra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxarticulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir" }));
        cbxarticulo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxarticuloItemStateChanged(evt);
            }
        });

        jLabel1.setText("Articulos:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Precio de venta:");

        jLabel5.setText("Unidades:");

        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });

        botoneditar.setText("Editar articulo");
        botoneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneditarActionPerformed(evt);
            }
        });

        botonagregar.setText("Agregar articulo");
        botonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttoneliminar.setText("Eliminar articulo");
        buttoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoneliminarActionPerformed(evt);
            }
        });

        jButton2.setText("<-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblcompraprecio.setText("PrecioCompra:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxarticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(botoneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(txtmarca)))
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblcompraprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtunidades, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(buttoneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPreciocompra))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxarticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botoneditar)
                    .addComponent(botonagregar))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtunidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcompraprecio)
                    .addComponent(txtPreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttoneliminar)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarActionPerformed
agregararticulo go=new agregararticulo(this.getLocation()); 
go.setVisible(true);// TODO add your handling code here:
this.dispose();
    }//GEN-LAST:event_botonagregarActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void cbxarticuloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxarticuloItemStateChanged

String registro="";
String nombre="";
String marca="";
String precio="";
String unidades="";
String nm="";
String preciocompra="";
if(cbxarticulo.getSelectedItem().equals("Elegir")){

  buttoneliminar.setEnabled(false);
   botoneditar.setEnabled(false);
   jButton1.setEnabled(false);
   txtnombre.setText("");
        txtmarca.setText("");
        txtprecio.setText("");
        txtunidades.setText("");
        txtPreciocompra.setText("");
  
}else{
if(frame1.getrango().equals("500")){
  buttoneliminar.setEnabled(false);
  botonagregar.setEnabled(false);
}else{
  buttoneliminar.setEnabled(true);
  botonagregar.setEnabled(true);
}

     botoneditar.setEnabled(true);
     jButton1.setEnabled(true);
}

 txtnombre.setEditable(false);
        txtmarca.setEditable(false);
        txtprecio.setEditable(false);
        txtunidades.setEditable(false);
        txtPreciocompra.setEditable(false);
        //cargando valores del registro
        
        try{
            
         FileReader leer=new FileReader("datos/articulos.data");
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
               
                // lee marca articulo
               if(registro.charAt(i)=='$'){
               
                   for(int j=i+1;registro.charAt(j)!='%';j++){
                   marca+=registro.charAt(j);
                   } 
           
              }
               
                 // lee precio del articulo
               if(registro.charAt(i)=='%'){
               
                   for(int j=i+1;registro.charAt(j)!='@';j++){
                   precio+=registro.charAt(j);
                   } 
           
              }
               // lee unidades
                if(registro.charAt(i)=='@'){
               
                   for(int j=i+1;registro.charAt(j)!='!';j++){
                   unidades+=registro.charAt(j);
                   } 
           
              }
                
                  // lee precio bruto
                if(registro.charAt(i)=='!'){
               
                   for(int j=i+1;j<registro.length();j++){
                   preciocompra+=registro.charAt(j);
                   } 
           
              }
                
                
               
           }
           
           nm=nombre+" ("+marca+")";
     
        if(nm.equals(cbxarticulo.getSelectedItem())){
        
        txtnombre.setText(nombre);
        txtmarca.setText(marca);
        txtprecio.setText(precio);
        txtunidades.setText(unidades);
        txtPreciocompra.setText(preciocompra);
         
        
        }
              
                  registro="";
                  nombre="";
                  precio="";
                  marca="";
                  unidades="";
                  preciocompra="";
                  registro=contenido.readLine();

                  
       }
   leer.close();
   contenido.close();
       
        }catch(Exception e){
        
        
        
        }
        
        





        // TODO add your handling code here:
    }//GEN-LAST:event_cbxarticuloItemStateChanged

    private void botoneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneditarActionPerformed



   
        txtprecio.setEditable(true);
        txtunidades.setEditable(true);
        txtPreciocompra.setEditable(true);
    }//GEN-LAST:event_botoneditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String registro[]=new String[cbxarticulo.getItemCount()];
 String nombre="";
 String marca="";
 String precio="";
 String unidades="";
 String registroc="";
 String preciocompra="";
 int p=0;
 int desde=0;
 int hasta=0;
 boolean corresponde=false;
        try{
            
        FileReader leer=new FileReader("datos/articulos.data");
       BufferedReader contenido=new BufferedReader(leer);
       
   
      
 


             registro[p]=contenido.readLine();
             p++;
             registroc=contenido.readLine();
     
    
             System.out.println(registroc);
             
             while(registroc!=null){
                       

             for(int i=0;i<registroc.length();i++){
               
               
                 if(registroc.charAt(i)=='#'){
                 
                 for(int j=i+1;registroc.charAt(j)!='$';j++){
                 nombre+=registroc.charAt(j);
                 
                 }
             
                 
                 
                 }
                 
                    // lee marca articulo
               if(registroc.charAt(i)=='$'){
                   
               
                 
                   for(int j=i+1;registroc.charAt(j)!='%';j++){
                   marca+=registroc.charAt(j);
                   } 
              
              }
                
             if((nombre.equals(txtnombre.getText())) && (marca.equals(txtmarca.getText())) && corresponde==false)
             {
             corresponde=true;
            
               
             }
             
                  // lee precio del articulo
               if(registroc.charAt(i)=='%'){
           
                   for(int j=i;registroc.charAt(j)!='@';j++){
                   precio+=registroc.charAt(j);
                   } 
             
              }
          

           
             // lee unidades
                if(registroc.charAt(i)=='@'){
               
                   for(int j=i;registroc.charAt(j)!='!';j++){
                   unidades+=registroc.charAt(j);
                   } 

              }
                
                 // lee precio bruto
                if(registroc.charAt(i)=='!'){
               
                   for(int j=i;j<registroc.length();j++){
                   preciocompra+=registroc.charAt(j);
                   } 

              }
                
                
                
           
           
           }
          
             if(corresponde){
            registroc=registroc.replaceAll(precio,"%"+txtprecio.getText());
            registroc=registroc.replaceAll(unidades,"@"+txtunidades.getText());
            registroc=registroc.replaceAll(preciocompra,"!"+txtPreciocompra.getText());
          
               corresponde=false;
               
             }
       
                 registro[p]=registroc;
   
         
                  if(p<cbxarticulo.getItemCount()){
                  p++;
                  }
                  
   
                  registroc=contenido.readLine();
  
                  nombre="";
                  precio="";
                  marca="";
                  unidades="";
                  preciocompra="";
       
                 
                             
             }
        
             
             leer.close();
   contenido.close();

   // modificacion de registros
         File fout = new File("datos/articulos.data");
FileOutputStream fos = new FileOutputStream(fout);

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

   for(int i=0;i<cbxarticulo.getItemCount();i++){
   bw.write(registro[i]);
    
       
       if(i==cbxarticulo.getItemCount()-1)
       {
           break;
       }
   bw.newLine();
   }
             
            bw.close();  
             fos.close();
             
             JOptionPane.showMessageDialog(null,"Datos guardados correctamente!");
        }catch(Exception e){
        System.out.println("fallo fatal");
        
        }





        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneliminarActionPerformed
int confirm=JOptionPane.showConfirmDialog(null,"Seguro que desea eliminar el articulo: "+cbxarticulo.getSelectedItem(),"Eliminar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);


if(confirm==0){
System.out.println("Articulo elminado");

//borrando articulo

String registro[]=new String[cbxarticulo.getItemCount()];
 String nombre="";
 String marca="";
 String precio="";
 String unidades="";
 String preciocompra="";
 String registroc="";
 int p=0;
 int desde=0;
 int hasta=0;
 boolean corresponde=false;
        try{
            
        FileReader leer=new FileReader("datos/articulos.data");
       BufferedReader contenido=new BufferedReader(leer);
       
   
      
 


             registro[p]=contenido.readLine();
             p++;
             registroc=contenido.readLine();
     
    
             System.out.println(registroc);
             
             while(registroc!=null){
                       

             for(int i=0;i<registroc.length();i++){
               
               
                 if(registroc.charAt(i)=='#'){
                 
                 for(int j=i+1;registroc.charAt(j)!='$';j++){
                 nombre+=registroc.charAt(j);
                 
                 }
             
                 
                 
                 }
                 
                    // lee marca articulo
               if(registroc.charAt(i)=='$'){
                   
               
                 
                   for(int j=i+1;registroc.charAt(j)!='%';j++){
                   marca+=registroc.charAt(j);
                   } 
              
              }
                
             if((nombre.equals(txtnombre.getText())) && (marca.equals(txtmarca.getText())) && corresponde==false)
             {
             corresponde=true;
            
               
             }
             
                  // lee precio del articulo
               if(registroc.charAt(i)=='%'){
           
                   for(int j=i;registroc.charAt(j)!='@';j++){
                   precio+=registroc.charAt(j);
                   } 
             
              }
          

           
             // lee unidades
                if(registroc.charAt(i)=='@'){
               
                   for(int j=i;registroc.charAt(j)!='!';j++){
                   unidades+=registroc.charAt(j);
                   } 

              }
                
                  // lee precio bruto
                if(registroc.charAt(i)=='!'){
               
                   for(int j=i;j<registroc.length();j++){
                   preciocompra+=registroc.charAt(j);
                   } 

              }
           
           
           }
          
             if(corresponde){
                 /*
            registroc=registroc.replaceAll(precio,"%"+txtprecio.getText());
            registroc=registroc.replaceAll(unidades,"@"+txtunidades.getText());
            */
                registroc="*";
  
               corresponde=false;
               
             }
       
           
   
                       registro[p]=registroc;
                  if(p<cbxarticulo.getItemCount()){
                  p++;
                  }
                  
   
                  registroc=contenido.readLine();
  
                  nombre="";
                  precio="";
                  marca="";
                  unidades="";
       
                 
                             
             }
        
             
             leer.close();
   contenido.close();

   // modificacion de registros
         File fout = new File("datos/articulos.data");
FileOutputStream fos = new FileOutputStream(fout);

BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

   for(int i=0;i<cbxarticulo.getItemCount();i++){
                 
       if(registro[i].equals("*")){
       //do nothing
       }else{
       bw.write(registro[i]);
       }
       
       if(i==cbxarticulo.getItemCount()-1)
       {
           break;
       }
         if(registro[i].equals("*")){
       //do nothing
       }else{
         bw.newLine();
       }

   
   }
             
            bw.close();  
             fos.close();
             
             JOptionPane.showMessageDialog(null,"Articulo : "+cbxarticulo.getSelectedItem()+" elminado!");
             cbxarticulo.removeItem(cbxarticulo.getSelectedItem());
             cbxarticulo.setSelectedIndex(0);
             
        }catch(Exception e){
        System.out.println("fallo fatal");
        
        }




}else if(confirm==1){

System.out.println("No se borro el articulo");
}


    }//GEN-LAST:event_buttoneliminarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Menu go=new Menu(this.getLocation());
        go.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonagregar;
    private javax.swing.JButton botoneditar;
    private javax.swing.JButton buttoneliminar;
    private javax.swing.JComboBox<String> cbxarticulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblcompraprecio;
    private javax.swing.JTextField txtPreciocompra;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtunidades;
    // End of variables declaration//GEN-END:variables
}
