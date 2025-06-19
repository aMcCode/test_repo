package datingapp.gui;
import java.awt.GridLayout;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.text.MaskFormatter;

public final class FormattedTextFields extends JFrame {

    public FormattedTextFields() throws ParseException {
          init();
          addComponents();

          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setVisible(true);
    }


    private void addComponents() throws ParseException {
          // Set up the content pane
          JPanel contentPane = new JPanel(new GridLayout(0, 2));
          contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

          // Set up the price label
          JLabel priceLabel = new JLabel("Price", SwingConstants.TRAILING);
          priceLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
          contentPane.add(priceLabel);

          // Set up the price formatted text field
          NumberFormat priceFormat = NumberFormat.getNumberInstance();
          priceFormat.setMaximumFractionDigits(2);
          JFormattedTextField priceTextField = new JFormattedTextField(priceFormat);
          priceTextField.setColumns(10);
          contentPane.add(priceTextField);

          // Set up the product reference label
          JLabel productReferenceLabel = new JLabel("Product reference", SwingConstants.TRAILING);
          productReferenceLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
          contentPane.add(productReferenceLabel);

          // Set up the product reference formatted text field
          MaskFormatter productReferenceFormat = new MaskFormatter("###-###-###");
          JFormattedTextField productReferenceTextField = new JFormattedTextField(productReferenceFormat);
          productReferenceTextField.setColumns(10);
          contentPane.add(productReferenceTextField);

          // Set up the quantity label
          JLabel quantitylLabel = new JLabel("Quantity", SwingConstants.TRAILING);
          quantitylLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
          contentPane.add(quantitylLabel);

          // Set up the quantity formatted text field
          NumberFormat quantityFormat = NumberFormat.getIntegerInstance();
          quantityFormat.setMaximumIntegerDigits(2);
          JFormattedTextField quantityTextField = new JFormattedTextField(quantityFormat);
          quantityTextField.setColumns(10);
          contentPane.add(quantityTextField);

          // Set up the date label
          JLabel dateLabel = new JLabel("Date", SwingConstants.TRAILING);
          dateLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
          contentPane.add(dateLabel);

          // Set up the date formatted text field
          MaskFormatter dateMaskFormatter = new MaskFormatter("##/##/####");
          JFormattedTextField dateTextField = new JFormattedTextField(dateMaskFormatter);
          dateTextField.setColumns(10);
          contentPane.add(dateTextField);

          // Add the content pane to the JFrame
          add(contentPane);
    }


    private void init() {
          setTitle("FormattedTextFields");
          setSize(300, 150);
          setLocationRelativeTo(null);
    }


    public static void main(String[] args){
          SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                      try{
                            new FormattedTextFields();
                      }
                      catch(ParseException e){
                            e.printStackTrace();
                      }
                }
          });
    }
}