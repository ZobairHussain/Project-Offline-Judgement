
package Pakage;

import P1.OfflineJudge;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class NewClass extends javax.swing.JFrame {

    public NewClass() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(180, 80));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("Offline Judge");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel2.setText("Language :");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setText("Problem No :");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel4.setText("Get Code :");

        jComboBox1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G" }));

        jComboBox2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "C", "C++", "JAVA" }));

        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton1.setText("Choose File");
        jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton1ActionPerformed(evt);
        });

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jButton2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton2ActionPerformed(evt);
        });

        jScrollPane4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        
        //jTable1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(jTable1);
        

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel5.setText("Get Output :");

        jButton3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton3.setText("Choose File");
        jButton3.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton3ActionPerformed(evt);
        });

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel6.setText("Code");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel7.setText("Verdict :");

        jScrollPane1.setViewportView(jTextPane1);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel8.setText("Time :");

        jScrollPane2.setViewportView(jTextPane2);

        jButton4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton4.setText("Clear");

        jLabel9.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel9.setText("Powered by Zobair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(69, 69, 69)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(56, 56, 56)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jButton1)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton2)
                        .addGap(26, 26, 26)
                        .addComponent(jButton4)))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(340, 340, 340))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jButton2)
                            .addComponent(jButton4))))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:

        File file;
        JFrame frame = new JFrame("Hello");
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(frame);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            String path = fc.getSelectedFile().getAbsolutePath();
            file = fc.getSelectedFile();

            try{
                Scanner scanner;
                scanner = new Scanner(file);
                String input = "";
                
                while (scanner.hasNextLine()) {
                input = input+scanner.nextLine()+"\n";
                }
                scanner.close();
                jTextArea3.setText(input);
            } catch (FileNotFoundException e){
            }
        }
        else{
            System.out.println("Open command cancelled by user");
        }
        System.out.println(returnVal);

    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String res = null, txt;
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        
        
        //write data from jTaxtArea1 to submitted.txt
        try {        
            try(BufferedWriter ofile = new BufferedWriter(new FileWriter("D:\\STUDY\\3rd_semister\\Run\\submitted.txt"))) {
                jTextArea3.write(ofile);
                ofile.flush();
                ofile.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(OfflineJudge.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //CAll bat file..
        try {
            Process p = Runtime.getRuntime().exec(new String[]{"D:\\STUDY\\3rd_semister\\Run\\01.bat"});
            p.waitFor();
        } catch (IOException er) {
            System.out.println("Error!222");
        } catch (InterruptedException er) {
        }
        
        //read output
        try {
            try (BufferedReader ifile = new BufferedReader(new FileReader("D:\\STUDY\\3rd_semister\\Run\\verdict.txt"))) {
                res = ifile.readLine();
            }
        } catch (IOException er) {
        }
        
        
    //Print output of judge & user in jTxtArea2, jTextArea3..       
    int flag, flag2;
    StringBuilder buffer = new StringBuilder("");
    FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("D:\\\\STUDY\\\\3rd_semister\\\\Run\\\\judge.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OfflineJudge.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while( (flag = inputStream.read()) != -1)
                buffer.append((char) flag);
        } catch (IOException ex) {
            Logger.getLogger(OfflineJudge.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            inputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(OfflineJudge.class.getName()).log(Level.SEVERE, null, ex);
        }
        String abc = buffer.toString();
        
        jTextArea3.setText(abc);   //prob
     
        StringBuilder buffer2 = new StringBuilder("");
        FileInputStream inputStream2 = null;
        try {
            inputStream2 = new FileInputStream(new File("D:\\\\STUDY\\\\3rd_semister\\\\Run\\\\output.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OfflineJudge.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            while( (flag2 = inputStream2.read()) != -1)
                buffer2.append((char) flag2);
        } catch (IOException ex) {
            Logger.getLogger(OfflineJudge.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            inputStream2.close();
        } catch (IOException ex) {
            Logger.getLogger(OfflineJudge.class.getName()).log(Level.SEVERE, null, ex);
        }
        abc = buffer2.toString();
        jTextArea2.setText(abc);    //prob
       
        //Show verdict & time
        String time = Double.toString(endTime-startTime);
        //JOptionPane.showMessageDialog(null, "Verdict: " + res + "\nTime Taken: " + (endTime - startTime) + " ms");
        jTextPane2.setText(time + "  ms");
        jTextPane1.setText(res);
        //Delete outputs from folder
        try {
            Process p;
            p = Runtime.getRuntime().exec("D:\\STUDY\\3rd_semister\\Run\\del.bat");
            p.waitFor();
        } catch (IOException er) {
            System.out.println("Error!0101");
        } catch (InterruptedException er) {
        }
    }                                        

    public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        File file;
        JFrame frame = new JFrame("Hello");
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(frame);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            String path = fc.getSelectedFile().getAbsolutePath();
            file = fc.getSelectedFile();
            System.out.println(file);
            try{
                Scanner scanner;
                scanner = new Scanner(file);
                String input = "";
                while (scanner.hasNextLine()) {
                input = input+scanner.nextLine()+"\n";  //input e ache jinis ta......file
                }
                scanner.close();
                Object ob1;
                ob1 = input;
                Object ob2 = null;
                jTable1.setCursor(null);
                jTable1.setAutoCreateRowSorter(rootPaneCheckingEnabled);
                jTable1.setAutoResizeMode(WIDTH);
                jTable1.setCellSelectionEnabled(true);
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {ob1,ob2}
                },
                new String [] {
                        "                         Judge's Output", "                         User's Output"
                    }
                ));
                
            } catch (FileNotFoundException e){
            }
        }
        else{
            System.out.println("Open command cancelled by user");
        }
        System.out.println(returnVal);
    }                                        

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewClass().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JButton jButton1;  // Get Code
    private javax.swing.JButton jButton2;  //Submit
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration                   
}

