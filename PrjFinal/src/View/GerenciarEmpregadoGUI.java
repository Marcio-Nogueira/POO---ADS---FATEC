package View;

import javax.swing.*;

import Model.Empregado;
import Model.GerenciarEmpregado;
import javax.swing.JScrollPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import static Model.GerenciarEmpregado.listaEmpregados;

public class GerenciarEmpregadoGUI extends JFrame implements WindowListener {
    public JScrollPane txtCadastro;
    private JPanel GerenciarEmpregado;
    private JLabel lblCodigo;
    private JLabel lblRecolhimento;
    private JLabel lblSalario;
    private JLabel lblSetor;
    private JLabel lblNome;


    public JPanel getPanelEmpregados() {
        return GerenciarEmpregado;
    }
    public GerenciarEmpregado ge;
//    public static List listaEmpregados = new ArrayList<Empregado>();


    public GerenciarEmpregadoGUI() {
        initComponents();



//        String[] colunas = {"Código", "Nome", "Setor", "Salário", "Recolhimento"};
//        String[] myArray = new String[listaEmpregados.size()];
//        listaEmpregados.toArray(myArray);
//
//
//        JList<String> list = new JList<>(myArray);
//        list.setVisibleRowCount(-1);
//        list.setVisible(true);
//        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//        txtCadastro = new JScrollPane(list);


//        Object[] dados = new Object[listaEmpregados.size()];
//        listaEmpregados.toArray(dados);
//        JList<Object> list = new JList<>(dados);
//        list.setVisibleRowCount(-1);
//        list.setVisible(true);
//        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
//        txtCadastro = new JScrollPane(list);
//        txtCadastro.setVisible(true);


        txtCadastro.addComponentListener(new ComponentAdapter() {
        });
    }

    private void initComponents() {
    }

    @Override
    public void windowOpened(WindowEvent e) {
//        Object[] dados = new Object[listaEmpregados.size()];
//        listaEmpregados.toArray(dados);

//        DefaultListModel<Empregado> model = new DefaultListModel<Empregado>();
//        for(Object empregado : listaEmpregados) {
//            model.addElement((Empregado) empregado);
//        }
//        JList<Empregado> list = new JList<Empregado>(model);
//        txtCadastro = new JScrollPane(list);
//        getContentPane().add(txtCadastro);
//    }


        }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

//    public List<Empregado> listaEmpregados;
//
//    private void createUIComponents() {
//
//    }

}
