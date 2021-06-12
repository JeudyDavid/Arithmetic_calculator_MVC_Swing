
import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculatorModel
{
    public int getChiffre1() {
        return chiffre1;
    }

    public void setChiffre1(int chiffre1) {
        this.chiffre1 = chiffre1;
    }

    private int chiffre1;
    private int sum;
    private int number;
    private char opt;

    public CalculatorModel()
    {
        sum = 0;
        number = 0;
    }

    public void set(JButton idenifier, JTextField number)
    {

        opt = idenifier.getText().charAt(0);


        this.number = Integer.parseInt(number.getText());

    }

    public void setNumber(int number)
    {
        this.number = number;
    }


}