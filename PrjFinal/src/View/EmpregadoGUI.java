package View;

import Model.Empregado;
import Model.GerenciarEmpregado;
import Model.ParametroInss;
import View.GerenciarEmpregadoGUI;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;

import static Model.GerenciarEmpregado.listaEmpregados;

public class EmpregadoGUI extends JFrame {
    private JPanel panelTela;
    private JLabel lblCodigoEmpregado;
    private JTextField txtCodigoEmpregado;
    private JTextField txtNomeEmpregado;
    private JTextField txtSetor;
    private JTextField txtSalarioBruto;
    private JButton cmdCalcularRecolhimento;
    private JButton cmdCadastrar;
    private JButton cmdApresentarEmpregados;
    private JTextArea txtRecolhimento;
    private JLabel lblNomeEmpregado;
    private JLabel lblSetor;
    private JLabel lblSalarioBruto;
    private JLabel lblRecolhimento;

    public JPanel getPanelTela() {
        return panelTela;
    }

    public Empregado empregado;
    public GerenciarEmpregado ge;

    public EmpregadoGUI() {
        initComponents();
        empregado = new Empregado();
        ge = new GerenciarEmpregado();






        cmdCadastrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int codigoEmpregado = Integer.parseInt(txtCodigoEmpregado.getText());
                empregado.setCodigoEmpregado(codigoEmpregado);
                String nomeEmpregado = txtNomeEmpregado.getText();
                empregado.setNomeEmpregado(nomeEmpregado);
                String setor = txtSetor.getText();
                empregado.setSetor(setor);
                double salarioBruto = Double.parseDouble(txtSalarioBruto.getText());
                empregado.setSalarioBruto(salarioBruto);
                ge.adcionarEmpregado(empregado);
                txtCodigoEmpregado.setText(null);
                txtNomeEmpregado.setText(null);
                txtSetor.setText(null);
                txtSalarioBruto.setText(null);
                txtRecolhimento.setText(null);
                JOptionPane.showMessageDialog(null,
                        "Funcionário cadastrado com sucesso");
            }

        });
        cmdCalcularRecolhimento.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double salarioBruto = Double.parseDouble(txtSalarioBruto.getText());
                empregado.setSalarioBruto(salarioBruto);
                double recInss = ParametroInss.calcularInss(salarioBruto);
                DecimalFormat df = new DecimalFormat("0.00");
                df.setRoundingMode(RoundingMode.HALF_UP);
                empregado.setRecInss(recInss);
                txtRecolhimento.setText("R$ " + df.format(recInss));

            }
        });

        cmdApresentarEmpregados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            JFrame gerenciarEmpregadoGUI = new JFrame();
            gerenciarEmpregadoGUI.setContentPane(new GerenciarEmpregadoGUI().getPanelEmpregados());
            gerenciarEmpregadoGUI.setTitle("Gerenciar Empregados");
            gerenciarEmpregadoGUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            gerenciarEmpregadoGUI.setVisible(true);
            gerenciarEmpregadoGUI.setSize(650,400);
            gerenciarEmpregadoGUI.setLocation(400,200);


            DefaultListModel<Empregado> model = new DefaultListModel<Empregado>();
            for(Object empregado : listaEmpregados) {
            model.addElement((Empregado) empregado);
            }
            JList<Empregado> list = new JList<Empregado>(model);
            JScrollPane txtCadastro = new JScrollPane(list);
            getContentPane().add(txtCadastro);





//            for(Object lista : listaEmpregados) {
//                lista.toString();
//            }
//            Object[] dados = new Object[listaEmpregados.size()];
//            listaEmpregados.toArray(dados);
//            JList<Object> list = new JList<>(dados);
//            list.setVisibleRowCount(-1);
//            list.setVisible(true);
//            list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//            JScrollPane txtCadastro = new JScrollPane(list);
//            System.out.println(dados);

            }
        });
    }

    private void initComponents() {

    }


}
