
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class EmpregadoGUI extends JFrame {
    private JPanel panelTela;
    private JTextField codigoEmpregado;
    private JTextField nomeEmpregado;
    private JTextField setor;
    private JTextField salarioBruto;
    private JButton cmdCalcularINSS;
    private JButton cmdCadastrar;
    private JButton cmdApresentarEmpregados;

    public JPanel getPanelTela() {
        return panelTela;
    }
}
