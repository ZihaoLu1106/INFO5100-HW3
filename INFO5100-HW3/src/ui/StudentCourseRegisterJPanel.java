/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.awt.CardLayout;
import model.Admin;
import model.Student;
import model.Course;
import javax.swing.JSplitPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Professor;



import model.Admin;
import model.Student;

/**
 *
 * @author JANFAN
 */

public class StudentCourseRegisterJPanel extends javax.swing.JPanel {
    JSplitPane SplitPane;
    Admin admin;
    Student student;
    Professor professor;
    Course course;
    /**
     * Creates new form StudentCourseRegisterJPanel
     */

    public StudentCourseRegisterJPanel(Admin admin,Student student,JSplitPane SplitPane) {
        initComponents();
        this.SplitPane=SplitPane;
        this.admin=admin;
        this.student=student;
        this.professor=professor;
        this.course=course;
        populateCurrentCourseTable();
        populateCurrentHistoryTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblCurrentCourse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllCourse = new javax.swing.JTable();
        lblCourseHistory = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllProfessor = new javax.swing.JTable();
        btnJoinClass = new javax.swing.JButton();
        btnViewDetail = new javax.swing.JButton();
        txtccode = new javax.swing.JTextField();
        lblCatelog = new javax.swing.JLabel();
        btnSearchCourse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtProfName = new javax.swing.JTextField();
        txtPRegion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPLanguage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPTopic = new javax.swing.JTextField();
        btnSearchProfessor = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lblTitle.setText("Course Registration");

        lblCurrentCourse.setText("Course List");

        tblAllCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Course Code", "Semester", "Professor", "Weekday", "Hour", "Capacity", "Current student"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllCourse);
        if (tblAllCourse.getColumnModel().getColumnCount() > 0) {
            tblAllCourse.getColumnModel().getColumn(0).setResizable(false);
            tblAllCourse.getColumnModel().getColumn(1).setResizable(false);
            tblAllCourse.getColumnModel().getColumn(2).setResizable(false);
            tblAllCourse.getColumnModel().getColumn(3).setResizable(false);
            tblAllCourse.getColumnModel().getColumn(4).setResizable(false);
            tblAllCourse.getColumnModel().getColumn(5).setResizable(false);
            tblAllCourse.getColumnModel().getColumn(6).setResizable(false);
        }

        lblCourseHistory.setText("Professor List");

        tblAllProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Professor", "Course", "Region", "Language", "Topic", "Ranking"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAllProfessor);
        if (tblAllProfessor.getColumnModel().getColumnCount() > 0) {
            tblAllProfessor.getColumnModel().getColumn(0).setResizable(false);
            tblAllProfessor.getColumnModel().getColumn(1).setResizable(false);
            tblAllProfessor.getColumnModel().getColumn(2).setResizable(false);
            tblAllProfessor.getColumnModel().getColumn(3).setResizable(false);
            tblAllProfessor.getColumnModel().getColumn(4).setResizable(false);
            tblAllProfessor.getColumnModel().getColumn(5).setResizable(false);
        }

        btnJoinClass.setText("Join Class");
        btnJoinClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinClassActionPerformed(evt);
            }
        });

        btnViewDetail.setText("View Detail");
        btnViewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailActionPerformed(evt);
            }
        });

        txtccode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtccodeActionPerformed(evt);
            }
        });

        lblCatelog.setText("Search Course Code:");

        btnSearchCourse.setText("Search");
        btnSearchCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCourseActionPerformed(evt);
            }
        });

        jLabel2.setText("Professor Name:");

        txtProfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfNameActionPerformed(evt);
            }
        });

        txtPRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPRegionActionPerformed(evt);
            }
        });

        jLabel3.setText("Region:");

        jLabel4.setText("Language:");

        txtPLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPLanguageActionPerformed(evt);
            }
        });

        jLabel5.setText("Topic:");

        txtPTopic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPTopicActionPerformed(evt);
            }
        });

        btnSearchProfessor.setText("Search");
        btnSearchProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCourseHistory)
                        .addGap(703, 703, 703))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSearchProfessor)
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCurrentCourse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCatelog)
                                .addGap(4, 4, 4)
                                .addComponent(txtccode, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearchCourse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnJoinClass, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(4, 4, 4)
                            .addComponent(txtProfName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addGap(4, 4, 4)
                            .addComponent(txtPRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addGap(4, 4, 4)
                            .addComponent(txtPLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel5)
                            .addGap(4, 4, 4)
                            .addComponent(txtPTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblCurrentCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJoinClass)
                    .addComponent(txtccode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCatelog)
                    .addComponent(btnSearchCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewDetail)
                .addGap(21, 21, 21)
                .addComponent(lblCourseHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchProfessor)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtccodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtccodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtccodeActionPerformed

    private void txtProfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfNameActionPerformed

    private void txtPRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPRegionActionPerformed

    private void txtPLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPLanguageActionPerformed

    private void txtPTopicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPTopicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPTopicActionPerformed

    private void btnJoinClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinClassActionPerformed
        // TODO add your handling code here:
        if(student.CheckGraduateStatus()){
            JOptionPane.showMessageDialog(this,"You can choose class since you have finish all requrement for graduate.");
                return;
        }
        
         int selectedRowIndex=tblAllCourse.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete");
            return;
        }
        DefaultTableModel model=(DefaultTableModel)tblAllCourse.getModel();
        Course selectedcourse=(Course)model.getValueAt(selectedRowIndex,0);
        //the class needs to add into student currentlist can student will be add into course's student list
        //check if student have this class
        
        for(Course course:student.getCurrentCourses()){
            if(course.getcCode().equals(selectedcourse.getcCode())){
                JOptionPane.showMessageDialog(this,"You have chosed same class");
                return;
            }
            if(course.getTime().equals(selectedcourse.getTime())){
                JOptionPane.showMessageDialog(this,"Time conflict");
                return;
            }
        }
        if(student.getCurrentCourses().size()>=2){
            JOptionPane.showMessageDialog(this,"You have reached max class");
                return;
        }
        //
        if(selectedcourse.getStudentList().size()<10){
            selectedcourse.getStudentList().add(student);
            student.getCurrentCourses().add(selectedcourse);
        }else{
            selectedcourse.getWaitList().add(student);
        }
        StudentCourseJPanel panel=new StudentCourseJPanel(SplitPane,admin,student);
        SplitPane.setRightComponent(panel);
        
    }//GEN-LAST:event_btnJoinClassActionPerformed

    private void btnSearchCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCourseActionPerformed
        // TODO add your handling code here:
        Course code=admin.getCourse(txtccode.getText());
        //        Account result=accountDirectory.searchAccount(txtAccountNumber.getText());
         if(code==null){
            JOptionPane.showMessageDialog(null, "Account number you entered does not exist", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
       else{
             populateCurrentCourseTable();
         }

    }//GEN-LAST:event_btnSearchCourseActionPerformed

    private void btnViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex= tblAllCourse.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }
        DefaultTableModel model=(DefaultTableModel)tblAllCourse.getModel();
        Course selectedcourse=(Course)model.getValueAt(selectedRowIndex,0);
        StudentViewClassJPanel panel=new StudentViewClassJPanel(selectedcourse,admin,student,SplitPane);
        SplitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnViewDetailActionPerformed

    private void btnSearchProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProfessorActionPerformed
        // TODO add your handling code here:
        for(Professor professor: admin.getAllProfessor()){
                if(txtProfName.getText().equals(professor.getName())|| txtPRegion.getText().equals(professor.getRegion())||
                   txtPLanguage.getText().equals(professor.getLanguage()) || txtPTopic.getText().equals(professor.getTopic())){
                      populateCurrentCourseTable();
                }
                else{
                      JOptionPane.showMessageDialog(null, "The professor information you entered does not exist", "Information", JOptionPane.INFORMATION_MESSAGE); 
                      break;                
                }
          }
    }//GEN-LAST:event_btnSearchProfessorActionPerformed

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJoinClass;
    private javax.swing.JButton btnSearchCourse;
    private javax.swing.JButton btnSearchProfessor;
    private javax.swing.JButton btnViewDetail;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCatelog;
    private javax.swing.JLabel lblCourseHistory;
    private javax.swing.JLabel lblCurrentCourse;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAllCourse;
    private javax.swing.JTable tblAllProfessor;
    private javax.swing.JTextField txtPLanguage;
    private javax.swing.JTextField txtPRegion;
    private javax.swing.JTextField txtPTopic;
    private javax.swing.JTextField txtProfName;
    private javax.swing.JTextField txtccode;
    // End of variables declaration//GEN-END:variables

    private void populateCurrentCourseTable() {
        DefaultTableModel model=(DefaultTableModel)tblAllCourse.getModel();
        model.setRowCount(0);
        
        for(Course course : admin.getAllCourse()){
            Object[]row =new Object[7];
            row[0]=course;
            row[1]=course.getSemester();
            row[2]=course.getProfessorName();
            row[3]=course.getWeekdays();
            row[4]=course.getHours();
            row[5]=10;
            row[6]=course.getStudentList().size();
            model.addRow(row);
        }
    }
    private void populateCurrentHistoryTable() {
        DefaultTableModel model=(DefaultTableModel)tblAllProfessor.getModel();
        model.setRowCount(0);
        
        for(Professor p : admin.getAllProfessor()){
            Object[]row =new Object[6];
            row[0]=p;
            row[1]=p.getCourseList().toString();
            row[2]=p.getRegion();
            row[3]=p.getLanguage();
            row[4]=p.getTopic();
            row[5]=p.getRank();
            model.addRow(row);
        }
    }
}

