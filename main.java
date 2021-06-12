

    public class main {

        public static void main(String[] args)
        {
            CalculatorModel model = new CalculatorModel();
            CalculatorView view = new CalculatorView();

            new CalculatorController(model,view);
        }

    }

