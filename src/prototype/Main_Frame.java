package prototype;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author kasus
 */
public class Main_Frame extends javax.swing.JFrame {

    int Number_of_main_panels = 19;      //----------------------Tambahi setiap nambah panel Menu-----
    JPanel[] Main_Panels = new JPanel[Number_of_main_panels];
    
    JPanel Current_active_panel;
    
    public Main_Frame() {
        initComponents();
        
        //ImageIcon _00_button_up = new ImageIcon(".\\00-button-up.png");
        //ImageIcon _00_button_down = new ImageIcon(".\\00-button-down.png");
        //ImageIcon _00_button_roll = new ImageIcon(".\\00-button-roll.png");
        
        ImageIcon _01_button_up = new ImageIcon(".\\01-button-up.png");
        ImageIcon _01_button_down = new ImageIcon(".\\01-button-down.png");
        ImageIcon _01_button_roll = new ImageIcon(".\\01-button-roll.png");
        ImageIcon _01_button_selected = new ImageIcon(".\\01-button-selected.gif");
        
        ImageIcon _02_button_up = new ImageIcon(".\\02-button-up.png");
        ImageIcon _02_button_down = new ImageIcon(".\\02-button-down.png");
        ImageIcon _02_button_roll = new ImageIcon(".\\02-button-roll.png");
        
        ImageIcon _03_button_up = new ImageIcon(".\\03-button-up.png");
        ImageIcon _03_button_down = new ImageIcon(".\\03-button-down.png");
        ImageIcon _03_button_roll = new ImageIcon(".\\03-button-roll.png");
        
        ImageIcon _04_button_up = new ImageIcon(".\\04-button-up.png");
        ImageIcon _04_button_down = new ImageIcon(".\\04-button-down.png");
        ImageIcon _04_button_roll = new ImageIcon(".\\04-button-roll.png");
        
        ImageIcon _05_button_up = new ImageIcon(".\\05-button-up.png");
        ImageIcon _05_button_down = new ImageIcon(".\\05-button-down.png");
        ImageIcon _05_button_roll = new ImageIcon(".\\05-button-roll.png");
        
        ImageIcon _06_button_up = new ImageIcon(".\\06-button-up.png");
        ImageIcon _06_button_down = new ImageIcon(".\\06-button-down.png");
        ImageIcon _06_button_roll = new ImageIcon(".\\06-button-roll.png");
        
        ImageIcon _07_button_up = new ImageIcon(".\\07-button-up.png");
        ImageIcon _07_button_down = new ImageIcon(".\\07-button-down.png");
        ImageIcon _07_button_roll = new ImageIcon(".\\07-button-roll.png");
        
        ImageIcon _08_button_up = new ImageIcon(".\\08-button-up.png");
        ImageIcon _08_button_down = new ImageIcon(".\\08-button-down.png");
        ImageIcon _08_button_roll = new ImageIcon(".\\08-button-roll.png");
        
        ImageIcon _09_button_up = new ImageIcon(".\\09-button-up.png");
        ImageIcon _09_button_down = new ImageIcon(".\\09-button-down.png");
        ImageIcon _09_button_roll = new ImageIcon(".\\09-button-roll.png");
        
        ImageIcon _10_button_up = new ImageIcon(".\\10-button-up.png");
        ImageIcon _10_button_down = new ImageIcon(".\\10-button-down.png");
        ImageIcon _10_button_roll = new ImageIcon(".\\10-button-roll.png");
        
        ImageIcon _11_button_up = new ImageIcon(".\\11-button-up.png");
        ImageIcon _11_button_down = new ImageIcon(".\\11-button-down.png");
        ImageIcon _11_button_roll = new ImageIcon(".\\11-button-roll.png");
        
        ImageIcon _12_button_up = new ImageIcon(".\\12-button-up.png");
        ImageIcon _12_button_down = new ImageIcon(".\\12-button-down.png");
        ImageIcon _12_button_roll = new ImageIcon(".\\12-button-roll.png");
        
        ImageIcon _13_button_up = new ImageIcon(".\\13-button-up.png");
        ImageIcon _13_button_down = new ImageIcon(".\\13-button-down.png");
        ImageIcon _13_button_roll = new ImageIcon(".\\13-button-roll.png");
        
        ImageIcon _14_button_up = new ImageIcon(".\\14-button-up.png");
        ImageIcon _14_button_down = new ImageIcon(".\\14-button-down.png");
        ImageIcon _14_button_roll = new ImageIcon(".\\14-button-roll.png");
        
        ImageIcon _15_button_up = new ImageIcon(".\\15-button-up.png");
        ImageIcon _15_button_down = new ImageIcon(".\\15-button-down.png");
        ImageIcon _15_button_roll = new ImageIcon(".\\15-button-roll.png");
        
        ImageIcon _16_button_up = new ImageIcon(".\\16-button-up.png");
        ImageIcon _16_button_down = new ImageIcon(".\\16-button-down.png");
        ImageIcon _16_button_roll = new ImageIcon(".\\16-button-roll.png");
        
        ImageIcon _17_button_up = new ImageIcon(".\\17-button-up.png");
        ImageIcon _17_button_down = new ImageIcon(".\\17-button-down.png");
        ImageIcon _17_button_roll = new ImageIcon(".\\17-button-roll.png");
        
        ImageIcon _18_button_up = new ImageIcon(".\\18-button-up.png");
        ImageIcon _18_button_down = new ImageIcon(".\\18-button-down.png");
        ImageIcon _18_button_roll = new ImageIcon(".\\18-button-roll.png");
        
                
        
        
        
        this.TB_01_BwtNtJl_jB_01x01.setIcon(_01_button_up);
        this.TB_01_BwtNtJl_jB_01x01.setPressedIcon(_01_button_down);
        this.TB_01_BwtNtJl_jB_01x01.setRolloverIcon(_01_button_roll);
        this.TB_01_BwtNtJl_jB_01x01.setSelectedIcon(_01_button_selected);
        
        this.TB_02_jB_DftrNtJl_01x01.setIcon(_02_button_up);
        this.TB_02_jB_DftrNtJl_01x01.setPressedIcon(_02_button_down);
        this.TB_02_jB_DftrNtJl_01x01.setRolloverIcon(_02_button_roll);
        
        this.jButton2.setIcon(_03_button_up);
        this.jButton2.setPressedIcon(_03_button_down);
        this.jButton2.setRolloverIcon(_03_button_roll);
        
        this.jButton6.setIcon(_04_button_up);
        this.jButton6.setPressedIcon(_04_button_down);
        this.jButton6.setRolloverIcon(_04_button_roll);
        
        this.jButton3.setIcon(_05_button_up);
        this.jButton3.setPressedIcon(_05_button_down);
        this.jButton3.setRolloverIcon(_05_button_roll);
        
        this.jButton7.setIcon(_06_button_up);
        this.jButton7.setPressedIcon(_06_button_down);
        this.jButton7.setRolloverIcon(_06_button_roll);
        
        this.jButton4.setIcon(_07_button_up);
        this.jButton4.setPressedIcon(_07_button_down);
        this.jButton4.setRolloverIcon(_07_button_roll);
        
        this.jButton8.setIcon(_08_button_up);
        this.jButton8.setPressedIcon(_08_button_down);
        this.jButton8.setRolloverIcon(_08_button_roll);
        
        this.jButton9.setIcon(_09_button_up);
        this.jButton9.setPressedIcon(_09_button_down);
        this.jButton9.setRolloverIcon(_09_button_roll);
        
        this.jButton12.setIcon(_10_button_up);
        this.jButton12.setPressedIcon(_10_button_down);
        this.jButton12.setRolloverIcon(_10_button_roll);
        
        this.jButton10.setIcon(_11_button_up);
        this.jButton10.setPressedIcon(_11_button_down);
        this.jButton10.setRolloverIcon(_11_button_roll);
        
        this.jButton13.setIcon(_12_button_up);
        this.jButton13.setPressedIcon(_12_button_down);
        this.jButton13.setRolloverIcon(_12_button_roll);
        
        this.jButton11.setIcon(_13_button_up);
        this.jButton11.setPressedIcon(_13_button_down);
        this.jButton11.setRolloverIcon(_13_button_roll);
        
        this.jButton14.setIcon(_14_button_up);
        this.jButton14.setPressedIcon(_14_button_down);
        this.jButton14.setRolloverIcon(_14_button_roll);
        
        this.jButton15.setIcon(_15_button_up);
        this.jButton15.setPressedIcon(_15_button_down);
        this.jButton15.setRolloverIcon(_15_button_roll);
        
        this.jButton17.setIcon(_16_button_up);
        this.jButton17.setPressedIcon(_16_button_down);
        this.jButton17.setRolloverIcon(_16_button_roll);
        
        this.jButton16.setIcon(_17_button_up);
        this.jButton16.setPressedIcon(_17_button_down);
        this.jButton16.setRolloverIcon(_17_button_roll);
        
        this.jButton18.setIcon(_18_button_up);
        this.jButton18.setPressedIcon(_18_button_down);
        this.jButton18.setRolloverIcon(_18_button_roll);
        
        
        int mpp = 0;
        Main_Panels[mpp++] = this._00_Tutorial1;
        Main_Panels[mpp++] = this._01_BwtNtJual1;
        Main_Panels[mpp++] = this._02_DftrNtJual1;
        Main_Panels[mpp++] = this._03_BwtNtTukar2;
        Main_Panels[mpp++] = this._04_DftrNtTukar1;
        Main_Panels[mpp++] = this._05_BwtNtRtr1;
        Main_Panels[mpp++] = this._06_DftrNtRtrUsr1;
        Main_Panels[mpp++] = this._07_BwtPlgnBr1;
        Main_Panels[mpp++] = this._08_EditDftrPlgn1;
        Main_Panels[mpp++] = this._09_BwtNtBl1;
        Main_Panels[mpp++] = this._10_DftrNtBl1;
        Main_Panels[mpp++] = this._11_BwtNtRtrSupl1;
        Main_Panels[mpp++] = this._12_DftrNtRtrSup1;
        Main_Panels[mpp++] = this._13_BwtSuplBr1;
        Main_Panels[mpp++] = this._14_EditDftrSupl1;
        Main_Panels[mpp++] = this._15_BwtBrgBr2;
        Main_Panels[mpp++] = this._16_EditDftrBrg2;
        Main_Panels[mpp++] = this._17_RwytBrg1;
        Main_Panels[mpp++] = this._18_StokOpname1;
        /*
        tambahi setiap buat panel
        Main_Panels[mpp++] = this.zzzzzzzz;
        */
        
        
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._00_Tutorial1.setVisible(true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TB_01_BwtNtJl_jB_01x01 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        TB_02_jB_DftrNtJl_01x01 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        _01_BwtNtJual1 = new prototype._01_BwtNtJual();
        _02_DftrNtJual1 = new prototype._02_DftrNtJual();
        _03_BwtNtTukar2 = new prototype._03_BwtNtTukar();
        _04_DftrNtTukar1 = new prototype._04_DftrNtTukar();
        _05_BwtNtRtr1 = new prototype._05_BwtNtRtrUsr();
        _06_DftrNtRtrUsr1 = new prototype._06_DftrNtRtrUsr();
        _07_BwtPlgnBr1 = new prototype._07_BwtPlgnBr();
        _08_EditDftrPlgn1 = new prototype._08_EditDftrPlgn();
        _09_BwtNtBl1 = new prototype._09_BwtNtBl();
        _10_DftrNtBl1 = new prototype._10_DftrNtBl();
        _11_BwtNtRtrSupl1 = new prototype._11_BwtNtRtrSupl();
        _13_BwtSuplBr1 = new prototype._13_BwtSuplBr();
        _14_EditDftrSupl1 = new prototype._14_EditDftrSupl();
        _12_DftrNtRtrSup1 = new prototype._12_DftrNtRtrSup();
        _15_BwtBrgBr2 = new prototype._15_BwtBrgBr();
        _16_EditDftrBrg2 = new prototype._16_EditDftrBrg();
        _17_RwytBrg1 = new prototype._17_RwytBrg();
        _18_StokOpname1 = new prototype._18_StokOpname();
        _00_Tutorial1 = new prototype._00_Tutorial();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 613));
        setMinimumSize(new java.awt.Dimension(800, 613));
        setPreferredSize(new java.awt.Dimension(800, 613));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 585));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 585));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 585));

        jPanel2.setBackground(new java.awt.Color(168, 214, 253));
        jPanel2.setMaximumSize(new java.awt.Dimension(200, 238));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 238));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 238));

        jLabel1.setBackground(new java.awt.Color(168, 214, 253));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PENJUALAN");
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 20));

        TB_01_BwtNtJl_jB_01x01.setBackground(new java.awt.Color(202, 202, 202));
        TB_01_BwtNtJl_jB_01x01.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TB_01_BwtNtJl_jB_01x01.setBorder(null);
        TB_01_BwtNtJl_jB_01x01.setMaximumSize(new java.awt.Dimension(92, 47));
        TB_01_BwtNtJl_jB_01x01.setMinimumSize(new java.awt.Dimension(92, 47));
        TB_01_BwtNtJl_jB_01x01.setPreferredSize(new java.awt.Dimension(92, 47));
        TB_01_BwtNtJl_jB_01x01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TB_01_BwtNtJl_jB_01x01ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(202, 202, 202));
        jButton2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton2.setBorder(null);
        jButton2.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton2.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton2.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(202, 202, 202));
        jButton3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton3.setBorder(null);
        jButton3.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton3.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton3.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(202, 202, 202));
        jButton4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton4.setBorder(null);
        jButton4.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton4.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton4.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TB_02_jB_DftrNtJl_01x01.setBackground(new java.awt.Color(202, 202, 202));
        TB_02_jB_DftrNtJl_01x01.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TB_02_jB_DftrNtJl_01x01.setBorder(null);
        TB_02_jB_DftrNtJl_01x01.setMaximumSize(new java.awt.Dimension(92, 47));
        TB_02_jB_DftrNtJl_01x01.setMinimumSize(new java.awt.Dimension(92, 47));
        TB_02_jB_DftrNtJl_01x01.setPreferredSize(new java.awt.Dimension(92, 47));
        TB_02_jB_DftrNtJl_01x01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TB_02_jB_DftrNtJl_01x01ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(202, 202, 202));
        jButton6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton6.setBorder(null);
        jButton6.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton6.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton6.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(202, 202, 202));
        jButton7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton7.setBorder(null);
        jButton7.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jButton7.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton7.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton7.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(202, 202, 202));
        jButton8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton8.setBorder(null);
        jButton8.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton8.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton8.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TB_01_BwtNtJl_jB_01x01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(TB_02_jB_DftrNtJl_01x01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TB_01_BwtNtJl_jB_01x01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TB_02_jB_DftrNtJl_01x01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(172, 191, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(200, 186));
        jPanel3.setMinimumSize(new java.awt.Dimension(200, 186));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 186));

        jLabel2.setBackground(new java.awt.Color(172, 191, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PEMBELIAN");
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(200, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 20));

        jButton9.setBackground(new java.awt.Color(202, 202, 202));
        jButton9.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton9.setBorder(null);
        jButton9.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton9.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton9.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(202, 202, 202));
        jButton10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton10.setBorder(null);
        jButton10.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton10.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton10.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(202, 202, 202));
        jButton11.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton11.setBorder(null);
        jButton11.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton11.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton11.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(202, 202, 202));
        jButton12.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton12.setBorder(null);
        jButton12.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton12.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton12.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(202, 202, 202));
        jButton13.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton13.setBorder(null);
        jButton13.setMargin(new java.awt.Insets(2, -12, 2, -12));
        jButton13.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton13.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton13.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(202, 202, 202));
        jButton14.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton14.setBorder(null);
        jButton14.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton14.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton14.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(159, 153, 243));
        jPanel4.setMaximumSize(new java.awt.Dimension(200, 134));
        jPanel4.setMinimumSize(new java.awt.Dimension(200, 134));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 134));

        jLabel3.setBackground(new java.awt.Color(159, 153, 243));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("STOK");
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(200, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 20));

        jButton15.setBackground(new java.awt.Color(202, 202, 202));
        jButton15.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton15.setBorder(null);
        jButton15.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton15.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton15.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(202, 202, 202));
        jButton16.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton16.setBorder(null);
        jButton16.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton16.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton16.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(202, 202, 202));
        jButton17.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton17.setBorder(null);
        jButton17.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton17.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton17.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(202, 202, 202));
        jButton18.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton18.setBorder(null);
        jButton18.setMaximumSize(new java.awt.Dimension(92, 47));
        jButton18.setMinimumSize(new java.awt.Dimension(92, 47));
        jButton18.setPreferredSize(new java.awt.Dimension(92, 47));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBackground(new java.awt.Color(255, 123, 15));
        jPanel5.setMaximumSize(new java.awt.Dimension(200, 27));
        jPanel5.setMinimumSize(new java.awt.Dimension(200, 27));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 27));

        jButton19.setBackground(new java.awt.Color(202, 202, 202));
        jButton19.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jButton19.setForeground(new java.awt.Color(51, 51, 255));
        jButton19.setText("TUTORIAL");
        jButton19.setMaximumSize(new java.awt.Dimension(190, 27));
        jButton19.setMinimumSize(new java.awt.Dimension(190, 27));
        jButton19.setPreferredSize(new java.awt.Dimension(190, 27));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_01_BwtNtJual1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_02_DftrNtJual1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_03_BwtNtTukar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_04_DftrNtTukar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_05_BwtNtRtr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_06_DftrNtRtrUsr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_07_BwtPlgnBr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_08_EditDftrPlgn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_09_BwtNtBl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_10_DftrNtBl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_11_BwtNtRtrSupl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_12_DftrNtRtrSup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_13_BwtSuplBr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_14_EditDftrSupl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_15_BwtBrgBr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_16_EditDftrBrg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_17_RwytBrg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_18_StokOpname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(_00_Tutorial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_01_BwtNtJual1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(_00_Tutorial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_18_StokOpname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_17_RwytBrg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_16_EditDftrBrg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_15_BwtBrgBr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_12_DftrNtRtrSup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_13_BwtSuplBr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_11_BwtNtRtrSupl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_10_DftrNtBl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_09_BwtNtBl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_08_EditDftrPlgn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_07_BwtPlgnBr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_06_DftrNtRtrUsr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_05_BwtNtRtr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_04_DftrNtTukar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_03_BwtNtTukar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_02_DftrNtJual1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(_14_EditDftrSupl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TB_01_BwtNtJl_jB_01x01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TB_01_BwtNtJl_jB_01x01ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._01_BwtNtJual1.setVisible(true);
    }//GEN-LAST:event_TB_01_BwtNtJl_jB_01x01ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._03_BwtNtTukar2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._05_BwtNtRtr1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._07_BwtPlgnBr1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TB_02_jB_DftrNtJl_01x01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TB_02_jB_DftrNtJl_01x01ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._02_DftrNtJual1.setVisible(true);
    }//GEN-LAST:event_TB_02_jB_DftrNtJl_01x01ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._04_DftrNtTukar1.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._06_DftrNtRtrUsr1.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._08_EditDftrPlgn1.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._09_BwtNtBl1.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._11_BwtNtRtrSupl1.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._13_BwtSuplBr1.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._10_DftrNtBl1.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._12_DftrNtRtrSup1.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._14_EditDftrSupl1.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._15_BwtBrgBr2.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._17_RwytBrg1.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._16_EditDftrBrg2.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._18_StokOpname1.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        for (int p=0; p<Number_of_main_panels; p++) {
            Main_Panels[p].setVisible(false);
        }
        this._00_Tutorial1.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TB_01_BwtNtJl_jB_01x01;
    private javax.swing.JButton TB_02_jB_DftrNtJl_01x01;
    private prototype._00_Tutorial _00_Tutorial1;
    private prototype._01_BwtNtJual _01_BwtNtJual1;
    private prototype._02_DftrNtJual _02_DftrNtJual1;
    private prototype._03_BwtNtTukar _03_BwtNtTukar2;
    private prototype._04_DftrNtTukar _04_DftrNtTukar1;
    private prototype._05_BwtNtRtrUsr _05_BwtNtRtr1;
    private prototype._06_DftrNtRtrUsr _06_DftrNtRtrUsr1;
    private prototype._07_BwtPlgnBr _07_BwtPlgnBr1;
    private prototype._08_EditDftrPlgn _08_EditDftrPlgn1;
    private prototype._09_BwtNtBl _09_BwtNtBl1;
    private prototype._10_DftrNtBl _10_DftrNtBl1;
    private prototype._11_BwtNtRtrSupl _11_BwtNtRtrSupl1;
    private prototype._12_DftrNtRtrSup _12_DftrNtRtrSup1;
    private prototype._13_BwtSuplBr _13_BwtSuplBr1;
    private prototype._14_EditDftrSupl _14_EditDftrSupl1;
    private prototype._15_BwtBrgBr _15_BwtBrgBr2;
    private prototype._16_EditDftrBrg _16_EditDftrBrg2;
    private prototype._17_RwytBrg _17_RwytBrg1;
    private prototype._18_StokOpname _18_StokOpname1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
