import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

    public class CalculatorView
    {

        JButton oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn;
        JButton sixBtn,sevenBtn, eightBtn, nineBtn, zeroBtn;
        JButton addBtn, subtractBtn, multiplyBtn, divideBtn;
        JButton resetBtn, equalsBtn;

        JTextField textField;
        JLabel ecran = new JLabel();
        JFrame frame;

        JPanel numbersPanel, signsPanel;

        CalculatorView()
        {
            frame = new JFrame("Jeudy Calculator");
            frame.setSize(400,500);
            frame.setLayout(new BorderLayout());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            textField = new JTextField(100);

            JPanel numbersPanel = new JPanel();

            numbersPanel = numberPan(numbersPanel);
            numbersPanel.setPreferredSize(new Dimension(55, 225));
            textField.setPreferredSize(new Dimension(40,50));
            frame.add(textField,BorderLayout.NORTH);
            frame.add(numbersPanel,BorderLayout.CENTER);


            frame.setResizable(false);
            frame.setVisible(true);
        }


        JPanel numberPan(JPanel panel)
        {
            oneBtn = new JButton("1");
            twoBtn = new JButton("2");
            threeBtn = new JButton("3");
            fourBtn= new JButton("4");
            fiveBtn= new JButton("5");
            sixBtn= new JButton("6");
            sevenBtn= new JButton("7");
            eightBtn= new JButton("8");
            nineBtn= new JButton("9");
            zeroBtn= new JButton("0");
            addBtn= new JButton("+");
            addBtn.setPreferredSize(new Dimension(40,20));
            subtractBtn= new JButton("-");
            multiplyBtn= new JButton("*");
            divideBtn= new JButton("/");

            resetBtn= new JButton("C");
            equalsBtn= new JButton("=");



            panel.add(oneBtn);
            panel.add(twoBtn);
            panel.add(threeBtn);

            panel.add(divideBtn);
            panel.add(fourBtn);
            panel.add(fiveBtn);
            panel.add(sixBtn);
            panel.add(multiplyBtn);
            panel.add(sevenBtn);
            panel.add(eightBtn);
            panel.add(nineBtn);







            panel.add(addBtn);
            panel.add(zeroBtn);
            panel.add(resetBtn);
            panel.add(equalsBtn);
            panel.add(subtractBtn);
            panel.setLayout(new GridLayout(4,3));

            return panel;
        }



        void setTextValue(int value)
        {

            textField.setText(Integer.toString(value));
        }
        

    }

