/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visão;
import Persistencia.Funcionário;
import Persistencia.Comum;
import Persistencia.Gerente;
import Cadastro.CLS_Cad;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class FrmFuncionário extends javax.swing.JFrame {
    CLS_Cad c=new CLS_Cad();
     int matricula = 0;

    /**
     * Creates new form FrmFuncionário
     */
    public FrmFuncionário() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtMatr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtSal = new javax.swing.JTextField();
        rbdComum = new javax.swing.JRadioButton();
        rbdGer = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        LCarga = new javax.swing.JLabel();
        TxtCarga = new javax.swing.JTextField();
        LCom = new javax.swing.JLabel();
        TxtComissao = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        BtnRec = new javax.swing.JButton();
        BtnMed = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Formulário de Funcionário");

        jLabel2.setText("Matrícula");

        TxtMatr.setEditable(false);
        TxtMatr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMatrActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Salário");

        TxtSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSalActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbdComum);
        rbdComum.setText("Comum");
        rbdComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdComumActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbdGer);
        rbdGer.setText("Gerente");
        rbdGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdGerActionPerformed(evt);
            }
        });

        jLabel6.setText("O que sou:");

        LCarga.setText("Carga Horária");

        TxtCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCargaActionPerformed(evt);
            }
        });

        LCom.setText("Comissão");

        BtnAdd.setText("Adicionar");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnRec.setText("Recuperar");
        BtnRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecActionPerformed(evt);
            }
        });

        BtnMed.setText("Média Salário");
        BtnMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMedActionPerformed(evt);
            }
        });

        btnSoma.setText("Soma Gerente");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtMatr, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TxtSal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbdComum)
                                .addGap(28, 28, 28)
                                .addComponent(rbdGer))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnAdd)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LCarga)
                                        .addComponent(LCom)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TxtCarga)
                                        .addComponent(TxtComissao, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnRec)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnMed)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)))))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSoma)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtMatr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbdComum)
                    .addComponent(rbdGer)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCarga)
                    .addComponent(TxtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LCom)
                    .addComponent(TxtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSoma)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdd)
                    .addComponent(BtnRec)
                    .addComponent(BtnMed)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

    private void TxtSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSalActionPerformed

    private void rbdComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdComumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbdComumActionPerformed

    private void rbdGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdGerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbdGerActionPerformed

    private void TxtCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCargaActionPerformed

    private void TxtMatrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMatrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMatrActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
      /* boolean erro=false;
       matricula++;
       TxtMatr.setText(String.valueOf(matricula));
       if(TxtMatr.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Preencha a matricula");
           erro=true;
       }else
           if(TxtNome.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Preencha o nome");
           erro=true;
           }else {
             if (TxtSal.getText().equals(""))
               JOptionPane.showMessageDialog(null,"Preencha o salário");
           }
             
     if(erro==true){
         System.out.println("Erro na entrada de dados");
         System.exit(111);}
     
     Comum comum=new Comum();
     Gerente g=new Gerente();
     Funcionário f=null;
     
     if (rbdComum.isSelected()){
         f=comum;
            //else//{
      //   f=g;
    }
     f.setMatricula(Integer.parseInt(TxtMatr.getText()));
     System.out.println("bbb " + f.getMatricula());
     f.setNome(TxtNome.getText());
     f.setSalario(Double.parseDouble(TxtSal.getText()));   
     rbdComum.setSelected(false);
     if (rbdGer.isSelected()==true){
      //   f=gerente;
         
         c.carrega(f);
     }else{
       f=comum;
       c.carrega(f);}*/
        Funcionário f=null;
        if (rbdComum.isSelected()){
          Comum co=new Comum();
          co.setMatricula(Integer.parseInt(TxtMatr.getText()));
          co.setNome(TxtNome.getText());
          co.setCarga(Integer.parseInt(TxtCarga.getText()));
          co.setSalario(Double.parseDouble(TxtSal.getText()));
          co.setTp("Comum");
          f=co;
        }else {
            Gerente g=new Gerente();
            g.setTp("Gerente");
            g.setMatricula(Integer.parseInt(TxtMatr.getText()));
            g.setNome(TxtNome.getText());
            g.setSalario(Double.parseDouble(TxtSal.getText()));
            g.setComissao(Double.parseDouble(TxtComissao.getText()));
            f=g;
        }
        c.adiciona(f);
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecActionPerformed
        /*buttonGroup1.clearSelection();
        rbdComum.setSelected(false);
        rbdGer.setSelected(false);
        Funcionário f=null;
        int ind=c.recupera(TxtNome.getText());
        TxtMatr.setText(String.valueOf(c.getListFunc().get(ind).getMatricula()));
        TxtSal.setText(String.valueOf(c.getListFunc().get(ind).getSalario())); */
        Funcionário fm=null;
        fm=c.recupera(TxtNome.getText());
        if (fm.getTp().equals("Comum")){
            Comum co= (Comum) fm;
            TxtMatr.setText(String.valueOf(co.getMatricula())); 
            TxtSal.setText(String.valueOf(co.getSalario()));
            TxtCarga.setText(String.valueOf(co.getCarga()));
            rbdComum.setFocusable(true);
        }
        else{
            Gerente g = (Gerente) fm;
            TxtMatr.setText(String.valueOf(g.getMatricula())); 
            TxtSal.setText(String.valueOf(g.getSalario()));
            TxtComissao.setText(String.valueOf(g.getComissao()));
            rbdGer.setFocusable(true);
        }
    }//GEN-LAST:event_BtnRecActionPerformed

    private void BtnMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMedActionPerformed
        double med= c.calcMedia();
        System.out.println("Média: "+med);
    }//GEN-LAST:event_BtnMedActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
       double val= c.totalGer();
       System.out.println("total   "+ val);
    }//GEN-LAST:event_btnSomaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("Maior nome "+ c.MaiornomeComum());
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(FrmFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFuncionário.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFuncionário().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnMed;
    private javax.swing.JButton BtnRec;
    private javax.swing.JLabel LCarga;
    private javax.swing.JLabel LCom;
    private javax.swing.JTextField TxtCarga;
    private javax.swing.JTextField TxtComissao;
    private javax.swing.JTextField TxtMatr;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtSal;
    private javax.swing.JButton btnSoma;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rbdComum;
    private javax.swing.JRadioButton rbdGer;
    // End of variables declaration//GEN-END:variables
}
