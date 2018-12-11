package hellogaes;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class FrameSatu extends JFrame implements ActionListener {

    private JButton buttonSatu;
    private JButton buttonDua;
    private JButton buttonTiga;
    private JTextField textField;
    private JTextField textNama;
    private JTextField textNPM;
    private JComboBox comboBox;
    private final ArrayList<Mahasiswa> arrayMahasiswa;

    public FrameSatu() {
        arrayMahasiswa = new ArrayList<Mahasiswa>();
    }

    public void showViewFrames() {
        setSize(500, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buttonSatu = new JButton("Satu");
        buttonSatu.setBounds(20, 20, 60, 60);
        buttonSatu.setActionCommand("btnSatu");

        buttonDua = new JButton("Dua");
        buttonDua.setBounds(80, 20, 60, 60);
        buttonDua.setActionCommand("btnDua");

        buttonTiga = new JButton("Add Mahasiswa");
        buttonTiga.setBounds(180, 20, 80, 60);
        buttonTiga.setActionCommand("btnTiga");

        textField = new JTextField();
        textField.setBounds(20, 90, 160, 60);
        Object cmb[] = {"One", "Two", "Three"};

        comboBox = new JComboBox(cmb);
        comboBox.setBounds(20, 170, 160, 30);

        textNama = new JTextField();
        textNama.setBounds(20, 210, 160, 30);

        this.setLayout(null);

        textNPM = new JTextField();
        textNPM.setBounds(20, 250, 160, 30);

        this.add(buttonSatu);
        this.add(buttonDua);
        this.add(buttonTiga);
        this.add(textField);
        this.add(comboBox);
        this.add(textNama);
        this.add(textNPM);

        buttonSatu.addActionListener(this);
        buttonDua.addActionListener(this);
        buttonTiga.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent var) {
        String actionCommand = var.getActionCommand();
        if (actionCommand.equals("btnSatu")) {
            System.out.println("Button Satu has been Clicked!");
        } else if (actionCommand.equals("btnDua")) {
            System.out.println("Button Dua has been Clicked!");
        } else if (actionCommand.equals("btnTiga")) {
            arrayMahasiswa.add(new Mahasiswa(textNama.getText(), textNPM.getText()));
            textNPM.setText("");
            textNama.setText("");
            showMahasiswa();
            Object arr[][] = new Object[arrayMahasiswa.size()][2];
            int i = 0;
            for(Mahasiswa mhs : arrayMahasiswa){
                arr[i][0] = mhs.getName();
                arr[i][1] = mhs.getNPM();
                i++;
            }
            new FrameDua(arr).setVisible(true);
        }
    }

    public void showMahasiswa() {
        for (Mahasiswa mhs : arrayMahasiswa) {
            System.out.println(mhs.getName());
            System.out.println(mhs.getNPM());
        }
        System.out.println("--------------------");
    }
}
