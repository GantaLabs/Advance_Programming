package Semester_2.Advance_Programming.Semester_2.TheoryAdvanceProgramming.Tugas_08;

import javax.swing.*;
import javax.swing.table.*;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

public class MainApp {

    static PegawaiService pegawaiService = new PegawaiService();
    static SiswaService siswaService = new SiswaService();
    static BukuService bukuService = new BukuService();
    static TransaksiService transaksiService = new TransaksiService();

    static final Color C_BG       = new Color(245, 245, 250);
    static final Color C_SIDEBAR   = new Color(38, 33, 92);
    static final Color C_ACCENT    = new Color(83, 74, 183);
    static final Color C_WHITE     = Color.WHITE;
    static final Color C_TEXT_DARK = new Color(30, 30, 50);
    static final Color C_TEXT_MUT  = new Color(110, 110, 130);
    static final Color C_GREEN     = new Color(59, 109, 17);
    static final Color C_GREEN_BG  = new Color(234, 243, 222);
    static final Color C_GRAY_BG   = new Color(241, 239, 232);
    static final Color C_GRAY_TXT  = new Color(95, 94, 90);
    static final Color C_RED       = new Color(163, 45, 45);
    static final Color C_RED_BG    = new Color(252, 235, 235);

    static JFrame frame;
    static JPanel cardPanel;
    static CardLayout cardLayout;
    static JLabel lblPageTitle;

    public static void main(String[] args) {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        } 
        catch (Exception ignored) {}
        SwingUtilities.invokeLater(MainApp::showLogin);
    }

    static void showLogin() {
        frame = new JFrame("Perpustakaan — Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel root = new JPanel(new GridBagLayout());
        root.setBackground(C_BG);

        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBackground(C_WHITE);
        card.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(220,220,230), 1, true),
            BorderFactory.createEmptyBorder(28, 32, 28, 32)
        ));
        card.setPreferredSize(new Dimension(320, 230));

        JLabel title = new JLabel("Perpustakaan");
        title.setFont(new Font("SansSerif", Font.BOLD, 20));
        title.setForeground(C_TEXT_DARK);
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel sub = new JLabel("Masuk dengan NIP pegawai");
        sub.setFont(new Font("SansSerif", Font.PLAIN, 13));
        sub.setForeground(C_TEXT_MUT);
        sub.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel nipLabel = formLabel("NIP");
        nipLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextField nipField = formField();
        nipField.setAlignmentX(Component.LEFT_ALIGNMENT);
        nipField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 36));

        JLabel errLabel = new JLabel("NIP tidak ditemukan.");
        errLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        errLabel.setForeground(C_RED);
        errLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        errLabel.setVisible(false);

        JButton btnLogin = accentButton("Masuk");
        btnLogin.setBackground(new Color(0, 0, 255));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setAlignmentX(Component.LEFT_ALIGNMENT);
        btnLogin.setMaximumSize(new Dimension(Integer.MAX_VALUE, 36));

        card.add(title);
        card.add(Box.createVerticalStrut(4));
        card.add(sub);
        card.add(Box.createVerticalStrut(20));
        card.add(nipLabel);
        card.add(Box.createVerticalStrut(6));
        card.add(nipField);
        card.add(Box.createVerticalStrut(6));
        card.add(errLabel);
        card.add(Box.createVerticalStrut(12));
        card.add(btnLogin);

        root.add(card);
        frame.setContentPane(root);
        frame.setVisible(true);

        ActionListener loginAction = e -> {
            String nip = nipField.getText().trim();
            Pegawai p = pegawaiService.findByNip(nip);
            if (p != null) {
                frame.dispose();
                showMain(p);
            } else {
                errLabel.setVisible(true);
            }
        };
        btnLogin.addActionListener(loginAction);
        nipField.addActionListener(loginAction);
    }

    static void showMain(Pegawai pegawai) {
        frame = new JFrame("Perpustakaan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(980, 640);
        frame.setLocationRelativeTo(null);
        frame.setMinimumSize(new Dimension(800, 500));

        JPanel root = new JPanel(new BorderLayout());

        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setBackground(C_SIDEBAR);
        sidebar.setPreferredSize(new Dimension(200, 0));

        JPanel logoArea = new JPanel();
        logoArea.setLayout(new BoxLayout(logoArea, BoxLayout.Y_AXIS));
        logoArea.setBackground(C_SIDEBAR);
        logoArea.setBorder(BorderFactory.createEmptyBorder(20, 16, 16, 16));
        logoArea.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));
        JLabel logoTitle = new JLabel("SiPerpus");
        logoTitle.setFont(new Font("SansSerif", Font.BOLD, 16));
        logoTitle.setForeground(Color.WHITE);
        logoTitle.setAlignmentX(Component.LEFT_ALIGNMENT);
        JLabel logoUser = new JLabel(pegawai.getNama() + " (" + pegawai.getNip() + ")");
        logoUser.setFont(new Font("SansSerif", Font.PLAIN, 11));
        logoUser.setForeground(new Color(180, 175, 230));
        logoUser.setAlignmentX(Component.LEFT_ALIGNMENT);
        logoArea.add(logoTitle);
        logoArea.add(Box.createVerticalStrut(4));
        logoArea.add(logoUser);
        sidebar.add(logoArea);

        JSeparator sep = new JSeparator();
        sep.setForeground(new Color(70, 60, 140));
        sep.setMaximumSize(new Dimension(Integer.MAX_VALUE, 1));
        sidebar.add(sep);
        sidebar.add(Box.createVerticalStrut(8));

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        cardPanel.setBackground(C_BG);

        JPanel topBar = new JPanel(new BorderLayout());
        topBar.setBackground(C_WHITE);
        topBar.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(220, 220, 230)),
            BorderFactory.createEmptyBorder(12, 20, 12, 20)
        ));
        lblPageTitle = new JLabel("Dashboard");
        lblPageTitle.setFont(new Font("SansSerif", Font.BOLD, 15));
        lblPageTitle.setForeground(C_TEXT_DARK);
        JButton btnLogout = new JButton("Logout");
        btnLogout.setFont(new Font("SansSerif", Font.PLAIN, 12));
        btnLogout.setForeground(C_RED);
        btnLogout.setBackground(C_RED_BG);
        btnLogout.setBorder(BorderFactory.createEmptyBorder(5, 12, 5, 12));
        btnLogout.setFocusPainted(false);
        btnLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLogout.addActionListener(e -> { frame.dispose(); showLogin(); });
        topBar.add(lblPageTitle, BorderLayout.WEST);
        topBar.add(btnLogout, BorderLayout.EAST);

        cardPanel.add(dashboardPage(), "dashboard");
        cardPanel.add(siswaPage(), "siswa");
        cardPanel.add(bukuPage(), "buku");
        cardPanel.add(transaksiPage(), "transaksi");

        String[][] navItems = {
            {"  Dashboard", "dashboard"},
            {"  Data Siswa", "siswa"},
            {"  Data Buku", "buku"},
            {"  Transaksi", "transaksi"}
        };
        ButtonGroup navGroup = new ButtonGroup();
        JToggleButton[] navBtns = new JToggleButton[navItems.length];

        for (int i = 0; i < navItems.length; i++) {
            final String pageKey = navItems[i][1];
            final String pageLabel = navItems[i][0].trim();
            JToggleButton btn = navButton(navItems[i][0]);
            navGroup.add(btn);
            navBtns[i] = btn;
            btn.addActionListener(e -> {
                cardLayout.show(cardPanel, pageKey);
                lblPageTitle.setText(pageLabel);
                refreshPage(pageKey);
            });
            sidebar.add(btn);
        }
        navBtns[0].setSelected(true);
        sidebar.add(Box.createVerticalGlue());

        JPanel mainArea = new JPanel(new BorderLayout());
        mainArea.add(topBar, BorderLayout.NORTH);
        mainArea.add(cardPanel, BorderLayout.CENTER);

        root.add(sidebar, BorderLayout.WEST);
        root.add(mainArea, BorderLayout.CENTER);

        frame.setContentPane(root);
        frame.setVisible(true);
        refreshPage("dashboard");
    }

    static void refreshPage(String key) {
        switch (key) {
            case "dashboard": refreshDashboard(); break;
            case "siswa": refreshSiswa(); break;
            case "buku": refreshBuku(); break;
            case "transaksi": refreshTransaksi(); break;
        }
    }

    static JLabel statSiswa, statBuku, statAktif, statKembali;
    static DefaultTableModel dashTableModel;

    static JPanel dashboardPage() {
        JPanel page = new JPanel(new BorderLayout());
        page.setBackground(C_BG);
        page.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel statsRow = new JPanel(new GridLayout(1, 4, 12, 0));
        statsRow.setBackground(C_BG);
        statSiswa = new JLabel("0"); statBuku = new JLabel("0");
        statAktif = new JLabel("0"); statKembali = new JLabel("0");
        statsRow.add(statCard("Total Siswa", statSiswa));
        statsRow.add(statCard("Total Buku", statBuku));
        statsRow.add(statCard("Sedang Dipinjam", statAktif));
        statsRow.add(statCard("Dikembalikan", statKembali));

        String[] cols = {"Kode", "NIS", "Judul Buku", "Tgl Pinjam", "Status"};
        dashTableModel = new DefaultTableModel(cols, 0) { public boolean isCellEditable(int r, int c) { return false; } };
        JTable table = styledTable(dashTableModel);
        colorStatusColumn(table, 4);

        JPanel center = new JPanel(new BorderLayout());
        center.setBackground(C_BG);
        center.add(Box.createVerticalStrut(16), BorderLayout.NORTH);
        center.add(tableCardWrap(new JScrollPane(table), "Transaksi Terbaru"), BorderLayout.CENTER);

        page.add(statsRow, BorderLayout.NORTH);
        page.add(center, BorderLayout.CENTER);
        return page;
    }

    static void refreshDashboard() {
        java.util.List<Siswa> sl = siswaService.getAll();
        java.util.List<Buku> bl = bukuService.getAll();
        java.util.List<Transaksi> tl = transaksiService.getAll();
        statSiswa.setText(String.valueOf(sl.size()));
        statBuku.setText(String.valueOf(bl.size()));
        statAktif.setText(String.valueOf(tl.stream().filter(t -> t.getStatus()==0).count()));
        statKembali.setText(String.valueOf(tl.stream().filter(t -> t.getStatus()==1).count()));
        dashTableModel.setRowCount(0);
        int count = 0;
        for (int i = tl.size()-1; i >= 0 && count < 10; i--, count++) {
            Transaksi t = tl.get(i);
            Buku b = bukuService.findByKode(t.getKodeBuku());
            dashTableModel.addRow(new Object[]{t.getKode(), t.getNis(), b!=null?b.getJudul():t.getKodeBuku(), t.getTglPinjam(), t.getStatus()==0?"Dipinjam":"Dikembalikan"});
        }
    }

    // ─── SISWA ────────────────────────────────────────────────────────────────
    static DefaultTableModel siswaTableModel;

    static JPanel siswaPage() {
        JPanel page = new JPanel(new BorderLayout());
        page.setBackground(C_BG);
        page.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel formCard = new JPanel(new GridBagLayout());
        formCard.setBackground(C_WHITE);
        formCard.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(220,220,230),1,true), BorderFactory.createEmptyBorder(16,16,16,16)));
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(4,4,4,4); gc.fill = GridBagConstraints.HORIZONTAL;

        JTextField fNis = formField(); JTextField fNama = formField(); JTextField fAlamat = formField();
        JLabel msgSiswa = new JLabel(" ");
        msgSiswa.setFont(new Font("SansSerif", Font.PLAIN, 12));

        gc.gridx=0; gc.gridy=0; gc.weightx=0; formCard.add(formLabel("NIS"), gc);
        gc.gridx=1; gc.weightx=0.2; formCard.add(fNis, gc);
        gc.gridx=2; gc.weightx=0; formCard.add(formLabel("Nama"), gc);
        gc.gridx=3; gc.weightx=0.4; formCard.add(fNama, gc);
        gc.gridx=4; gc.weightx=0; formCard.add(formLabel("Alamat"), gc);
        gc.gridx=5; gc.weightx=0.4; formCard.add(fAlamat, gc);

        JButton btnSimpan = accentButton("Simpan");
        gc.gridx=0; gc.gridy=1; gc.weightx=0; formCard.add(btnSimpan, gc);
        gc.gridx=1; gc.gridwidth=5; formCard.add(msgSiswa, gc); gc.gridwidth=1;

        btnSimpan.addActionListener(e -> {
            String nis=fNis.getText().trim(), nama=fNama.getText().trim(), alamat=fAlamat.getText().trim();
            if (nis.isEmpty()||nama.isEmpty()||alamat.isEmpty()) { setMsg(msgSiswa,"Semua field wajib diisi.",false); return; }
            if (siswaService.findByNis(nis) != null) { setMsg(msgSiswa,"NIS sudah terdaftar.",false); return; }
            siswaService.tambah(new Siswa(nis,nama,alamat));
            setMsg(msgSiswa,"Siswa berhasil ditambahkan.",true);
            fNis.setText(""); fNama.setText(""); fAlamat.setText("");
            refreshSiswa(); refreshDashboard();
        });

        String[] cols = {"NIS","Nama","Alamat","Pinjaman Aktif"};
        siswaTableModel = new DefaultTableModel(cols, 0) { public boolean isCellEditable(int r, int c) { return false; } };
        JTable table = styledTable(siswaTableModel);
        JPanel center = new JPanel(new BorderLayout());
        center.setBackground(C_BG);
        center.add(Box.createVerticalStrut(12), BorderLayout.NORTH);
        center.add(tableCardWrap(new JScrollPane(table), "Daftar Siswa"), BorderLayout.CENTER);
        page.add(formCard, BorderLayout.NORTH);
        page.add(center, BorderLayout.CENTER);
        return page;
    }

    static void refreshSiswa() {
        siswaTableModel.setRowCount(0);
        for (Siswa s : siswaService.getAll()) {
            int aktif = transaksiService.countPinjamanAktif(s.getNis());
            siswaTableModel.addRow(new Object[]{s.getNis(), s.getNama(), s.getAlamat(), aktif + " buku"});
        }
    }

    // ─── BUKU ─────────────────────────────────────────────────────────────────
    static DefaultTableModel bukuTableModel;

    static JPanel bukuPage() {
        JPanel page = new JPanel(new BorderLayout());
        page.setBackground(C_BG);
        page.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        JPanel formCard = new JPanel(new GridBagLayout());
        formCard.setBackground(C_WHITE);
        formCard.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(220,220,230),1,true), BorderFactory.createEmptyBorder(16,16,16,16)));
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(4,4,4,4); gc.fill = GridBagConstraints.HORIZONTAL;

        JTextField fKode=formField(); JTextField fJudul=formField(); JTextField fJenis=formField();
        JLabel msgBuku = new JLabel(" ");
        msgBuku.setFont(new Font("SansSerif", Font.PLAIN, 12));

        gc.gridx=0; gc.gridy=0; gc.weightx=0; formCard.add(formLabel("Kode"), gc);
        gc.gridx=1; gc.weightx=0.2; formCard.add(fKode, gc);
        gc.gridx=2; gc.weightx=0; formCard.add(formLabel("Judul"), gc);
        gc.gridx=3; gc.weightx=0.5; formCard.add(fJudul, gc);
        gc.gridx=4; gc.weightx=0; formCard.add(formLabel("Jenis"), gc);
        gc.gridx=5; gc.weightx=0.3; formCard.add(fJenis, gc);

        JButton btnSimpan = accentButton("Simpan");
        gc.gridx=0; gc.gridy=1; gc.weightx=0; formCard.add(btnSimpan, gc);
        gc.gridx=1; gc.gridwidth=5; formCard.add(msgBuku, gc); gc.gridwidth=1;

        btnSimpan.addActionListener(e -> {
            String kode=fKode.getText().trim(), judul=fJudul.getText().trim(), jenis=fJenis.getText().trim();
            if (kode.isEmpty()||judul.isEmpty()||jenis.isEmpty()) { setMsg(msgBuku,"Semua field wajib diisi.",false); return; }
            if (bukuService.findByKode(kode) != null) { setMsg(msgBuku,"Kode buku sudah ada.",false); return; }
            bukuService.tambah(new Buku(kode,judul,jenis));
            setMsg(msgBuku,"Buku berhasil ditambahkan.",true);
            fKode.setText(""); fJudul.setText(""); fJenis.setText("");
            refreshBuku(); refreshDashboard();
        });

        String[] cols = {"Kode","Judul","Jenis","Status"};
        bukuTableModel = new DefaultTableModel(cols, 0) { public boolean isCellEditable(int r, int c) { return false; } };
        JTable table = styledTable(bukuTableModel);
        colorStatusColumn(table, 3);
        JPanel center = new JPanel(new BorderLayout());
        center.setBackground(C_BG);
        center.add(Box.createVerticalStrut(12), BorderLayout.NORTH);
        center.add(tableCardWrap(new JScrollPane(table), "Daftar Buku"), BorderLayout.CENTER);
        page.add(formCard, BorderLayout.NORTH);
        page.add(center, BorderLayout.CENTER);
        return page;
    }

    static void refreshBuku() {
        bukuTableModel.setRowCount(0);
        java.util.List<Transaksi> trx = transaksiService.getAll();
        for (Buku b : bukuService.getAll()) {
            boolean dipinjam = trx.stream().anyMatch(t -> t.getKodeBuku().equals(b.getKode()) && t.getStatus()==0);
            bukuTableModel.addRow(new Object[]{b.getKode(), b.getJudul(), b.getJenis(), dipinjam?"Dipinjam":"Tersedia"});
        }
    }

    // ─── TRANSAKSI ────────────────────────────────────────────────────────────
    static DefaultTableModel trxTableModel;

    static JPanel transaksiPage() {
        JPanel page = new JPanel(new BorderLayout());
        page.setBackground(C_BG);
        page.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        JPanel formCard = new JPanel(new GridBagLayout());
        formCard.setBackground(C_WHITE);
        formCard.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(220,220,230),1,true), BorderFactory.createEmptyBorder(16,16,16,16)));
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(4,4,4,4); gc.fill = GridBagConstraints.HORIZONTAL;

        JTextField fKode=formField(); JTextField fNis=formField(); JTextField fKodeBuku=formField();
        JTextField fTgl=formField(); fTgl.setText(LocalDate.now().toString());
        JLabel msgTrx = new JLabel(" ");
        msgTrx.setFont(new Font("SansSerif", Font.PLAIN, 12));

        gc.gridx=0; gc.gridy=0; gc.weightx=0; formCard.add(formLabel("Kode Transaksi"), gc);
        gc.gridx=1; gc.weightx=0.25; formCard.add(fKode, gc);
        gc.gridx=2; gc.weightx=0; formCard.add(formLabel("NIS Siswa"), gc);
        gc.gridx=3; gc.weightx=0.25; formCard.add(fNis, gc);
        gc.gridx=4; gc.weightx=0; formCard.add(formLabel("Kode Buku"), gc);
        gc.gridx=5; gc.weightx=0.25; formCard.add(fKodeBuku, gc);
        gc.gridx=6; gc.weightx=0; formCard.add(formLabel("Tgl Pinjam"), gc);
        gc.gridx=7; gc.weightx=0.25; formCard.add(fTgl, gc);

        JButton btnPinjam = accentButton("Pinjam");
        gc.gridx=0; gc.gridy=1; gc.weightx=0; formCard.add(btnPinjam, gc);
        gc.gridx=1; gc.gridwidth=7; formCard.add(msgTrx, gc); gc.gridwidth=1;

        btnPinjam.addActionListener(e -> {
            String kode=fKode.getText().trim(), nis=fNis.getText().trim(), kb=fKodeBuku.getText().trim(), tgl=fTgl.getText().trim();
            if (kode.isEmpty()||nis.isEmpty()||kb.isEmpty()||tgl.isEmpty()) { setMsg(msgTrx,"Semua field wajib diisi.",false); return; }
            if (siswaService.findByNis(nis)==null) { setMsg(msgTrx,"NIS tidak ditemukan.",false); return; }
            if (bukuService.findByKode(kb)==null) { setMsg(msgTrx,"Kode buku tidak ditemukan.",false); return; }
            if (transaksiService.countPinjamanAktif(nis)>=2) { setMsg(msgTrx,"Maksimal 2 buku dipinjam sekaligus!",false); return; }
            boolean sdDipinjam = transaksiService.getAll().stream().anyMatch(t->t.getKodeBuku().equals(kb)&&t.getStatus()==0);
            if (sdDipinjam) { setMsg(msgTrx,"Buku sedang dipinjam siswa lain.",false); return; }
            transaksiService.pinjam(new Transaksi(kode,nis,kb,tgl,"null",0));
            setMsg(msgTrx,"Peminjaman berhasil dicatat.",true);
            fKode.setText(""); fNis.setText(""); fKodeBuku.setText(""); fTgl.setText(LocalDate.now().toString());
            refreshTransaksi(); refreshBuku(); refreshSiswa(); refreshDashboard();
        });

        String[] cols = {"Kode","NIS","Judul Buku","Tgl Pinjam","Tgl Kembali","Status","Aksi"};
        trxTableModel = new DefaultTableModel(cols, 0) { public boolean isCellEditable(int r, int c) { return false; } };
        JTable table = styledTable(trxTableModel);
        colorStatusColumn(table, 5);

        table.getColumnModel().getColumn(6).setCellRenderer(new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable tbl, Object val, boolean sel, boolean foc, int row, int col) {
                String status = (String) tbl.getValueAt(row, 5);
                if ("Dipinjam".equals(status)) {
                    JButton btn = new JButton("Kembalikan");
                    btn.setFont(new Font("SansSerif", Font.PLAIN, 11));
                    btn.setBackground(new Color(235,233,250));
                    btn.setForeground(C_ACCENT);
                    btn.setBorder(BorderFactory.createLineBorder(C_ACCENT, 1, true));
                    btn.setFocusPainted(false);
                    return btn;
                }
                JLabel lbl = new JLabel("-");
                lbl.setHorizontalAlignment(SwingConstants.CENTER);
                lbl.setForeground(C_TEXT_MUT);
                return lbl;
            }
        });

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                int col = table.columnAtPoint(e.getPoint());
                if (col==6 && row>=0) {
                    String status = (String) trxTableModel.getValueAt(row, 5);
                    if ("Dipinjam".equals(status)) {
                        String kodeRow = (String) trxTableModel.getValueAt(row, 0);
                        transaksiService.kembali(kodeRow, LocalDate.now().toString());
                        refreshTransaksi(); refreshBuku(); refreshSiswa(); refreshDashboard();
                    }
                }
            }
        });

        JPanel center = new JPanel(new BorderLayout());
        center.setBackground(C_BG);
        center.add(Box.createVerticalStrut(12), BorderLayout.NORTH);
        center.add(tableCardWrap(new JScrollPane(table), "Daftar Transaksi"), BorderLayout.CENTER);
        page.add(formCard, BorderLayout.NORTH);
        page.add(center, BorderLayout.CENTER);
        return page;
    }

    static void refreshTransaksi() {
        trxTableModel.setRowCount(0);
        for (Transaksi t : transaksiService.getAll()) {
            Buku b = bukuService.findByKode(t.getKodeBuku());
            trxTableModel.addRow(new Object[]{t.getKode(), t.getNis(), b!=null?b.getJudul():t.getKodeBuku(), t.getTglPinjam(), t.getTglKembali(), t.getStatus()==0?"Dipinjam":"Dikembalikan", ""});
        }
    }

    // ─── HELPERS ──────────────────────────────────────────────────────────────

    static JPanel statCard(String label, JLabel valueLabel) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(new Color(245, 244, 252));
        card.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(210,207,240),1,true), BorderFactory.createEmptyBorder(14,16,14,16)));
        JLabel lbl = new JLabel(label);
        lbl.setFont(new Font("SansSerif", Font.PLAIN, 12));
        lbl.setForeground(C_TEXT_MUT);
        valueLabel.setFont(new Font("SansSerif", Font.BOLD, 28));
        valueLabel.setForeground(C_TEXT_DARK);
        card.add(lbl, BorderLayout.NORTH);
        card.add(valueLabel, BorderLayout.CENTER);
        return card;
    }

    static JPanel tableCardWrap(JScrollPane scroll, String title) {
        scroll.setBorder(BorderFactory.createEmptyBorder());
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(C_WHITE);
        card.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(220,220,230),1,true), BorderFactory.createEmptyBorder(14,16,14,16)));
        JLabel lbl = new JLabel(title);
        lbl.setFont(new Font("SansSerif", Font.BOLD, 13));
        lbl.setForeground(C_TEXT_DARK);
        lbl.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
        card.add(lbl, BorderLayout.NORTH);
        card.add(scroll, BorderLayout.CENTER);
        return card;
    }

    static JTable styledTable(DefaultTableModel model) {
        JTable table = new JTable(model);
        table.setFont(new Font("SansSerif", Font.PLAIN, 13));
        table.setRowHeight(34);
        table.setShowHorizontalLines(true);
        table.setGridColor(new Color(235,235,240));
        table.setBackground(C_WHITE);
        table.setSelectionBackground(new Color(230,228,250));
        table.setSelectionForeground(C_TEXT_DARK);
        table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 11));
        table.getTableHeader().setBackground(C_BG);
        table.getTableHeader().setForeground(C_TEXT_MUT);
        table.getTableHeader().setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(220,220,230)));
        table.setFillsViewportHeight(true);
        return table;
    }

    static void colorStatusColumn(JTable table, int colIndex) {
        table.getColumnModel().getColumn(colIndex).setCellRenderer(new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable tbl, Object val, boolean sel, boolean foc, int row, int col) {
                JLabel lbl = new JLabel(val!=null?val.toString():"");
                lbl.setOpaque(true);
                lbl.setFont(new Font("SansSerif", Font.BOLD, 11));
                lbl.setBorder(BorderFactory.createEmptyBorder(0,8,0,8));
                lbl.setHorizontalAlignment(SwingConstants.CENTER);
                if ("Dipinjam".equals(val)||"Tersedia".equals(val)) {
                    if ("Dipinjam".equals(val)) { lbl.setBackground(C_GREEN_BG); lbl.setForeground(C_GREEN); }
                    else { lbl.setBackground(C_GREEN_BG); lbl.setForeground(C_GREEN); }
                } else {
                    lbl.setBackground(C_GRAY_BG); lbl.setForeground(C_GRAY_TXT);
                }
                return lbl;
            }
        });
    }

    static JToggleButton navButton(String text) {
        JToggleButton btn = new JToggleButton(text);
        btn.setFont(new Font("SansSerif", Font.PLAIN, 13));
        btn.setForeground(new Color(190,185,230));
        btn.setBackground(C_SIDEBAR);
        btn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0,3,0,0,C_SIDEBAR), BorderFactory.createEmptyBorder(10,13,10,13)));
        btn.setHorizontalAlignment(SwingConstants.LEFT);
        btn.setFocusPainted(false);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 42));
        btn.setAlignmentX(Component.LEFT_ALIGNMENT);
        btn.addItemListener(e -> {
            if (btn.isSelected()) {
                btn.setForeground(Color.WHITE);
                btn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0,3,0,0,C_ACCENT), BorderFactory.createEmptyBorder(10,13,10,13)));
                btn.setBackground(new Color(55,48,120));
            } else {
                btn.setForeground(new Color(190,185,230));
                btn.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0,3,0,0,C_SIDEBAR), BorderFactory.createEmptyBorder(10,13,10,13)));
                btn.setBackground(C_SIDEBAR);
            }
        });
        return btn;
    }

    static JButton accentButton(String text) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("SansSerif", Font.BOLD, 13));
        btn.setBackground(C_ACCENT);
        btn.setForeground(Color.WHITE);
        btn.setBorder(BorderFactory.createEmptyBorder(8,18,8,18));
        btn.setFocusPainted(false);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return btn;
    }

    static JTextField formField() {
        JTextField f = new JTextField();
        f.setFont(new Font("SansSerif", Font.PLAIN, 13));
        f.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(200,200,215),1,true), BorderFactory.createEmptyBorder(4,8,4,8)));
        return f;
    }

    static JLabel formLabel(String text) {
        JLabel l = new JLabel(text);
        l.setFont(new Font("SansSerif", Font.BOLD, 12));
        l.setForeground(C_TEXT_MUT);
        return l;
    }

    static void setMsg(JLabel lbl, String text, boolean ok) {
        lbl.setText(text);
        lbl.setForeground(ok ? C_GREEN : C_RED);
    }
}