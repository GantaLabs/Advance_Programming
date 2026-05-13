package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_9.SourceCode;

import javax.swing.*;

public class Gui extends JFrame {

    private JTextField txNama, txNim, txUTS, txUAS, txRata;
    private JTextArea hasil;
    private JComboBox<String> cbKelamin;
    private JRadioButton rb1, rb2, rb3;

    public Gui() {
        setTitle("DATA MAHASISWA");
        setSize(320, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        initMenu();
        initForm();

        setVisible(true);
    }

    private void initMenu() {
        JMenuBar mb = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        JMenuItem about = new JMenuItem("About");

        help.add(about);
        mb.add(file);
        mb.add(edit);
        mb.add(help);

        setJMenuBar(mb);

        about.addActionListener(e ->
            JOptionPane.showMessageDialog(this,
                "Aplikasi Data Mahasiswa\nFungsi: Input & hitung nilai",
                "About",
                JOptionPane.INFORMATION_MESSAGE)
        );
    }

    private void initForm() {
        txNama = addField("Nama", 10, 150);
        txNim  = addField("NIM", 35, 150);

        addLabel("Jenis Kelamin", 60);
        cbKelamin = new JComboBox<>(new String[]{"Pria", "Wanita"});
        addComponent(cbKelamin, 120, 60, 150, 20);

        addLabel("Hobi", 90);
        rb1 = addRadio("Shopping", 120, 90);
        rb2 = addRadio("Futsal", 120, 115);
        rb3 = addRadio("Musik", 120, 140);

        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        txUTS = addField("Nilai UTS", 165, 150);
        txUAS = addField("Nilai UAS", 190, 150);

        JButton cetak = new JButton("Cetak");
        addComponent(cetak, 10, 220, 260, 25);

        hasil = new JTextArea();
        addComponent(hasil, 10, 250, 260, 100);

        txRata = addField("Rata-rata", 360, 150);

        cetak.addActionListener(e -> proses());
    }

    private void proses() {
        hasil.setText("");

        hasil.append("Nama : " + txNama.getText() + "\n");
        hasil.append("NIM : " + txNim.getText() + "\n");
        hasil.append("Jenis Kelamin : " + cbKelamin.getSelectedItem() + "\n");
        hasil.append("Hobi : " + getSelectedHobi() + "\n");

        double uts = parse(txUTS.getText());
        double uas = parse(txUAS.getText());
        double rata = (uts + uas) / 2;

        hasil.append("UTS : " + uts + "\n");
        hasil.append("UAS : " + uas + "\n");
        hasil.append("Nilai Akhir : " + rata);

        txRata.setText(String.valueOf(rata));
    }

    private JTextField addField(String label, int y, int width) {
        addLabel(label, y);
        JTextField tf = new JTextField();
        addComponent(tf, 120, y, width, 20);
        return tf;
    }

    private void addLabel(String text, int y) {
        JLabel lbl = new JLabel(text);
        addComponent(lbl, 10, y, 100, 20);
    }

    private JRadioButton addRadio(String text, int x, int y) {
        JRadioButton rb = new JRadioButton(text);
        addComponent(rb, x, y, 120, 20);
        return rb;
    }

    private void addComponent(JComponent comp, int x, int y, int w, int h) {
        comp.setBounds(x, y, w, h);
        add(comp);
    }

    private String getSelectedHobi() {
        if (rb1.isSelected()) return rb1.getText();
        if (rb2.isSelected()) return rb2.getText();
        if (rb3.isSelected()) return rb3.getText();
        return "-";
    }

    private double parse(String text) {
        try {
            return Double.parseDouble(text);
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        new Gui();
    }
}