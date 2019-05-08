package P1;

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
import javax.swing.JOptionPane;

public class OfflineJudge extends javax.swing.JFrame {
    public OfflineJudge() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Offline Judge System");
        setLocation(new java.awt.Point(150, 70));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jButton1.setText("Submit");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel1.setText("Language  :");

        jLabel2.setText("Problem No  :");

        jLabel3.setText("Get Code  :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "C", "C++", "JAVA", " " }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G" }));

        jLabel4.setText("Or paste your code here  :");

        jLabel5.setText("Judge's Output                                                                                  Users's Output");

        jButton2.setText("Choose file");

        jButton2.addActionListener(this::jButton2ActionPerformed);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel4)
                        .addGap(180, 180, 180)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
   
    
    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt){  
    
        File file;
        System.out.println("zobair");
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
                input = input+scanner.nextLine()+"\n";
                }
                scanner.close();
                jTextArea1.setText(input);
            } catch (FileNotFoundException e){
            }
        }
        else{
            System.out.println("Open command cancelled by user");
        }
        System.out.println(returnVal);

    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        String res = null, txt;
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        
        
        //write data from jTaxtArea1 to submitted.txt
        try {        
            try(BufferedWriter ofile = new BufferedWriter(new FileWriter("D:\\STUDY\\3rd_semister\\Run\\submitted.txt"))) {
                jTextArea1.write(ofile);
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
        jTextArea3.setText(abc);
     
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
        jTextArea2.setText(abc);
        
        //Show verdict & time
        JOptionPane.showMessageDialog(null, "Verdict: " + res + "\nTime Taken: " + (endTime - startTime) + " ms");
        
        //Delete outputs from folder
        try {
            Process p;
            p = Runtime.getRuntime().exec("D:\\STUDY\\3rd_semister\\Run\\del.batch");
            p.waitFor();
        } catch (IOException er) {
            System.out.println("Error!0101");
        } catch (InterruptedException er) {
        }
     
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
        
            java.util.logging.Logger.getLogger(OfflineJudge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new OfflineJudge().setVisible(true);
        });
    }

    // Variables declaration - do not modify
    //highly resticted
    private javax.swing.JButton jButton1;  //submit
    private javax.swing.JButton jButton2;  //choose file
    private javax.swing.JComboBox jComboBox1;  //c/c++/JAVA
    private javax.swing.JComboBox jComboBox2;   //Code name
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;   //input
    private javax.swing.JTextArea jTextArea2;   //user's Output
    private javax.swing.JTextArea jTextArea3;   //Judge's Output
    // End of variables declaration                   

}
