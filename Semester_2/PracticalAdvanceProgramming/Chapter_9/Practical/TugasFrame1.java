package Semester_2.Advance_Programming.Semester_2.PracticalAdvanceProgramming.Chapter_9.Practical;

import java.awt.*;
import java.awt.event.*;

class Pemlan {
    double hitung(double t, double k, double uts, double uas) {
        return (t*0.2 + k*0.2 + uts*0.3 + uas*0.3);
    }
}

class ASD {
    double hitung(double t, double k, double uts, double uas) {
        return (t*0.1 + k*0.2 + uts*0.3 + uas*0.4);
    }
}

class Matkomlan {
    double hitung(double t, double k, double uts, double uas) {
        return (t*0.25 + k*0.25 + uts*0.25 + uas*0.25);
    }
}

class Probstat {
    double hitung(double t, double k, double uts, double uas) {
        return (t*0.3 + k*0.2 + uts*0.2 + uas*0.3);
    }
}

public class TugasFrame1 extends Frame{

    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox pemlan = new Checkbox("Pemlan", cbg, true);
    Checkbox asd = new Checkbox("ASD", cbg, false);
    Checkbox matkom = new Checkbox("Matkomlan", cbg, false);
    Checkbox prob = new Checkbox("Probstat", cbg, false);

    TextField tTugas = new TextField();
    TextField tKuis = new TextField();
    TextField tUTS = new TextField();
    TextField tUAS = new TextField();
    TextField tHasil = new TextField();

    Button btn = new Button("Hitung");
    TextArea area = new TextArea();
    Button nilaiMatkul = new Button("Tampilkan semua nilai matkul");

    double hasil[] = new double[4];

    public TugasFrame1(){
        setLayout(null);
        setTitle("Menghitung nilai Mahasiswa");
        setSize(320, 520);

        tampilan();

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });

        setVisible(true);
    }

    public void tampilan(){

        add(new Label("Hitung Nilai Akhir")).setBounds(100, 25, 200, 30);

        add(pemlan).setBounds(20,50,60,20);
        add(asd).setBounds(80,50,50,20);
        add(matkom).setBounds(140,50,80,20);
        add(prob).setBounds(230,50,70,20);

        add(new Label("Tugas")).setBounds(50,80,80,20);
        add(tTugas).setBounds(150,80,100,20);

        add(new Label("Kuis")).setBounds(50,110,80,20);
        add(tKuis).setBounds(150,110,100,20);

        add(new Label("UTS")).setBounds(50,140,80,20);
        add(tUTS).setBounds(150,140,100,20);

        add(new Label("UAS")).setBounds(50,170,80,20);
        add(tUAS).setBounds(150,170,100,20);

        add(new Label("Hasil")).setBounds(50,200,80,20);
        add(tHasil).setBounds(150,200,100,20);
        tHasil.setEditable(false); // FIX

        add(btn).setBounds(150,230,100,25);

        add(area).setBounds(20,270,260,120);

        add(nilaiMatkul).setBounds(20,400,260,25);

        ItemListener reset = new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                tTugas.setText("");
                tKuis.setText("");
                tUTS.setText("");
                tUAS.setText("");
                tHasil.setText("");
            }
        };

        pemlan.addItemListener(reset);
        asd.addItemListener(reset);
        matkom.addItemListener(reset);
        prob.addItemListener(reset);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    double t = Double.parseDouble(tTugas.getText());
                    double k = Double.parseDouble(tKuis.getText());
                    double uts = Double.parseDouble(tUTS.getText());
                    double uas = Double.parseDouble(tUAS.getText());

                    if(pemlan.getState()){
                        hasil[0] = new Pemlan().hitung(t,k,uts,uas);
                        tHasil.setText(String.valueOf(hasil[0]));

                    } else if(asd.getState()){
                        hasil[1] = new ASD().hitung(t,k,uts,uas);
                        tHasil.setText(String.valueOf(hasil[1]));

                    } else if(matkom.getState()){
                        hasil[2] = new Matkomlan().hitung(t,k,uts,uas);
                        tHasil.setText(String.valueOf(hasil[2]));

                    } else if(prob.getState()){
                        hasil[3] = new Probstat().hitung(t,k,uts,uas);
                        tHasil.setText(String.valueOf(hasil[3]));
                    }

                } catch(Exception ex){
                    tHasil.setText("Input salah!");
                }
            }
        });

        nilaiMatkul.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){

                area.setText("Hasil Nilai Semua Matkul\n\n");
                area.append("Pemlan     : " + hasil[0] + "\n");
                area.append("ASD        : " + hasil[1] + "\n");
                area.append("Matkomlan  : " + hasil[2] + "\n");
                area.append("Probstat   : " + hasil[3] + "\n");
            }
        });
    }

    public static void main(String[] args) {
        new TugasFrame1();
    }
}