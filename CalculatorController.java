
import javax.swing.*;
import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class CalculatorController {
    private boolean clicOperateur = false, update = false;
    private String operateur = "";
    CalculatorModel model;
    CalculatorView view;

    CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        view.addBtn.addActionListener(new PlusListener());
        view.subtractBtn.addActionListener(new MoinsListener());
        view.multiplyBtn.addActionListener(new MultiListener());
        view.divideBtn.addActionListener(new DivListener());
        view.equalsBtn.addActionListener(new EgalListener());
        view.resetBtn.addActionListener(new Actions());
        view.oneBtn.addActionListener(new ChiffreListener());
        view.twoBtn.addActionListener(new ChiffreListener());
        view.threeBtn.addActionListener(new ChiffreListener());
        view.fourBtn.addActionListener(new ChiffreListener());
        view.fiveBtn.addActionListener(new ChiffreListener());
        view.sixBtn.addActionListener(new ChiffreListener());
        view.sevenBtn.addActionListener(new ChiffreListener());
        view.eightBtn.addActionListener(new ChiffreListener());
        view.nineBtn.addActionListener(new ChiffreListener());
        view.zeroBtn.addActionListener(new ChiffreListener());
    }

    public void calcul() {
        if (operateur.equals("+")) {
            model.setChiffre1((int) (model.getChiffre1() + Double.valueOf(view.textField.getText()).doubleValue()));
            view.textField.setText(String.valueOf(model.getChiffre1()));
        }

        if (operateur.equals("-")) {
            model.setChiffre1((int) (model.getChiffre1() - Double.valueOf(view.textField.getText()).doubleValue()));
            view.textField.setText(String.valueOf(model.getChiffre1()));
        }

        if (operateur.equals("*")) {
            model.setChiffre1((int) (model.getChiffre1() * Double.valueOf(view.textField.getText()).doubleValue()));
            view.textField.setText(String.valueOf(model.getChiffre1()));
        }

        if (operateur.equals("/")) {
            try {
                model.setChiffre1((int) (model.getChiffre1() / Double.valueOf(view.textField.getText()).doubleValue()));
                view.textField.setText(String.valueOf(model.getChiffre1()));
            } catch (ArithmeticException e) {
                view.textField.setText("0");
            }
        }


    }

    class ChiffreListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str = ((JButton) e.getSource()).getText();

            if (update) {
                update = false;
            } else {
                if (!view.textField.getText().equals("0"))
                    str = view.textField.getText() + str;
            }

            view.setTextValue(Integer.parseInt(str));
        }
    }


    class EgalListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            calcul();
            update = true;
            clicOperateur = false;
        }
    }


    class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {

            if (clicOperateur) {
                calcul();
                view.setTextValue(model.getChiffre1());
            } else {
                model.setChiffre1((int) Double.valueOf(view.textField.getText()).doubleValue());
                clicOperateur = true;
            }
            operateur = "+";
            update = true;
        }
    }

    class MoinsListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            if (clicOperateur) {
                calcul();
                view.setTextValue(model.getChiffre1());
            } else {
                model.setChiffre1((int) Double.valueOf(view.textField.getText()).doubleValue());
                clicOperateur = true;
            }
            operateur = "-";
            update = true;
        }
    }

    class MultiListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            if (clicOperateur) {
                calcul();
                view.setTextValue(model.getChiffre1());
            } else {
                model.setChiffre1((int) Double.valueOf(view.textField.getText()).doubleValue());
                clicOperateur = true;
            }
            operateur = "*";
            update = true;
        }
    }

    class DivListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (clicOperateur) {
                calcul();
                view.setTextValue(model.getChiffre1());
            } else {
                model.setChiffre1((int) Double.valueOf(view.textField.getText()).doubleValue());
                clicOperateur = true;
            }
            operateur = "/";
            update = true;
        }

    }

    //inner class that will handle action listeners
    class Actions implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

                if (e.getSource() == view.resetBtn) {
                    model.set(view.resetBtn, view.textField);

                    view.setTextValue(0);
                }


            }


        }
    }
