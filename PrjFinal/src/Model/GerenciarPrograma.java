package Model;
import View.EmpregadoGUI;
import View.GerenciarEmpregadoGUI;
import Model.GerenciarEmpregado;
import javax.swing.*;
import static Model.GerenciarEmpregado.listaEmpregados;

public class GerenciarPrograma {
    public static void main(String[] args) {
        showWindow();
        Empregado e = new Empregado();
        e.setNomeEmpregado("José");
        e.setRecInss(225);
        e.setSalarioBruto(2600);
        e.setCodigoEmpregado(1);
        e.setSetor("2");
        GerenciarEmpregado.ListaEmpregados().add(0, e);
        System.out.println(e.getNomeEmpregado());


    }


    public static void showWindow() {
        JFrame empregadoGUI = new JFrame();
        empregadoGUI.setContentPane(new EmpregadoGUI().getPanelTela());
        empregadoGUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        empregadoGUI.setSize(650,400);
        empregadoGUI.setTitle("Cadastro de Empregados");
        empregadoGUI.setLocation(400,200);
        empregadoGUI.setVisible(true);
    }
}



