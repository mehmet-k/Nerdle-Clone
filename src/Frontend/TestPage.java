package Frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import static Core.Generate.GenerateEquation;
/** Denklem uret,p kullaniciya gosteren test frame'i
/**
 * @author emirm
 */
public class TestPage extends JFrame {

    /**
     * Creates new form Frontend.Test
     */
    public TestPage() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {



        jScrollPane1 = new JScrollPane();
        jEditorPane1 = new JEditorPane();
        jLabel2 = new JLabel();
        btnGenerateEquation = new JButton();
        lblEquation = new JLabel();
        btnBack = new JButton();
        lblEquation.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("5 - 20011103 Mehmet Keçeci - 20011062 Emir Çağrı Aykın");

        btnGenerateEquation.setText("Generate Equation");
        btnGenerateEquation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnGenerateEquationActionPerformed(evt);
            }
        });

        lblEquation.setText("");

        btnBack.setText("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addComponent(btnGenerateEquation, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                                                .addGap(89, 89, 89)
                                                .addComponent(lblEquation))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2))))
                                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnGenerateEquation, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEquation))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                                .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void btnGenerateEquationActionPerformed(ActionEvent evt) {
        String generatedText = GenerateEquation();
        lblEquation.setText(generatedText);

    }

    private void btnBackActionPerformed(ActionEvent evt) {
        GUI gui = new GUI();
        gui.setVisible(true);

        this.dispose();        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TestPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TestPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Create and display the form
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestPage().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify
    private JButton btnBack;
    private JButton btnGenerateEquation;
    private JEditorPane jEditorPane1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JLabel lblEquation;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */

    private void $$$setupUI$$$() {
        final JPanel panel1 = new JPanel();
        //panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
    }
    // End of variables declaration
}
