/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import action.DepartmentAction;
import action.TeacherAction;
import infobean.TeacherInfoBean;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author reqaw
 */
public class DelTeacherFrame extends javax.swing.JFrame {

    /**
     * Creates new form DelTeacherFrame
     */
    public DelTeacherFrame() {
        initComponents();
        int windowWidth = this.getWidth(); //获得窗口宽

        int windowHeight = this.getHeight(); //获得窗口高

        Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包

        Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸

        int screenWidth = screenSize.width; //获取屏幕的宽

        int screenHeight = screenSize.height; //获取屏幕的高

        this.setLocation(screenWidth / 2 - windowWidth / 2, screenHeight / 2 - windowHeight / 2);//设置窗口居中显示
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hintL = new javax.swing.JLabel();
        teacherIdL = new javax.swing.JTextField();
        showDetailB = new javax.swing.JButton();
        teacherNameL = new javax.swing.JLabel();
        teacherSexL = new javax.swing.JLabel();
        teacherBirthL = new javax.swing.JLabel();
        teacherSchoolL = new javax.swing.JLabel();
        teacherTechL = new javax.swing.JLabel();
        teacherAddressL = new javax.swing.JLabel();
        teacherIndateL = new javax.swing.JLabel();
        teacherDepartmentL = new javax.swing.JLabel();
        teacherDutyL = new javax.swing.JLabel();
        delTeacherB = new javax.swing.JButton();
        teacherNameT = new javax.swing.JTextField();
        teacherSexT = new javax.swing.JTextField();
        teacherBirthT = new javax.swing.JTextField();
        teacherSchoolT = new javax.swing.JTextField();
        teacherTechT = new javax.swing.JTextField();
        teacherAddressT = new javax.swing.JTextField();
        teacherIndateT = new javax.swing.JTextField();
        teacherDepartmentT = new javax.swing.JTextField();
        teacherDutyT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        hintL.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        hintL.setText("请输入离职员工编号：");

        teacherIdL.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N

        showDetailB.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        showDetailB.setText("查看详细信息");
        showDetailB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDetailBActionPerformed(evt);
            }
        });

        teacherNameL.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        teacherNameL.setText("姓名：");

        teacherSexL.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        teacherSexL.setText("性别：");

        teacherBirthL.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        teacherBirthL.setText("生日：");

        teacherSchoolL.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        teacherSchoolL.setText("毕业院校：");

        teacherTechL.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        teacherTechL.setText("专业：");

        teacherAddressL.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        teacherAddressL.setText("籍贯：");

        teacherIndateL.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        teacherIndateL.setText("入职时间：");

        teacherDepartmentL.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        teacherDepartmentL.setText("部门：");

        teacherDutyL.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        teacherDutyL.setText("岗位：");

        delTeacherB.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        delTeacherB.setText("确定离职");
        delTeacherB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delTeacherBActionPerformed(evt);
            }
        });

        teacherNameT.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N

        teacherSexT.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N

        teacherBirthT.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N

        teacherSchoolT.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N

        teacherTechT.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N

        teacherAddressT.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N

        teacherIndateT.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N

        teacherDutyT.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hintL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teacherIdL, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(delTeacherB)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teacherIndateL, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(teacherDepartmentL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teacherDutyL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(teacherDepartmentT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(teacherIndateT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacherDutyT))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showDetailB)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(teacherTechL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teacherBirthL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teacherSexL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teacherNameL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teacherSchoolL, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(teacherAddressL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(teacherTechT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(teacherSchoolT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teacherBirthT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teacherSexT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teacherNameT, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teacherAddressT))
                                .addGap(25, 25, 25)))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hintL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherIdL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showDetailB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teacherSexL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacherSexT, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherBirthT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherBirthL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherSchoolL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherSchoolT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherTechL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherTechT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherAddressL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherAddressT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherIndateL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherIndateT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherDepartmentL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherDepartmentT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherDutyL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherDutyT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(delTeacherB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showDetailBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDetailBActionPerformed
       String teacherid = this.teacherIdL.getText().trim();
       if(teacherid.equals(""))
           JOptionPane.showMessageDialog(null, "<html><font Color='red'>请输入员工编号" ,"错误", JOptionPane.ERROR_MESSAGE);
       else {
           TeacherAction teacherAction = new TeacherAction();
           TeacherInfoBean teacherinfo = teacherAction.findTeacherByTeacherID(teacherid);
           if(teacherinfo == null) {
               JOptionPane.showMessageDialog(null, "<html><font Color='red'>此员工编号不存在，请重新输入" ,"错误", JOptionPane.ERROR_MESSAGE);
               this.teacherIdL.setText("");
           }
           else {
               this.teacherNameT.setText(teacherinfo.getTeacherName());
               this.teacherBirthT.setText(teacherinfo.getTeacherBirthday());
               this.teacherSexT.setText(teacherinfo.getTeacherSex());
               this.teacherSchoolT.setText(teacherinfo.getTeacherSchool());
               this.teacherTechT.setText(teacherinfo.getTeacherTech());
               this.teacherAddressT.setText(teacherinfo.getTeacherAddress());
               this.teacherIndateT.setText(teacherinfo.getTeacherIndate());
               DepartmentAction departmentAction = new DepartmentAction();
               this.teacherDepartmentT.setText(departmentAction.findDepartmentNameByDepartmentID(teacherinfo.getTeacherDepartment()));
               this.teacherDutyT.setText(teacherinfo.getTeacherDuty());
           }
       }
    }//GEN-LAST:event_showDetailBActionPerformed

    private void delTeacherBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delTeacherBActionPerformed
        String teacherid = this.teacherIdL.getText().trim();
        if(teacherid.equals(""))
            JOptionPane.showMessageDialog(null, "<html><font Color='red'>请输入员工编号" ,"错误", JOptionPane.ERROR_MESSAGE);
        else {
            TeacherAction teacherAction = new TeacherAction();
            TeacherInfoBean teacherinfo = teacherAction.findTeacherByTeacherID(teacherid);
            if(teacherinfo == null) {
                JOptionPane.showMessageDialog(null, "<html><font Color='red'>此员工编号不存在，请重新输入" ,"错误", JOptionPane.ERROR_MESSAGE);
                this.teacherIdL.setText("");
            }
            else {
                int ok = teacherAction.delTeacher(teacherid);
                if(ok < 0)
                    JOptionPane.showMessageDialog(null, "<html><font Color='red'>删除失败，请重新点击员工离职" ,"错误", JOptionPane.ERROR_MESSAGE);
                else {
                    JOptionPane.showMessageDialog(null, "<html><font Color='red'>删除成功" ,"错误", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            this.setVisible(false);
       }
    }//GEN-LAST:event_delTeacherBActionPerformed

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
            java.util.logging.Logger.getLogger(DelTeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DelTeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DelTeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DelTeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DelTeacherFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delTeacherB;
    private javax.swing.JLabel hintL;
    private javax.swing.JButton showDetailB;
    private javax.swing.JLabel teacherAddressL;
    private javax.swing.JTextField teacherAddressT;
    private javax.swing.JLabel teacherBirthL;
    private javax.swing.JTextField teacherBirthT;
    private javax.swing.JLabel teacherDepartmentL;
    private javax.swing.JTextField teacherDepartmentT;
    private javax.swing.JLabel teacherDutyL;
    private javax.swing.JTextField teacherDutyT;
    private javax.swing.JTextField teacherIdL;
    private javax.swing.JLabel teacherIndateL;
    private javax.swing.JTextField teacherIndateT;
    private javax.swing.JLabel teacherNameL;
    private javax.swing.JTextField teacherNameT;
    private javax.swing.JLabel teacherSchoolL;
    private javax.swing.JTextField teacherSchoolT;
    private javax.swing.JLabel teacherSexL;
    private javax.swing.JTextField teacherSexT;
    private javax.swing.JLabel teacherTechL;
    private javax.swing.JTextField teacherTechT;
    // End of variables declaration//GEN-END:variables
}
