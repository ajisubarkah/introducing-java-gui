package hellogaes;

import java.util.ArrayList;

public class FrameDua extends javax.swing.JFrame {

    private javax.swing.JLabel label;
    private javax.swing.JLabel labelDua;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane pane;

    public FrameDua(Object[][] arr) {
        setLayout(null);
        setSize(600, 600);
        label = new javax.swing.JLabel("This is Label");
//        label.setText(str);
        label.setBounds(10, 10, 160, 80);

        labelDua = new javax.swing.JLabel();
//        labelDua.setText(combo);
        labelDua.setBounds(10, 100, 160, 80);

        String[] headerTable = {"Nama", "NPM"};
        table = new javax.swing.JTable(arr, headerTable);
        
        pane = new javax.swing.JScrollPane(table);
        
//        pane.setViewportView(this);
        pane.setBounds(10, 10, 200, 200);

//        add(label);
//        add(labelDua);
        add(pane);
    }
}
