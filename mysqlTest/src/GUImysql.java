import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Shlomi Alon on 05/04/2017.
 */
public class GUImysql extends javax.swing.JFrame implements KeyListener {

    // Buttons
    private JButton sendBtn;
    private JButton connectBtn;
    private JButton clrBtn;

    // TextsFields
    private JTextField userTxt;
    private JTextField passTxt;
    private JTextArea queryTxt;

    //List
    private JList listQuery;

    public GUImysql() {
        initComponents();
    }

    private void initComponents() {
        this.addKeyListener(this);
        sendBtn = new javax.swing.JButton();
        listQuery = new javax.swing.JList<>();
        connectBtn = new javax.swing.JButton();
        userTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JTextField();
        clrBtn = new javax.swing.JButton();
        queryTxt = new javax.swing.JTextArea();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new GUImysql().setVisible(true));
    }
}
