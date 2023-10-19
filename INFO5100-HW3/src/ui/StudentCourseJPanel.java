/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.Admin;
import model.Course;
import model.Student;

/**
 *
 * @author JANFAN
 */
public class StudentCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentCourseJPanel
     */
    JSplitPane SplitPane;
    Admin admin;
    Student student;
    public StudentCourseJPanel(JSplitPane SplitPane,Admin admin,Student student) {
        initComponents();
        this.SplitPane=SplitPane;
        this.admin=admin;
        this.student=student;
        populateCurrentCourseTable();
        populateCourseHistoryTable();
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
        tblCurrentCourse = new javax.swing.JTable();
        btnDropClass = new javax.swing.JButton();
        btnJoinClass = new javax.swing.JButton();
        btnViewDetail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCourseHistory = new javax.swing.JTable();
        lblCourseHistory = new javax.swing.JLabel();
        btnViewDetail1 = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lblTitle.setText("Course Management");

        lblCurrentCourse.setText("Current Course:");

        tblCurrentCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Course Code", "Semester", "Weekday", "Hour", "Capacity", "Current student", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCurrentCourse);

        btnDropClass.setText("Drop Class");
        btnDropClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropClassActionPerformed(evt);
            }
        });

        btnJoinClass.setText("Join Another Class");
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

        tblCourseHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Course Code", "Professor", "Semester", "Weekday", "Hour", "Capacity", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCourseHistory);

        lblCourseHistory.setText("Course History:");

        btnViewDetail1.setText("Rate your professor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnViewDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDropClass, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnViewDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnJoinClass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCourseHistory)
                            .addComponent(lblCurrentCourse)
                            .addComponent(lblTitle)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(115, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblCurrentCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDropClass)
                    .addComponent(btnJoinClass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewDetail)
                .addGap(71, 71, 71)
                .addComponent(lblCourseHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnViewDetail1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnJoinClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinClassActionPerformed
        // TODO add your handling code here:
        StudentCourseRegisterJPanel studentCourseRegisterJPanel=new StudentCourseRegisterJPanel(admin,student);
        SplitPane.setRightComponent(studentCourseRegisterJPanel);
    }//GEN-LAST:event_btnJoinClassActionPerformed

    private void btnViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewDetailActionPerformed

    private void btnDropClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropClassActionPerformed
        // TODO add your handling code here:
        // drop class:
        //1.student delete this class in the current course
        //2.course delete the student in student list
        //3.course check waitlist if have student move student to student list;
        
        int selectedRowIndex=tblCurrentCourse.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete");
            return;
        }
        DefaultTableModel model=(DefaultTableModel)tblCurrentCourse.getModel();
        Course selectedCourse=(Course)model.getValueAt(selectedRowIndex,0);
        
        
        student.getCurrentCourses().remove(selectedCourse);
        JOptionPane.showMessageDialog(this,"Course deleted.");
        
        populateCurrentCourseTable();
        
        //course delete the student in student list
        selectedCourse.getStudentList().remove(student);
        //course check waitlist if have student move student to student list;
        
        if(!selectedCourse.getWaitList().isEmpty()){
            Student newStudent=selectedCourse.getWaitList().get(0);
            selectedCourse.getWaitList().remove(0);
            selectedCourse.getStudentList().add(newStudent);
        }
        
        
    }//GEN-LAST:event_btnDropClassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDropClass;
    private javax.swing.JButton btnJoinClass;
    private javax.swing.JButton btnViewDetail;
    private javax.swing.JButton btnViewDetail1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCourseHistory;
    private javax.swing.JLabel lblCurrentCourse;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCourseHistory;
    private javax.swing.JTable tblCurrentCourse;
    // End of variables declaration//GEN-END:variables
 private void populateCurrentCourseTable() {
        DefaultTableModel model=(DefaultTableModel)tblCurrentCourse.getModel();
        model.setRowCount(0);
        
        for(Course course : student.getCurrentCourses()){
            Object[]row =new Object[7];
            row[0]=course;
            row[1]=course.getSemester();
            row[2]=course.getWeekdays().toString();
            row[3]=course.getHours();
            row[4]=10;
            row[5]=course.getStudentList().size();
            row[6]=course.getGrade().get(student);
            model.addRow(row);
        }            
    }

    private void populateCourseHistoryTable() {
        DefaultTableModel model=(DefaultTableModel)tblCourseHistory.getModel();
        model.setRowCount(0);
        
        for(Course course : student.getCourseHistory()){
            Object[]row =new Object[7];
            row[0]=course;
            row[1]=course.getProfessorName();
            row[2]=course.getSemester();
            row[3]=course.getWeekdays().toString();
            row[4]=course.getHours();
            row[5]=10;
            row[6]=course.getGrade().get(student);
            model.addRow(row);
        }
    }
}
