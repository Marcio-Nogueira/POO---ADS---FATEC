package Model;

import java.util.ArrayList;
import java.util.List;

public class GerenciarEmpregado extends Empregado {
//    public static List<Empregado> listaEmpregados;
    public static List listaEmpregados = new ArrayList<Empregado>();

    public void adcionarEmpregado(Empregado e) {
        listaEmpregados.add(this);
    }


    public static final List<Empregado> ListaEmpregados() {
        return listaEmpregados;
    }

    public void removerEmpregado(Empregado e) {
        listaEmpregados.remove(this);
    }

    private boolean verificarExistencia(Empregado e) {
        if (listaEmpregados.contains(this)) {
            return true;
        } else {
            return false;
        }
    }

}
