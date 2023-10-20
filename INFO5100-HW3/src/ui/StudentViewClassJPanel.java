/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.Admin;
import model.Course;
import model.Student;

/**
 *
 * @author xupeihan
 */
public class StudentViewClassJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentViewClassJPanel
     */
    Admin admin;
    Course course;
    Student student;
    JSplitPane SplitPane;
    public StudentViewClassJPanel(Course course, Admin admin, Student student,JSplitPane SplitPane) {
        initComponents();
        this.course=course;
        this.admin=admin;
        this.student=student;
        this.SplitPane=SplitPane;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StudentViewClassJPanel = new javax.swing.JPanel();
        lblCourseName = new javax.swing.JLabel();
        txtcWeekDay = new javax.swing.JTextField();
        lblSemester = new javax.swing.JLabel();
        txtCourseCata = new javax.swing.JTextField();
        lblCourseDesc = new javax.swing.JLabel();
        txtcHour = new javax.swing.JTextField();
        lblCourseCode = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWaitlist = new javax.swing.JTable();
        lblWeekDay = new javax.swing.JLabel();
        lblCourseCatalog = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCStu = new javax.swing.JTable();
        lblHour = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblWatilist = new javax.swing.JLabel();
        txtcName = new javax.swing.JTextField();
        txtcYear = new javax.swing.JTextField();
        txtSemester = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        lblCourseDetail = new javax.swing.JLabel();
        txtcCode = new javax.swing.JTextField();
        txtcDescription = new javax.swing.JTextField();
        lblSemester1 = new javax.swing.JLabel();
        txtCourseTopic = new javax.swing.JTextField();

        lblCourseName.setText("Course Name:");

        txtcWeekDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcWeekDayActionPerformed(evt);
            }
        });

        lblSemester.setText("Semester:");

        txtCourseCata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseCataActionPerformed(evt);
            }
        });

        lblCourseDesc.setText("Course Description:");

        txtcHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcHourActionPerformed(evt);
            }
        });

        lblCourseCode.setText("Course Code:");

        tblWaitlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student Name", "Student ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWaitlist);

        lblWeekDay.setText("WeekDay:");

        lblCourseCatalog.setText("Course Catalog:");

        tblCStu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student Name", "Student ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCStu);

        lblHour.setText("Hour:");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblWatilist.setText("Waitlist:");

        txtcName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcNameActionPerformed(evt);
            }
        });

        txtcYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcYearActionPerformed(evt);
            }
        });

        txtSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemesterActionPerformed(evt);
            }
        });

        lblYear.setText("Year:");

        lblCourseDetail.setText("Course Detail");

        txtcCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcCodeActionPerformed(evt);
            }
        });

        txtcDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcDescriptionActionPerformed(evt);
            }
        });

        lblSemester1.setText("Topic:");

        javax.swing.GroupLayout StudentViewClassJPanelLayout = new javax.swing.GroupLayout(StudentViewClassJPanel);
        StudentViewClassJPanel.setLayout(StudentViewClassJPanelLayout);
        StudentViewClassJPanelLayout.setHorizontalGroup(
            StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblCourseDetail))
                    .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblHour)
                        .addGap(javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE)
                        .addComponent(txtcHour, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246)
                        .addComponent(lblCourseDesc)
                        .addGap(18, 18, 18)
                        .addComponent(txtcDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentViewClassJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(152, 152, 152))
            .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCourseName)
                            .addComponent(lblSemester1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtCourseTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lblSemester)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                                .addComponent(txtcName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                                        .addComponent(lblYear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcYear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                                        .addComponent(lblCourseCode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcCode, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(4, 4, 4)
                        .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCourseCatalog)
                            .addComponent(lblWeekDay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCourseCata, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcWeekDay, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                                .addComponent(lblWatilist)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        StudentViewClassJPanelLayout.setVerticalGroup(
            StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblCourseDetail)
                .addGap(18, 18, 18)
                .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCourseName)
                    .addComponent(lblCourseCode)
                    .addComponent(lblCourseCatalog)
                    .addComponent(txtcName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourseCata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSemester1)
                    .addComponent(txtCourseTopic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSemester)
                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWeekDay)
                    .addComponent(txtcWeekDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCourseDesc)
                                .addComponent(lblYear)
                                .addComponent(txtcYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(StudentViewClassJPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHour)
                            .addComponent(txtcHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(StudentViewClassJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWatilist))
                .addGap(14, 14, 14)
                .addComponent(btnBack)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentViewClassJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentViewClassJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtcWeekDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcWeekDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcWeekDayActionPerformed

    private void txtCourseCataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseCataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseCataActionPerformed

    private void txtcHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcHourActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        StudentCourseJPanel panel=new StudentCourseJPanel(SplitPane,admin,student);
        SplitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtcNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcNameActionPerformed

    private void txtcYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcYearActionPerformed

    private void txtSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemesterActionPerformed

    private void txtcCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcCodeActionPerformed

    private void txtcDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcDescriptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel StudentViewClassJPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCourseCatalog;
    private javax.swing.JLabel lblCourseCode;
    private javax.swing.JLabel lblCourseDesc;
    private javax.swing.JLabel lblCourseDetail;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblSemester1;
    private javax.swing.JLabel lblWatilist;
    private javax.swing.JLabel lblWeekDay;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTable tblCStu;
    private javax.swing.JTable tblWaitlist;
    private javax.swing.JTextField txtCourseCata;
    private javax.swing.JTextField txtCourseTopic;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtcCode;
    private javax.swing.JTextField txtcDescription;
    private javax.swing.JTextField txtcHour;
    private javax.swing.JTextField txtcName;
    private javax.swing.JTextField txtcWeekDay;
    private javax.swing.JTextField txtcYear;
    // End of variables declaration//GEN-END:variables

    private void displayProduct() {
        txtcName.setText(course.getcName());
        txtcCode.setText(course.getcCode());
        txtCourseCata.setText(course.getcCatalog());
        txtCourseTopic.setText(course.getcTopic());
        txtcDescription.setText(course.getcDescription());
        txtSemester.setText(course.getSemesters());
        txtcWeekDay.setText(course.getWeekdays());
        txtcHour.setText(course.getHours());
        txtcYear.setText(course.getYears());
       
    }
    private void populateTable() {
             DefaultTableModel model1 = (DefaultTableModel) tblCStu.getModel();
             model1.setRowCount(0);
             for(Student student: course.getStudentList()){
               Object [] row = new Object[3];
               row[0] = student;
               row[1] = student.getName();
               row[2] = student.getStudentID();
               model1.addRow(row);
             }    
               
               
             DefaultTableModel model2 = (DefaultTableModel) tblWaitlist.getModel();
             model2.setRowCount(0);
             for(Student student: course.getWaitList()){
               Object [] row = new Object[3];
               row[0] = student;
               row[1] = student.getName();
               row[2] = student.getStudentID();
               model2.addRow(row);
               }
    }
}
