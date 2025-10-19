import javax.swing.*;

public class calculatorIMC {
    private JTextField pesoFild;
    private JTextField alturaFild;
    private JButton calcularBtn;
    private JLabel peso;
    private JLabel altura;
    private JLabel resultado;
    private JPanel painelPrincipal;

    public calculatorIMC() {
        calcularBtn.addActionListener(e -> calcularIMC());
    }

    private void calcularIMC() {
        try {
            double peso = Double.parseDouble(pesoFild.getText());
            double altura = Double.parseDouble(alturaFild.getText());

            // Fórmula correta:
            double imc = peso / (altura * altura);

            String classificao;
            if (imc < 18.5) classificao = "Abaixo do peso";
            else if (imc < 24.9) classificao = "Peso normal";
            else if (imc < 29.9) classificao = "Sobrepeso";
            else classificao = "Obesidade";

            resultado.setText(String.format("IMC: %.2f (%s)", imc, classificao));

        } catch (NumberFormatException ex) {
            resultado.setText("Por favor, insira valores válidos!");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculatorIMC");
        frame.setContentPane(new calculatorIMC().painelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
