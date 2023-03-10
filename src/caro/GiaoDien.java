package caro;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Khac Tam
 */

public class GiaoDien extends javax.swing.JFrame {
    
    private int row = 12; //12
    private int col = 12; //12
    public XOButton[][] Buttons  = new XOButton[col][row];
    private static final int winScore = 100000000;
    private Point PCurrentPointX = new Point();
    private Point pCurrentPointO = new Point();
    private Stack<Point> CurrentPointX = new Stack<Point>();
    private Stack<Point> CurrentPointO = new Stack<Point>();
    private int scoreX = 0 , scoreO = 0;
    private int test = 0 , capdo = 0 , dk = 0 , u=5;
    private File dataFile = new File("data\\broad.txt");
    private File ScrocedataFile = new File("data\\Scroce.txt");
  
    public GiaoDien() {
        initComponents();
        initUI1();
        loadBroad();
        setLocationRelativeTo(null); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BaoBoc = new javax.swing.JPanel();
        p = new javax.swing.JPanel();
        Khung1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ScoreX = new javax.swing.JLabel();
        ScoreO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ChoiMoi = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LuatChoi = new javax.swing.JButton();
        Level = new javax.swing.JButton();
        Undo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caro Game");
        setBackground(new java.awt.Color(0, 153, 153));
        setBounds(new java.awt.Rectangle(2, 2, 2, 2));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font(".VnArabia", 1, 24)); // NOI18N
        setForeground(java.awt.Color.lightGray);
        setName("Caro Game"); // NOI18N

        BaoBoc.setBackground(new java.awt.Color(204, 204, 255));

        p.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        p.setLayout(new java.awt.GridLayout(12, 12, -3, -3));

        Khung1.setBackground(new java.awt.Color(204, 204, 255));
        Khung1.setAlignmentX(-2.0F);
        Khung1.setAlignmentY(-2.0F);
        Khung1.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caro/Xanh_d????ng_v??_V??ng_M???t_tr???i_Tr?????ng_h???c_??o_thun_c??_logo-removebg-preview.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("T??? S??? ");

        ScoreX.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ScoreX.setForeground(new java.awt.Color(0, 0, 204));
        ScoreX.setText("jLabel2");

        ScoreO.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ScoreO.setForeground(new java.awt.Color(255, 0, 0));
        ScoreO.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("-");

        ChoiMoi.setBackground(new java.awt.Color(0, 0, 153));
        ChoiMoi.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        ChoiMoi.setForeground(new java.awt.Color(255, 255, 255));
        ChoiMoi.setText("B???t ?????u l???i tr?? ch??i");
        ChoiMoi.setActionCommand("Chon");
        ChoiMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoiMoiActionPerformed(evt);
            }
        });

        btnStart.setBackground(new java.awt.Color(0, 0, 153));
        btnStart.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("V??n m???i");
        btnStart.setAlignmentY(0.0F);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(0, 0, 153));
        exit.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Tho??t");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caro/unnamed (1).png"))); // NOI18N

        LuatChoi.setBackground(new java.awt.Color(0, 0, 153));
        LuatChoi.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LuatChoi.setForeground(new java.awt.Color(255, 255, 255));
        LuatChoi.setText("H?????ng d???n");
        LuatChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuatChoiActionPerformed(evt);
            }
        });

        Level.setBackground(new java.awt.Color(0, 0, 153));
        Level.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Level.setForeground(new java.awt.Color(255, 255, 255));
        Level.setText("C???p ?????");
        Level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelActionPerformed(evt);
            }
        });

        Undo.setBackground(new java.awt.Color(0, 0, 153));
        Undo.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        Undo.setForeground(new java.awt.Color(255, 255, 255));
        Undo.setText("??i l???i");
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText(" User");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("AI");

        javax.swing.GroupLayout Khung1Layout = new javax.swing.GroupLayout(Khung1);
        Khung1.setLayout(Khung1Layout);
        Khung1Layout.setHorizontalGroup(
            Khung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Khung1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Khung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScoreX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Khung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Khung1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(Khung1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addGap(30, 30, 30)
                .addGroup(Khung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScoreO, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Khung1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)))
                .addGap(24, 24, 24))
            .addGroup(Khung1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Khung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Khung1Layout.createSequentialGroup()
                        .addGroup(Khung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Undo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChoiMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Khung1Layout.createSequentialGroup()
                        .addGroup(Khung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Khung1Layout.createSequentialGroup()
                                .addComponent(LuatChoi)
                                .addGap(2, 2, 2)
                                .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Khung1Layout.setVerticalGroup(
            Khung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Khung1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(Khung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScoreO)
                    .addComponent(jLabel1)
                    .addComponent(ScoreX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Khung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(ChoiMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Undo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Khung1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LuatChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout BaoBocLayout = new javax.swing.GroupLayout(BaoBoc);
        BaoBoc.setLayout(BaoBocLayout);
        BaoBocLayout.setHorizontalGroup(
            BaoBocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaoBocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Khung1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE))
        );
        BaoBocLayout.setVerticalGroup(
            BaoBocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaoBocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Khung1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BaoBoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BaoBoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int x = JOptionPane.showConfirmDialog(this, "Tho??t Game", "B???n mu???n",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(x == JOptionPane.YES_OPTION ){
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            dispose();
        }
        deleteFolder(dataFile);
        
        //b??n  c???
        try {
            PrintWriter pw = null;
            FileWriter  fw = null;
            for (int i = 0; i < Buttons.length; i++) {
                for (int j = 0; j < Buttons.length; j++) {
                        XOButton button = Buttons[i][j];
                        fw = new FileWriter(dataFile, true);
                        pw = new PrintWriter(fw);
                        pw.println(button.value);
                        pw.flush();     
                    }
                pw.close();
                fw.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        //??i???m s??
         deleteFolder(ScrocedataFile);
        try {
            FileWriter  a = new FileWriter(ScrocedataFile, true);
            PrintWriter b = new PrintWriter(a);
            b.print(scoreX+";");
            b.print(scoreO);
            b.flush();           
            b.close();
            a.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }  
    }//GEN-LAST:event_exitActionPerformed
     
    
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if(files!=null) {
            for(File f: files) {
                if(f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }
    private void UndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoActionPerformed
            
        dk++;
        if(u > 0 && test != 1 && test != 2)  u--;
        if(dk <= 5 && test != 1 && test != 2){
            undo();
        }
        Undo.setText("??i l???i ("+String.valueOf(u)+")");
    }//GEN-LAST:event_UndoActionPerformed

    public void undo(){
        PCurrentPointX = CurrentPointX.pop();
        Buttons[PCurrentPointX.x][PCurrentPointX.y].setIcon(null);
        Buttons[PCurrentPointX.x][PCurrentPointX.y].value = 0;
        pCurrentPointO = CurrentPointO.pop();
        Buttons[pCurrentPointO.x][pCurrentPointO.y].setIcon(null);
        Buttons[pCurrentPointO.x][pCurrentPointO.y].value = 0;   
    }
    
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
      
        int x = JOptionPane.showConfirmDialog(this, "B???t ?????u v??n m???i?", "B???n mu???n",JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.YES_OPTION ){
            for (int i1 = 0; i1 < row; i1++) {
                for (int j1 = 0; j1 < col; j1++) {
                    Buttons[i1][j1].setIcon(null);
                    Buttons[i1][j1].value = 0;
                }
            }
        }
        dk = 0;
        u = 5;
        if(test == 1) scoreX++;
        if(test == 2) scoreO++;
        ScoreX.setText(String.valueOf(scoreX));
        ScoreO.setText(String.valueOf(scoreO));
        test = 0;
        Undo.setText("??i l???i ("+String.valueOf(u)+")");
    }//GEN-LAST:event_btnStartActionPerformed

    private void LuatChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuatChoiActionPerformed

        ImageIcon icon = new ImageIcon("D:\\NetBean\\Caro\\src\\caro\\removebg-preview.png");
        JOptionPane.showMessageDialog(null, "Ca??ch ch??i \n"
            +"Tr?? ch??i ???????c ch??i tr??n b??n c??? c?? 144 ??, v???i 12 h??ng v?? 12 c???t.\n"
            +"M???t ng?????i ??i X, m???t ng?????i ??i O.\n"
            +"Khi ?????n l?????t m??nh, ng?????i ch??i ph???i ????nh d???u v??o m???t ?? tr??n b??n c???.\n"
            +"Ng?????i ch??i kh??ng ???????c ph??p ????nh d???u v??o ?? ???? c?? ????nh d???u c???a m??nh ho???c ?????i ph????ng tr?????c ????.\n\n"
            +"Lu???t th???ng \n"
            +"Ng?????i chi???n th???ng l?? ng?????i t???o ???????c ???????ng th???ng theo chi???u d???c ho???c ngang ho???c ch??o v???i ch??nh x??c 5 con c??? c???a m??nh.\n"
            +"N???u chu???i 5 qu??n li??n t???c b??? ch???n c??? hai ?????u th?? tr?? ch??i v???n ti???p t???c.\n"    
            +"N???u b??n c??? ?????y th?? hai b??n h??a nhau (h??a c???).\n"," Tho??t",JOptionPane.INFORMATION_MESSAGE , icon );
        
    }//GEN-LAST:event_LuatChoiActionPerformed

    private void LevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelActionPerformed
        String[] options = {"D???", "B??nh th?????ng", "Kh??"};
        ImageIcon icon = new ImageIcon("src/images/turtle32.png");
        String n = (String)JOptionPane.showInputDialog(null, "C???p ????? b???n mu???n ch???n l??  ","Ch???n c???p ????? ",JOptionPane.QUESTION_MESSAGE, icon, options, "D???");
        if(n!=null && n.equals(options[0])){
            capdo = 0;
        }
        if(n!=null && n.equals(options[1])){
            capdo = 1;
        }
         if(n!=null && n.equals(options[2])){
            capdo = 2;
         }
    }//GEN-LAST:event_LevelActionPerformed
    
    
    private void ChoiMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoiMoiActionPerformed
    
        int x = JOptionPane.showConfirmDialog(this, "B???t ?????u l???i tr?? ch??i?", "B???n mu???n",JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.YES_OPTION ){
            for (int i1 = 0; i1 < row; i1++) {
                for (int j1 = 0; j1 < col; j1++) {
                    Buttons[i1][j1].setIcon(null);
                    Buttons[i1][j1].value = 0;
                }
            }
            scoreX = 0 ;
            scoreO = 0;
        }
        ScoreX.setText(String.valueOf(scoreX));
        ScoreO.setText(String.valueOf(scoreO));
 
    }//GEN-LAST:event_ChoiMoiActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BaoBoc;
    private javax.swing.JButton ChoiMoi;
    private javax.swing.JPanel Khung1;
    private javax.swing.JButton Level;
    private javax.swing.JButton LuatChoi;
    private javax.swing.JLabel ScoreO;
    private javax.swing.JLabel ScoreX;
    private javax.swing.JButton Undo;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel p;
    // End of variables declaration//GEN-END:variables
     
        private void initUI1(){
            for (int i = 0; i < Buttons.length; i++) {
                    for (int j = 0; j < Buttons.length; j++) {
                            Point point = new Point(i, j);
                            Buttons[i][j] = new XOButton(i, j);
                            Buttons[i][j].setBackground(Color.WHITE);	
                            MouseListener mouseEvent = new MouseListener() {

                                    @Override
                                    public void mouseReleased(MouseEvent e) {
                                            CurrentPointX.add(point);
                                            handleClickButton(point);
                                    }

                                    @Override
                                    public void mousePressed(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseExited(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseEntered(MouseEvent e) {

                                    }

                                    @Override
                                    public void mouseClicked(MouseEvent e) {

                                    }
                            };
                            Buttons[i][j].addMouseListener(mouseEvent);
                            p.setBackground(new java.awt.Color(204,204,255));
                            p.add(Buttons[i][j]);
                      }
                }
            
            Undo.setText("??i l???i ("+String.valueOf(u)+")");
              try{
                FileReader frs =  new FileReader("data\\Scroce.txt");
                BufferedReader brs = new BufferedReader(frs);
                String line = brs.readLine();
                String[] temp = null;
                temp = line.split(";");
                int[] num=new int[temp.length];
                for(int i=0;i<temp.length;i++){
                   num[i]=Integer.parseInt(temp[i]);           
                }
                 for(int i=0;i<temp.length;i++){
                    if(i==0){
                       scoreX = num[i];  
                    }
                    else scoreO = num[i];               
                }
                brs.close();
                frs.close();
            } catch (IOException ex) {
               ex.printStackTrace();
            }
              
            ScoreX.setText(String.valueOf(scoreX));
            ScoreO.setText(String.valueOf(scoreO));
        }
       
    	private void handleClickButton(Point point) {
            
		int[][] board = getMatrixBoard();
		point.log();
                
                if (getScore(getMatrixBoard(), false, true) >= winScore) return;
                if (getScore(getMatrixBoard(), true, false) >= winScore) return;
                if(Buttons[point.x][point.y].value != 0) return;
          
		Buttons[point.x][point.y].setState(true); 
		if (getScore(getMatrixBoard(), true, false) >= winScore) {
                    ImageIcon icon = new ImageIcon("D:\\NetBean\\Caro\\src\\caro\\thang.png");
                    JOptionPane.showMessageDialog(null,icon, "B???n th???ng!!!", JOptionPane.PLAIN_MESSAGE);
                    test = 1;
                    return;  
                }
		
		int nextMoveX = 0 , nextMoveY = 0;
                int [] bestMove = calcNextMove(1);
                if(capdo == 1){
                   bestMove = calcNextMove(2);
                }
		if(capdo == 2){
                   bestMove = calcNextMove(3);
                }
                // xet vi tri cho o
		if (bestMove != null) {
                    nextMoveX = bestMove[0];
                    nextMoveY = bestMove[1];
		}
                
                Point p = new Point(nextMoveX , nextMoveY );
		CurrentPointO.add(p);
		Buttons[nextMoveX][nextMoveY].setState(false);
		if (getScore(getMatrixBoard(), false, true) >= winScore) {
                    ImageIcon icon = new ImageIcon("D:\\NetBean\\Caro\\src\\caro\\thua.png");
                    JOptionPane.showMessageDialog(null,icon, "B???n thua!!!", JOptionPane.PLAIN_MESSAGE);
                    test = 2;
                    return;
                }
                
                if(!broadFull()) {     
                    ImageIcon icon = new ImageIcon("D:\\NetBean\\Caro\\src\\caro\\hoa.png");
                    JOptionPane.showMessageDialog(null,icon, "H??a c???", JOptionPane.PLAIN_MESSAGE);
                }
	}
        
	//load tr???ng th??i b??n c???
        private void loadBroad(){
            try{
                FileReader fr =  new FileReader("data\\broad.txt");
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while(line != null){
                    for (int i = 0; i < Buttons.length; i++) {
                        for (int j = 0; j < Buttons.length; j++) {
                                XOButton button = Buttons[i][j];
                                int nextMoveX = i , nextMoveY = j;
                                if(line.equals("2")){
                                    Point a = new Point(nextMoveX , nextMoveY );
                                    Buttons[a.x][a.y].setState(true);
                                }
                                if(line.equals("1")){
                                    Point a = new Point(nextMoveX , nextMoveY );
                                    Buttons[a.x][a.y].setState(false);
                                }
                                line = br.readLine();
                        }
                    }
                }
                br.close();
                fr.close();
            } catch (IOException ex) {
               ex.printStackTrace();
            }
           
        }
        
	
	public int[] calcNextMove(int depth) {
            
		int[][] board = getMatrixBoard();
		Object[] bestMove = searchWinningMove(board); 
		Object[] badMove = searchLoseMove(board);
		
		int[] move = new int[2];
		
                //kiem tra minh co the thang khong cot hang
                if(bestMove[1] != null && bestMove[2] != null) {
			
			move[0] = (Integer)(bestMove[1]);
			move[1] = (Integer)(bestMove[2]);
                        return move;
			
		} 
                
                //Kiem tra xem doi thu thang chua chan            
		if (badMove[1] != null && badMove[2] != null) {
			move[0] = (Integer)(badMove[1]);
			move[1] = (Integer)(badMove[2]);
			return move;
		} else {
			
			bestMove = minimaxSearchAB(depth, board, true, -1.0, winScore);
                        System.out.println(bestMove[1]);
                        if(bestMove[1] == null) {
				move = null;
			
			}else {
				move[0] = (Integer)(bestMove[1]);
				move[1] = (Integer)(bestMove[2]);
			}
                     
                    }
		return move;
	}
        
                
        //t??m ki???m Di chuy???n th???ng 
	private Object[] searchWinningMove(int[][] matrix) {
            
		ArrayList<int[]> allPossibleMoves = generateMoves(matrix);
		System.out.println(allPossibleMoves.size());
		
		Object[] winningMove = new Object[3];
	
		for(int[] move : allPossibleMoves) {
			int[][] dummyBoard = playNextMove(matrix, move, false);
			
			// If ng?????i ch??i tr???ng c?? ??i???m th???ng trong b??n t???m th???i tr?????c ???? , tr??? l???i n?????c ??i
			if(getScore(dummyBoard,false,false) >= winScore) {
                            winningMove[1] = move[0];
                            winningMove[2] = move[1];
                            return winningMove;
			}
		}
		
            return winningMove;
	}
        
        //t??m ki???m di chuy???n M???t
	private Object[] searchLoseMove(int[][] matrix) {
		ArrayList<int[]> allPossibleMoves = generateMoves(matrix);
//		System.out.println(allPossibleMoves.size());
		
		Object[] losingMove = new Object[3];
	
		for(int[] move : allPossibleMoves) {
			int[][] dummyBoard = playNextMove(matrix, move, true);
			
			// If the white player has a winning score in that temporary board, return the move.
			if (getScore(dummyBoard, true, false) >= winScore) {
				losingMove[1] = move[0];
				losingMove[2] = move[1];
				return losingMove;
			}
		}
		
		return losingMove;
	}
	
        //??i th??? t???t c??? c??c b?????c ??i c?? th??? 
	public int[][] playNextMove(int[][] board, int[] move, boolean isUserTurn) {
       
		int i = move[0], j = move[1];
		int [][] newBoard = new int[row][col];
		for (int h = 0; h < row; h++) {
			for (int k = 0; k < col; k++) {
                            
                            newBoard[h][k] = board[h][k];    
			}
		}
		newBoard[i][j] = isUserTurn ? 2 : 1;
		return newBoard;
	}
	
	public Object[] minimaxSearchAB(int depth, int[][] board, boolean max, double alpha, double beta) {
		if(depth == 0) {
                    
                    Object[] x = {evaluateBoardForWhite(board, !max), null, null};
                    return x;      
		}

		ArrayList<int[]> allPossibleMoves = generateMoves(board);
		
		if(allPossibleMoves.size() == 0) {
			
                    Object[] x = {evaluateBoardForWhite(board, !max), null, null};
                    return x;
		}
		
		Object[] bestMove = new Object[3];
			
		if(max) {
			bestMove[0] = -999999999.0;
		
			for(int[] move : allPossibleMoves) {
				// Ch??i th??? v???i move hi???n t???i
				int[][] dummyBoard = playNextMove(board, move, false);
				
				Object[] tempMove = minimaxSearchAB(depth-1, dummyBoard, !max, alpha, beta);
				
				// C???p nh???t alpha
				if((Double)(tempMove[0]) > alpha) {
					alpha = (Double)(tempMove[0]);
				}
				// C???t t???a beta
				if((Double)(tempMove[0]) >= beta) {
					return tempMove;
				}
				if((Double)tempMove[0] > (Double)bestMove[0]) {
					bestMove = tempMove;
					bestMove[1] = move[0];
					bestMove[2] = move[1];
				}
			}
			
		}
		else {
			bestMove[0] = 100000000.0;
			bestMove[1] = allPossibleMoves.get(0)[0];
			bestMove[2] = allPossibleMoves.get(0)[1];
                   
			for(int[] move : allPossibleMoves){

				int[][] dummyBoard = playNextMove(board, move, true);
				
				Object[] tempMove = minimaxSearchAB(depth-1, dummyBoard, !max, alpha, beta);
				
				// C???p nh???t beta
				if(((Double)tempMove[0]) < beta) {
					beta = (Double)(tempMove[0]);
				}
				// C???t t???a alpha
				if((Double)(tempMove[0]) <= alpha) {
					return tempMove;
				}
				if((Double)tempMove[0] < (Double)bestMove[0]) {
					bestMove = tempMove;
					bestMove[1] = move[0];
					bestMove[2] = move[1];
				}
			}
		}
		return bestMove;
	}
	
	
	public double evaluateBoardForWhite(int[][] board, boolean userTurn) {
		
		
		double blackScore = getScore(board, true, userTurn);
		double whiteScore = getScore(board, false, userTurn);
		
		if(blackScore == 0) blackScore = 1.0;
		
		return whiteScore / blackScore;
		
	}
	
	public ArrayList<int[]> generateMoves(int[][] boardMatrix) {
            
		ArrayList<int[]> moveList = new ArrayList<int[]>();
		int boardSize = boardMatrix.length;
		// T??m nh???ng t???t c??? nh???ng ?? tr???ng nh??ng c?? ????nh XO li???n k???
		for(int i=0; i<boardSize; i++) {
			for(int j=0; j<boardSize; j++) {
				
				if(boardMatrix[i][j] > 0) continue;
                                
				if(i > 0) {
					if(j > 0) {
						if(boardMatrix[i-1][j-1] > 0 ||
						   boardMatrix[i][j-1] > 0) {
							int[] move = {i,j};
							moveList.add(move);
							continue;
						}
					}
					if(j < boardSize-1) {
						if(boardMatrix[i-1][j+1] > 0 ||
						   boardMatrix[i][j+1] > 0) {
							int[] move = {i,j};
							moveList.add(move);
							continue;
						}
					}
					if(boardMatrix[i-1][j] > 0) {
						int[] move = {i,j};
						moveList.add(move);
						continue;
					}
				}
				if( i < boardSize-1) {
					if(j > 0) {
						if(boardMatrix[i+1][j-1] > 0 ||
						   boardMatrix[i][j-1] > 0) {
							int[] move = {i,j};
							moveList.add(move);
							continue;
						}
					}
					if(j < boardSize-1) {
						if(boardMatrix[i+1][j+1] > 0 ||
						   boardMatrix[i][j+1] > 0) {
							int[] move = {i,j};
							moveList.add(move);
							continue;
						}
					}
					if(boardMatrix[i+1][j] > 0) {
						int[] move = {i,j};
						moveList.add(move);
						continue;
					}
				}
				
			}
		}
		return moveList;
		
	}
	
	
	// ????nh gi?? b??n c??? d???a tr??n t???ng s??? ??i???m h??ng ngan, h??ng d???c, v?? 2 ???????ng ch??o
	public int getScore(int[][] board, boolean forX, boolean blacksTurn) {   
            
		return evaluateHorizontal(board, forX, blacksTurn) +
				evaluateVertical(board, forX, blacksTurn) +
				evaluateDiagonal(board, forX, blacksTurn);
	}
	
	public static int evaluateHorizontal(int[][] boardMatrix, boolean forX, boolean playersTurn ) {
		
		int consecutive = 0; //li??n ti???p
		int blocks = 2; //ch???n
		int score = 0; // ??i???m
                
		for(int i=0; i<boardMatrix.length; i++) {
			for(int j=0; j<boardMatrix[0].length; j++) {
				
				if(boardMatrix[i][j] == (forX ? 2 : 1)) {
					//2. ?????m...
					consecutive++;
				}
				// g???p ?? tr???ng
				else if(boardMatrix[i][j] == 0) {
					if(consecutive > 0) {
						// Ra: ?? tr???ng ??? cu???i sau khi ?????m. Gi???m block r???i b???t ?????u t??nh ??i???m sau ???? reset l???i ban ?????u
						blocks--;
						score += getConsecutiveSetScore(consecutive, blocks, forX == playersTurn);
						consecutive = 0;
						blocks = 1;
					}
					else {
						// 1. V??o reset l???i blocks = 1 r???i b???t ?????u ?????m
						blocks = 1;
					}
				}
				//g???p qu??n ?????ch
				else if(consecutive > 0) {
					// 2.Ra:  ?? b??? ch???n sau khi ?????m. T??nh ??i???m sau ???? reset l???i.
					score += getConsecutiveSetScore(consecutive, blocks, forX == playersTurn);
					consecutive = 0;
					blocks = 2;
				}
				else {
					//1. V??o: reset l???i blocks = 2 r???i b???t ?????u ?????m
					blocks = 2;
				}
			
                        }
			
			// 3. Ra: nh??ng l??c n??y ??ang ??? cu???i. N???u li??n t???c th?? v???n t??nh cho ?????n h???t d??ng
			if(consecutive > 0) {
				score += getConsecutiveSetScore(consecutive, blocks, forX == playersTurn);
				
			}
			// reset l???i ????? ti???p t???c ch???y cho d??ng ti???p theo
			consecutive = 0;
			blocks = 2;
			
		}
		return score;
	}
        
	// h??m t??nh to??n ???????ng d???c t????ng t??? nh?? ???????ng ngan
	public static  int evaluateVertical(int[][] boardMatrix, boolean forX, boolean playersTurn ) {
		
		int consecutive = 0;
		int blocks = 2;
		int score = 0;
		
		for(int j=0; j<boardMatrix[0].length; j++) {
			for(int i=0; i<boardMatrix.length; i++) {
				if(boardMatrix[i][j] == (forX ? 2 : 1)) {
					consecutive++;
				}
				else if(boardMatrix[i][j] == 0) {
					if(consecutive > 0) {
						blocks--;
						score += getConsecutiveSetScore(consecutive, blocks, forX == playersTurn);
						consecutive = 0;
						blocks = 1;
					}
					else {
						blocks = 1;
					}
				}
				else if(consecutive > 0) {
					score += getConsecutiveSetScore(consecutive, blocks, forX == playersTurn);
					consecutive = 0;
					blocks = 2;
				}
				else {
					blocks = 2;
				}
			}
			if(consecutive > 0) {
				score += getConsecutiveSetScore(consecutive, blocks, forX == playersTurn);
				
			}
                        
			consecutive = 0;
			blocks = 2;
			
		}
		return score;
	}
	// H??m t??nh to??n 2 ???????ng ch??o t????ng t??? nh?? h??ng ngan
	public static  int evaluateDiagonal(int[][] boardMatrix, boolean forX, boolean playersTurn ) {
		
		int consecutive = 0;
		int blocks = 2;
		int score = 0;
		// ???????ng ch??o /
		for (int k = 0; k <= 2 * (boardMatrix.length - 1); k++) {
		    int iStart = Math.max(0, k - boardMatrix.length + 1);
		    int iEnd = Math.min(boardMatrix.length - 1, k);
		    for (int i = iStart; i <= iEnd; ++i) {
		        int j = k - i;
		        
		        if(boardMatrix[i][j] == (forX ? 2 : 1)) {
					consecutive++;
				}
				else if(boardMatrix[i][j] == 0) {
					if(consecutive > 0) {
						blocks--;
						score += getConsecutiveSetScore(consecutive, blocks, forX == playersTurn);
						consecutive = 0;
						blocks = 1;
					}
					else {
						blocks = 1;
					}
				}
				else if(consecutive > 0) {
					score += getConsecutiveSetScore(consecutive, blocks, forX == playersTurn);
					consecutive = 0;
					blocks = 2;
				}
				else {
					blocks = 2;
				}
		        
		    }
		    if(consecutive > 0) {
				score += getConsecutiveSetScore(consecutive, blocks, forX == playersTurn);
				
			}
			consecutive = 0;
			blocks = 2;
		}
		// ???????ng ch??o 
		for (int k = 1-boardMatrix.length; k < boardMatrix.length; k++) {
		    int iStart = Math.max(0, k);
		    int iEnd = Math.min(boardMatrix.length + k - 1, boardMatrix.length-1);
		    for (int i = iStart; i <= iEnd; ++i) {
		        int j = i - k;
		        
		        if(boardMatrix[i][j] == (forX ? 2 : 1)) {
					consecutive++;
				}
				else if(boardMatrix[i][j] == 0) {
					if(consecutive > 0) {
						blocks--;
						score += getConsecutiveSetScore(consecutive, blocks, forX == playersTurn);
						consecutive = 0;
						blocks = 1;
					}
					else {
						blocks = 1;
					}
				}
				else if(consecutive > 0) {
					score += getConsecutiveSetScore(consecutive, blocks, forX == playersTurn);
					consecutive = 0;
					blocks = 2;
				}
				else {
					blocks = 2;
				}
		        
		    }
		    if(consecutive > 0) {
				score += getConsecutiveSetScore(consecutive, blocks, forX == playersTurn);
				
			}
			consecutive = 0;
			blocks = 2;
		}
		return score;
	}
        
        //?????t ???????c ??i???m s??? li??n ti???p
	public static  int getConsecutiveSetScore(int count, int blocks, boolean currentTurn) {
		final int winGuarantee = 1000000; //gi??nh chi???n th???ng ?????m b???o
		if(blocks == 2 && count <= 5) return 0;
		switch(count) {
			// ??n 5 -> Cho ??i???m cao nh???t
			case 5: {
				return winScore;
			}
			case 4: {
				// ??ang 4 -> Tu??? theo l?????c v?? b??? ch???n: winGuarantee, winGuarantee/4, 200
				if(currentTurn) return winGuarantee;
				else {
					if(blocks == 0) return winGuarantee/4;
					else return 200;
				}
			}
			case 3: {
				// ??ang 3: Block = 0
				if(blocks == 0) {
					// N???u l?????c c???a currentTurn th?? ??n 3 + 1 = 4 (kh??ng b??? block) -> 50000 -> Kh??? n??ng th???ng cao. 
					// Ng?????c l???i kh??ng ph???i l?????c c???a currentTurn th?? kh??? n??ng b??? blocks cao
					if(currentTurn) return 50000;
					else return 200;
				}
				else {
					// Block == 1 ho???c Blocks == 2
					if(currentTurn) return 10;
					else return 5;
				}
			}
			case 2: {
				// T????ng t??? v???i 2
				if(blocks == 0) {
					if(currentTurn) return 7;
					else return 5;
				}
				else {
					return 3;
				}
			}
			case 1: {
				return 1;
			}
		}
		return winScore*2;
	}
	
        //Kiem tra ban co dau 
        public boolean broadFull(){
		for (int i = 0; i < Buttons.length; i++)  {
			for (int j = 0; j < Buttons.length; j++) {
                            if( Buttons[i][j].value == 0)
                                return true;
			}
                    }
            return false;
        }
        
        // l???y b???ng ma tr???n
	public int[][] getMatrixBoard() {
		int matrix[][] = new int[row][col];
		for (int i = 0; i < Buttons.length; i++) {
			for (int j = 0; j < Buttons.length; j++) {
				int value = Buttons[i][j].value;
				matrix[i][j] = value;
			}
		}
		return matrix;
	}	
}
        
