package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_9.Practical;

import javax.swing.*;

public class TugasFrame2 extends JFrame {

    private JTextField txtNama = new JTextField();
    private JTextField txtNim = new JTextField();
    private JTextField txtTelp = new JTextField();
    private JTextField txtAlamat = new JTextField();
    private JTextField txtEmail = new JTextField();

    private JComboBox<String> cbJurusan =
            new JComboBox<>(new String[]{"TIF", "SI", "TEKKOM"});

    private JButton btnSubmit = new JButton("Submit");

    public TugasFrame2() {
        setTitle("Form Daftar Ulang");
        setSize(320, 320);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initComponents();
        initEvents();

        setVisible(true);
    }

    private void initComponents() {
        addLabel("Nama", 10, 10);
        add(txtNama).setBounds(100, 10, 150, 20);

        addLabel("NIM", 10, 40);
        add(txtNim).setBounds(100, 40, 150, 20);

        addLabel("No. Telp", 10, 70);
        add(txtTelp).setBounds(100, 70, 150, 20);

        addLabel("Email", 10, 100);
        add(txtEmail).setBounds(100, 100, 150, 20);

        addLabel("Jurusan", 10, 130);
        add(cbJurusan).setBounds(100, 130, 150, 20);

        addLabel("Alamat", 10, 160);
        add(txtAlamat).setBounds(100, 160, 150, 20);

        add(btnSubmit).setBounds(100, 200, 100, 25);
    }

    private void initEvents() {
        btnSubmit.addActionListener(e -> handleSubmit());
    }

    private void handleSubmit() {
        if (!isFormValid()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Apakah data sudah benar?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            showResultFrame();
        }
    }

    private boolean isFormValid() {
        return !txtNama.getText().isEmpty() &&
               !txtNim.getText().isEmpty() &&
               !txtTelp.getText().isEmpty() &&
               !txtEmail.getText().isEmpty() &&
               !txtAlamat.getText().isEmpty();
    }

    private String getFormData() {
        return "Nama : " + txtNama.getText() + "\n" +
               "NIM : " + txtNim.getText() + "\n" +
               "No. Telp : " + txtTelp.getText() + "\n" +
               "Email : " + txtEmail.getText() + "\n" +
               "Jurusan : " + cbJurusan.getSelectedItem() + "\n" +
               "Alamat : " + txtAlamat.getText();
    }

    private void showResultFrame() {
        JFrame frame = new JFrame("Data Anda");
        frame.setSize(300, 250);
        frame.setLayout(null);

        JTextArea area = new JTextArea(getFormData());
        area.setEditable(false);

        frame.add(area).setBounds(10, 10, 260, 180);
        frame.setVisible(true);
    }

    private void addLabel(String text, int x, int y) {
        JLabel label = new JLabel(text);
        add(label).setBounds(x, y, 80, 20);
    }

    public static void main(String[] args) {
        new TugasFrame2();
    }
}