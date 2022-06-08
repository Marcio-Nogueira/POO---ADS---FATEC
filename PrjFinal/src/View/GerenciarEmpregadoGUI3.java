package View;

import Model.Empregado;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GerenciarEmpregadoGUI3 {
    private JPanel panel1;
    private JTable table1;

    public JPanel getPanel1() {
        return panel1;
    }

    public GerenciarEmpregadoGUI3() {
    initComponents();
        // TODO: place custom component creation code here
        String[] header = {"IdContato", "Nome", "Email", "Telefone", "Observação"};
        DefaultTableModel model = new DefaultTableModel(0,4);
        model.setColumnIdentifiers(header);
        table1 = new JTable(model);
        for (Empregado empregado: EmpregadoGUI.listaEmpregado) {
            Object[] row = {empregado.getCodigoEmpregado(), empregado.getNomeEmpregado(),
                    empregado.getSetor(), empregado.getSalarioBruto(),
                    empregado.getRecInss()
            };
            model.addRow(row);
        }
    }

    private void initComponents() {
    }
}


