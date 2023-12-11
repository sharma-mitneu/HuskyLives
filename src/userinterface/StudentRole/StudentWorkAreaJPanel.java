/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.Student.Student;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ashish
 */
public class StudentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private Student student;
    Network network;
    private boolean ageValid = true;
    private boolean zipValid = true;
    private boolean heightValid = true;
    private boolean weightValid = true;

    public StudentWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = business;
        txtName.setEditable(false);
        txtAge.setEditable(false);
        radioMale.setEnabled(false);
        radioFemale.setEnabled(false);
        txtAdress.setEditable(false);
        txtPassword.setEditable(false);
        txtCity.setEditable(false);
        networkJComboBox.setEditable(false);
        txtZipcode.setEditable(false);
        txtHeight.setEditable(false);
        txtWeight.setEditable(false);
        saveBtn.setEnabled(false);
        clearLabels();

        txtName.setText(userAccount.getStudent().getName());
        txtAge.setText(String.valueOf(userAccount.getStudent().getAge()));
        greetLbl.setText(userAccount.getStudent().getName() + " !!");
        if (userAccount.getStudent().getGender().toLowerCase().equals("male")) {
            radioMale.setSelected(true);
        } else {
            radioFemale.setSelected(true);
        }
        txtPassword.setText(userAccount.getPassword());
        txtAdress.setText(userAccount.getStudent().getAddress());
        txtCity.setText(userAccount.getStudent().getCity());
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        dm.addElement(userAccount.getStudent().getNetwork());
        networkJComboBox.setModel(dm);
        txtZipcode.setText(String.valueOf(userAccount.getStudent().getZipcode()));
        txtHeight.setText(String.valueOf(userAccount.getStudent().getHeight()));
        txtWeight.setText(String.valueOf(userAccount.getStudent().getWeight()));
        student = userAccount.getStudent();
        return;
    }

    private void clearLabels() {
        nameLbl.setVisible(false);
        nameSuccessLbl.setVisible(false);
        AgeSuccessLbl.setVisible(false);
        invalidAgeLbl.setVisible(false);
        ageBandLbl.setVisible(false);
        addressSuccessLbl.setVisible(false);
        addressLbl.setVisible(false);
        passwordSuccessLbl.setVisible(false);
        passwordLbl.setVisible(false);
        cityLbl.setVisible(false);
        citySuccessLbl.setVisible(false);
        zipLbl.setVisible(false);
        zipSuccessLbl.setVisible(false);
        heightLbl.setVisible(false);
        heightSuccessLbl.setVisible(false);
        weightLbl.setVisible(false);
        weightSuccessLbl.setVisible(false);
    }

    private boolean usernamePatternCorrect(String val) {
        Pattern p = Pattern.compile("^.+@[^\\.].*\\.[a-z]{2,}$");
        Matcher m = p.matcher(val);
        boolean b = m.matches();
        return b;
    }

    private boolean namePatternCorrect(String val1) {
        Pattern p = Pattern.compile("^[a-zA-Z ]+$");
        Matcher m = p.matcher(val1);
        boolean b = m.matches();
        return b;
    }

    private boolean addressPatternCorrect(String val2) {
        Pattern p = Pattern.compile("^[a-z A-Z 0-9 #/-]+$");
        Matcher m = p.matcher(val2);
        boolean b = m.matches();
        return b;
    }

    private boolean cityPatternCorrect(String val3) {
        Pattern p = Pattern.compile("^[a-zA-Z ]+$");
        Matcher m = p.matcher(val3);
        boolean b = m.matches();
        return b;
    }

    private boolean passwordPatternCorrect(String val4) {
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = p1.matcher(String.valueOf(val4));
        boolean b1 = m1.matches();
        return b1;
    }

    private boolean numberPatternCorrect(String val5) {
        Pattern p = Pattern.compile("^[0-9]$");
        Matcher m = p.matcher(val5);
        boolean b = m.matches();
        return b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        btnAnalysis = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        invalidAgeLbl = new javax.swing.JLabel();
        ageBandLbl = new javax.swing.JLabel();
        heightLbl = new javax.swing.JLabel();
        weightLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        zipLbl = new javax.swing.JLabel();
        nameSuccessLbl = new javax.swing.JLabel();
        AgeSuccessLbl = new javax.swing.JLabel();
        heightSuccessLbl = new javax.swing.JLabel();
        weightSuccessLbl = new javax.swing.JLabel();
        addressSuccessLbl = new javax.swing.JLabel();
        citySuccessLbl = new javax.swing.JLabel();
        zipSuccessLbl = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        passwordSuccessLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        updateBtn1 = new javax.swing.JButton();
        btnMaintainReq = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        greetLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        placeOrderBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 80, 30));

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        txtName.setForeground(new java.awt.Color(51, 51, 51));
        txtName.setEnabled(false);
        txtName.setPreferredSize(new java.awt.Dimension(160, 25));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Age:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 80, 30));

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(204, 204, 204));
        txtAge.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        txtAge.setForeground(new java.awt.Color(51, 51, 51));
        txtAge.setEnabled(false);
        txtAge.setPreferredSize(new java.awt.Dimension(160, 25));
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Height(in cms):");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 90, -1));

        txtHeight.setEditable(false);
        txtHeight.setBackground(new java.awt.Color(204, 204, 204));
        txtHeight.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        txtHeight.setForeground(new java.awt.Color(51, 51, 51));
        txtHeight.setEnabled(false);
        txtHeight.setPreferredSize(new java.awt.Dimension(160, 25));
        txtHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHeightKeyReleased(evt);
            }
        });
        add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Weight (In Kgs):");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 100, 20));

        txtWeight.setEditable(false);
        txtWeight.setBackground(new java.awt.Color(204, 204, 204));
        txtWeight.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        txtWeight.setForeground(new java.awt.Color(51, 51, 51));
        txtWeight.setEnabled(false);
        txtWeight.setPreferredSize(new java.awt.Dimension(160, 25));
        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWeightKeyReleased(evt);
            }
        });
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        btnAnalysis.setBackground(new java.awt.Color(255, 51, 51));
        btnAnalysis.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnAnalysis.setForeground(new java.awt.Color(51, 51, 51));
        btnAnalysis.setText("Health Club");
        btnAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalysisActionPerformed(evt);
            }
        });
        add(btnAnalysis, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 110, 51));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Gender:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 80, 40));

        radioMale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioMale.setForeground(new java.awt.Color(204, 204, 204));
        radioMale.setText("Male");
        radioMale.setEnabled(false);
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });
        add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 64, -1));

        radioFemale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioFemale.setForeground(new java.awt.Color(204, 204, 204));
        radioFemale.setText("Female");
        radioFemale.setEnabled(false);
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });
        add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        updateBtn.setBackground(new java.awt.Color(204, 204, 204));
        updateBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(51, 51, 51));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 106, 51));

        saveBtn.setBackground(new java.awt.Color(204, 204, 204));
        saveBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(51, 51, 51));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 106, 51));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Address:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 80, 40));

        txtAdress.setBackground(new java.awt.Color(204, 204, 204));
        txtAdress.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        txtAdress.setForeground(new java.awt.Color(51, 51, 51));
        txtAdress.setEnabled(false);
        txtAdress.setPreferredSize(new java.awt.Dimension(160, 25));
        txtAdress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdressKeyReleased(evt);
            }
        });
        add(txtAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 158, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("City:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 120, -1));

        txtCity.setBackground(new java.awt.Color(204, 204, 204));
        txtCity.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        txtCity.setForeground(new java.awt.Color(51, 51, 51));
        txtCity.setEnabled(false);
        txtCity.setPreferredSize(new java.awt.Dimension(160, 25));
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 158, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Campus:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 110, -1));

        networkJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        networkJComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(51, 51, 51));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.setEnabled(false);
        networkJComboBox.setPreferredSize(new java.awt.Dimension(160, 25));
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 158, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Zip Code:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 60, 20));

        txtZipcode.setBackground(new java.awt.Color(204, 204, 204));
        txtZipcode.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        txtZipcode.setForeground(new java.awt.Color(51, 51, 51));
        txtZipcode.setEnabled(false);
        txtZipcode.setPreferredSize(new java.awt.Dimension(160, 25));
        txtZipcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipcodeKeyReleased(evt);
            }
        });
        add(txtZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 158, -1));

        nameLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(255, 51, 51));
        nameLbl.setText(" Only Alphabets are allowed.");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 160, 20));

        invalidAgeLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        invalidAgeLbl.setForeground(new java.awt.Color(255, 51, 51));
        invalidAgeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        invalidAgeLbl.setText("Invalid Age.");
        add(invalidAgeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 160, 20));

        ageBandLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        ageBandLbl.setForeground(new java.awt.Color(255, 51, 51));
        ageBandLbl.setText("Age Should be between 15-85");
        add(ageBandLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 180, 20));

        heightLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        heightLbl.setForeground(new java.awt.Color(255, 51, 51));
        heightLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heightLbl.setText("Invalid Height");
        add(heightLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 160, 20));

        weightLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        weightLbl.setForeground(new java.awt.Color(255, 51, 51));
        weightLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weightLbl.setText("Invalid Weight");
        add(weightLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 160, 20));

        addressLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        addressLbl.setForeground(new java.awt.Color(255, 51, 51));
        addressLbl.setText("Only Alphabets, Numbers, '#/-' are allowed");
        add(addressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 250, 20));

        cityLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        cityLbl.setForeground(new java.awt.Color(255, 51, 51));
        cityLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityLbl.setText("Only Alphabets are allowed");
        add(cityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 160, 20));

        zipLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        zipLbl.setForeground(new java.awt.Color(255, 51, 51));
        zipLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zipLbl.setText("Only Numbers Allowed");
        add(zipLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 160, 20));

        nameSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(nameSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 30, -1));

        AgeSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(AgeSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 30, -1));

        heightSuccessLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        heightSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(heightSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 30, -1));

        weightSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(weightSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 40, -1));

        addressSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(addressSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 40, -1));

        citySuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(citySuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 30, -1));

        zipSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(zipSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 30, -1));

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtPassword.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setEnabled(false);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 158, 25));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Password:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 107, 20));

        passwordSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(passwordSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 30, -1));

        passwordLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(255, 51, 51));
        passwordLbl.setText("Sample format: Asdf@1");
        add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 160, 20));

        updateBtn1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        updateBtn1.setText("Update");
        updateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn1ActionPerformed(evt);
            }
        });
        add(updateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 106, 51));

        btnMaintainReq.setBackground(new java.awt.Color(204, 204, 204));
        btnMaintainReq.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnMaintainReq.setForeground(new java.awt.Color(51, 51, 51));
        btnMaintainReq.setText("Dorm Maintenence");
        btnMaintainReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintainReqActionPerformed(evt);
            }
        });
        add(btnMaintainReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 160, 51));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Welcome,");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 120, 40));

        greetLbl.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        greetLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(greetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 330, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Student");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 692, 36));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));

        placeOrderBtn1.setBackground(new java.awt.Color(204, 204, 204));
        placeOrderBtn1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        placeOrderBtn1.setForeground(new java.awt.Color(51, 51, 51));
        placeOrderBtn1.setText("Student Store");
        placeOrderBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderBtn1ActionPerformed(evt);
            }
        });
        add(placeOrderBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 490, 110, 51));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalysisActionPerformed

        StudentAnalysisJPanel studentAnalysisJPanel = new StudentAnalysisJPanel(userProcessContainer, student, system, userAccount, enterprise, network);
        userProcessContainer.add("StudentAnalysisJPanel", studentAnalysisJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalysisActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        txtName.setEditable(true);
        txtName.setEnabled(true);
        txtAge.setEditable(true);
        txtAge.setEnabled(true);
        radioMale.setEnabled(true);
        radioFemale.setEnabled(true);
        txtAdress.setEditable(true);
        txtAdress.setEnabled(true);
        txtPassword.setEditable(true);
        txtPassword.setEnabled(true);
        txtCity.setEditable(true);
        txtCity.setEnabled(true);
        networkJComboBox.setEditable(true);
        txtZipcode.setEditable(true);
        txtZipcode.setEnabled(true);
        txtHeight.setEditable(true);
        txtHeight.setEnabled(true);
        txtWeight.setEditable(true);
        txtWeight.setEnabled(true);
        saveBtn.setEnabled(true);
        updateBtn.setEnabled(false);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (txtName.getText().isEmpty() || txtAge.getText().isEmpty() || txtWeight.getText().isEmpty() || txtHeight.getText().isEmpty() || txtAdress.getText().isEmpty() || txtCity.getText().isEmpty() || txtZipcode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field(s) cannot be Empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (ageValid && zipValid && heightValid && weightValid) {
            String name = txtName.getText();
            String password = txtPassword.getText();
            String add = txtAdress.getText();
            String city = txtCity.getText();
            String gender = "";
            if (radioMale.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            double height = Double.parseDouble(txtHeight.getText());
            double weight = Double.parseDouble(txtWeight.getText());
            int age = Integer.parseInt(txtAge.getText());
            String address = txtAdress.getText();
            String zipcode = txtZipcode.getText();

            system.getStudentDirectory().updateStudent(student, name, height, weight, gender, age, address, city, zipcode);
            system.getUserAccountDirectory().updateUserAccount(userAccount, password);
            JOptionPane.showMessageDialog(null, "Student has been updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

            txtName.setEditable(false);
            txtName.setEnabled(false);
            txtAge.setEditable(false);
            txtAge.setEnabled(false);
            radioMale.setEnabled(false);
            radioFemale.setEnabled(false);
            txtAdress.setEditable(false);
            txtAdress.setEnabled(false);
            txtPassword.setEditable(false);
            txtPassword.setEnabled(false);
            txtCity.setEditable(false);
            txtCity.setEnabled(false);
            networkJComboBox.setEditable(false);
            networkJComboBox.setEnabled(false);
            txtZipcode.setEditable(false);
            txtZipcode.setEnabled(false);
            txtHeight.setEditable(false);
            txtHeight.setEnabled(false);
            txtWeight.setEditable(false);
            txtWeight.setEnabled(false);
            saveBtn.setEnabled(false);
            updateBtn.setEnabled(true);
            clearLabels();
        } else {
            JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        // TODO add your handling code here:
        radioMale.setSelected(false);
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        if (!namePatternCorrect(txtName.getText()) && !(txtName.getText().isEmpty())) {
            nameLbl.setVisible(true);
            nameSuccessLbl.setVisible(false);
        } else if (txtName.getText().isEmpty()) {
            nameLbl.setVisible(false);
            nameSuccessLbl.setVisible(false);
        } else {
            nameLbl.setVisible(false);
            nameSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        int age = 0;
        try {
            age = Integer.parseInt(txtAge.getText());
        } catch (NumberFormatException e) {
            if (!txtAge.getText().isEmpty()) {
                invalidAgeLbl.setVisible(true);
                ageValid = false;
                ageBandLbl.setVisible(false);
                AgeSuccessLbl.setVisible(false);
                return;
            } else {
                invalidAgeLbl.setVisible(false);
                ageValid = false;
                ageBandLbl.setVisible(false);
                AgeSuccessLbl.setVisible(false);
                return;
            }
        }
        if (age < 15 || age > 85) {
            ageBandLbl.setVisible(true);
            ageValid = false;
            invalidAgeLbl.setVisible(false);
            AgeSuccessLbl.setVisible(false);
        } else {
            invalidAgeLbl.setVisible(false);
            ageBandLbl.setVisible(false);
            ageValid = true;
            AgeSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtHeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHeightKeyReleased
        // TODO add your handling code here:
        int height = 0;
        try {
            height = Integer.parseInt(txtHeight.getText());
        } catch (NumberFormatException e) {
            if (!txtHeight.getText().isEmpty()) {
                heightValid = false;
                heightSuccessLbl.setVisible(false);
                heightLbl.setVisible(true);
                return;
            } else {
                heightValid = false;
                heightLbl.setVisible(false);
                heightSuccessLbl.setVisible(false);
                return;
            }
        }
        if (txtHeight.getText().length() > 3 || txtHeight.getText().length() < 3) {
            heightValid = false;
            heightLbl.setVisible(true);
            heightSuccessLbl.setVisible(false);
        } else {
            heightValid = true;
            heightLbl.setVisible(false);
            heightSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtHeightKeyReleased

    private void txtWeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyReleased
        // TODO add your handling code here:
        int weight = 0;
        try {
            weight = Integer.parseInt(txtWeight.getText());
        } catch (NumberFormatException e) {
            if (!txtWeight.getText().isEmpty()) {
                weightValid = false;
                weightSuccessLbl.setVisible(false);
                weightLbl.setVisible(true);
                return;
            } else {
                weightValid = false;
                weightLbl.setVisible(false);
                weightSuccessLbl.setVisible(false);
                return;
            }
        }
        if (weight > 200) {
            weightValid = false;
            weightLbl.setVisible(true);
            weightSuccessLbl.setVisible(false);
        } else {
            weightValid = true;
            weightLbl.setVisible(false);
            weightSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtWeightKeyReleased

    private void txtAdressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdressKeyReleased
        // TODO add your handling code here:
        if (!addressPatternCorrect(txtAdress.getText()) && !(txtAdress.getText().isEmpty())) {
            addressSuccessLbl.setVisible(false);
            addressLbl.setVisible(true);
        } else {
            addressLbl.setVisible(false);
            addressSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtAdressKeyReleased

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        // TODO add your handling code here:
        if (!cityPatternCorrect(txtCity.getText()) && !(txtCity.getText().isEmpty())) {
            citySuccessLbl.setVisible(false);
            cityLbl.setVisible(true);
        } else {
            cityLbl.setVisible(false);
            citySuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtZipcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipcodeKeyReleased
        // TODO add your handling code here:
        int zip = 0;
        try {
            zip = Integer.parseInt(txtZipcode.getText());
            zipValid = true;
            zipSuccessLbl.setVisible(true);
            zipLbl.setVisible(false);
            return;
        } catch (NumberFormatException e) {
            if (!txtZipcode.getText().isEmpty()) {
                zipValid = false;
                zipSuccessLbl.setVisible(false);
                zipLbl.setVisible(true);
                return;
            } else {
                zipValid = false;
                zipLbl.setVisible(false);
                zipSuccessLbl.setVisible(false);
                return;
            }
        }
    }//GEN-LAST:event_txtZipcodeKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        if (!passwordPatternCorrect(txtPassword.getText()) && !(txtPassword.getText().isEmpty())) {
            passwordSuccessLbl.setVisible(false);
            passwordLbl.setVisible(true);
        } else {
            passwordLbl.setVisible(false);
            passwordSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // TODO add your handling code here:
        radioFemale.setSelected(false);
    }//GEN-LAST:event_radioMaleActionPerformed

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtn1ActionPerformed

    private void btnMaintainReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainReqActionPerformed
        // TODO add your handling code here:
        RaiseRequestJPanel requestPanel = new RaiseRequestJPanel(userProcessContainer, student, system, userAccount, enterprise, network);
        userProcessContainer.add("StudentRequestJPanel", requestPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMaintainReqActionPerformed

    private void placeOrderBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderBtn1ActionPerformed
        PlaceOrderJPanel placeOrder = new PlaceOrderJPanel(userProcessContainer, student, system, userAccount, enterprise, network);
        userProcessContainer.add("StudentAnalysisJPanel", placeOrder);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_placeOrderBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeSuccessLbl;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JLabel addressSuccessLbl;
    private javax.swing.JLabel ageBandLbl;
    private javax.swing.JButton btnAnalysis;
    private javax.swing.JButton btnMaintainReq;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JLabel citySuccessLbl;
    private javax.swing.JLabel greetLbl;
    private javax.swing.JLabel heightLbl;
    private javax.swing.JLabel heightSuccessLbl;
    private javax.swing.JLabel invalidAgeLbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel nameSuccessLbl;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel passwordSuccessLbl;
    private javax.swing.JButton placeOrderBtn1;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtZipcode;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateBtn1;
    private javax.swing.JLabel weightLbl;
    private javax.swing.JLabel weightSuccessLbl;
    private javax.swing.JLabel zipLbl;
    private javax.swing.JLabel zipSuccessLbl;
    // End of variables declaration//GEN-END:variables
}
