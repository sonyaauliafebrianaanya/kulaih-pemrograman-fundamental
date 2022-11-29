import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FormATM {
    private JTextField textNomor;
    private JComboBox comboATM;
    private JComboBox comboBank;
    private JTextField textNama;
    private JButton buttonSave;
    private JButton FileButton;
    private JTextArea textHasil;
    private JTextField textImage;
    private JLabel JImage;
    private JPanel rootPanel;


    public FormATM() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nokartu = textNomor.getText();
                String jenisATM = (String) comboATM.getSelectedItem();
                String Bank = (String) comboBank.getSelectedItem();
                String namapemilik = textNama.getText();
                String file = textImage.getText();

                String hasil = "\n\nNomor Kartu :" +nokartu +"\nJenis ATM :" +jenisATM +"\nBank :" +Bank +"\nNama Pemilik :" +namapemilik +"\nFile Name :" +file;

                JOptionPane.showMessageDialog(null, "saved");
                textHasil.append(hasil);

                try {
                    FileWriter myWriter = new FileWriter("FileDataBase.txt" , true);
                    myWriter.write(hasil);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file");

                } catch (IOException ex){
                    System.out.println("Aa error occurred.");
                    ex.printStackTrace();
                }

            }
        });
        FileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser browseImage = new JFileChooser();

                int showOpenDialogue = browseImage.showOpenDialog(null);

                if(showOpenDialogue == JFileChooser.APPROVE_OPTION) {
                    File selectedImage = browseImage.getSelectedFile();
                    String selectedImagePath = selectedImage.getAbsolutePath();
                    String selectedImagePath2 = selectedImage.getName();

                    textImage.setText(selectedImagePath2);

                    ImageIcon ii = new ImageIcon(selectedImagePath);
                    Image image = ii.getImage().getScaledInstance(JImage.getWidth(), JImage.getHeight(), Image.SCALE_SMOOTH);

                    JImage.setIcon(new ImageIcon(image));
                }
            }
        });
    }
    public JPanel getRootPanel(){
        return rootPanel;
    }
}
