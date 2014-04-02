/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szab
 */
import javax.swing.DefaultListModel;

public class SimulationGUI extends javax.swing.JFrame
{
    private ProcessManager ProcMan = null;
    private IOController IO = null;

    /**
     * Creates new form SimulationGUI
     */
    
    // Dodatkowy konstruktor
    public SimulationGUI(ProcessManager ProcMan, IOController IO)
    {
        this.ProcMan = ProcMan;
        
        this.IO = IO;
        initComponents();
        
        Integer count = ProcMan._templateList.size();
        lblGeneratorCount.setText(count.toString());  
        lblROTQuant.setText((new Integer(ProcMan.quantSize)).toString());
        
    }
    
    public SimulationGUI()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblWorkTime = new javax.swing.JLabel();
        lblRemaining = new javax.swing.JLabel();
        lblNumberRealised = new javax.swing.JLabel();
        lblAverageWaited = new javax.swing.JLabel();
        lblCurrentProcess = new javax.swing.JLabel();
        lblProcessDuration = new javax.swing.JLabel();
        lblRemainingTime = new javax.swing.JLabel();
        lblROTQuant = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNextQ = new javax.swing.JButton();
        btnNextP = new javax.swing.JButton();
        btnFastFW = new javax.swing.JButton();
        btnUnlockPG = new javax.swing.JButton();
        btnLockProcessGN = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProcesy = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstGenerator = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblGeneratorCount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCountGenerated = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblGeneratorStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Statystyki symulacji"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Pozostało procesów:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 46, -1, -1));

        jLabel3.setText("Zrealizowane procesy:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 66, -1, -1));

        jLabel4.setText("Średni czas oczekiwania:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 86, -1, -1));

        jLabel5.setText("Obecny proces:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 118, -1, -1));

        jLabel6.setText("Długość procesu:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 138, -1, -1));

        jLabel7.setText("Pozostało do końca:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 158, -1, -1));

        jLabel8.setText("Czas działania:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, -1));

        jLabel11.setText("Długość kwantu czasu (ROT):");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 212, -1, -1));

        lblWorkTime.setText("0");
        jPanel1.add(lblWorkTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 27, -1, -1));

        lblRemaining.setText("0");
        jPanel1.add(lblRemaining, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 46, -1, -1));

        lblNumberRealised.setText("0");
        jPanel1.add(lblNumberRealised, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 66, -1, -1));

        lblAverageWaited.setText("0,0");
        jPanel1.add(lblAverageWaited, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 86, -1, -1));

        lblCurrentProcess.setText("brak");
        jPanel1.add(lblCurrentProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 118, -1, -1));

        lblProcessDuration.setText("0");
        jPanel1.add(lblProcessDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 138, -1, -1));

        lblRemainingTime.setText("0");
        jPanel1.add(lblRemainingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 158, -1, -1));

        lblROTQuant.setText("0");
        jPanel1.add(lblROTQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 212, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Kontrola przebiegu"));

        btnNextQ.setText("Następny kwant");
        btnNextQ.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNextQActionPerformed(evt);
            }
        });

        btnNextP.setText("Następny proces");
        btnNextP.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNextPActionPerformed(evt);
            }
        });

        btnFastFW.setText("Przejdź do końca");
        btnFastFW.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFastFWActionPerformed(evt);
            }
        });

        btnUnlockPG.setText("Odblokuj generator procesów");
        btnUnlockPG.setToolTipText("");
        btnUnlockPG.setEnabled(false);
        btnUnlockPG.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUnlockPGActionPerformed(evt);
            }
        });

        btnLockProcessGN.setText("Zablokuj generator procesów");
        btnLockProcessGN.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLockProcessGNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNextQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNextP, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btnFastFW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUnlockPG, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLockProcessGN, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNextQ)
                    .addComponent(btnUnlockPG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNextP)
                    .addComponent(btnLockProcessGN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFastFW)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(lstProcesy);

        jScrollPane4.setViewportView(lstGenerator);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Statystyki generatora procesów"));

        jLabel9.setText("Szablonów w generatorze:");

        lblGeneratorCount.setText("0");

        jLabel1.setText("Wygenerowano:");

        lblCountGenerated.setText("0");

        jLabel13.setText("Stan:");

        lblGeneratorStatus.setText("aktywny");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1))
                .addGap(153, 153, 153)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblGeneratorCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(143, 143, 143))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCountGenerated)
                            .addComponent(lblGeneratorStatus))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblGeneratorCount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCountGenerated))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblGeneratorStatus))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnlockPGActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUnlockPGActionPerformed
    {//GEN-HEADEREND:event_btnUnlockPGActionPerformed
	ProcMan.unlockProcessGenerator();
        lblGeneratorStatus.setText("aktywny");
        btnUnlockPG.setEnabled(false);
        btnLockProcessGN.setEnabled(true);
    }//GEN-LAST:event_btnUnlockPGActionPerformed

    private void btnLockProcessGNActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLockProcessGNActionPerformed
    {//GEN-HEADEREND:event_btnLockProcessGNActionPerformed
        ProcMan.lockProcessGenerator();
        lblGeneratorStatus.setText("zablokowany");
        btnLockProcessGN.setEnabled(false);
        btnUnlockPG.setEnabled(true);
    }//GEN-LAST:event_btnLockProcessGNActionPerformed

    private void btnNextQActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextQActionPerformed
    {//GEN-HEADEREND:event_btnNextQActionPerformed
        ProcMan.nextStep();
    }//GEN-LAST:event_btnNextQActionPerformed

    private void btnNextPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextPActionPerformed
    {//GEN-HEADEREND:event_btnNextPActionPerformed
        ProcMan.nextProcess();
    }//GEN-LAST:event_btnNextPActionPerformed

    private void btnFastFWActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFastFWActionPerformed
    {//GEN-HEADEREND:event_btnFastFWActionPerformed
        ProcMan.endSimulation();
    }//GEN-LAST:event_btnFastFWActionPerformed

    // Ustawia wartosc wygenerowanych procesów
    public void incrementGenerated()
    {
        Integer count = Integer.parseInt(lblCountGenerated.getText());
        count += 1;
        
        lblCountGenerated.setText(count.toString());
    }
    
    // Aktualizuje wartości statystyk
    public void update()
    {
        Integer workTime = ProcMan.workTime;
        Integer remainingProc = ProcMan.processList.size();
        Integer procRealised = ProcMan.numberRealised;
        Double average = ProcMan.getAverageTime();     
        
        // Aktualizacja statystyk
        if(ProcMan.processList.size()!=0)
        {
             Integer currentDuration = ProcMan.getCurrent().duration;
             Integer currentRemaining = ProcMan.getCurrent().timeLeft;
             String currentProcess = ProcMan.getCurrent().id;
             lblCurrentProcess.setText(currentProcess);
             lblProcessDuration.setText(currentDuration.toString());
             lblRemainingTime.setText(currentRemaining.toString());
        }
        else
        {
            lblCurrentProcess.setText("brak");
            lblProcessDuration.setText("-");
            lblRemainingTime.setText("-");
        }
        lblAverageWaited.setText(average.toString());
        lblRemaining.setText(remainingProc.toString());
        lblWorkTime.setText(workTime.toString());
        lblNumberRealised.setText(procRealised.toString());
        
        // Zapełnienie listy procesów
        DefaultListModel model = new DefaultListModel();
        int selected = 0;
        
        if(ProcMan.processList.size()!=0)
        {
            for(Process process : ProcMan.processList)
            {
                model.addElement(process.id+": długość "+process.duration+", pozostało "+process.timeLeft);
                if(process == ProcMan.getCurrent()) selected = model.size()-1;
            }
        }
        else
        {
            model.addElement("Brak procesów");
        }
        lstProcesy.setModel(model);
        lstProcesy.setSelectedIndex(selected);  
        
         // Zapełnienie listy wzorców
        DefaultListModel tmplmodel = new DefaultListModel();
        if(ProcMan._templateList.size()!=0)
        {
            for(ProcessTemplate template : ProcMan._templateList)
            {
                tmplmodel.addElement("Wzór id: "+template.id+", długość procesu "+template.duration+". Generowany co "+template.interval+" jednostek czasu. Pozostało: "+template.remaining);
            }
        }
        else
        {
            tmplmodel.addElement("Brak wzorców");
        }
        lstGenerator.setModel(tmplmodel);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFastFW;
    private javax.swing.JButton btnLockProcessGN;
    private javax.swing.JButton btnNextP;
    private javax.swing.JButton btnNextQ;
    private javax.swing.JButton btnUnlockPG;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAverageWaited;
    private javax.swing.JLabel lblCountGenerated;
    private javax.swing.JLabel lblCurrentProcess;
    private javax.swing.JLabel lblGeneratorCount;
    private javax.swing.JLabel lblGeneratorStatus;
    private javax.swing.JLabel lblNumberRealised;
    private javax.swing.JLabel lblProcessDuration;
    private javax.swing.JLabel lblROTQuant;
    private javax.swing.JLabel lblRemaining;
    private javax.swing.JLabel lblRemainingTime;
    private javax.swing.JLabel lblWorkTime;
    private javax.swing.JList lstGenerator;
    private javax.swing.JList lstProcesy;
    // End of variables declaration//GEN-END:variables
}
